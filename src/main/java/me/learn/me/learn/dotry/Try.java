package me.learn.me.learn.dotry;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Try {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    private static SimpleDateFormat sdfDb = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) throws DatatypeConfigurationException, ParseException {
        String date = "2021-11-11";
        String holidayDate = sdf.format(sdfDb.parse(date));
        System.out.println(DatatypeFactory.newInstance().newXMLGregorianCalendar(holidayDate));
        System.out.println(DatatypeFactory.newInstance().newXMLGregorianCalendar(date));
    }
}
