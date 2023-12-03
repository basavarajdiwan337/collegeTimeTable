package com.proj.timetable;

import android.app.Activity;
import android.os.Bundle;
import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Environment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class CreatePdf extends Activity {


    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

    private static final int REQUEST_EXTERNAL_STORAGE = 1;

    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createpdf);

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

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.
                    createPDF();

                } else {

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.

                    Toast.makeText(CreatePdf.this, "Error", Toast.LENGTH_SHORT).show();
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }
    public  void createPDF(){
        //create document object
        Document document=new Document();

        //output file path
        String outpath= Environment.getExternalStorageDirectory()+"/TimeTable2.pdf";


        try {
            PdfWriter.getInstance(document, new FileOutputStream(outpath));
            document.open();
            addMetaData(document);
            addTitlePage(document);
            addContent(document);
            document.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Toast.makeText(CreatePdf.this, "File Not Found:"+e, Toast.LENGTH_LONG).show();
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            Toast.makeText(CreatePdf.this, "No Support in your device:"+e, Toast.LENGTH_LONG).show();
            e.printStackTrace();

        }
    }

    // iText allows to add metadata to the PDF which can be viewed in your Adobe
    // Reader
    // under File -> Properties
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
        preface.add(new Paragraph("Report generated by: " + System.getProperty("user.name") + ", " + new Date(), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                smallBold));
        addEmptyLine(preface, 3);
        preface.add(new Paragraph("This document is for Generating Time Table  of BEC College ",
                smallBold));

        addEmptyLine(preface, 8);

        //preface.add(new Paragraph("This document is a preliminary version and not subject to your license agreement or any other agreement with vogella.com ;-).",
          //      redFont));

        document.add(preface);
        // Start a new page
        document.newPage();
    }

    private static void addContent(Document document) throws DocumentException {
        Anchor anchor = new Anchor("Time Table Generator", redFont);
        anchor.setName("Time Table Generator");

        // Second parameter is the number of the chapter
        Chapter catPart = new Chapter(new Paragraph(anchor), 1);

        Paragraph subPara = new Paragraph("Time Table", subFont);
        Section subCatPart = catPart.addSection(subPara);
        //subCatPart.add(new Paragraph("Hello"));

        //subPara = new Paragraph("Subcategory 2", subFont);
        //subCatPart = catPart.addSection(subPara);
        //subCatPart.add(new Paragraph("Paragraph 1"));
       // subCatPart.add(new Paragraph("Paragraph 2"));
       // subCatPart.add(new Paragraph("Paragraph 3"));

        // add a list
       // createList(subCatPart);
        Paragraph paragraph = new Paragraph();
        addEmptyLine(paragraph, 5);
        subCatPart.add(paragraph);

        // add a table
        createTable(subCatPart);

        // now add all this to the document
        document.add(catPart);

        // Next section
        /*anchor = new Anchor("Second Chapter", catFont);
        anchor.setName("Second Chapter");*/

        // Second parameter is the number of the chapter
        catPart = new Chapter(new Paragraph(anchor), 1);

        /*subPara = new Paragraph("Subcategory", subFont);
        subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph("This is a very important message"));*/

        // now add all this to the document
        document.add(catPart);

    }

    private static void createTable(Section subCatPart)
            throws BadElementException {
        PdfPTable table = new PdfPTable(8);

        table.setWidthPercentage(100);

            /*table.setBorderColor(BaseColor.GRAY);
            table.setPadding(4);
            table.setSpacing(4);
            table.setBorderWidth(1);
*/
        PdfPCell c1 = new PdfPCell(new Phrase("Day/Time"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("8-9"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("9-10"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);

        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("10-11"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("11-12"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);


        c1 = new PdfPCell(new Phrase("12-1"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("1:30-3:30"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);


        c1 = new PdfPCell(new Phrase("3:30-5:30"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        table.setHeaderRows(1);

        table.addCell("Monday");
        table.addCell("C");
        table.addCell("C++");
        table.addCell("OOPS");
        table.addCell("Java");
        table.addCell("OS");
        table.addCell("Lab C++");
        table.addCell("Lab DS");


        table.addCell("Tuesday");
        table.addCell("C++");
        table.addCell("C");
        table.addCell("Java");
        table.addCell("OOPS");
        table.addCell("OS");
        table.addCell("Lab C++");
        table.addCell("Lab DS");


        table.addCell("Wednesday");
        table.addCell("OOPS");
        table.addCell("C++");
        table.addCell("Java");
        table.addCell("C");
        table.addCell("OS");
        table.addCell("Lab DS");
        table.addCell("Lab C++");


        table.addCell("Thursday");
        table.addCell("OS");
        table.addCell("Java");
        table.addCell("OOPS");
        table.addCell("C++");
        table.addCell("C");
        table.addCell("Lab C++");
        table.addCell("Lab DS");


        table.addCell("Friday");
        table.addCell("OS");
        table.addCell("C++");
        table.addCell("OS");
        table.addCell("Java");
        table.addCell("C");
        table.addCell("Lab DS");
        table.addCell("Lab C++");

        table.addCell("Saturday");
        table.addCell("C");
        table.addCell("C++");
        table.addCell("OOPS");
        table.addCell("Java");
        table.addCell("OS");
        table.addCell("Lab C++");
        table.addCell("Lab DS");

        subCatPart.add(table);

    }

    private static void createList(Section subCatPart) {
        List list = new List(true, false, 10);
        list.add(new ListItem("First point"));
        list.add(new ListItem("Second point"));
        list.add(new ListItem("Third point"));
        subCatPart.add(list);
    }

    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
}
