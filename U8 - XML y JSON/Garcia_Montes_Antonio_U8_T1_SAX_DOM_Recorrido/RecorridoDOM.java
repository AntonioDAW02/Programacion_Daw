package Tarea1_U8;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RecorridoDOM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1:\n");
        numNodosHijos();

        System.out.println("2:\n");
        mostrarXMLDom();

        System.out.println("3:\n");

        System.out.println("Introduce el nombre de una etiqueta");
        String etiqueta = sc.nextLine();
        Element elementoEtiq = null;

        try {
            //Cargamos el Fichero XML en Memoria.
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc1 = (Document) db.parse(new File("hospital.xml"));

            elementoEtiq = doc1.createElement(etiqueta);

        }catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
        mostrarContenidoEtiqueta(elementoEtiq);
    }

    public static void numNodosHijos() {
        try {
            //Cargamos el Fichero XML en Memoria.
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc1 = db.parse(new File("hospital.xml"));

            Element elements = doc1.getDocumentElement();

            System.out.println("Número de nodos hijos del elemento raíz: " + elements.getChildNodes());

            NodeList lista = elements.getChildNodes();

            System.out.println("Información de los Nodos:");

            for (int i = 0; i < lista.getLength(); i++) {
                System.out.println("Nodo: " + i);
                System.out.println("Tipo Nodo: " + lista.item(i).getNodeType());
                System.out.println("*******************************************");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void mostrarXMLDom(){
        try {
            //Cargamos el Fichero XML en Memoria.
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc1 = db.parse(new File("hospital.xml"));

            Element elements = doc1.getDocumentElement();

            NodeList lista = elements.getChildNodes();

            System.out.println("Información de los Nodos:");

            for (int i = 0; i < lista.getLength(); i++) {
                System.out.println("Nodo" + i + "Nombre" + lista.item(i).getNodeName());
                System.out.println("Tipo de Nodo" + lista.item(i).getNodeType());
                if (lista.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("Contiene: " + lista.item(i).getTextContent());
                }
                System.out.println("*******************************************");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void mostrarContenidoEtiqueta(Element el) {
        try {
            //Cargamos el Fichero XML en Memoria.
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc1 = db.parse(new File("hospital.xml"));

            NodeList lista = doc1.getElementsByTagName(el.getTagName());

            if (lista.getLength() == 0) {
                System.out.println("No existe ninguna etiqueta con ese nombre");
            }else {
                for (int i = 0; i < lista.getLength(); i++) {
                    Node nodo = lista.item(i);

                    Element eNode = (Element) lista.item(i);
                    System.out.println("Nombre: " + eNode.getTagName() + "Id: " + eNode.getAttribute("id"));

                    if (nodo.hasChildNodes()) {
                        System.out.println("Etiquetas hijas: ");
                        NodeList lista2 = nodo.getChildNodes();

                        for (int j = 0; j < lista2.getLength(); j++) {
                            if (lista2.item(j).getNodeType() == Node.ELEMENT_NODE){
                                Element eNodeHijo = (Element) lista2.item(j);
                                System.out.println("      " + eNodeHijo.getTagName() + ": " + eNodeHijo.getTextContent());
                            }
                        }
                    } else {
                        System.out.println("Esta etiqueta no tiene ninguna etiqueta hija");
                    }
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
