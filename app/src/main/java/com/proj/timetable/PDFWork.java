package com.proj.timetable;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PDFWork extends Activity {


    PdfPTable table;

    private static final int REQUEST_EXTERNAL_STORAGE = 1;

    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    private static Font mainHead = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static Font titleHead = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);
    private static Font subHead = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static Font subHeadSmall = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        verifyStoragePermissions(this);
    }



    private void verifyStoragePermissions(Activity activity) {
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

    private void createPDF() {

        Document document=new Document();

        //output file path
        String outpath= Environment.getExternalStorageDirectory()+"/TimeTable.pdf";


        try {
            PdfWriter.getInstance(document, new FileOutputStream(outpath));
            document.open();
            addMetaData(document);
            addContent(document);
            document.close();
            Intent pdfv = new Intent(PDFWork.this, PDFLoader.class);
            startActivity(pdfv);


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Toast.makeText(PDFWork.this, "File Not Found:"+e, Toast.LENGTH_LONG).show();
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            Toast.makeText(PDFWork.this, "No Support in your device:"+e, Toast.LENGTH_LONG).show();
            e.printStackTrace();

        }

    }

    private void addContent(Document document) {
        try {

            Paragraph titleS = new Paragraph("BVV Sangha", this.titleHead);
            titleS.setAlignment(Element.ALIGN_CENTER);
            document.add(titleS);




            Paragraph emptyS = new Paragraph();
            addEmptyLine(emptyS, 2);
            document.add(emptyS);




        }catch(Exception e){
            Toast.makeText(getApplicationContext(), "Error: "+e, Toast.LENGTH_LONG).show();
        }
    }

    private static void addMetaData(Document document) {
        document.addTitle("BEC");
        document.addSubject("BEC Time Table");
        document.addKeywords("Time Table Generation");
        document.addAuthor("BEC");
        document.addCreator("BEC");
    }
    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
}
