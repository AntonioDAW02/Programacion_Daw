package Tarea2_U8;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class DomDesdeCero {
    public static void main(String[] args) {
        //Crear el ArrayList.
        ArrayList<Medico> lista = new ArrayList<>();
        // Añade los elementos al ArrayList.
        lista.add(new Medico("34567667O","Antonio","García Montes", 25));
        lista.add(new Medico( "19457698U","Roberto","Fernandez Sanchez", 30));
        lista.add(new Medico( "45697778S","Gustavo","Martín Gonzalez", 40));
        lista.add(new Medico( "09165847A","Oracio","Salas Salas", 39));
        lista.add(new Medico( "67583023Z","Segismundo","Mendez Sanchez", 45));
        lista.add(new Medico( "34556701X","Tony","Martinez Mendes", 33));
        lista.add(new Medico( "06706113F","Nigga","Gonzalez Montes", 45));
        lista.add(new Medico( "57679998D","Trujillo","Fernandez Montes", 25));
        lista.add(new Medico( "12098909C","Paco","García Salas", 55));
        lista.add(new Medico( "56876789V","Dani","Gonzalez Montes", 27));

        try{

            //Obtener la referencia al objeto "Document".
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.newDocument();
            Element root = doc.createElement("hospital");
            doc.appendChild(root);

            Integer i = 0;

            //Crear médicos.
            Iterator it = lista.iterator();
            while (it.hasNext()){
                Medico med = (Medico) it.next();

                //Crear etiquetas médico.
                Element etiquetaMedico = doc.createElement(med.getClass().getSimpleName());
                etiquetaMedico.setAttribute("id", i.toString());
                root.appendChild(etiquetaMedico);
                i++;

                //Crear etiquetas hijas y sus atributos.
                //Etiqueta dni.
                Element dni = doc.createElement("dni");
                dni.setTextContent((med.getDni()));
                etiquetaMedico.appendChild(dni);
                //Etiqueta nombre.
                Element nombre = doc.createElement("nombre");
                nombre.setTextContent((med.getNombre()));
                etiquetaMedico.appendChild(nombre);
                //Etiqueta apellidos.
                Element apellidos = doc.createElement("apellidos");
                apellidos.setTextContent((med.getApellidos()));
                etiquetaMedico.appendChild(apellidos);
                //Etiqueta edad.
                Element edad = doc.createElement("edad");
                edad.setTextContent(Integer.toString(med.getEdad()));
                etiquetaMedico.appendChild(edad);
            }

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
            File nuevoXML = new File("Medico_DesdeCero.xml");
            StreamResult destino = new StreamResult(nuevoXML);

            //Hacer la transformación de escritura.
            transformer.transform(origenDOM,destino);

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }


}
