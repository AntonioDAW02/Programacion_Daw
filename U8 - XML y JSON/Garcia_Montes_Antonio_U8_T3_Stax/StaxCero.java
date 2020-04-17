package Tarea3_U8;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.events.*;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class StaxCero {
    public static void main(String[] args) {
        ArrayList<Medico> medicos = new ArrayList<>();

        //Crear los objeto necesarios.
        Medico m1 = new Medico(1,"34567667O","Antonio","García Montes", 25);
        Medico m2 = new Medico( 2,"19457698U","Roberto","Fernandez Sanchez", 30);
        Medico m3 = new Medico( 3,"45697778S","Gustavo","Martín Gonzalez", 40);
        Medico m4 = new Medico( 4,"09165847A","Oracio","Salas Salas", 39);
        Medico m5 = new Medico( 5,"67583023Z","Segismundo","Mendez Sanchez", 45);
        Medico m6 = new Medico( 6,"34556701X","Tony","Martinez Mendes", 33);
        Medico m7 = new Medico( 7,"06706113F","Nigga","Gonzalez Montes", 45);
        Medico m8 = new Medico( 8,"57679998D","Trujillo","Fernandez Montes", 25);
        Medico m9 = new Medico( 9,"12098909C","Paco","García Salas", 55);
        Medico m10 = new Medico( 10,"56876789V","Dani","Gonzalez Montes", 27);

        //Los añado a la lista
        medicos.add(m1);
        medicos.add(m2);
        medicos.add(m3);
        medicos.add(m4);
        medicos.add(m5);
        medicos.add(m6);
        medicos.add(m7);
        medicos.add(m8);
        medicos.add(m9);
        medicos.add(m10);

        try{

            //Crear objeto para escribir.
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("stax.xml"));

            //Crear objeto para crear eventos.
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            //Crear el evento del inicio del documento.
            StartDocument startDocument = eventFactory.createStartDocument();
            //Escribir con el objeto escritor.
            xmlWriter.add(startDocument);

            //Crear el evento para introducir el salto de línea.
            Characters saltoDeLinea = eventFactory.createCharacters("\n");
            //y el de salto de línea con tabulador.
            Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");
            xmlWriter.add(saltoDeLinea);

            //Crear el evento necesario para crear la etiqueta raíz medicos.
            StartElement hospitalStartElement = eventFactory.createStartElement("","","hospital");
            xmlWriter.add(hospitalStartElement);
            xmlWriter.add(saltoDeLineaTab);

            //Variable para controlar el último médico.
            int longitud = 0;

            for (Medico m : medicos) {

                //Crear todas las etiquetas de apertura  que va a tener cada uno de los medicos.
                StartElement medicoStart = eventFactory.createStartElement("","","medico");
                StartElement idStart = eventFactory.createStartElement("","","id");
                StartElement dniStart = eventFactory.createStartElement("","","dni");
                StartElement nombreStart = eventFactory.createStartElement("","","nombre");
                StartElement apellidosStart = eventFactory.createStartElement("","","apellidos");
                StartElement edadStart = eventFactory.createStartElement("","","edad");

                //Crear el atribudo id.
                Attribute id = eventFactory.createAttribute("id",Integer.toString(m.getId()));

                //Crear todas las etiquetas de cierre que va a tener cada uno de los médicos.
                EndElement medicoEnd = eventFactory.createEndElement("","","medico");
                EndElement idEnd = eventFactory.createEndElement("","","id");
                EndElement dniEnd = eventFactory.createEndElement("","","dni");
                EndElement nombreEnd = eventFactory.createEndElement("","","nombre");
                EndElement apellidosEnd = eventFactory.createEndElement("","","apellidos");
                EndElement edadEnd = eventFactory.createEndElement("","","edad");

                //Creo los contenidos
                Characters idC = eventFactory.createCharacters(Integer.toString(m.getId()));
                Characters dniC = eventFactory.createCharacters(m.getDni());
                Characters nombreC = eventFactory.createCharacters(m.getNombre());
                Characters apellidosC  = eventFactory.createCharacters(m.getApellidos());
                Characters edadC = eventFactory.createCharacters(Integer.toString(m.getEdad()));

                //Añadir todos los elementos correspondientes a un médico.
                xmlWriter.add(medicoStart);

                //Añadir el atributo.
                xmlWriter.add(id);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                //Hijos de cada médico.
                xmlWriter.add(idStart);
                xmlWriter.add(idC);
                xmlWriter.add(idEnd);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                xmlWriter.add(dniStart);
                xmlWriter.add(dniC);
                xmlWriter.add(dniEnd);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                xmlWriter.add(nombreStart);
                xmlWriter.add(nombreC);
                xmlWriter.add(nombreEnd);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                xmlWriter.add(apellidosStart);
                xmlWriter.add(apellidosC);
                xmlWriter.add(apellidosEnd);

                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                xmlWriter.add(edadStart);
                xmlWriter.add(edadC);
                xmlWriter.add(edadEnd);

                xmlWriter.add(saltoDeLineaTab);

                //Cerrar el médico que estoy escribiendo.
                xmlWriter.add(medicoEnd);

                if (longitud == medicos.size() - 1) {
                    xmlWriter.add(saltoDeLinea);
                } else {
                    xmlWriter.add(saltoDeLineaTab);
                }

                longitud++;

            }

            //Crear el evento para cerrar la etiqueta raíz hospital.
            EndElement hospitalEndElement = eventFactory.createEndElement("","","hospital");
            xmlWriter.add(hospitalEndElement);
            xmlWriter.add(saltoDeLinea);

            //Crear el evento de finalización del documento.
            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);

        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
