package Tarea3_U8;

import Tarea2_U8.Medico;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.util.ArrayList;

public class MostrarStax {
    public static void main(String[] args) {

        try{
            //Obtener el lector de eventos.
            XMLInputFactory xmlIF = XMLInputFactory.newInstance();
            XMLEventReader xmlR = xmlIF.createXMLEventReader(new FileInputStream("hospital.xml"));

            //Iterar la lista de eventos.
            while (xmlR.hasNext()){
                //Solicitar al lector el siguiente evento.
                XMLEvent xmlE = xmlR.nextEvent();

                //Si es un evento de apertura de etiqueta.
                if (xmlE.isStartElement()){
                    //Obterner información de la etiqueta.
                    StartElement startTag = xmlE.asStartElement();

                    //Abro la etiqueta.
                    //System.out.println("<"+ startTag.getName().getLocalPart());

                    //Establezco el tagActual al nombre de la etiqueta detectada.
                    String tagName = startTag.getName().getLocalPart();
                    switch (tagName){
                        case "hospital":
                            System.out.println("<"+startTag.getName().getLocalPart()+">");
                            break;
                        case "medico":
                            Attribute id = startTag.getAttributeByName(new QName("id"));
                            System.out.print("\t" + "<" + startTag.getName().getLocalPart());
                            System.out.println(" " + id.getName() + "\"" + id.getValue() + "\"" + ">");
                            break;
                        case "nombre":
                            System.out.println("\t\t" + "<" + startTag.getName().getLocalPart() + ">");
                            break;
                        case "apellidos":
                            System.out.println("\t\t" + "<" + startTag.getName().getLocalPart() + ">");
                            break;
                        case "edad":
                            System.out.println("\t\t" + "<" + startTag.getName().getLocalPart() + ">");
                            break;
                    }

                }else if (xmlE.isEndElement()){
                    //Si es un evento de fin de etiqueta.
                    EndElement endTag = xmlE.asEndElement();

                    System.out.println("\t\t"+"<\\" + endTag.getName().getLocalPart() + ">" +"\n");

                }else if (xmlE.isStartDocument()){
                    System.out.println("Comienzo del parseado del documento");
                }else if (xmlE.isEndDocument()){
                    System.out.println("Fin del parseado del documento");
                }else if (xmlE.isCharacters()){
                    //Nodo de texto.
                    Characters text = xmlE.asCharacters();

                    if (!text.getData().contains("\n")){
                        System.out.println("\t\t\t" + text.getData());
                    }
                }
            }

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());

        }
    }
}
