package Tarea2_U8;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {
    public static void main(String[] args) {
        try {
            //Obtener la referencia al objeto "Document".
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            //Parsear el documento XML para tenerlo en memoria cargado.
            Document doc = db.parse(new File("hospital.xml"));

            //Obtener el nodo.
            Node root = doc.getDocumentElement();

            //Nodo tipo text (salto de línea).
            Text saltoLinea = doc.createTextNode("\n");

            //2 - Añadir comentario antes de todas las etiquetas médico.

            //Obtener lista.
            NodeList lista = root.getChildNodes();

            //Obtener referencia a todas las ocurrencia de médico.
            for (int i = 0; i < lista.getLength(); i++) {
                Node nodo = lista.item(i);
                if (lista.item(i).getNodeType()== Node.ELEMENT_NODE){
                    //Insertar un nodo comentario antes de la persona
                    Comment comentario = doc.createComment(" COMENTARIO AÑADIDO DESDE DOM ");

                    //Obtengo una referencia de medico.
                    Element medico = (Element) lista.item(i);

                    //Uso de la función "insertBefore", para colocar el comentario antes del primer médico.
                    root.insertBefore(comentario, medico);

                    i= i+1;
                }
            }

            //3 - Insertar un nuevo nodo Element medico.

            // Crear la etiqueta padre médico.
            Element medico = doc.createElement("medico");
            medico.setAttribute("id","6");

            //Crear la etiqueta hija nombre y darle valor.
            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Alberto");

            //Crear la etiqueta hija apellidos y darle valor.
            Element apellidos = doc.createElement("apellidos");
            apellidos.setTextContent("Martín Martínez");

            //Crear la etiqueta hija edad y darle valor.
            Element edad = doc.createElement("edad");
            edad.setTextContent("31");

            //Construir la estructura general de la etiqueta.
            //medico.appendChild(saltoLinea);
            medico.appendChild(nombre);
            //medico.appendChild(saltoLinea);
            medico.appendChild(apellidos);
            //medico.appendChild(saltoLinea);
            medico.appendChild(edad);
            //medico.appendChild(saltoLinea);

            //Añadir el nuevo nodo al root.
            root.appendChild(medico);

            // 4 - Insertar un nuevo nodo Element medico y sustituirlo por el primer médico.

            //Obtengo una referencia a la primera ocurrencia de médico.
            Element primerMedico = (Element) doc.getElementsByTagName("medico").item(0);

            //Insertamos el nuevo elemento.
            // Crear la etiqueta padre médico.
            Element nuevoMedico1 = doc.createElement("medico");
            nuevoMedico1.setAttribute("id","1");

            //Crear la etiqueta hija nombre y darle valor.
            Element nuevoNombre1 = doc.createElement("nombre");
            nuevoNombre1.setTextContent("Antonio");

            //Crear la etiqueta hija apellidos y darle valor.
            Element nuevoApellidos1 = doc.createElement("apellidos");
            nuevoApellidos1.setTextContent("García Montes");

            //Crear la etiqueta hija edad y darle valor.
            Element nuevaEdad1 = doc.createElement("edad");
            nuevaEdad1.setTextContent("25");

            //Construir la estructura general de la etiqueta.
            //medico.appendChild(saltoLinea);
            nuevoMedico1.appendChild(nuevoNombre1);
            //medico.appendChild(saltoLinea);
            nuevoMedico1.appendChild(nuevoApellidos1);
            //medico.appendChild(saltoLinea);
            nuevoMedico1.appendChild(nuevaEdad1);
            //medico.appendChild(saltoLinea);

            //Reemplazar el nuevo medico por el primer médico.
            root.replaceChild(nuevoMedico1,primerMedico);

            // PROCEDEMOS A VOLCAR TODAS LAS MODIFICACIONES

            //Obtener el objeto transformer.
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            //Configuración del transformer
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            //Crear origen DOMSource.
            DOMSource origenDOM = new DOMSource(root);

            //Creación del fichero que va a ser mi destino
            File nuevoMedicos = new File("dom_modificado.xml");
            StreamResult destino = new StreamResult(nuevoMedicos);

            //Hacer la transformación de escritura.
            transformer.transform(origenDOM,destino);

        }catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            System.out.println(e.getStackTrace());
        }

    }
}
