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

public class PDFCreation extends Activity {

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

                // Show an expanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

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


                    Toast.makeText(PDFCreation.this, "Error", Toast.LENGTH_SHORT).show();
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

        Paragraph subPara = new Paragraph("Div A", redFont);

        Section subCatPart = catPart.addSection(subPara);


        Paragraph paragraph = new Paragraph();
        addEmptyLine(paragraph, 2);
        subCatPart.add(paragraph);

        createTable(subCatPart);

        document.add(catPart);


    }


    private  void createTable(Section subCatPart)
            throws BadElementException {
        table = new PdfPTable(7);

        table.setWidthPercentage(100);

        c1 = new PdfPCell(new Phrase("Day/Time"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        c1.setMinimumHeight(50);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("8am-9am"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        c1.setMinimumHeight(50);

        table.addCell(c1);


        c1 = new PdfPCell(new Phrase("9am-10am"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        c1.setMinimumHeight(50);

        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("10:15am-11:15am"));
        c1.setMinimumHeight(50);

        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("11:15am-12:15am`"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        c1.setMinimumHeight(50);
        table.addCell(c1);


        c1 = new PdfPCell(new Phrase("2:30-4:00"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        c1.setMinimumHeight(50);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("4:00-5:30"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        c1.setMinimumHeight(50);
        table.addCell(c1);


        table.setHeaderRows(1);

        table.addCell("Monday");
        table.addCell("C");
        table.addCell("C++");
        table.addCell("OOPS");
        table.addCell("Java");
        table.addCell("Lab C++");
        table.addCell("Lab DS");


        table.addCell("Tuesday");
        table.addCell("C++");
        table.addCell("C");
        table.addCell("Java");
        table.addCell("OS");
        table.addCell("Lab C++");
        table.addCell("Lab DS");


        table.addCell("Wednesday");
        table.addCell("OOPS");
        table.addCell("Java");
        table.addCell("C");
        table.addCell("OS");
        table.addCell("Lab DS");
        table.addCell("Lab C++");


        table.addCell("Thursday");
        table.addCell("OS");
        table.addCell("Java");
        table.addCell("C++");
        table.addCell("C");
        table.addCell("Lab C++");
        table.addCell("Lab DS");


        table.addCell("Friday");
        table.addCell("OS");
        table.addCell("C++");
        table.addCell("OS");
        table.addCell("Java");
        table.addCell("Lab DS");
        table.addCell("Lab C++");

        table.addCell("Saturday");
        table.addCell("C++");
        table.addCell("OOPS");
        table.addCell("Java");
        table.addCell("OS");
        table.addCell("Lab C++");
        table.addCell("Lab DS");

        subCatPart.add(table);



        Paragraph preface = new Paragraph();
        // We add one empty line
        addEmptyLine(preface, 4);
        subCatPart.add(preface);
        Paragraph preface2 = new Paragraph("Div B");
        // We add one empty line
        subCatPart.add(preface2);


        Paragraph preface3 = new Paragraph();
        // We add one empty line
        addEmptyLine(preface3, 4);
        subCatPart.add(preface3);

        PdfPTable table1 = new PdfPTable(7);

        table1.setWidthPercentage(100);



        PdfPCell c2 = new PdfPCell(new Phrase("Day/Time"));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setMinimumHeight(50);
        table1.addCell(c2);

        c2 = new PdfPCell(new Phrase("8-10"));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setMinimumHeight(50);
        table1.addCell(c2);

        c2 = new PdfPCell(new Phrase("10-12"));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setMinimumHeight(50);

        table1.addCell(c2);

        c2 = new PdfPCell(new Phrase("12-02"));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setMinimumHeight(50);
        table1.addCell(c2);

        c2 = new PdfPCell(new Phrase("12-02"));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setMinimumHeight(50);
        table1.addCell(c2);


        c2 = new PdfPCell(new Phrase("2:30-4:00"));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setMinimumHeight(50);
        table1.addCell(c2);

        c2 = new PdfPCell(new Phrase("4:00-5:30"));
        c2.setHorizontalAlignment(Element.ALIGN_CENTER);
        c2.setMinimumHeight(50);
        table1.addCell(c2);


        table1.setHeaderRows(1);

        table1.addCell("Monday");
        table1.addCell("C++");
        table1.addCell("C");
        table1.addCell("Java");
        table1.addCell("OOPS");
        table1.addCell("Lab CS");
        table1.addCell("Lab C++");


        table1.addCell("Tuesday");
        table1.addCell("Java");
        table1.addCell("C++");
        table1.addCell("OS");
        table1.addCell("Java");
        table1.addCell("Lab C++");
        table1.addCell("Lab DS");


        table1.addCell("Wednesday");
        table1.addCell("C");
        table1.addCell("OS");
        table1.addCell("Java");
        table1.addCell("DS");
        table1.addCell("Lab C++");
        table1.addCell("Lab DS");


        table1.addCell("Thursday");
        table1.addCell("C");
        table1.addCell("C++");
        table1.addCell("Java");
        table1.addCell("DS");
        table1.addCell("Lab C++");
        table1.addCell("Lab DS");


        table1.addCell("Friday");
        table1.addCell("DS");
        table1.addCell("Java");
        table1.addCell("C");
        table1.addCell("C++");
        table1.addCell("Lab C++");
        table1.addCell("Lab C++");

        table1.addCell("Saturday");
        table1.addCell("DS");
        table1.addCell("OS");
        table1.addCell("C++");
        table1.addCell("Java");
        table1.addCell("Lab C++");
        table1.addCell("Lab DS");

        subCatPart.add(table1);


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


            Intent pdfv = new Intent(PDFCreation.this, PDFLoader.class);
            startActivity(pdfv);


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Toast.makeText(PDFCreation.this, "File Not Found:"+e, Toast.LENGTH_LONG).show();
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            Toast.makeText(PDFCreation.this, "No Support in your device:"+e, Toast.LENGTH_LONG).show();
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
