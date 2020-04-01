package Tarea1_U8;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//Hereda de la clase que tiene ya implementaciones por defecto de todos los interfaces
public class GenericXML extends DefaultHandler {

    public GenericXML(){super();}

    //Handler para el evento comienzo de documento.
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("Comienzo del parseado del documento hospital.xml.xml");
    }

    //Handler para el evento fin de documento.
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("Fin del parseado del documento hospital.xml.xml");
    }

    //Handler para el evento etiqueta de apertura.
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

        //Abro la etiqueta.
        System.out.print("<"+qName);

        //Recorro los atributos (si tuviera).
        if (attributes != null) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.print(" "+attributes.getQName(i)+"=\""+attributes.getValue(i)+"\"");
            }
        }

        //Cierro la etiqueta.
        System.out.print(">");
    }

    //Handler para el evento etiqueta de cierre.

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);

        System.out.print("</"+qName+">");
    }

    //Handler para el evento Nodo de Texto encontrado.
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);

        String content = new String(ch, start, length);
        System.out.println(content);
    }

}
