package com.proj.timetable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class AddTTDetails extends Activity implements View.OnClickListener {

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    String commonId;
    int id;

    String Pyear, Pschema, Pdept, Psem, Pdiv, Psub;
    Spinner spnLecHour1, spnTutorHour1, spnPracHour1, spnCredit1, spnSub1, spnFacDivA1, spnFacDivB1;
    Spinner spnLecHour2, spnTutorHour2, spnPracHour2, spnCredit2, spnSub2, spnFacDivA2, spnFacDivB2;
    Spinner spnLecHour3, spnTutorHour3, spnPracHour3, spnCredit3, spnSub3, spnFacDivA3, spnFacDivB3;
    Spinner spnLecHour4, spnTutorHour4, spnPracHour4, spnCredit4, spnSub4, spnFacDivA4, spnFacDivB4;
    Spinner spnLecHour5, spnTutorHour5, spnPracHour5, spnCredit5, spnSub5, spnFacDivA5, spnFacDivB5;
    Spinner spnLecHour6, spnTutorHour6, spnPracHour6, spnCredit6, spnSub6, spnFacDivA6, spnFacDivB6;
    Spinner spnLecHour7, spnTutorHour7, spnPracHour7, spnCredit7, spnSub7, spnFacDivA7, spnFacDivB7;
    Spinner spnLecHour8, spnTutorHour8, spnPracHour8, spnCredit8, spnSub8, spnFacDivA8, spnFacDivB8;
    Spinner spnLecHour9, spnTutorHour9, spnPracHour9, spnCredit9, spnSub9, spnFacDivA9, spnFacDivB9;
    Spinner spnLecHour10, spnTutorHour10, spnPracHour10, spnCredit10, spnSub10, spnFacDivA10, spnFacDivB10;
    Spinner spnLecHour11, spnTutorHour11, spnPracHour11, spnCredit11, spnSub11, spnFacDivA11, spnFacDivB11;
    Spinner spnLecHour12, spnTutorHour12, spnPracHour12, spnCredit12, spnSub12, spnFacDivA12, spnFacDivB12;
    Spinner spnLecHour13, spnTutorHour13, spnPracHour13, spnCredit13, spnSub13, spnFacDivA13, spnFacDivB13;
    Spinner spnLecHour14, spnTutorHour14, spnPracHour14, spnCredit14, spnSub14, spnFacDivA14, spnFacDivB14;
    Spinner spnLecHour15, spnTutorHour15, spnPracHour15, spnCredit15, spnSub15, spnFacDivA15, spnFacDivB15;

    Button btnSaveDraft;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adding_details_form);

        Intent i = getIntent();
        Pyear = i.getStringExtra("year");
        Pschema = i.getStringExtra("schema");
        Pdept = i.getStringExtra("dept");
        Psem = i.getStringExtra("sem");

        Psub = i.getStringExtra("sub");


         commonId = Pyear+"-"+Pschema+"-"+Pdept+"-"+Psem+"";

        btnSaveDraft = (Button) findViewById(R.id.btnSaveDraft);

        btnSaveDraft.setOnClickListener(this);

        spnLecHour1 = (Spinner) findViewById(R.id.spnLecHour1);
        spnTutorHour1 = (Spinner) findViewById(R.id.spnTutorHour1);
        spnPracHour1 = (Spinner) findViewById(R.id.spnPracHour1);
        spnCredit1 = (Spinner) findViewById(R.id.spnCredit1);
        spnSub1 = (Spinner) findViewById(R.id.spnSub1);
        spnFacDivA1 = (Spinner) findViewById(R.id.spnFacDivA1);
        spnFacDivB1 = (Spinner) findViewById(R.id.spnFacDivB1);

        spnLecHour2 = (Spinner) findViewById(R.id.spnLecHour2);
        spnTutorHour2 = (Spinner) findViewById(R.id.spnTutorHour2);
        spnPracHour2 = (Spinner) findViewById(R.id.spnPracHour2);
        spnCredit2 = (Spinner) findViewById(R.id.spnCredit2);
        spnSub2 = (Spinner) findViewById(R.id.spnSub2);
        spnFacDivA2 = (Spinner) findViewById(R.id.spnFacDivA2);
        spnFacDivB2 = (Spinner) findViewById(R.id.spnFacDivB2);


        spnLecHour3 = (Spinner) findViewById(R.id.spnLecHour3);
        spnTutorHour3 = (Spinner) findViewById(R.id.spnTutorHour3);
        spnPracHour3 = (Spinner) findViewById(R.id.spnPracHour3);
        spnCredit3 = (Spinner) findViewById(R.id.spnCredit3);
        spnSub3 = (Spinner) findViewById(R.id.spnSub3);
        spnFacDivA3 = (Spinner) findViewById(R.id.spnFacDivA3);
        spnFacDivB3 = (Spinner) findViewById(R.id.spnFacDivB3);


        spnLecHour4 = (Spinner) findViewById(R.id.spnLecHour4);
        spnTutorHour4 = (Spinner) findViewById(R.id.spnTutorHour4);
        spnPracHour4 = (Spinner) findViewById(R.id.spnPracHour4);
        spnCredit4 = (Spinner) findViewById(R.id.spnCredit4);
        spnSub4 = (Spinner) findViewById(R.id.spnSub4);
        spnFacDivA4 = (Spinner) findViewById(R.id.spnFacDivA4);
        spnFacDivB4 = (Spinner) findViewById(R.id.spnFacDivB4);

        spnLecHour5 = (Spinner) findViewById(R.id.spnLecHour5);
        spnTutorHour5 = (Spinner) findViewById(R.id.spnTutorHour5);
        spnPracHour5 = (Spinner) findViewById(R.id.spnPracHour5);
        spnCredit5 = (Spinner) findViewById(R.id.spnCredit5);
        spnSub5 = (Spinner) findViewById(R.id.spnSub5);
        spnFacDivA5 = (Spinner) findViewById(R.id.spnFacDivA5);
        spnFacDivB5 = (Spinner) findViewById(R.id.spnFacDivB5);

        spnLecHour6 = (Spinner) findViewById(R.id.spnLecHour6);
        spnTutorHour6 = (Spinner) findViewById(R.id.spnTutorHour6);
        spnPracHour6 = (Spinner) findViewById(R.id.spnPracHour6);
        spnCredit6 = (Spinner) findViewById(R.id.spnCredit6);
        spnSub6 = (Spinner) findViewById(R.id.spnSub6);
        spnFacDivA6 = (Spinner) findViewById(R.id.spnFacDivA6);
        spnFacDivB6 = (Spinner) findViewById(R.id.spnFacDivB6);

        spnLecHour7 = (Spinner) findViewById(R.id.spnLecHour7);
        spnTutorHour7 = (Spinner) findViewById(R.id.spnTutorHour7);
        spnPracHour7 = (Spinner) findViewById(R.id.spnPracHour7);
        spnCredit7 = (Spinner) findViewById(R.id.spnCredit7);
        spnSub7 = (Spinner) findViewById(R.id.spnSub7);
        spnFacDivA7 = (Spinner) findViewById(R.id.spnFacDivA7);
        spnFacDivB7 = (Spinner) findViewById(R.id.spnFacDivB7);

        spnLecHour8 = (Spinner) findViewById(R.id.spnLecHour8);
        spnTutorHour8 = (Spinner) findViewById(R.id.spnTutorHour8);
        spnPracHour8 = (Spinner) findViewById(R.id.spnPracHour8);
        spnCredit8 = (Spinner) findViewById(R.id.spnCredit8);
        spnSub8 = (Spinner) findViewById(R.id.spnSub8);
        spnFacDivA8 = (Spinner) findViewById(R.id.spnFacDivA8);
        spnFacDivB8 = (Spinner) findViewById(R.id.spnFacDivB8);

        spnLecHour9 = (Spinner) findViewById(R.id.spnLecHour9);
        spnTutorHour9 = (Spinner) findViewById(R.id.spnTutorHour9);
        spnPracHour9 = (Spinner) findViewById(R.id.spnPracHour9);
        spnCredit9 = (Spinner) findViewById(R.id.spnCredit9);
        spnSub9 = (Spinner) findViewById(R.id.spnSub9);
        spnFacDivA9 = (Spinner) findViewById(R.id.spnFacDivA9);
        spnFacDivB9 = (Spinner) findViewById(R.id.spnFacDivB9);

        spnLecHour10 = (Spinner) findViewById(R.id.spnLecHour10);
        spnTutorHour10 = (Spinner) findViewById(R.id.spnTutorHour10);
        spnPracHour10 = (Spinner) findViewById(R.id.spnPracHour10);
        spnCredit10 = (Spinner) findViewById(R.id.spnCredit10);
        spnSub10 = (Spinner) findViewById(R.id.spnSub10);
        spnFacDivA10 = (Spinner) findViewById(R.id.spnFacDivA10);
        spnFacDivB10 = (Spinner) findViewById(R.id.spnFacDivB10);

        spnLecHour11 = (Spinner) findViewById(R.id.spnLecHour11);
        spnTutorHour11 = (Spinner) findViewById(R.id.spnTutorHour11);
        spnPracHour11 = (Spinner) findViewById(R.id.spnPracHour11);
        spnCredit11 = (Spinner) findViewById(R.id.spnCredit11);
        spnSub11 = (Spinner) findViewById(R.id.spnSub11);
        spnFacDivA11 = (Spinner) findViewById(R.id.spnFacDivA11);
        spnFacDivB11 = (Spinner) findViewById(R.id.spnFacDivB11);

        spnLecHour12 = (Spinner) findViewById(R.id.spnLecHour12);
        spnTutorHour12 = (Spinner) findViewById(R.id.spnTutorHour12);
        spnPracHour12 = (Spinner) findViewById(R.id.spnPracHour12);
        spnCredit12 = (Spinner) findViewById(R.id.spnCredit12);
        spnSub12 = (Spinner) findViewById(R.id.spnSub12);
        spnFacDivA12 = (Spinner) findViewById(R.id.spnFacDivA12);
        spnFacDivB12 = (Spinner) findViewById(R.id.spnFacDivB12);

        spnLecHour13 = (Spinner) findViewById(R.id.spnLecHour13);
        spnTutorHour13 = (Spinner) findViewById(R.id.spnTutorHour13);
        spnPracHour13 = (Spinner) findViewById(R.id.spnPracHour13);
        spnCredit13 = (Spinner) findViewById(R.id.spnCredit13);
        spnSub13 = (Spinner) findViewById(R.id.spnSub13);
        spnFacDivA13 = (Spinner) findViewById(R.id.spnFacDivA13);
        spnFacDivB13 = (Spinner) findViewById(R.id.spnFacDivB13);

        spnLecHour14 = (Spinner) findViewById(R.id.spnLecHour14);
        spnTutorHour14 = (Spinner) findViewById(R.id.spnTutorHour14);
        spnPracHour14 = (Spinner) findViewById(R.id.spnPracHour14);
        spnCredit14 = (Spinner) findViewById(R.id.spnCredit14);
        spnSub14 = (Spinner) findViewById(R.id.spnSub14);
        spnFacDivA14 = (Spinner) findViewById(R.id.spnFacDivA14);
        spnFacDivB14 = (Spinner) findViewById(R.id.spnFacDivB14);

        spnLecHour15 = (Spinner) findViewById(R.id.spnLecHour15);
        spnTutorHour15 = (Spinner) findViewById(R.id.spnTutorHour15);
        spnPracHour15 = (Spinner) findViewById(R.id.spnPracHour15);
        spnCredit15 = (Spinner) findViewById(R.id.spnCredit15);
        spnSub15 = (Spinner) findViewById(R.id.spnSub15);
        spnFacDivA15 = (Spinner) findViewById(R.id.spnFacDivA15);
        spnFacDivB15 = (Spinner) findViewById(R.id.spnFacDivB15);


        if (Integer.parseInt(Psub) == 1) {
            spnLecHour2.setVisibility(View.GONE);
            spnTutorHour2.setVisibility(View.GONE);
            spnPracHour2.setVisibility(View.GONE);
            spnCredit2.setVisibility(View.GONE);
            spnSub2.setVisibility(View.GONE);
            spnFacDivA2.setVisibility(View.GONE);
            spnFacDivB2.setVisibility(View.GONE);


            spnLecHour3.setVisibility(View.GONE);
            spnTutorHour3.setVisibility(View.GONE);
            spnPracHour3.setVisibility(View.GONE);
            spnCredit3.setVisibility(View.GONE);
            spnSub3.setVisibility(View.GONE);
            spnFacDivA3.setVisibility(View.GONE);
            spnFacDivB3.setVisibility(View.GONE);


            spnLecHour4.setVisibility(View.GONE);
            spnTutorHour4.setVisibility(View.GONE);
            spnPracHour4.setVisibility(View.GONE);
            spnCredit4.setVisibility(View.GONE);
            spnSub4.setVisibility(View.GONE);
            spnFacDivA4.setVisibility(View.GONE);
            spnFacDivB4.setVisibility(View.GONE);

            spnLecHour5.setVisibility(View.GONE);
            spnTutorHour5.setVisibility(View.GONE);
            spnPracHour5.setVisibility(View.GONE);
            spnCredit5.setVisibility(View.GONE);
            spnSub5.setVisibility(View.GONE);
            spnFacDivA5.setVisibility(View.GONE);
            spnFacDivB5.setVisibility(View.GONE);

            spnLecHour6.setVisibility(View.GONE);
            spnTutorHour6.setVisibility(View.GONE);
            spnPracHour6.setVisibility(View.GONE);
            spnCredit6.setVisibility(View.GONE);
            spnSub6.setVisibility(View.GONE);
            spnFacDivA6.setVisibility(View.GONE);
            spnFacDivB6.setVisibility(View.GONE);

            spnLecHour7.setVisibility(View.GONE);
            spnTutorHour7.setVisibility(View.GONE);
            spnPracHour7.setVisibility(View.GONE);
            spnCredit7.setVisibility(View.GONE);
            spnSub7.setVisibility(View.GONE);
            spnFacDivA7.setVisibility(View.GONE);
            spnFacDivB7.setVisibility(View.GONE);

            spnLecHour8.setVisibility(View.GONE);
            spnTutorHour8.setVisibility(View.GONE);
            spnPracHour8.setVisibility(View.GONE);
            spnCredit8.setVisibility(View.GONE);
            spnSub8.setVisibility(View.GONE);
            spnFacDivA8.setVisibility(View.GONE);
            spnFacDivB8.setVisibility(View.GONE);

            spnLecHour9.setVisibility(View.GONE);
            spnTutorHour9.setVisibility(View.GONE);
            spnPracHour9.setVisibility(View.GONE);
            spnCredit9.setVisibility(View.GONE);
            spnSub9.setVisibility(View.GONE);
            spnFacDivA9.setVisibility(View.GONE);
            spnFacDivB9.setVisibility(View.GONE);

            spnLecHour10.setVisibility(View.GONE);
            spnTutorHour10.setVisibility(View.GONE);
            spnPracHour10.setVisibility(View.GONE);
            spnCredit10.setVisibility(View.GONE);
            spnSub10.setVisibility(View.GONE);
            spnFacDivA10.setVisibility(View.GONE);
            spnFacDivB10.setVisibility(View.GONE);

            spnLecHour11.setVisibility(View.GONE);
            spnTutorHour11.setVisibility(View.GONE);
            spnPracHour11.setVisibility(View.GONE);
            spnCredit11.setVisibility(View.GONE);
            spnSub11.setVisibility(View.GONE);
            spnFacDivA11.setVisibility(View.GONE);
            spnFacDivB11.setVisibility(View.GONE);

            spnLecHour12.setVisibility(View.GONE);
            spnTutorHour12.setVisibility(View.GONE);
            spnPracHour12.setVisibility(View.GONE);
            spnCredit12.setVisibility(View.GONE);
            spnSub12.setVisibility(View.GONE);
            spnFacDivA12.setVisibility(View.GONE);
            spnFacDivB12.setVisibility(View.GONE);

            spnLecHour13.setVisibility(View.GONE);
            spnTutorHour13.setVisibility(View.GONE);
            spnPracHour13.setVisibility(View.GONE);
            spnCredit13.setVisibility(View.GONE);
            spnSub13.setVisibility(View.GONE);
            spnFacDivA13.setVisibility(View.GONE);
            spnFacDivB13.setVisibility(View.GONE);

            spnLecHour14.setVisibility(View.GONE);
            spnTutorHour14.setVisibility(View.GONE);
            spnPracHour14.setVisibility(View.GONE);
            spnCredit14.setVisibility(View.GONE);
            spnSub14.setVisibility(View.GONE);
            spnFacDivA14.setVisibility(View.GONE);
            spnFacDivB14.setVisibility(View.GONE);

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }

        if (Integer.parseInt(Psub) == 2) {


            spnLecHour3.setVisibility(View.GONE);
            spnTutorHour3.setVisibility(View.GONE);
            spnPracHour3.setVisibility(View.GONE);
            spnCredit3.setVisibility(View.GONE);
            spnSub3.setVisibility(View.GONE);
            spnFacDivA3.setVisibility(View.GONE);
            spnFacDivB3.setVisibility(View.GONE);


            spnLecHour4.setVisibility(View.GONE);
            spnTutorHour4.setVisibility(View.GONE);
            spnPracHour4.setVisibility(View.GONE);
            spnCredit4.setVisibility(View.GONE);
            spnSub4.setVisibility(View.GONE);
            spnFacDivA4.setVisibility(View.GONE);
            spnFacDivB4.setVisibility(View.GONE);

            spnLecHour5.setVisibility(View.GONE);
            spnTutorHour5.setVisibility(View.GONE);
            spnPracHour5.setVisibility(View.GONE);
            spnCredit5.setVisibility(View.GONE);
            spnSub5.setVisibility(View.GONE);
            spnFacDivA5.setVisibility(View.GONE);
            spnFacDivB5.setVisibility(View.GONE);

            spnLecHour6.setVisibility(View.GONE);
            spnTutorHour6.setVisibility(View.GONE);
            spnPracHour6.setVisibility(View.GONE);
            spnCredit6.setVisibility(View.GONE);
            spnSub6.setVisibility(View.GONE);
            spnFacDivA6.setVisibility(View.GONE);
            spnFacDivB6.setVisibility(View.GONE);

            spnLecHour7.setVisibility(View.GONE);
            spnTutorHour7.setVisibility(View.GONE);
            spnPracHour7.setVisibility(View.GONE);
            spnCredit7.setVisibility(View.GONE);
            spnSub7.setVisibility(View.GONE);
            spnFacDivA7.setVisibility(View.GONE);
            spnFacDivB7.setVisibility(View.GONE);

            spnLecHour8.setVisibility(View.GONE);
            spnTutorHour8.setVisibility(View.GONE);
            spnPracHour8.setVisibility(View.GONE);
            spnCredit8.setVisibility(View.GONE);
            spnSub8.setVisibility(View.GONE);
            spnFacDivA8.setVisibility(View.GONE);
            spnFacDivB8.setVisibility(View.GONE);

            spnLecHour9.setVisibility(View.GONE);
            spnTutorHour9.setVisibility(View.GONE);
            spnPracHour9.setVisibility(View.GONE);
            spnCredit9.setVisibility(View.GONE);
            spnSub9.setVisibility(View.GONE);
            spnFacDivA9.setVisibility(View.GONE);
            spnFacDivB9.setVisibility(View.GONE);

            spnLecHour10.setVisibility(View.GONE);
            spnTutorHour10.setVisibility(View.GONE);
            spnPracHour10.setVisibility(View.GONE);
            spnCredit10.setVisibility(View.GONE);
            spnSub10.setVisibility(View.GONE);
            spnFacDivA10.setVisibility(View.GONE);
            spnFacDivB10.setVisibility(View.GONE);

            spnLecHour11.setVisibility(View.GONE);
            spnTutorHour11.setVisibility(View.GONE);
            spnPracHour11.setVisibility(View.GONE);
            spnCredit11.setVisibility(View.GONE);
            spnSub11.setVisibility(View.GONE);
            spnFacDivA11.setVisibility(View.GONE);
            spnFacDivB11.setVisibility(View.GONE);

            spnLecHour12.setVisibility(View.GONE);
            spnTutorHour12.setVisibility(View.GONE);
            spnPracHour12.setVisibility(View.GONE);
            spnCredit12.setVisibility(View.GONE);
            spnSub12.setVisibility(View.GONE);
            spnFacDivA12.setVisibility(View.GONE);
            spnFacDivB12.setVisibility(View.GONE);

            spnLecHour13.setVisibility(View.GONE);
            spnTutorHour13.setVisibility(View.GONE);
            spnPracHour13.setVisibility(View.GONE);
            spnCredit13.setVisibility(View.GONE);
            spnSub13.setVisibility(View.GONE);
            spnFacDivA13.setVisibility(View.GONE);
            spnFacDivB13.setVisibility(View.GONE);

            spnLecHour14.setVisibility(View.GONE);
            spnTutorHour14.setVisibility(View.GONE);
            spnPracHour14.setVisibility(View.GONE);
            spnCredit14.setVisibility(View.GONE);
            spnSub14.setVisibility(View.GONE);
            spnFacDivA14.setVisibility(View.GONE);
            spnFacDivB14.setVisibility(View.GONE);

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }


        if (Integer.parseInt(Psub) == 3) {


            spnLecHour4.setVisibility(View.GONE);
            spnTutorHour4.setVisibility(View.GONE);
            spnPracHour4.setVisibility(View.GONE);
            spnCredit4.setVisibility(View.GONE);
            spnSub4.setVisibility(View.GONE);
            spnFacDivA4.setVisibility(View.GONE);
            spnFacDivB4.setVisibility(View.GONE);

            spnLecHour5.setVisibility(View.GONE);
            spnTutorHour5.setVisibility(View.GONE);
            spnPracHour5.setVisibility(View.GONE);
            spnCredit5.setVisibility(View.GONE);
            spnSub5.setVisibility(View.GONE);
            spnFacDivA5.setVisibility(View.GONE);
            spnFacDivB5.setVisibility(View.GONE);

            spnLecHour6.setVisibility(View.GONE);
            spnTutorHour6.setVisibility(View.GONE);
            spnPracHour6.setVisibility(View.GONE);
            spnCredit6.setVisibility(View.GONE);
            spnSub6.setVisibility(View.GONE);
            spnFacDivA6.setVisibility(View.GONE);
            spnFacDivB6.setVisibility(View.GONE);

            spnLecHour7.setVisibility(View.GONE);
            spnTutorHour7.setVisibility(View.GONE);
            spnPracHour7.setVisibility(View.GONE);
            spnCredit7.setVisibility(View.GONE);
            spnSub7.setVisibility(View.GONE);
            spnFacDivA7.setVisibility(View.GONE);
            spnFacDivB7.setVisibility(View.GONE);

            spnLecHour8.setVisibility(View.GONE);
            spnTutorHour8.setVisibility(View.GONE);
            spnPracHour8.setVisibility(View.GONE);
            spnCredit8.setVisibility(View.GONE);
            spnSub8.setVisibility(View.GONE);
            spnFacDivA8.setVisibility(View.GONE);
            spnFacDivB8.setVisibility(View.GONE);

            spnLecHour9.setVisibility(View.GONE);
            spnTutorHour9.setVisibility(View.GONE);
            spnPracHour9.setVisibility(View.GONE);
            spnCredit9.setVisibility(View.GONE);
            spnSub9.setVisibility(View.GONE);
            spnFacDivA9.setVisibility(View.GONE);
            spnFacDivB9.setVisibility(View.GONE);

            spnLecHour10.setVisibility(View.GONE);
            spnTutorHour10.setVisibility(View.GONE);
            spnPracHour10.setVisibility(View.GONE);
            spnCredit10.setVisibility(View.GONE);
            spnSub10.setVisibility(View.GONE);
            spnFacDivA10.setVisibility(View.GONE);
            spnFacDivB10.setVisibility(View.GONE);

            spnLecHour11.setVisibility(View.GONE);
            spnTutorHour11.setVisibility(View.GONE);
            spnPracHour11.setVisibility(View.GONE);
            spnCredit11.setVisibility(View.GONE);
            spnSub11.setVisibility(View.GONE);
            spnFacDivA11.setVisibility(View.GONE);
            spnFacDivB11.setVisibility(View.GONE);

            spnLecHour12.setVisibility(View.GONE);
            spnTutorHour12.setVisibility(View.GONE);
            spnPracHour12.setVisibility(View.GONE);
            spnCredit12.setVisibility(View.GONE);
            spnSub12.setVisibility(View.GONE);
            spnFacDivA12.setVisibility(View.GONE);
            spnFacDivB12.setVisibility(View.GONE);

            spnLecHour13.setVisibility(View.GONE);
            spnTutorHour13.setVisibility(View.GONE);
            spnPracHour13.setVisibility(View.GONE);
            spnCredit13.setVisibility(View.GONE);
            spnSub13.setVisibility(View.GONE);
            spnFacDivA13.setVisibility(View.GONE);
            spnFacDivB13.setVisibility(View.GONE);

            spnLecHour14.setVisibility(View.GONE);
            spnTutorHour14.setVisibility(View.GONE);
            spnPracHour14.setVisibility(View.GONE);
            spnCredit14.setVisibility(View.GONE);
            spnSub14.setVisibility(View.GONE);
            spnFacDivA14.setVisibility(View.GONE);
            spnFacDivB14.setVisibility(View.GONE);

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }

        if (Integer.parseInt(Psub) == 4) {
            spnLecHour5.setVisibility(View.GONE);
            spnTutorHour5.setVisibility(View.GONE);
            spnPracHour5.setVisibility(View.GONE);
            spnCredit5.setVisibility(View.GONE);
            spnSub5.setVisibility(View.GONE);
            spnFacDivA5.setVisibility(View.GONE);
            spnFacDivB5.setVisibility(View.GONE);

            spnLecHour6.setVisibility(View.GONE);
            spnTutorHour6.setVisibility(View.GONE);
            spnPracHour6.setVisibility(View.GONE);
            spnCredit6.setVisibility(View.GONE);
            spnSub6.setVisibility(View.GONE);
            spnFacDivA6.setVisibility(View.GONE);
            spnFacDivB6.setVisibility(View.GONE);

            spnLecHour7.setVisibility(View.GONE);
            spnTutorHour7.setVisibility(View.GONE);
            spnPracHour7.setVisibility(View.GONE);
            spnCredit7.setVisibility(View.GONE);
            spnSub7.setVisibility(View.GONE);
            spnFacDivA7.setVisibility(View.GONE);
            spnFacDivB7.setVisibility(View.GONE);

            spnLecHour8.setVisibility(View.GONE);
            spnTutorHour8.setVisibility(View.GONE);
            spnPracHour8.setVisibility(View.GONE);
            spnCredit8.setVisibility(View.GONE);
            spnSub8.setVisibility(View.GONE);
            spnFacDivA8.setVisibility(View.GONE);
            spnFacDivB8.setVisibility(View.GONE);

            spnLecHour9.setVisibility(View.GONE);
            spnTutorHour9.setVisibility(View.GONE);
            spnPracHour9.setVisibility(View.GONE);
            spnCredit9.setVisibility(View.GONE);
            spnSub9.setVisibility(View.GONE);
            spnFacDivA9.setVisibility(View.GONE);
            spnFacDivB9.setVisibility(View.GONE);

            spnLecHour10.setVisibility(View.GONE);
            spnTutorHour10.setVisibility(View.GONE);
            spnPracHour10.setVisibility(View.GONE);
            spnCredit10.setVisibility(View.GONE);
            spnSub10.setVisibility(View.GONE);
            spnFacDivA10.setVisibility(View.GONE);
            spnFacDivB10.setVisibility(View.GONE);

            spnLecHour11.setVisibility(View.GONE);
            spnTutorHour11.setVisibility(View.GONE);
            spnPracHour11.setVisibility(View.GONE);
            spnCredit11.setVisibility(View.GONE);
            spnSub11.setVisibility(View.GONE);
            spnFacDivA11.setVisibility(View.GONE);
            spnFacDivB11.setVisibility(View.GONE);

            spnLecHour12.setVisibility(View.GONE);
            spnTutorHour12.setVisibility(View.GONE);
            spnPracHour12.setVisibility(View.GONE);
            spnCredit12.setVisibility(View.GONE);
            spnSub12.setVisibility(View.GONE);
            spnFacDivA12.setVisibility(View.GONE);
            spnFacDivB12.setVisibility(View.GONE);

            spnLecHour13.setVisibility(View.GONE);
            spnTutorHour13.setVisibility(View.GONE);
            spnPracHour13.setVisibility(View.GONE);
            spnCredit13.setVisibility(View.GONE);
            spnSub13.setVisibility(View.GONE);
            spnFacDivA13.setVisibility(View.GONE);
            spnFacDivB13.setVisibility(View.GONE);

            spnLecHour14.setVisibility(View.GONE);
            spnTutorHour14.setVisibility(View.GONE);
            spnPracHour14.setVisibility(View.GONE);
            spnCredit14.setVisibility(View.GONE);
            spnSub14.setVisibility(View.GONE);
            spnFacDivA14.setVisibility(View.GONE);
            spnFacDivB14.setVisibility(View.GONE);

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }


        if (Integer.parseInt(Psub) == 5) {


            spnLecHour6.setVisibility(View.GONE);
            spnTutorHour6.setVisibility(View.GONE);
            spnPracHour6.setVisibility(View.GONE);
            spnCredit6.setVisibility(View.GONE);
            spnSub6.setVisibility(View.GONE);
            spnFacDivA6.setVisibility(View.GONE);
            spnFacDivB6.setVisibility(View.GONE);

            spnLecHour7.setVisibility(View.GONE);
            spnTutorHour7.setVisibility(View.GONE);
            spnPracHour7.setVisibility(View.GONE);
            spnCredit7.setVisibility(View.GONE);
            spnSub7.setVisibility(View.GONE);
            spnFacDivA7.setVisibility(View.GONE);
            spnFacDivB7.setVisibility(View.GONE);

            spnLecHour8.setVisibility(View.GONE);
            spnTutorHour8.setVisibility(View.GONE);
            spnPracHour8.setVisibility(View.GONE);
            spnCredit8.setVisibility(View.GONE);
            spnSub8.setVisibility(View.GONE);
            spnFacDivA8.setVisibility(View.GONE);
            spnFacDivB8.setVisibility(View.GONE);

            spnLecHour9.setVisibility(View.GONE);
            spnTutorHour9.setVisibility(View.GONE);
            spnPracHour9.setVisibility(View.GONE);
            spnCredit9.setVisibility(View.GONE);
            spnSub9.setVisibility(View.GONE);
            spnFacDivA9.setVisibility(View.GONE);
            spnFacDivB9.setVisibility(View.GONE);

            spnLecHour10.setVisibility(View.GONE);
            spnTutorHour10.setVisibility(View.GONE);
            spnPracHour10.setVisibility(View.GONE);
            spnCredit10.setVisibility(View.GONE);
            spnSub10.setVisibility(View.GONE);
            spnFacDivA10.setVisibility(View.GONE);
            spnFacDivB10.setVisibility(View.GONE);

            spnLecHour11.setVisibility(View.GONE);
            spnTutorHour11.setVisibility(View.GONE);
            spnPracHour11.setVisibility(View.GONE);
            spnCredit11.setVisibility(View.GONE);
            spnSub11.setVisibility(View.GONE);
            spnFacDivA11.setVisibility(View.GONE);
            spnFacDivB11.setVisibility(View.GONE);

            spnLecHour12.setVisibility(View.GONE);
            spnTutorHour12.setVisibility(View.GONE);
            spnPracHour12.setVisibility(View.GONE);
            spnCredit12.setVisibility(View.GONE);
            spnSub12.setVisibility(View.GONE);
            spnFacDivA12.setVisibility(View.GONE);
            spnFacDivB12.setVisibility(View.GONE);

            spnLecHour13.setVisibility(View.GONE);
            spnTutorHour13.setVisibility(View.GONE);
            spnPracHour13.setVisibility(View.GONE);
            spnCredit13.setVisibility(View.GONE);
            spnSub13.setVisibility(View.GONE);
            spnFacDivA13.setVisibility(View.GONE);
            spnFacDivB13.setVisibility(View.GONE);

            spnLecHour14.setVisibility(View.GONE);
            spnTutorHour14.setVisibility(View.GONE);
            spnPracHour14.setVisibility(View.GONE);
            spnCredit14.setVisibility(View.GONE);
            spnSub14.setVisibility(View.GONE);
            spnFacDivA14.setVisibility(View.GONE);
            spnFacDivB14.setVisibility(View.GONE);

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }

        if (Integer.parseInt(Psub) == 6) {

            spnLecHour7.setVisibility(View.GONE);
            spnTutorHour7.setVisibility(View.GONE);
            spnPracHour7.setVisibility(View.GONE);
            spnCredit7.setVisibility(View.GONE);
            spnSub7.setVisibility(View.GONE);
            spnFacDivA7.setVisibility(View.GONE);
            spnFacDivB7.setVisibility(View.GONE);

            spnLecHour8.setVisibility(View.GONE);
            spnTutorHour8.setVisibility(View.GONE);
            spnPracHour8.setVisibility(View.GONE);
            spnCredit8.setVisibility(View.GONE);
            spnSub8.setVisibility(View.GONE);
            spnFacDivA8.setVisibility(View.GONE);
            spnFacDivB8.setVisibility(View.GONE);

            spnLecHour9.setVisibility(View.GONE);
            spnTutorHour9.setVisibility(View.GONE);
            spnPracHour9.setVisibility(View.GONE);
            spnCredit9.setVisibility(View.GONE);
            spnSub9.setVisibility(View.GONE);
            spnFacDivA9.setVisibility(View.GONE);
            spnFacDivB9.setVisibility(View.GONE);

            spnLecHour10.setVisibility(View.GONE);
            spnTutorHour10.setVisibility(View.GONE);
            spnPracHour10.setVisibility(View.GONE);
            spnCredit10.setVisibility(View.GONE);
            spnSub10.setVisibility(View.GONE);
            spnFacDivA10.setVisibility(View.GONE);
            spnFacDivB10.setVisibility(View.GONE);

            spnLecHour11.setVisibility(View.GONE);
            spnTutorHour11.setVisibility(View.GONE);
            spnPracHour11.setVisibility(View.GONE);
            spnCredit11.setVisibility(View.GONE);
            spnSub11.setVisibility(View.GONE);
            spnFacDivA11.setVisibility(View.GONE);
            spnFacDivB11.setVisibility(View.GONE);

            spnLecHour12.setVisibility(View.GONE);
            spnTutorHour12.setVisibility(View.GONE);
            spnPracHour12.setVisibility(View.GONE);
            spnCredit12.setVisibility(View.GONE);
            spnSub12.setVisibility(View.GONE);
            spnFacDivA12.setVisibility(View.GONE);
            spnFacDivB12.setVisibility(View.GONE);

            spnLecHour13.setVisibility(View.GONE);
            spnTutorHour13.setVisibility(View.GONE);
            spnPracHour13.setVisibility(View.GONE);
            spnCredit13.setVisibility(View.GONE);
            spnSub13.setVisibility(View.GONE);
            spnFacDivA13.setVisibility(View.GONE);
            spnFacDivB13.setVisibility(View.GONE);

            spnLecHour14.setVisibility(View.GONE);
            spnTutorHour14.setVisibility(View.GONE);
            spnPracHour14.setVisibility(View.GONE);
            spnCredit14.setVisibility(View.GONE);
            spnSub14.setVisibility(View.GONE);
            spnFacDivA14.setVisibility(View.GONE);
            spnFacDivB14.setVisibility(View.GONE);

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }


        if (Integer.parseInt(Psub) == 7) {


            spnLecHour8.setVisibility(View.GONE);
            spnTutorHour8.setVisibility(View.GONE);
            spnPracHour8.setVisibility(View.GONE);
            spnCredit8.setVisibility(View.GONE);
            spnSub8.setVisibility(View.GONE);
            spnFacDivA8.setVisibility(View.GONE);
            spnFacDivB8.setVisibility(View.GONE);

            spnLecHour9.setVisibility(View.GONE);
            spnTutorHour9.setVisibility(View.GONE);
            spnPracHour9.setVisibility(View.GONE);
            spnCredit9.setVisibility(View.GONE);
            spnSub9.setVisibility(View.GONE);
            spnFacDivA9.setVisibility(View.GONE);
            spnFacDivB9.setVisibility(View.GONE);

            spnLecHour10.setVisibility(View.GONE);
            spnTutorHour10.setVisibility(View.GONE);
            spnPracHour10.setVisibility(View.GONE);
            spnCredit10.setVisibility(View.GONE);
            spnSub10.setVisibility(View.GONE);
            spnFacDivA10.setVisibility(View.GONE);
            spnFacDivB10.setVisibility(View.GONE);

            spnLecHour11.setVisibility(View.GONE);
            spnTutorHour11.setVisibility(View.GONE);
            spnPracHour11.setVisibility(View.GONE);
            spnCredit11.setVisibility(View.GONE);
            spnSub11.setVisibility(View.GONE);
            spnFacDivA11.setVisibility(View.GONE);
            spnFacDivB11.setVisibility(View.GONE);

            spnLecHour12.setVisibility(View.GONE);
            spnTutorHour12.setVisibility(View.GONE);
            spnPracHour12.setVisibility(View.GONE);
            spnCredit12.setVisibility(View.GONE);
            spnSub12.setVisibility(View.GONE);
            spnFacDivA12.setVisibility(View.GONE);
            spnFacDivB12.setVisibility(View.GONE);

            spnLecHour13.setVisibility(View.GONE);
            spnTutorHour13.setVisibility(View.GONE);
            spnPracHour13.setVisibility(View.GONE);
            spnCredit13.setVisibility(View.GONE);
            spnSub13.setVisibility(View.GONE);
            spnFacDivA13.setVisibility(View.GONE);
            spnFacDivB13.setVisibility(View.GONE);

            spnLecHour14.setVisibility(View.GONE);
            spnTutorHour14.setVisibility(View.GONE);
            spnPracHour14.setVisibility(View.GONE);
            spnCredit14.setVisibility(View.GONE);
            spnSub14.setVisibility(View.GONE);
            spnFacDivA14.setVisibility(View.GONE);
            spnFacDivB14.setVisibility(View.GONE);

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }

        if (Integer.parseInt(Psub) == 8) {

            spnLecHour9.setVisibility(View.GONE);
            spnTutorHour9.setVisibility(View.GONE);
            spnPracHour9.setVisibility(View.GONE);
            spnCredit9.setVisibility(View.GONE);
            spnSub9.setVisibility(View.GONE);
            spnFacDivA9.setVisibility(View.GONE);
            spnFacDivB9.setVisibility(View.GONE);

            spnLecHour10.setVisibility(View.GONE);
            spnTutorHour10.setVisibility(View.GONE);
            spnPracHour10.setVisibility(View.GONE);
            spnCredit10.setVisibility(View.GONE);
            spnSub10.setVisibility(View.GONE);
            spnFacDivA10.setVisibility(View.GONE);
            spnFacDivB10.setVisibility(View.GONE);

            spnLecHour11.setVisibility(View.GONE);
            spnTutorHour11.setVisibility(View.GONE);
            spnPracHour11.setVisibility(View.GONE);
            spnCredit11.setVisibility(View.GONE);
            spnSub11.setVisibility(View.GONE);
            spnFacDivA11.setVisibility(View.GONE);
            spnFacDivB11.setVisibility(View.GONE);

            spnLecHour12.setVisibility(View.GONE);
            spnTutorHour12.setVisibility(View.GONE);
            spnPracHour12.setVisibility(View.GONE);
            spnCredit12.setVisibility(View.GONE);
            spnSub12.setVisibility(View.GONE);
            spnFacDivA12.setVisibility(View.GONE);
            spnFacDivB12.setVisibility(View.GONE);

            spnLecHour13.setVisibility(View.GONE);
            spnTutorHour13.setVisibility(View.GONE);
            spnPracHour13.setVisibility(View.GONE);
            spnCredit13.setVisibility(View.GONE);
            spnSub13.setVisibility(View.GONE);
            spnFacDivA13.setVisibility(View.GONE);
            spnFacDivB13.setVisibility(View.GONE);

            spnLecHour14.setVisibility(View.GONE);
            spnTutorHour14.setVisibility(View.GONE);
            spnPracHour14.setVisibility(View.GONE);
            spnCredit14.setVisibility(View.GONE);
            spnSub14.setVisibility(View.GONE);
            spnFacDivA14.setVisibility(View.GONE);
            spnFacDivB14.setVisibility(View.GONE);

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }


        if (Integer.parseInt(Psub) == 9) {

            spnLecHour10.setVisibility(View.GONE);
            spnTutorHour10.setVisibility(View.GONE);
            spnPracHour10.setVisibility(View.GONE);
            spnCredit10.setVisibility(View.GONE);
            spnSub10.setVisibility(View.GONE);
            spnFacDivA10.setVisibility(View.GONE);
            spnFacDivB10.setVisibility(View.GONE);

            spnLecHour11.setVisibility(View.GONE);
            spnTutorHour11.setVisibility(View.GONE);
            spnPracHour11.setVisibility(View.GONE);
            spnCredit11.setVisibility(View.GONE);
            spnSub11.setVisibility(View.GONE);
            spnFacDivA11.setVisibility(View.GONE);
            spnFacDivB11.setVisibility(View.GONE);

            spnLecHour12.setVisibility(View.GONE);
            spnTutorHour12.setVisibility(View.GONE);
            spnPracHour12.setVisibility(View.GONE);
            spnCredit12.setVisibility(View.GONE);
            spnSub12.setVisibility(View.GONE);
            spnFacDivA12.setVisibility(View.GONE);
            spnFacDivB12.setVisibility(View.GONE);

            spnLecHour13.setVisibility(View.GONE);
            spnTutorHour13.setVisibility(View.GONE);
            spnPracHour13.setVisibility(View.GONE);
            spnCredit13.setVisibility(View.GONE);
            spnSub13.setVisibility(View.GONE);
            spnFacDivA13.setVisibility(View.GONE);
            spnFacDivB13.setVisibility(View.GONE);

            spnLecHour14.setVisibility(View.GONE);
            spnTutorHour14.setVisibility(View.GONE);
            spnPracHour14.setVisibility(View.GONE);
            spnCredit14.setVisibility(View.GONE);
            spnSub14.setVisibility(View.GONE);
            spnFacDivA14.setVisibility(View.GONE);
            spnFacDivB14.setVisibility(View.GONE);

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }

        if (Integer.parseInt(Psub) == 10) {

            spnLecHour11.setVisibility(View.GONE);
            spnTutorHour11.setVisibility(View.GONE);
            spnPracHour11.setVisibility(View.GONE);
            spnCredit11.setVisibility(View.GONE);
            spnSub11.setVisibility(View.GONE);
            spnFacDivA11.setVisibility(View.GONE);
            spnFacDivB11.setVisibility(View.GONE);

            spnLecHour12.setVisibility(View.GONE);
            spnTutorHour12.setVisibility(View.GONE);
            spnPracHour12.setVisibility(View.GONE);
            spnCredit12.setVisibility(View.GONE);
            spnSub12.setVisibility(View.GONE);
            spnFacDivA12.setVisibility(View.GONE);
            spnFacDivB12.setVisibility(View.GONE);

            spnLecHour13.setVisibility(View.GONE);
            spnTutorHour13.setVisibility(View.GONE);
            spnPracHour13.setVisibility(View.GONE);
            spnCredit13.setVisibility(View.GONE);
            spnSub13.setVisibility(View.GONE);
            spnFacDivA13.setVisibility(View.GONE);
            spnFacDivB13.setVisibility(View.GONE);

            spnLecHour14.setVisibility(View.GONE);
            spnTutorHour14.setVisibility(View.GONE);
            spnPracHour14.setVisibility(View.GONE);
            spnCredit14.setVisibility(View.GONE);
            spnSub14.setVisibility(View.GONE);
            spnFacDivA14.setVisibility(View.GONE);
            spnFacDivB14.setVisibility(View.GONE);

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }

        if (Integer.parseInt(Psub) == 11) {

            spnLecHour12.setVisibility(View.GONE);
            spnTutorHour12.setVisibility(View.GONE);
            spnPracHour12.setVisibility(View.GONE);
            spnCredit12.setVisibility(View.GONE);
            spnSub12.setVisibility(View.GONE);
            spnFacDivA12.setVisibility(View.GONE);
            spnFacDivB12.setVisibility(View.GONE);

            spnLecHour13.setVisibility(View.GONE);
            spnTutorHour13.setVisibility(View.GONE);
            spnPracHour13.setVisibility(View.GONE);
            spnCredit13.setVisibility(View.GONE);
            spnSub13.setVisibility(View.GONE);
            spnFacDivA13.setVisibility(View.GONE);
            spnFacDivB13.setVisibility(View.GONE);

            spnLecHour14.setVisibility(View.GONE);
            spnTutorHour14.setVisibility(View.GONE);
            spnPracHour14.setVisibility(View.GONE);
            spnCredit14.setVisibility(View.GONE);
            spnSub14.setVisibility(View.GONE);
            spnFacDivA14.setVisibility(View.GONE);
            spnFacDivB14.setVisibility(View.GONE);

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }
        if (Integer.parseInt(Psub) == 12) {


            spnLecHour13.setVisibility(View.GONE);
            spnTutorHour13.setVisibility(View.GONE);
            spnPracHour13.setVisibility(View.GONE);
            spnCredit13.setVisibility(View.GONE);
            spnSub13.setVisibility(View.GONE);
            spnFacDivA13.setVisibility(View.GONE);
            spnFacDivB13.setVisibility(View.GONE);

            spnLecHour14.setVisibility(View.GONE);
            spnTutorHour14.setVisibility(View.GONE);
            spnPracHour14.setVisibility(View.GONE);
            spnCredit14.setVisibility(View.GONE);
            spnSub14.setVisibility(View.GONE);
            spnFacDivA14.setVisibility(View.GONE);
            spnFacDivB14.setVisibility(View.GONE);

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }


        if (Integer.parseInt(Psub) == 13) {


            spnLecHour14.setVisibility(View.GONE);
            spnTutorHour14.setVisibility(View.GONE);
            spnPracHour14.setVisibility(View.GONE);
            spnCredit14.setVisibility(View.GONE);
            spnSub14.setVisibility(View.GONE);
            spnFacDivA14.setVisibility(View.GONE);
            spnFacDivB14.setVisibility(View.GONE);

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }
        if (Integer.parseInt(Psub) == 14) {

            spnLecHour15.setVisibility(View.GONE);
            spnTutorHour15.setVisibility(View.GONE);
            spnPracHour15.setVisibility(View.GONE);
            spnCredit15.setVisibility(View.GONE);
            spnSub15.setVisibility(View.GONE);
            spnFacDivA15.setVisibility(View.GONE);
            spnFacDivB15.setVisibility(View.GONE);
        }

        if (Integer.parseInt(Psub) == 15) {


        }

    }

    @Override
    public void onClick(View view) {

        Toast.makeText(getApplicationContext(), "Added To Firebase",Toast.LENGTH_LONG).show();

        Random r = new Random();

        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference("detailtable");


        if(Integer.parseInt(Psub)==1){

            id = r.nextInt(10000);

            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
        }


        if(Integer.parseInt(Psub)==2){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);

        }

        if(Integer.parseInt(Psub)==3){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);
            id = r.nextInt(10000);
            AddDetailsHelper adh3 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour3.getSelectedItem().toString(), this.spnTutorHour3.getSelectedItem().toString(), this.spnPracHour3.getSelectedItem().toString(), this.spnCredit3.getSelectedItem().toString(), this.spnSub3.getSelectedItem().toString(),this.spnFacDivA3.getSelectedItem().toString(), this.spnFacDivB3.getSelectedItem().toString());
            reference.child(""+id).setValue(adh3);

        }

        if(Integer.parseInt(Psub)==4){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);
            id = r.nextInt(10000);
            AddDetailsHelper adh3 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour3.getSelectedItem().toString(), this.spnTutorHour3.getSelectedItem().toString(), this.spnPracHour3.getSelectedItem().toString(), this.spnCredit3.getSelectedItem().toString(), this.spnSub3.getSelectedItem().toString(),this.spnFacDivA3.getSelectedItem().toString(), this.spnFacDivB3.getSelectedItem().toString());
            reference.child(""+id).setValue(adh3);
            id = r.nextInt(10000);
            AddDetailsHelper adh4 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour4.getSelectedItem().toString(), this.spnTutorHour4.getSelectedItem().toString(), this.spnPracHour4.getSelectedItem().toString(), this.spnCredit4.getSelectedItem().toString(), this.spnSub4.getSelectedItem().toString(),this.spnFacDivA4.getSelectedItem().toString(), this.spnFacDivB4.getSelectedItem().toString());
            reference.child(""+id).setValue(adh4);

        }


        if(Integer.parseInt(Psub)==5){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);
            id = r.nextInt(10000);
            AddDetailsHelper adh3 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour3.getSelectedItem().toString(), this.spnTutorHour3.getSelectedItem().toString(), this.spnPracHour3.getSelectedItem().toString(), this.spnCredit3.getSelectedItem().toString(), this.spnSub3.getSelectedItem().toString(),this.spnFacDivA3.getSelectedItem().toString(), this.spnFacDivB3.getSelectedItem().toString());
            reference.child(""+id).setValue(adh3);
            id = r.nextInt(10000);
            AddDetailsHelper adh4 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour4.getSelectedItem().toString(), this.spnTutorHour4.getSelectedItem().toString(), this.spnPracHour4.getSelectedItem().toString(), this.spnCredit4.getSelectedItem().toString(), this.spnSub4.getSelectedItem().toString(),this.spnFacDivA4.getSelectedItem().toString(), this.spnFacDivB4.getSelectedItem().toString());
            reference.child(""+id).setValue(adh4);
            id = r.nextInt(10000);
            AddDetailsHelper adh5 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour5.getSelectedItem().toString(), this.spnTutorHour5.getSelectedItem().toString(), this.spnPracHour5.getSelectedItem().toString(), this.spnCredit5.getSelectedItem().toString(), this.spnSub5.getSelectedItem().toString(),this.spnFacDivA5.getSelectedItem().toString(), this.spnFacDivB5.getSelectedItem().toString());
            reference.child(""+id).setValue(adh5);

        }


        if(Integer.parseInt(Psub)==6){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);
            id = r.nextInt(10000);
            AddDetailsHelper adh3 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour3.getSelectedItem().toString(), this.spnTutorHour3.getSelectedItem().toString(), this.spnPracHour3.getSelectedItem().toString(), this.spnCredit3.getSelectedItem().toString(), this.spnSub3.getSelectedItem().toString(),this.spnFacDivA3.getSelectedItem().toString(), this.spnFacDivB3.getSelectedItem().toString());
            reference.child(""+id).setValue(adh3);
            id = r.nextInt(10000);
            AddDetailsHelper adh4 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour4.getSelectedItem().toString(), this.spnTutorHour4.getSelectedItem().toString(), this.spnPracHour4.getSelectedItem().toString(), this.spnCredit4.getSelectedItem().toString(), this.spnSub4.getSelectedItem().toString(),this.spnFacDivA4.getSelectedItem().toString(), this.spnFacDivB4.getSelectedItem().toString());
            reference.child(""+id).setValue(adh4);
            id = r.nextInt(10000);
            AddDetailsHelper adh5 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour5.getSelectedItem().toString(), this.spnTutorHour5.getSelectedItem().toString(), this.spnPracHour5.getSelectedItem().toString(), this.spnCredit5.getSelectedItem().toString(), this.spnSub5.getSelectedItem().toString(),this.spnFacDivA5.getSelectedItem().toString(), this.spnFacDivB5.getSelectedItem().toString());
            reference.child(""+id).setValue(adh5);
            id = r.nextInt(10000);
            AddDetailsHelper adh6 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour6.getSelectedItem().toString(), this.spnTutorHour6.getSelectedItem().toString(), this.spnPracHour6.getSelectedItem().toString(), this.spnCredit6.getSelectedItem().toString(), this.spnSub6.getSelectedItem().toString(),this.spnFacDivA6.getSelectedItem().toString(), this.spnFacDivB6.getSelectedItem().toString());
            reference.child(""+id).setValue(adh6);

        }

        if(Integer.parseInt(Psub)==7){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);
            id = r.nextInt(10000);
            AddDetailsHelper adh3 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour3.getSelectedItem().toString(), this.spnTutorHour3.getSelectedItem().toString(), this.spnPracHour3.getSelectedItem().toString(), this.spnCredit3.getSelectedItem().toString(), this.spnSub3.getSelectedItem().toString(),this.spnFacDivA3.getSelectedItem().toString(), this.spnFacDivB3.getSelectedItem().toString());
            reference.child(""+id).setValue(adh3);
            id = r.nextInt(10000);
            AddDetailsHelper adh4 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour4.getSelectedItem().toString(), this.spnTutorHour4.getSelectedItem().toString(), this.spnPracHour4.getSelectedItem().toString(), this.spnCredit4.getSelectedItem().toString(), this.spnSub4.getSelectedItem().toString(),this.spnFacDivA4.getSelectedItem().toString(), this.spnFacDivB4.getSelectedItem().toString());
            reference.child(""+id).setValue(adh4);
            id = r.nextInt(10000);
            AddDetailsHelper adh5 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour5.getSelectedItem().toString(), this.spnTutorHour5.getSelectedItem().toString(), this.spnPracHour5.getSelectedItem().toString(), this.spnCredit5.getSelectedItem().toString(), this.spnSub5.getSelectedItem().toString(),this.spnFacDivA5.getSelectedItem().toString(), this.spnFacDivB5.getSelectedItem().toString());
            reference.child(""+id).setValue(adh5);
            id = r.nextInt(10000);
            AddDetailsHelper adh6 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour6.getSelectedItem().toString(), this.spnTutorHour6.getSelectedItem().toString(), this.spnPracHour6.getSelectedItem().toString(), this.spnCredit6.getSelectedItem().toString(), this.spnSub6.getSelectedItem().toString(),this.spnFacDivA6.getSelectedItem().toString(), this.spnFacDivB6.getSelectedItem().toString());
            reference.child(""+id).setValue(adh6);
            id = r.nextInt(10000);
            AddDetailsHelper adh7 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour7.getSelectedItem().toString(), this.spnTutorHour7.getSelectedItem().toString(), this.spnPracHour7.getSelectedItem().toString(), this.spnCredit7.getSelectedItem().toString(), this.spnSub7.getSelectedItem().toString(),this.spnFacDivA7.getSelectedItem().toString(), this.spnFacDivB7.getSelectedItem().toString());
            reference.child(""+id).setValue(adh7);

        }

        if(Integer.parseInt(Psub)==8){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);
            id = r.nextInt(10000);
            AddDetailsHelper adh3 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour3.getSelectedItem().toString(), this.spnTutorHour3.getSelectedItem().toString(), this.spnPracHour3.getSelectedItem().toString(), this.spnCredit3.getSelectedItem().toString(), this.spnSub3.getSelectedItem().toString(),this.spnFacDivA3.getSelectedItem().toString(), this.spnFacDivB3.getSelectedItem().toString());
            reference.child(""+id).setValue(adh3);
            id = r.nextInt(10000);
            AddDetailsHelper adh4 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour4.getSelectedItem().toString(), this.spnTutorHour4.getSelectedItem().toString(), this.spnPracHour4.getSelectedItem().toString(), this.spnCredit4.getSelectedItem().toString(), this.spnSub4.getSelectedItem().toString(),this.spnFacDivA4.getSelectedItem().toString(), this.spnFacDivB4.getSelectedItem().toString());
            reference.child(""+id).setValue(adh4);
            id = r.nextInt(10000);
            AddDetailsHelper adh5 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour5.getSelectedItem().toString(), this.spnTutorHour5.getSelectedItem().toString(), this.spnPracHour5.getSelectedItem().toString(), this.spnCredit5.getSelectedItem().toString(), this.spnSub5.getSelectedItem().toString(),this.spnFacDivA5.getSelectedItem().toString(), this.spnFacDivB5.getSelectedItem().toString());
            reference.child(""+id).setValue(adh5);
            id = r.nextInt(10000);
            AddDetailsHelper adh6 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour6.getSelectedItem().toString(), this.spnTutorHour6.getSelectedItem().toString(), this.spnPracHour6.getSelectedItem().toString(), this.spnCredit6.getSelectedItem().toString(), this.spnSub6.getSelectedItem().toString(),this.spnFacDivA6.getSelectedItem().toString(), this.spnFacDivB6.getSelectedItem().toString());
            reference.child(""+id).setValue(adh6);
            id = r.nextInt(10000);
            AddDetailsHelper adh7 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour7.getSelectedItem().toString(), this.spnTutorHour7.getSelectedItem().toString(), this.spnPracHour7.getSelectedItem().toString(), this.spnCredit7.getSelectedItem().toString(), this.spnSub7.getSelectedItem().toString(),this.spnFacDivA7.getSelectedItem().toString(), this.spnFacDivB7.getSelectedItem().toString());
            reference.child(""+id).setValue(adh7);
            id = r.nextInt(10000);
            AddDetailsHelper adh8 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour8.getSelectedItem().toString(), this.spnTutorHour8.getSelectedItem().toString(), this.spnPracHour8.getSelectedItem().toString(), this.spnCredit8.getSelectedItem().toString(), this.spnSub8.getSelectedItem().toString(),this.spnFacDivA8.getSelectedItem().toString(), this.spnFacDivB8.getSelectedItem().toString());
            reference.child(""+id).setValue(adh8);

        }

        if(Integer.parseInt(Psub)==9){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);
            id = r.nextInt(10000);
            AddDetailsHelper adh3 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour3.getSelectedItem().toString(), this.spnTutorHour3.getSelectedItem().toString(), this.spnPracHour3.getSelectedItem().toString(), this.spnCredit3.getSelectedItem().toString(), this.spnSub3.getSelectedItem().toString(),this.spnFacDivA3.getSelectedItem().toString(), this.spnFacDivB3.getSelectedItem().toString());
            reference.child(""+id).setValue(adh3);
            id = r.nextInt(10000);
            AddDetailsHelper adh4 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour4.getSelectedItem().toString(), this.spnTutorHour4.getSelectedItem().toString(), this.spnPracHour4.getSelectedItem().toString(), this.spnCredit4.getSelectedItem().toString(), this.spnSub4.getSelectedItem().toString(),this.spnFacDivA4.getSelectedItem().toString(), this.spnFacDivB4.getSelectedItem().toString());
            reference.child(""+id).setValue(adh4);
            id = r.nextInt(10000);
            AddDetailsHelper adh5 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour5.getSelectedItem().toString(), this.spnTutorHour5.getSelectedItem().toString(), this.spnPracHour5.getSelectedItem().toString(), this.spnCredit5.getSelectedItem().toString(), this.spnSub5.getSelectedItem().toString(),this.spnFacDivA5.getSelectedItem().toString(), this.spnFacDivB5.getSelectedItem().toString());
            reference.child(""+id).setValue(adh5);
            id = r.nextInt(10000);
            AddDetailsHelper adh6 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour6.getSelectedItem().toString(), this.spnTutorHour6.getSelectedItem().toString(), this.spnPracHour6.getSelectedItem().toString(), this.spnCredit6.getSelectedItem().toString(), this.spnSub6.getSelectedItem().toString(),this.spnFacDivA6.getSelectedItem().toString(), this.spnFacDivB6.getSelectedItem().toString());
            reference.child(""+id).setValue(adh6);
            id = r.nextInt(10000);
            AddDetailsHelper adh7 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour7.getSelectedItem().toString(), this.spnTutorHour7.getSelectedItem().toString(), this.spnPracHour7.getSelectedItem().toString(), this.spnCredit7.getSelectedItem().toString(), this.spnSub7.getSelectedItem().toString(),this.spnFacDivA7.getSelectedItem().toString(), this.spnFacDivB7.getSelectedItem().toString());
            reference.child(""+id).setValue(adh7);
            id = r.nextInt(10000);
            AddDetailsHelper adh8 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour8.getSelectedItem().toString(), this.spnTutorHour8.getSelectedItem().toString(), this.spnPracHour8.getSelectedItem().toString(), this.spnCredit8.getSelectedItem().toString(), this.spnSub8.getSelectedItem().toString(),this.spnFacDivA8.getSelectedItem().toString(), this.spnFacDivB8.getSelectedItem().toString());
            reference.child(""+id).setValue(adh8);
            id = r.nextInt(10000);
            AddDetailsHelper adh9 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour9.getSelectedItem().toString(), this.spnTutorHour9.getSelectedItem().toString(), this.spnPracHour9.getSelectedItem().toString(), this.spnCredit9.getSelectedItem().toString(), this.spnSub9.getSelectedItem().toString(),this.spnFacDivA9.getSelectedItem().toString(), this.spnFacDivB9.getSelectedItem().toString());
            reference.child(""+id).setValue(adh9);

        }

        if(Integer.parseInt(Psub)==10){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);
            id = r.nextInt(10000);
            AddDetailsHelper adh3 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour3.getSelectedItem().toString(), this.spnTutorHour3.getSelectedItem().toString(), this.spnPracHour3.getSelectedItem().toString(), this.spnCredit3.getSelectedItem().toString(), this.spnSub3.getSelectedItem().toString(),this.spnFacDivA3.getSelectedItem().toString(), this.spnFacDivB3.getSelectedItem().toString());
            reference.child(""+id).setValue(adh3);
            id = r.nextInt(10000);
            AddDetailsHelper adh4 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour4.getSelectedItem().toString(), this.spnTutorHour4.getSelectedItem().toString(), this.spnPracHour4.getSelectedItem().toString(), this.spnCredit4.getSelectedItem().toString(), this.spnSub4.getSelectedItem().toString(),this.spnFacDivA4.getSelectedItem().toString(), this.spnFacDivB4.getSelectedItem().toString());
            reference.child(""+id).setValue(adh4);
            id = r.nextInt(10000);
            AddDetailsHelper adh5 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour5.getSelectedItem().toString(), this.spnTutorHour5.getSelectedItem().toString(), this.spnPracHour5.getSelectedItem().toString(), this.spnCredit5.getSelectedItem().toString(), this.spnSub5.getSelectedItem().toString(),this.spnFacDivA5.getSelectedItem().toString(), this.spnFacDivB5.getSelectedItem().toString());
            reference.child(""+id).setValue(adh5);
            id = r.nextInt(10000);
            AddDetailsHelper adh6 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour6.getSelectedItem().toString(), this.spnTutorHour6.getSelectedItem().toString(), this.spnPracHour6.getSelectedItem().toString(), this.spnCredit6.getSelectedItem().toString(), this.spnSub6.getSelectedItem().toString(),this.spnFacDivA6.getSelectedItem().toString(), this.spnFacDivB6.getSelectedItem().toString());
            reference.child(""+id).setValue(adh6);
            id = r.nextInt(10000);
            AddDetailsHelper adh7 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour7.getSelectedItem().toString(), this.spnTutorHour7.getSelectedItem().toString(), this.spnPracHour7.getSelectedItem().toString(), this.spnCredit7.getSelectedItem().toString(), this.spnSub7.getSelectedItem().toString(),this.spnFacDivA7.getSelectedItem().toString(), this.spnFacDivB7.getSelectedItem().toString());
            reference.child(""+id).setValue(adh7);
            id = r.nextInt(10000);
            AddDetailsHelper adh8 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour8.getSelectedItem().toString(), this.spnTutorHour8.getSelectedItem().toString(), this.spnPracHour8.getSelectedItem().toString(), this.spnCredit8.getSelectedItem().toString(), this.spnSub8.getSelectedItem().toString(),this.spnFacDivA8.getSelectedItem().toString(), this.spnFacDivB8.getSelectedItem().toString());
            reference.child(""+id).setValue(adh8);
            id = r.nextInt(10000);
            AddDetailsHelper adh9 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour9.getSelectedItem().toString(), this.spnTutorHour9.getSelectedItem().toString(), this.spnPracHour9.getSelectedItem().toString(), this.spnCredit9.getSelectedItem().toString(), this.spnSub9.getSelectedItem().toString(),this.spnFacDivA9.getSelectedItem().toString(), this.spnFacDivB9.getSelectedItem().toString());
            reference.child(""+id).setValue(adh9);
            id = r.nextInt(10000);
            AddDetailsHelper adh10 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour10.getSelectedItem().toString(), this.spnTutorHour10.getSelectedItem().toString(), this.spnPracHour10.getSelectedItem().toString(), this.spnCredit10.getSelectedItem().toString(), this.spnSub10.getSelectedItem().toString(),this.spnFacDivA10.getSelectedItem().toString(), this.spnFacDivB10.getSelectedItem().toString());
            reference.child(""+id).setValue(adh10);

        }

        if(Integer.parseInt(Psub)==11){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);
            id = r.nextInt(10000);
            AddDetailsHelper adh3 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour3.getSelectedItem().toString(), this.spnTutorHour3.getSelectedItem().toString(), this.spnPracHour3.getSelectedItem().toString(), this.spnCredit3.getSelectedItem().toString(), this.spnSub3.getSelectedItem().toString(),this.spnFacDivA3.getSelectedItem().toString(), this.spnFacDivB3.getSelectedItem().toString());
            reference.child(""+id).setValue(adh3);
            id = r.nextInt(10000);
            AddDetailsHelper adh4 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour4.getSelectedItem().toString(), this.spnTutorHour4.getSelectedItem().toString(), this.spnPracHour4.getSelectedItem().toString(), this.spnCredit4.getSelectedItem().toString(), this.spnSub4.getSelectedItem().toString(),this.spnFacDivA4.getSelectedItem().toString(), this.spnFacDivB4.getSelectedItem().toString());
            reference.child(""+id).setValue(adh4);
            id = r.nextInt(10000);
            AddDetailsHelper adh5 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour5.getSelectedItem().toString(), this.spnTutorHour5.getSelectedItem().toString(), this.spnPracHour5.getSelectedItem().toString(), this.spnCredit5.getSelectedItem().toString(), this.spnSub5.getSelectedItem().toString(),this.spnFacDivA5.getSelectedItem().toString(), this.spnFacDivB5.getSelectedItem().toString());
            reference.child(""+id).setValue(adh5);
            id = r.nextInt(10000);
            AddDetailsHelper adh6 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour6.getSelectedItem().toString(), this.spnTutorHour6.getSelectedItem().toString(), this.spnPracHour6.getSelectedItem().toString(), this.spnCredit6.getSelectedItem().toString(), this.spnSub6.getSelectedItem().toString(),this.spnFacDivA6.getSelectedItem().toString(), this.spnFacDivB6.getSelectedItem().toString());
            reference.child(""+id).setValue(adh6);
            id = r.nextInt(10000);
            AddDetailsHelper adh7 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour7.getSelectedItem().toString(), this.spnTutorHour7.getSelectedItem().toString(), this.spnPracHour7.getSelectedItem().toString(), this.spnCredit7.getSelectedItem().toString(), this.spnSub7.getSelectedItem().toString(),this.spnFacDivA7.getSelectedItem().toString(), this.spnFacDivB7.getSelectedItem().toString());
            reference.child(""+id).setValue(adh7);
            id = r.nextInt(10000);
            AddDetailsHelper adh8 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour8.getSelectedItem().toString(), this.spnTutorHour8.getSelectedItem().toString(), this.spnPracHour8.getSelectedItem().toString(), this.spnCredit8.getSelectedItem().toString(), this.spnSub8.getSelectedItem().toString(),this.spnFacDivA8.getSelectedItem().toString(), this.spnFacDivB8.getSelectedItem().toString());
            reference.child(""+id).setValue(adh8);
            id = r.nextInt(10000);
            AddDetailsHelper adh9 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour9.getSelectedItem().toString(), this.spnTutorHour9.getSelectedItem().toString(), this.spnPracHour9.getSelectedItem().toString(), this.spnCredit9.getSelectedItem().toString(), this.spnSub9.getSelectedItem().toString(),this.spnFacDivA9.getSelectedItem().toString(), this.spnFacDivB9.getSelectedItem().toString());
            reference.child(""+id).setValue(adh9);
            id = r.nextInt(10000);
            AddDetailsHelper adh10 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour10.getSelectedItem().toString(), this.spnTutorHour10.getSelectedItem().toString(), this.spnPracHour10.getSelectedItem().toString(), this.spnCredit10.getSelectedItem().toString(), this.spnSub10.getSelectedItem().toString(),this.spnFacDivA10.getSelectedItem().toString(), this.spnFacDivB10.getSelectedItem().toString());
            reference.child(""+id).setValue(adh10);
            id = r.nextInt(10000);
            AddDetailsHelper adh11 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour11.getSelectedItem().toString(), this.spnTutorHour11.getSelectedItem().toString(), this.spnPracHour11.getSelectedItem().toString(), this.spnCredit11.getSelectedItem().toString(), this.spnSub11.getSelectedItem().toString(),this.spnFacDivA11.getSelectedItem().toString(), this.spnFacDivB11.getSelectedItem().toString());
            reference.child(""+id).setValue(adh11);

        }
        if(Integer.parseInt(Psub)==12){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);
            id = r.nextInt(10000);
            AddDetailsHelper adh3 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour3.getSelectedItem().toString(), this.spnTutorHour3.getSelectedItem().toString(), this.spnPracHour3.getSelectedItem().toString(), this.spnCredit3.getSelectedItem().toString(), this.spnSub3.getSelectedItem().toString(),this.spnFacDivA3.getSelectedItem().toString(), this.spnFacDivB3.getSelectedItem().toString());
            reference.child(""+id).setValue(adh3);
            id = r.nextInt(10000);
            AddDetailsHelper adh4 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour4.getSelectedItem().toString(), this.spnTutorHour4.getSelectedItem().toString(), this.spnPracHour4.getSelectedItem().toString(), this.spnCredit4.getSelectedItem().toString(), this.spnSub4.getSelectedItem().toString(),this.spnFacDivA4.getSelectedItem().toString(), this.spnFacDivB4.getSelectedItem().toString());
            reference.child(""+id).setValue(adh4);
            id = r.nextInt(10000);
            AddDetailsHelper adh5 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour5.getSelectedItem().toString(), this.spnTutorHour5.getSelectedItem().toString(), this.spnPracHour5.getSelectedItem().toString(), this.spnCredit5.getSelectedItem().toString(), this.spnSub5.getSelectedItem().toString(),this.spnFacDivA5.getSelectedItem().toString(), this.spnFacDivB5.getSelectedItem().toString());
            reference.child(""+id).setValue(adh5);
            id = r.nextInt(10000);
            AddDetailsHelper adh6 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour6.getSelectedItem().toString(), this.spnTutorHour6.getSelectedItem().toString(), this.spnPracHour6.getSelectedItem().toString(), this.spnCredit6.getSelectedItem().toString(), this.spnSub6.getSelectedItem().toString(),this.spnFacDivA6.getSelectedItem().toString(), this.spnFacDivB6.getSelectedItem().toString());
            reference.child(""+id).setValue(adh6);
            id = r.nextInt(10000);
            AddDetailsHelper adh7 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour7.getSelectedItem().toString(), this.spnTutorHour7.getSelectedItem().toString(), this.spnPracHour7.getSelectedItem().toString(), this.spnCredit7.getSelectedItem().toString(), this.spnSub7.getSelectedItem().toString(),this.spnFacDivA7.getSelectedItem().toString(), this.spnFacDivB7.getSelectedItem().toString());
            reference.child(""+id).setValue(adh7);
            id = r.nextInt(10000);
            AddDetailsHelper adh8 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour8.getSelectedItem().toString(), this.spnTutorHour8.getSelectedItem().toString(), this.spnPracHour8.getSelectedItem().toString(), this.spnCredit8.getSelectedItem().toString(), this.spnSub8.getSelectedItem().toString(),this.spnFacDivA8.getSelectedItem().toString(), this.spnFacDivB8.getSelectedItem().toString());
            reference.child(""+id).setValue(adh8);
            id = r.nextInt(10000);
            AddDetailsHelper adh9 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour9.getSelectedItem().toString(), this.spnTutorHour9.getSelectedItem().toString(), this.spnPracHour9.getSelectedItem().toString(), this.spnCredit9.getSelectedItem().toString(), this.spnSub9.getSelectedItem().toString(),this.spnFacDivA9.getSelectedItem().toString(), this.spnFacDivB9.getSelectedItem().toString());
            reference.child(""+id).setValue(adh9);
            id = r.nextInt(10000);
            AddDetailsHelper adh10 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour10.getSelectedItem().toString(), this.spnTutorHour10.getSelectedItem().toString(), this.spnPracHour10.getSelectedItem().toString(), this.spnCredit10.getSelectedItem().toString(), this.spnSub10.getSelectedItem().toString(),this.spnFacDivA10.getSelectedItem().toString(), this.spnFacDivB10.getSelectedItem().toString());
            reference.child(""+id).setValue(adh10);
            id = r.nextInt(10000);
            AddDetailsHelper adh11 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour11.getSelectedItem().toString(), this.spnTutorHour11.getSelectedItem().toString(), this.spnPracHour11.getSelectedItem().toString(), this.spnCredit11.getSelectedItem().toString(), this.spnSub11.getSelectedItem().toString(),this.spnFacDivA11.getSelectedItem().toString(), this.spnFacDivB11.getSelectedItem().toString());
            reference.child(""+id).setValue(adh11);
            id = r.nextInt(10000);
            AddDetailsHelper adh12 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour12.getSelectedItem().toString(), this.spnTutorHour12.getSelectedItem().toString(), this.spnPracHour12.getSelectedItem().toString(), this.spnCredit12.getSelectedItem().toString(), this.spnSub12.getSelectedItem().toString(),this.spnFacDivA12.getSelectedItem().toString(), this.spnFacDivB12.getSelectedItem().toString());
            reference.child(""+id).setValue(adh12);

        }

        if(Integer.parseInt(Psub)==13){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);
            id = r.nextInt(10000);
            AddDetailsHelper adh3 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour3.getSelectedItem().toString(), this.spnTutorHour3.getSelectedItem().toString(), this.spnPracHour3.getSelectedItem().toString(), this.spnCredit3.getSelectedItem().toString(), this.spnSub3.getSelectedItem().toString(),this.spnFacDivA3.getSelectedItem().toString(), this.spnFacDivB3.getSelectedItem().toString());
            reference.child(""+id).setValue(adh3);
            id = r.nextInt(10000);
            AddDetailsHelper adh4 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour4.getSelectedItem().toString(), this.spnTutorHour4.getSelectedItem().toString(), this.spnPracHour4.getSelectedItem().toString(), this.spnCredit4.getSelectedItem().toString(), this.spnSub4.getSelectedItem().toString(),this.spnFacDivA4.getSelectedItem().toString(), this.spnFacDivB4.getSelectedItem().toString());
            reference.child(""+id).setValue(adh4);
            id = r.nextInt(10000);
            AddDetailsHelper adh5 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour5.getSelectedItem().toString(), this.spnTutorHour5.getSelectedItem().toString(), this.spnPracHour5.getSelectedItem().toString(), this.spnCredit5.getSelectedItem().toString(), this.spnSub5.getSelectedItem().toString(),this.spnFacDivA5.getSelectedItem().toString(), this.spnFacDivB5.getSelectedItem().toString());
            reference.child(""+id).setValue(adh5);
            id = r.nextInt(10000);
            AddDetailsHelper adh6 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour6.getSelectedItem().toString(), this.spnTutorHour6.getSelectedItem().toString(), this.spnPracHour6.getSelectedItem().toString(), this.spnCredit6.getSelectedItem().toString(), this.spnSub6.getSelectedItem().toString(),this.spnFacDivA6.getSelectedItem().toString(), this.spnFacDivB6.getSelectedItem().toString());
            reference.child(""+id).setValue(adh6);
            id = r.nextInt(10000);
            AddDetailsHelper adh7 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour7.getSelectedItem().toString(), this.spnTutorHour7.getSelectedItem().toString(), this.spnPracHour7.getSelectedItem().toString(), this.spnCredit7.getSelectedItem().toString(), this.spnSub7.getSelectedItem().toString(),this.spnFacDivA7.getSelectedItem().toString(), this.spnFacDivB7.getSelectedItem().toString());
            reference.child(""+id).setValue(adh7);
            id = r.nextInt(10000);
            AddDetailsHelper adh8 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour8.getSelectedItem().toString(), this.spnTutorHour8.getSelectedItem().toString(), this.spnPracHour8.getSelectedItem().toString(), this.spnCredit8.getSelectedItem().toString(), this.spnSub8.getSelectedItem().toString(),this.spnFacDivA8.getSelectedItem().toString(), this.spnFacDivB8.getSelectedItem().toString());
            reference.child(""+id).setValue(adh8);
            id = r.nextInt(10000);
            AddDetailsHelper adh9 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour9.getSelectedItem().toString(), this.spnTutorHour9.getSelectedItem().toString(), this.spnPracHour9.getSelectedItem().toString(), this.spnCredit9.getSelectedItem().toString(), this.spnSub9.getSelectedItem().toString(),this.spnFacDivA9.getSelectedItem().toString(), this.spnFacDivB9.getSelectedItem().toString());
            reference.child(""+id).setValue(adh9);
            id = r.nextInt(10000);
            AddDetailsHelper adh10 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour10.getSelectedItem().toString(), this.spnTutorHour10.getSelectedItem().toString(), this.spnPracHour10.getSelectedItem().toString(), this.spnCredit10.getSelectedItem().toString(), this.spnSub10.getSelectedItem().toString(),this.spnFacDivA10.getSelectedItem().toString(), this.spnFacDivB10.getSelectedItem().toString());
            reference.child(""+id).setValue(adh10);
            id = r.nextInt(10000);
            AddDetailsHelper adh11 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour11.getSelectedItem().toString(), this.spnTutorHour11.getSelectedItem().toString(), this.spnPracHour11.getSelectedItem().toString(), this.spnCredit11.getSelectedItem().toString(), this.spnSub11.getSelectedItem().toString(),this.spnFacDivA11.getSelectedItem().toString(), this.spnFacDivB11.getSelectedItem().toString());
            reference.child(""+id).setValue(adh11);
            id = r.nextInt(10000);
            AddDetailsHelper adh12 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour12.getSelectedItem().toString(), this.spnTutorHour12.getSelectedItem().toString(), this.spnPracHour12.getSelectedItem().toString(), this.spnCredit12.getSelectedItem().toString(), this.spnSub12.getSelectedItem().toString(),this.spnFacDivA12.getSelectedItem().toString(), this.spnFacDivB12.getSelectedItem().toString());
            reference.child(""+id).setValue(adh12);
            id = r.nextInt(10000);
            AddDetailsHelper adh13 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour13.getSelectedItem().toString(), this.spnTutorHour13.getSelectedItem().toString(), this.spnPracHour13.getSelectedItem().toString(), this.spnCredit13.getSelectedItem().toString(), this.spnSub13.getSelectedItem().toString(),this.spnFacDivA13.getSelectedItem().toString(), this.spnFacDivB13.getSelectedItem().toString());
            reference.child(""+id).setValue(adh13);

        }

        if(Integer.parseInt(Psub)==14){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);
            id = r.nextInt(10000);
            AddDetailsHelper adh3 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour3.getSelectedItem().toString(), this.spnTutorHour3.getSelectedItem().toString(), this.spnPracHour3.getSelectedItem().toString(), this.spnCredit3.getSelectedItem().toString(), this.spnSub3.getSelectedItem().toString(),this.spnFacDivA3.getSelectedItem().toString(), this.spnFacDivB3.getSelectedItem().toString());
            reference.child(""+id).setValue(adh3);
            id = r.nextInt(10000);
            AddDetailsHelper adh4 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour4.getSelectedItem().toString(), this.spnTutorHour4.getSelectedItem().toString(), this.spnPracHour4.getSelectedItem().toString(), this.spnCredit4.getSelectedItem().toString(), this.spnSub4.getSelectedItem().toString(),this.spnFacDivA4.getSelectedItem().toString(), this.spnFacDivB4.getSelectedItem().toString());
            reference.child(""+id).setValue(adh4);
            id = r.nextInt(10000);
            AddDetailsHelper adh5 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour5.getSelectedItem().toString(), this.spnTutorHour5.getSelectedItem().toString(), this.spnPracHour5.getSelectedItem().toString(), this.spnCredit5.getSelectedItem().toString(), this.spnSub5.getSelectedItem().toString(),this.spnFacDivA5.getSelectedItem().toString(), this.spnFacDivB5.getSelectedItem().toString());
            reference.child(""+id).setValue(adh5);
            id = r.nextInt(10000);
            AddDetailsHelper adh6 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour6.getSelectedItem().toString(), this.spnTutorHour6.getSelectedItem().toString(), this.spnPracHour6.getSelectedItem().toString(), this.spnCredit6.getSelectedItem().toString(), this.spnSub6.getSelectedItem().toString(),this.spnFacDivA6.getSelectedItem().toString(), this.spnFacDivB6.getSelectedItem().toString());
            reference.child(""+id).setValue(adh6);
            id = r.nextInt(10000);
            AddDetailsHelper adh7 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour7.getSelectedItem().toString(), this.spnTutorHour7.getSelectedItem().toString(), this.spnPracHour7.getSelectedItem().toString(), this.spnCredit7.getSelectedItem().toString(), this.spnSub7.getSelectedItem().toString(),this.spnFacDivA7.getSelectedItem().toString(), this.spnFacDivB7.getSelectedItem().toString());
            reference.child(""+id).setValue(adh7);
            id = r.nextInt(10000);
            AddDetailsHelper adh8 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour8.getSelectedItem().toString(), this.spnTutorHour8.getSelectedItem().toString(), this.spnPracHour8.getSelectedItem().toString(), this.spnCredit8.getSelectedItem().toString(), this.spnSub8.getSelectedItem().toString(),this.spnFacDivA8.getSelectedItem().toString(), this.spnFacDivB8.getSelectedItem().toString());
            reference.child(""+id).setValue(adh8);
            id = r.nextInt(10000);
            AddDetailsHelper adh9 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour9.getSelectedItem().toString(), this.spnTutorHour9.getSelectedItem().toString(), this.spnPracHour9.getSelectedItem().toString(), this.spnCredit9.getSelectedItem().toString(), this.spnSub9.getSelectedItem().toString(),this.spnFacDivA9.getSelectedItem().toString(), this.spnFacDivB9.getSelectedItem().toString());
            reference.child(""+id).setValue(adh9);
            id = r.nextInt(10000);
            AddDetailsHelper adh10 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour10.getSelectedItem().toString(), this.spnTutorHour10.getSelectedItem().toString(), this.spnPracHour10.getSelectedItem().toString(), this.spnCredit10.getSelectedItem().toString(), this.spnSub10.getSelectedItem().toString(),this.spnFacDivA10.getSelectedItem().toString(), this.spnFacDivB10.getSelectedItem().toString());
            reference.child(""+id).setValue(adh10);
            id = r.nextInt(10000);
            AddDetailsHelper adh11 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour11.getSelectedItem().toString(), this.spnTutorHour11.getSelectedItem().toString(), this.spnPracHour11.getSelectedItem().toString(), this.spnCredit11.getSelectedItem().toString(), this.spnSub11.getSelectedItem().toString(),this.spnFacDivA11.getSelectedItem().toString(), this.spnFacDivB11.getSelectedItem().toString());
            reference.child(""+id).setValue(adh11);
            id = r.nextInt(10000);
            AddDetailsHelper adh12 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour12.getSelectedItem().toString(), this.spnTutorHour12.getSelectedItem().toString(), this.spnPracHour12.getSelectedItem().toString(), this.spnCredit12.getSelectedItem().toString(), this.spnSub12.getSelectedItem().toString(),this.spnFacDivA12.getSelectedItem().toString(), this.spnFacDivB12.getSelectedItem().toString());
            reference.child(""+id).setValue(adh12);
            id = r.nextInt(10000);
            AddDetailsHelper adh13 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour13.getSelectedItem().toString(), this.spnTutorHour13.getSelectedItem().toString(), this.spnPracHour13.getSelectedItem().toString(), this.spnCredit13.getSelectedItem().toString(), this.spnSub13.getSelectedItem().toString(),this.spnFacDivA13.getSelectedItem().toString(), this.spnFacDivB13.getSelectedItem().toString());
            reference.child(""+id).setValue(adh13);
            id = r.nextInt(10000);
            AddDetailsHelper adh14 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour14.getSelectedItem().toString(), this.spnTutorHour14.getSelectedItem().toString(), this.spnPracHour14.getSelectedItem().toString(), this.spnCredit14.getSelectedItem().toString(), this.spnSub14.getSelectedItem().toString(),this.spnFacDivA14.getSelectedItem().toString(), this.spnFacDivB14.getSelectedItem().toString());
            reference.child(""+id).setValue(adh14);

        }

        if(Integer.parseInt(Psub)==15){
            id = r.nextInt(10000);
            AddDetailsHelper adh = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour1.getSelectedItem().toString(), this.spnTutorHour1.getSelectedItem().toString(), this.spnPracHour1.getSelectedItem().toString(), this.spnCredit1.getSelectedItem().toString(), this.spnSub1.getSelectedItem().toString(),this.spnFacDivA1.getSelectedItem().toString(), this.spnFacDivB1.getSelectedItem().toString());
            reference.child(""+id).setValue(adh);
            id = r.nextInt(10000);
            AddDetailsHelper adh2 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour2.getSelectedItem().toString(), this.spnTutorHour2.getSelectedItem().toString(), this.spnPracHour2.getSelectedItem().toString(), this.spnCredit2.getSelectedItem().toString(), this.spnSub2.getSelectedItem().toString(),this.spnFacDivA2.getSelectedItem().toString(), this.spnFacDivB2.getSelectedItem().toString());
            reference.child(""+id).setValue(adh2);
            id = r.nextInt(10000);
            AddDetailsHelper adh3 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour3.getSelectedItem().toString(), this.spnTutorHour3.getSelectedItem().toString(), this.spnPracHour3.getSelectedItem().toString(), this.spnCredit3.getSelectedItem().toString(), this.spnSub3.getSelectedItem().toString(),this.spnFacDivA3.getSelectedItem().toString(), this.spnFacDivB3.getSelectedItem().toString());
            reference.child(""+id).setValue(adh3);
            id = r.nextInt(10000);
            AddDetailsHelper adh4 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour4.getSelectedItem().toString(), this.spnTutorHour4.getSelectedItem().toString(), this.spnPracHour4.getSelectedItem().toString(), this.spnCredit4.getSelectedItem().toString(), this.spnSub4.getSelectedItem().toString(),this.spnFacDivA4.getSelectedItem().toString(), this.spnFacDivB4.getSelectedItem().toString());
            reference.child(""+id).setValue(adh4);
            id = r.nextInt(10000);
            AddDetailsHelper adh5 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour5.getSelectedItem().toString(), this.spnTutorHour5.getSelectedItem().toString(), this.spnPracHour5.getSelectedItem().toString(), this.spnCredit5.getSelectedItem().toString(), this.spnSub5.getSelectedItem().toString(),this.spnFacDivA5.getSelectedItem().toString(), this.spnFacDivB5.getSelectedItem().toString());
            reference.child(""+id).setValue(adh5);
            id = r.nextInt(10000);
            AddDetailsHelper adh6 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour6.getSelectedItem().toString(), this.spnTutorHour6.getSelectedItem().toString(), this.spnPracHour6.getSelectedItem().toString(), this.spnCredit6.getSelectedItem().toString(), this.spnSub6.getSelectedItem().toString(),this.spnFacDivA6.getSelectedItem().toString(), this.spnFacDivB6.getSelectedItem().toString());
            reference.child(""+id).setValue(adh6);
            id = r.nextInt(10000);
            AddDetailsHelper adh7 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour7.getSelectedItem().toString(), this.spnTutorHour7.getSelectedItem().toString(), this.spnPracHour7.getSelectedItem().toString(), this.spnCredit7.getSelectedItem().toString(), this.spnSub7.getSelectedItem().toString(),this.spnFacDivA7.getSelectedItem().toString(), this.spnFacDivB7.getSelectedItem().toString());
            reference.child(""+id).setValue(adh7);
            id = r.nextInt(10000);
            AddDetailsHelper adh8 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour8.getSelectedItem().toString(), this.spnTutorHour8.getSelectedItem().toString(), this.spnPracHour8.getSelectedItem().toString(), this.spnCredit8.getSelectedItem().toString(), this.spnSub8.getSelectedItem().toString(),this.spnFacDivA8.getSelectedItem().toString(), this.spnFacDivB8.getSelectedItem().toString());
            reference.child(""+id).setValue(adh8);
            id = r.nextInt(10000);
            AddDetailsHelper adh9 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour9.getSelectedItem().toString(), this.spnTutorHour9.getSelectedItem().toString(), this.spnPracHour9.getSelectedItem().toString(), this.spnCredit9.getSelectedItem().toString(), this.spnSub9.getSelectedItem().toString(),this.spnFacDivA9.getSelectedItem().toString(), this.spnFacDivB9.getSelectedItem().toString());
            reference.child(""+id).setValue(adh9);
            id = r.nextInt(10000);
            AddDetailsHelper adh10 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour10.getSelectedItem().toString(), this.spnTutorHour10.getSelectedItem().toString(), this.spnPracHour10.getSelectedItem().toString(), this.spnCredit10.getSelectedItem().toString(), this.spnSub10.getSelectedItem().toString(),this.spnFacDivA10.getSelectedItem().toString(), this.spnFacDivB10.getSelectedItem().toString());
            reference.child(""+id).setValue(adh10);
            id = r.nextInt(10000);
            AddDetailsHelper adh11 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour11.getSelectedItem().toString(), this.spnTutorHour11.getSelectedItem().toString(), this.spnPracHour11.getSelectedItem().toString(), this.spnCredit11.getSelectedItem().toString(), this.spnSub11.getSelectedItem().toString(),this.spnFacDivA11.getSelectedItem().toString(), this.spnFacDivB11.getSelectedItem().toString());
            reference.child(""+id).setValue(adh11);
            id = r.nextInt(10000);
            AddDetailsHelper adh12 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour12.getSelectedItem().toString(), this.spnTutorHour12.getSelectedItem().toString(), this.spnPracHour12.getSelectedItem().toString(), this.spnCredit12.getSelectedItem().toString(), this.spnSub12.getSelectedItem().toString(),this.spnFacDivA12.getSelectedItem().toString(), this.spnFacDivB12.getSelectedItem().toString());
            reference.child(""+id).setValue(adh12);
            id = r.nextInt(10000);
            AddDetailsHelper adh13 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour13.getSelectedItem().toString(), this.spnTutorHour13.getSelectedItem().toString(), this.spnPracHour13.getSelectedItem().toString(), this.spnCredit13.getSelectedItem().toString(), this.spnSub13.getSelectedItem().toString(),this.spnFacDivA13.getSelectedItem().toString(), this.spnFacDivB13.getSelectedItem().toString());
            reference.child(""+id).setValue(adh13);
            id = r.nextInt(10000);
            AddDetailsHelper adh14 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour14.getSelectedItem().toString(), this.spnTutorHour14.getSelectedItem().toString(), this.spnPracHour14.getSelectedItem().toString(), this.spnCredit14.getSelectedItem().toString(), this.spnSub14.getSelectedItem().toString(),this.spnFacDivA14.getSelectedItem().toString(), this.spnFacDivB14.getSelectedItem().toString());
            reference.child(""+id).setValue(adh14);
            id = r.nextInt(10000);
            AddDetailsHelper adh15 = new AddDetailsHelper(""+id, this.commonId,this.spnLecHour15.getSelectedItem().toString(), this.spnTutorHour15.getSelectedItem().toString(), this.spnPracHour15.getSelectedItem().toString(), this.spnCredit15.getSelectedItem().toString(), this.spnSub15.getSelectedItem().toString(),this.spnFacDivA15.getSelectedItem().toString(), this.spnFacDivB15.getSelectedItem().toString());
            reference.child(""+id).setValue(adh15);
        }
            id = r.nextInt(10000);
            GetDrafts gd = new GetDrafts(this.commonId);
            reference = rootNode.getReference("drafts");
            reference.child(""+id).setValue(gd);


    }



    @Override
    protected void onStop() {
        super.onStop();
        FirebaseDatabase.getInstance().goOffline();
    }

    @Override
    protected void onResume() {
        super.onResume();
        FirebaseDatabase.getInstance().goOnline();
    }
}
