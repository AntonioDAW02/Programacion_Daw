package Tarea1_U8;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class RecorridoSAX  {
    public static void main(String[] args) {
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();

            DefaultHandler medicoSax = new GenericXML();

            saxParser.parse(new File("hospital.xml"), medicoSax);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
