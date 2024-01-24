package com.flight_reservation.util;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

public class PdfGenrator {

    public void generatePdf(String filepath, String name, String email, String phone , String airline, Date dateOfDeparture , String departureCity, String arrivalCity ){
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(filepath));
            document.open();

            document.add(new Paragraph("Flight Booking details"));
            document.add(new Paragraph("Name: " + name));
            document.add(new Paragraph("Email: " + email));
            document.add(new Paragraph("Phone: " + phone));
            document.add(new Paragraph("Airline: " + airline));
            document.add(new Paragraph("Date of Departure: " + dateOfDeparture.toString()));
            document.add(new Paragraph("Departure City: " + departureCity));
            document.add(new Paragraph("Arrival City: " + arrivalCity));

            document.close();

        }  catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
