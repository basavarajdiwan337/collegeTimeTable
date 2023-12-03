package com.proj.timetable;


import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

public class PDFOne extends Activity {

    public  PdfPTable table;
    public  PdfPCell c1;
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 22, Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 24, Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
    private static final int REQUEST_EXTERNAL_STORAGE = 1;

    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        verifyStoragePermissions(this);
        Toast.makeText(getApplicationContext(),"PDF Generated in your device memory please check",Toast.LENGTH_LONG).show();

    }


    public  void verifyStoragePermissions(Activity activity) {
        // Check if we have write permission
        if (ContextCompat.checkSelfPermission(activity,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE)) {



            } else {
                // No explanation needed, we can request the permission.
                ActivityCompat.requestPermissions(activity,
                        PERMISSIONS_STORAGE,
                        REQUEST_EXTERNAL_STORAGE);

            }


        } else {
            createPDF();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case REQUEST_EXTERNAL_STORAGE: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    createPDF();

                } else {


                    Toast.makeText(PDFOne.this, "Error", Toast.LENGTH_SHORT).show();
                }
                return;
            }

        }
    }


    private  void addContent(Document document) throws DocumentException {
        Anchor anchor = new Anchor("BVV Sangha",redFont );
        anchor.setName("Time Table Generator");
        Paragraph p = new Paragraph(anchor);

        p.add(new Paragraph("Basaveshwara Engineering College(Autonomous), Bagalkote", catFont));
        p.add(new Paragraph("Department of Computer Science and Engineering", redFont));
        p.add(new Paragraph("Time Table for BE(CES) III Semester 21-22", subFont));
        p.setAlignment(Element.ALIGN_CENTER);
        Chapter catPart = new Chapter(p, 1);

        Paragraph subPara = new Paragraph("Div A", subFont);

        Section subCatPart = catPart.addSection(subPara);

        Paragraph paragraph = new Paragraph();
        addEmptyLine(paragraph, 2);
        subCatPart.add(paragraph);

        createTable(subCatPart);

        document.add(catPart);
    }


    private  void createTable(Section subCatPart)
            throws BadElementException {
        table = new PdfPTable(5);

        table.setWidthPercentage(100);

        c1 = new PdfPCell(new Phrase("Day/Time"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        c1.setMinimumHeight(50);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("08:00 am-09:00 am"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        c1.setMinimumHeight(50);

        table.addCell(c1);


        c1 = new PdfPCell(new Phrase("09:00 am-10:00 am"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        c1.setMinimumHeight(50);

        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("10:15 am-11:15 am"));
        c1.setMinimumHeight(50);

        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("11:15 am-12:15 pm`"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        c1.setMinimumHeight(50);
        table.addCell(c1);




        table.setHeaderRows(1);

        table.addCell("Monday");
        table.addCell("Python");
        table.addCell("AI");
        table.addCell("OOPS");
        table.addCell("ADA");



        table.addCell("Tuesday");
        table.addCell("AI");
        table.addCell("Python");
        table.addCell("ADA");
        table.addCell("OS");


        table.addCell("Wednesday");
        table.addCell("OOPS");
        table.addCell("ADA");
        table.addCell("Python");
        table.addCell("OS");



        table.addCell("Thursday");
        table.addCell("OS");
        table.addCell("ADA");
        table.addCell("AI");
        table.addCell("Python");



        table.addCell("Friday");
        table.addCell("OS");
        table.addCell("AI");
        table.addCell("OS");
        table.addCell("ADA");


        table.addCell("Saturday");
        table.addCell("AI");
        table.addCell("OOPS");
        table.addCell("ADA");
        table.addCell("OS");


        subCatPart.add(table);



        Paragraph preface = new Paragraph();
        // We add one empty line
        addEmptyLine(preface, 4);
        subCatPart.add(preface);
        Paragraph preface2 = new Paragraph("Div B", subFont);
        // We add one empty line
        subCatPart.add(preface2);


        Paragraph preface3 = new Paragraph();
        // We add one empty line
        addEmptyLine(preface3, 4);
        subCatPart.add(preface3);

        PdfPTable table1 = new PdfPTable(5);

        table1.setWidthPercentage(100);



        PdfPCell c2 = new PdfPCell(new Phrase("Day/Time"));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setMinimumHeight(50);
        table1.addCell(c2);

        c2 = new PdfPCell(new Phrase("08:00 am-09:00 am"));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setMinimumHeight(50);
        table1.addCell(c2);

        c2 = new PdfPCell(new Phrase("09:00 am-10:00 am"));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setMinimumHeight(50);

        table1.addCell(c2);

        c2 = new PdfPCell(new Phrase("10:15 am-11:15am"));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setMinimumHeight(50);
        table1.addCell(c2);

        c2 = new PdfPCell(new Phrase("11:15am-12:15pm"));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setMinimumHeight(50);
        table1.addCell(c2);



        table1.setHeaderRows(1);

        table1.addCell("Monday");
        table1.addCell("AI");
        table1.addCell("Java");
        table1.addCell("ADA");
        table1.addCell("OOPS");



        table1.addCell("Tuesday");
        table1.addCell("ADA");
        table1.addCell("AI");
        table1.addCell("OS");
        table1.addCell("ADA");



        table1.addCell("Wednesday");
        table1.addCell("Java");
        table1.addCell("OS");
        table1.addCell("ADA");
        table1.addCell("DS");



        table1.addCell("Thursday");
        table1.addCell("Java");
        table1.addCell("AI");
        table1.addCell("ADA");
        table1.addCell("DS");



        table1.addCell("Friday");
        table1.addCell("DS");
        table1.addCell("ADA");
        table1.addCell("Java");
        table1.addCell("AI");


        table1.addCell("Saturday");
        table1.addCell("DS");
        table1.addCell("OS");
        table1.addCell("AI");
        table1.addCell("ADA");


        subCatPart.add(table1);


        Paragraph preface4 = new Paragraph();
        // We add one empty line
        addEmptyLine(preface4, 2);
        subCatPart.add(preface4);
        Paragraph preface5 = new Paragraph("Faculties Undertaking Subjects");
        // We add one empty line
        subCatPart.add(preface5);


        Paragraph preface6 = new Paragraph();
        // We add one empty line
        addEmptyLine(preface6, 1);
        subCatPart.add(preface6);

        PdfPTable table2 = new PdfPTable(5);

        table2.setWidthPercentage(100);



        PdfPCell c3 = new PdfPCell(new Phrase("Serial No"));
        c3.setHorizontalAlignment(Element.ALIGN_CENTER);
        c3.setMinimumHeight(50);
        table2.addCell(c3);

        c3 = new PdfPCell(new Phrase("Subject Code"));
        c3.setHorizontalAlignment(Element.ALIGN_CENTER);
        c3.setMinimumHeight(50);
        table2.addCell(c3);

        c3 = new PdfPCell(new Phrase("Subject"));
        c3.setHorizontalAlignment(Element.ALIGN_CENTER);
        c3.setMinimumHeight(50);

        table2.addCell(c3);

        c3 = new PdfPCell(new Phrase("A Division"));
        c3.setHorizontalAlignment(Element.ALIGN_CENTER);
        c3.setMinimumHeight(50);
        table2.addCell(c3);

        c3 = new PdfPCell(new Phrase("B Division"));
        c3.setHorizontalAlignment(Element.ALIGN_CENTER);
        c3.setMinimumHeight(50);
        table2.addCell(c3);



        table2.setHeaderRows(1);

        table2.addCell("1");
        table2.addCell("AI");
        table2.addCell("Artificial Intelligence");
        table2.addCell("Prof. Hattore");
        table2.addCell("Prof. Hattore");


        table2.addCell("2");
        table2.addCell("OOPS");
        table2.addCell("Object Oriented Programming");
        table2.addCell("Prof. Prahanth");
        table2.addCell("Prof. Prahanth");


        table2.addCell("3");
        table2.addCell("OS");
        table2.addCell("Operating System");
        table2.addCell("Prof. Benkikeri");
        table2.addCell("Prof. Benkikeri");


        table2.addCell("4");
        table2.addCell("DS");
        table2.addCell("Data Structures");
        table2.addCell("Prof. Smitha");
        table2.addCell("Prof. Smitha");




        subCatPart.add(table2);



    }


    public  void createPDF(){
        //create document object
        Document document=new Document();

        //output file path
        String outpath= Environment.getExternalStorageDirectory()+"/TimeTable.pdf";


        try {
            PdfWriter.getInstance(document, new FileOutputStream(outpath));
            document.open();
            addMetaData(document);
            //addTitlePage(document);
            addContent(document);
            document.close();


            Intent pdfv = new Intent(PDFOne.this, PDFLoader.class);
            startActivity(pdfv);


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Toast.makeText(PDFOne.this, "File Not Found:"+e, Toast.LENGTH_LONG).show();
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            Toast.makeText(PDFOne.this, "No Support in your device:"+e, Toast.LENGTH_LONG).show();
            e.printStackTrace();

        }
    }

    private static void addMetaData(Document document) {
        document.addTitle("BEC");
        document.addSubject("BEC Time Table");
        document.addKeywords("Time Table Generation");
        document.addAuthor("BEC");
        document.addCreator("BEC");
    }

    private static void addTitlePage(Document document)
            throws DocumentException {
        Paragraph preface = new Paragraph();
        // We add one empty line
        addEmptyLine(preface, 1);
        // Lets write a big header

        preface.add(new Paragraph("Time Table BEC College", catFont));
        preface.setAlignment(Element.ALIGN_CENTER);
        addEmptyLine(preface, 1);
        // Will create: Report generated by: _name, _date
        /*preface.add(new Paragraph("Report generated by: " + System.getProperty("user.name") + ", " + new Date(), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                smallBold));
        addEmptyLine(preface, 3);
        preface.add(new Paragraph("This document is for Generating Time Table  of BEC College ",
                smallBold));*/

        /* addEmptyLine(preface, 8);*/

        //preface.add(new Paragraph("This document is a preliminary version and not subject to your license agreement or any other agreement with vogella.com ;-).",
        //      redFont));

        document.add(preface);
        // Start a new page
        document.newPage();
    }
    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
}
