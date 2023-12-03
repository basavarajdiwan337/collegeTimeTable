package com.proj.timetable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ViewDrafts extends Activity implements View.OnClickListener {

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    ArrayList<AddDetailsHelper> arrlst = new ArrayList<AddDetailsHelper>();

    AddDetailsHelper adh = new AddDetailsHelper();

    TextView spnLecHour1, spnTutorHour1, spnPracHour1, spnCredit1, spnSub1, spnFacDivA1, spnFacDivB1;
    TextView spnLecHour2, spnTutorHour2, spnPracHour2, spnCredit2, spnSub2, spnFacDivA2, spnFacDivB2;
    TextView spnLecHour3, spnTutorHour3, spnPracHour3, spnCredit3, spnSub3, spnFacDivA3, spnFacDivB3;
    TextView spnLecHour4, spnTutorHour4, spnPracHour4, spnCredit4, spnSub4, spnFacDivA4, spnFacDivB4;
    TextView spnLecHour5, spnTutorHour5, spnPracHour5, spnCredit5, spnSub5, spnFacDivA5, spnFacDivB5;
    TextView spnLecHour6, spnTutorHour6, spnPracHour6, spnCredit6, spnSub6, spnFacDivA6, spnFacDivB6;
    TextView spnLecHour7, spnTutorHour7, spnPracHour7, spnCredit7, spnSub7, spnFacDivA7, spnFacDivB7;
    TextView spnLecHour8, spnTutorHour8, spnPracHour8, spnCredit8, spnSub8, spnFacDivA8, spnFacDivB8;
    TextView spnLecHour9, spnTutorHour9, spnPracHour9, spnCredit9, spnSub9, spnFacDivA9, spnFacDivB9;
    TextView spnLecHour10, spnTutorHour10, spnPracHour10, spnCredit10, spnSub10, spnFacDivA10, spnFacDivB10;
    TextView spnLecHour11, spnTutorHour11, spnPracHour11, spnCredit11, spnSub11, spnFacDivA11, spnFacDivB11;
    TextView spnLecHour12, spnTutorHour12, spnPracHour12, spnCredit12, spnSub12, spnFacDivA12, spnFacDivB12;
    TextView spnLecHour13, spnTutorHour13, spnPracHour13, spnCredit13, spnSub13, spnFacDivA13, spnFacDivB13;
    TextView spnLecHour14, spnTutorHour14, spnPracHour14, spnCredit14, spnSub14, spnFacDivA14, spnFacDivB14;
    TextView spnLecHour15, spnTutorHour15, spnPracHour15, spnCredit15, spnSub15, spnFacDivA15, spnFacDivB15;

    Button btnUpdate1, btnDelet1;
    Button btnUpdate2, btnDelet2;
    Button btnUpdate3, btnDelet3;
    Button btnUpdate4, btnDelet4;
    Button btnUpdate5, btnDelet5;
    Button btnUpdate6, btnDelet6;
    Button btnUpdate7, btnDelet7;
    Button btnUpdate8, btnDelet8;
    Button btnUpdate9, btnDelet9;
    Button btnUpdate10, btnDelet10;
    Button btnUpdate11, btnDelet11;
    Button btnUpdate12, btnDelet12;
    Button btnUpdate13, btnDelet13;
    Button btnUpdate14, btnDelet14;
    Button btnUpdate15, btnDelet15;

    String commonid;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_details_form);

        Intent param = getIntent();
        commonid = param.getStringExtra("commonid");


        btnUpdate1 = (Button) findViewById(R.id.btnUpdate1);
        btnDelet1 = (Button) findViewById(R.id.btnDelet1);

        btnUpdate2 = (Button) findViewById(R.id.btnUpdate2);
        btnDelet2 = (Button) findViewById(R.id.btnDelet2);

        btnUpdate3 = (Button) findViewById(R.id.btnUpdate3);
        btnDelet3 = (Button) findViewById(R.id.btnDelet3);

        btnUpdate4 = (Button) findViewById(R.id.btnUpdate4);
        btnDelet4 = (Button) findViewById(R.id.btnDelet4);


        btnUpdate5 = (Button) findViewById(R.id.btnUpdate5);
        btnDelet5 = (Button) findViewById(R.id.btnDelet5);


        btnUpdate6 = (Button) findViewById(R.id.btnUpdate6);
        btnDelet6 = (Button) findViewById(R.id.btnDelet6);


        btnUpdate7 = (Button) findViewById(R.id.btnUpdate7);
        btnDelet7 = (Button) findViewById(R.id.btnDelet7);


        btnUpdate8 = (Button) findViewById(R.id.btnUpdate8);
        btnDelet8 = (Button) findViewById(R.id.btnDelet8);


        btnUpdate9 = (Button) findViewById(R.id.btnUpdate9);
        btnDelet9 = (Button) findViewById(R.id.btnDelet9);


        btnUpdate10 = (Button) findViewById(R.id.btnUpdate10);
        btnDelet10 = (Button) findViewById(R.id.btnDelet10);


        btnUpdate11 = (Button) findViewById(R.id.btnUpdate11);
        btnDelet11 = (Button) findViewById(R.id.btnDelet11);


        btnUpdate12 = (Button) findViewById(R.id.btnUpdate12);
        btnDelet12 = (Button) findViewById(R.id.btnDelet12);

        btnUpdate13 = (Button) findViewById(R.id.btnUpdate13);
        btnDelet13 = (Button) findViewById(R.id.btnDelet13);


        btnUpdate14 = (Button) findViewById(R.id.btnUpdate14);
        btnDelet14 = (Button) findViewById(R.id.btnDelet14);


        btnUpdate15 = (Button) findViewById(R.id.btnUpdate15);
        btnDelet15 = (Button) findViewById(R.id.btnDelet15);


        spnLecHour1 = (TextView) findViewById(R.id.spnLecHour1);
        spnTutorHour1 = (TextView) findViewById(R.id.spnTutorHour1);
        spnPracHour1 = (TextView) findViewById(R.id.spnPracHour1);
        spnCredit1 = (TextView) findViewById(R.id.spnCredit1);
        spnSub1 = (TextView) findViewById(R.id.spnSub1);
        spnFacDivA1 = (TextView) findViewById(R.id.spnFacDivA1);
        spnFacDivB1 = (TextView) findViewById(R.id.spnFacDivB1);

        spnLecHour2 = (TextView) findViewById(R.id.spnLecHour2);
        spnTutorHour2 = (TextView) findViewById(R.id.spnTutorHour2);
        spnPracHour2 = (TextView) findViewById(R.id.spnPracHour2);
        spnCredit2 = (TextView) findViewById(R.id.spnCredit2);
        spnSub2 = (TextView) findViewById(R.id.spnSub2);
        spnFacDivA2 = (TextView) findViewById(R.id.spnFacDivA2);
        spnFacDivB2 = (TextView) findViewById(R.id.spnFacDivB2);


        spnLecHour3 = (TextView) findViewById(R.id.spnLecHour3);
        spnTutorHour3 = (TextView) findViewById(R.id.spnTutorHour3);
        spnPracHour3 = (TextView) findViewById(R.id.spnPracHour3);
        spnCredit3 = (TextView) findViewById(R.id.spnCredit3);
        spnSub3 = (TextView) findViewById(R.id.spnSub3);
        spnFacDivA3 = (TextView) findViewById(R.id.spnFacDivA3);
        spnFacDivB3 = (TextView) findViewById(R.id.spnFacDivB3);


        spnLecHour4 = (TextView) findViewById(R.id.spnLecHour4);
        spnTutorHour4 = (TextView) findViewById(R.id.spnTutorHour4);
        spnPracHour4 = (TextView) findViewById(R.id.spnPracHour4);
        spnCredit4 = (TextView) findViewById(R.id.spnCredit4);
        spnSub4 = (TextView) findViewById(R.id.spnSub4);
        spnFacDivA4 = (TextView) findViewById(R.id.spnFacDivA4);
        spnFacDivB4 = (TextView) findViewById(R.id.spnFacDivB4);

        spnLecHour5 = (TextView) findViewById(R.id.spnLecHour5);
        spnTutorHour5 = (TextView) findViewById(R.id.spnTutorHour5);
        spnPracHour5 = (TextView) findViewById(R.id.spnPracHour5);
        spnCredit5 = (TextView) findViewById(R.id.spnCredit5);
        spnSub5 = (TextView) findViewById(R.id.spnSub5);
        spnFacDivA5 = (TextView) findViewById(R.id.spnFacDivA5);
        spnFacDivB5 = (TextView) findViewById(R.id.spnFacDivB5);

        spnLecHour6 = (TextView) findViewById(R.id.spnLecHour6);
        spnTutorHour6 = (TextView) findViewById(R.id.spnTutorHour6);
        spnPracHour6 = (TextView) findViewById(R.id.spnPracHour6);
        spnCredit6 = (TextView) findViewById(R.id.spnCredit6);
        spnSub6 = (TextView) findViewById(R.id.spnSub6);
        spnFacDivA6 = (TextView) findViewById(R.id.spnFacDivA6);
        spnFacDivB6 = (TextView) findViewById(R.id.spnFacDivB6);

        spnLecHour7 = (TextView) findViewById(R.id.spnLecHour7);
        spnTutorHour7 = (TextView) findViewById(R.id.spnTutorHour7);
        spnPracHour7 = (TextView) findViewById(R.id.spnPracHour7);
        spnCredit7 = (TextView) findViewById(R.id.spnCredit7);
        spnSub7 = (TextView) findViewById(R.id.spnSub7);
        spnFacDivA7 = (TextView) findViewById(R.id.spnFacDivA7);
        spnFacDivB7 = (TextView) findViewById(R.id.spnFacDivB7);

        spnLecHour8 = (TextView) findViewById(R.id.spnLecHour8);
        spnTutorHour8 = (TextView) findViewById(R.id.spnTutorHour8);
        spnPracHour8 = (TextView) findViewById(R.id.spnPracHour8);
        spnCredit8 = (TextView) findViewById(R.id.spnCredit8);
        spnSub8 = (TextView) findViewById(R.id.spnSub8);
        spnFacDivA8 = (TextView) findViewById(R.id.spnFacDivA8);
        spnFacDivB8 = (TextView) findViewById(R.id.spnFacDivB8);

        spnLecHour9 = (TextView) findViewById(R.id.spnLecHour9);
        spnTutorHour9 = (TextView) findViewById(R.id.spnTutorHour9);
        spnPracHour9 = (TextView) findViewById(R.id.spnPracHour9);
        spnCredit9 = (TextView) findViewById(R.id.spnCredit9);
        spnSub9 = (TextView) findViewById(R.id.spnSub9);
        spnFacDivA9 = (TextView) findViewById(R.id.spnFacDivA9);
        spnFacDivB9 = (TextView) findViewById(R.id.spnFacDivB9);

        spnLecHour10 = (TextView) findViewById(R.id.spnLecHour10);
        spnTutorHour10 = (TextView) findViewById(R.id.spnTutorHour10);
        spnPracHour10 = (TextView) findViewById(R.id.spnPracHour10);
        spnCredit10 = (TextView) findViewById(R.id.spnCredit10);
        spnSub10 = (TextView) findViewById(R.id.spnSub10);
        spnFacDivA10 = (TextView) findViewById(R.id.spnFacDivA10);
        spnFacDivB10 = (TextView) findViewById(R.id.spnFacDivB10);

        spnLecHour11 = (TextView) findViewById(R.id.spnLecHour11);
        spnTutorHour11 = (TextView) findViewById(R.id.spnTutorHour11);
        spnPracHour11 = (TextView) findViewById(R.id.spnPracHour11);
        spnCredit11 = (TextView) findViewById(R.id.spnCredit11);
        spnSub11 = (TextView) findViewById(R.id.spnSub11);
        spnFacDivA11 = (TextView) findViewById(R.id.spnFacDivA11);
        spnFacDivB11 = (TextView) findViewById(R.id.spnFacDivB11);

        spnLecHour12 = (TextView) findViewById(R.id.spnLecHour12);
        spnTutorHour12 = (TextView) findViewById(R.id.spnTutorHour12);
        spnPracHour12 = (TextView) findViewById(R.id.spnPracHour12);
        spnCredit12 = (TextView) findViewById(R.id.spnCredit12);
        spnSub12 = (TextView) findViewById(R.id.spnSub12);
        spnFacDivA12 = (TextView) findViewById(R.id.spnFacDivA12);
        spnFacDivB12 = (TextView) findViewById(R.id.spnFacDivB12);

        spnLecHour13 = (TextView) findViewById(R.id.spnLecHour13);
        spnTutorHour13 = (TextView) findViewById(R.id.spnTutorHour13);
        spnPracHour13 = (TextView) findViewById(R.id.spnPracHour13);
        spnCredit13 = (TextView) findViewById(R.id.spnCredit13);
        spnSub13 = (TextView) findViewById(R.id.spnSub13);
        spnFacDivA13 = (TextView) findViewById(R.id.spnFacDivA13);
        spnFacDivB13 = (TextView) findViewById(R.id.spnFacDivB13);

        spnLecHour14 = (TextView) findViewById(R.id.spnLecHour14);
        spnTutorHour14 = (TextView) findViewById(R.id.spnTutorHour14);
        spnPracHour14 = (TextView) findViewById(R.id.spnPracHour14);
        spnCredit14 = (TextView) findViewById(R.id.spnCredit14);
        spnSub14 = (TextView) findViewById(R.id.spnSub14);
        spnFacDivA14 = (TextView) findViewById(R.id.spnFacDivA14);
        spnFacDivB14 = (TextView) findViewById(R.id.spnFacDivB14);

        spnLecHour15 = (TextView) findViewById(R.id.spnLecHour15);
        spnTutorHour15 = (TextView) findViewById(R.id.spnTutorHour15);
        spnPracHour15 = (TextView) findViewById(R.id.spnPracHour15);
        spnCredit15 = (TextView) findViewById(R.id.spnCredit15);
        spnSub15 = (TextView) findViewById(R.id.spnSub15);
        spnFacDivA15 = (TextView) findViewById(R.id.spnFacDivA15);
        spnFacDivB15 = (TextView) findViewById(R.id.spnFacDivB15);

        btnUpdate1.setOnClickListener(this);
        btnDelet1.setOnClickListener(this);

        btnUpdate2.setOnClickListener(this);
        btnDelet2.setOnClickListener(this);

        btnUpdate3.setOnClickListener(this);
        btnDelet3.setOnClickListener(this);

        btnUpdate4.setOnClickListener(this);
        btnDelet4.setOnClickListener(this);


        btnUpdate5.setOnClickListener(this);
        btnDelet5.setOnClickListener(this);


        btnUpdate6.setOnClickListener(this);
        btnDelet6.setOnClickListener(this);


        btnUpdate7.setOnClickListener(this);
        btnDelet7.setOnClickListener(this);


        btnUpdate8.setOnClickListener(this);
        btnDelet8.setOnClickListener(this);


        btnUpdate9.setOnClickListener(this);
        btnDelet9.setOnClickListener(this);


        btnUpdate10.setOnClickListener(this);
        btnDelet10.setOnClickListener(this);


        btnUpdate11.setOnClickListener(this);
        btnDelet11.setOnClickListener(this);


        btnUpdate12.setOnClickListener(this);
        btnDelet12.setOnClickListener(this);

        btnUpdate13.setOnClickListener(this);
        btnDelet13.setOnClickListener(this);


        btnUpdate14.setOnClickListener(this);
        btnDelet14.setOnClickListener(this);


        btnUpdate15.setOnClickListener(this);
        btnDelet15.setOnClickListener(this);


        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference("detailtable");

        Query checkUser = reference.orderByChild("commonid").equalTo(commonid);

        checkUser.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if (dataSnapshot.exists()) {
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        AddDetailsHelper helper = snapshot.getValue(AddDetailsHelper.class);
                        arrlst.add(helper);
                    }
                }


                if (arrlst.size() == 1) {


                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);
                }
                if (arrlst.size() == 2) {

                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);


                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);
                }
                if (arrlst.size() == 3) {

                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);

                    spnLecHour3.setVisibility(View.VISIBLE);
                    spnTutorHour3.setVisibility(View.VISIBLE);
                    spnPracHour3.setVisibility(View.VISIBLE);
                    spnCredit3.setVisibility(View.VISIBLE);
                    spnSub3.setVisibility(View.VISIBLE);
                    spnFacDivA3.setVisibility(View.VISIBLE);
                    spnFacDivB3.setVisibility(View.VISIBLE);
                    btnUpdate3.setVisibility(View.VISIBLE);
                    btnDelet3.setVisibility(View.VISIBLE);



                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


                    spnLecHour3.setText(arrlst.get(2).lecturehour);
                    spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
                    spnPracHour3.setText(arrlst.get(2).practicalhour);
                    spnCredit3.setText(arrlst.get(2).credits);
                    spnSub3.setText(arrlst.get(2).subjects);
                    spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
                    spnFacDivB3.setText(arrlst.get(2).facultyBdiv);


                }

                if (arrlst.size() == 4) {

                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);

                    spnLecHour3.setVisibility(View.VISIBLE);
                    spnTutorHour3.setVisibility(View.VISIBLE);
                    spnPracHour3.setVisibility(View.VISIBLE);
                    spnCredit3.setVisibility(View.VISIBLE);
                    spnSub3.setVisibility(View.VISIBLE);
                    spnFacDivA3.setVisibility(View.VISIBLE);
                    spnFacDivB3.setVisibility(View.VISIBLE);
                    btnUpdate3.setVisibility(View.VISIBLE);
                    btnDelet3.setVisibility(View.VISIBLE);

                    spnLecHour4.setVisibility(View.VISIBLE);
                    spnTutorHour4.setVisibility(View.VISIBLE);
                    spnPracHour4.setVisibility(View.VISIBLE);
                    spnCredit4.setVisibility(View.VISIBLE);
                    spnSub4.setVisibility(View.VISIBLE);
                    spnFacDivA4.setVisibility(View.VISIBLE);
                    spnFacDivB4.setVisibility(View.VISIBLE);
                    btnUpdate4.setVisibility(View.VISIBLE);
                    btnDelet4.setVisibility(View.VISIBLE);




                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


                    spnLecHour3.setText(arrlst.get(2).lecturehour);
                    spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
                    spnPracHour3.setText(arrlst.get(2).practicalhour);
                    spnCredit3.setText(arrlst.get(2).credits);
                    spnSub3.setText(arrlst.get(2).subjects);
                    spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
                    spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

                    spnLecHour4.setText(arrlst.get(3).lecturehour);
                    spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
                    spnPracHour4.setText(arrlst.get(3).practicalhour);
                    spnCredit4.setText(arrlst.get(3).credits);
                    spnSub4.setText(arrlst.get(3).subjects);
                    spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
                    spnFacDivB4.setText(arrlst.get(3).facultyBdiv);


                }


                if (arrlst.size() == 5) {


                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);

                    spnLecHour3.setVisibility(View.VISIBLE);
                    spnTutorHour3.setVisibility(View.VISIBLE);
                    spnPracHour3.setVisibility(View.VISIBLE);
                    spnCredit3.setVisibility(View.VISIBLE);
                    spnSub3.setVisibility(View.VISIBLE);
                    spnFacDivA3.setVisibility(View.VISIBLE);
                    spnFacDivB3.setVisibility(View.VISIBLE);
                    btnUpdate3.setVisibility(View.VISIBLE);
                    btnDelet3.setVisibility(View.VISIBLE);

                    spnLecHour4.setVisibility(View.VISIBLE);
                    spnTutorHour4.setVisibility(View.VISIBLE);
                    spnPracHour4.setVisibility(View.VISIBLE);
                    spnCredit4.setVisibility(View.VISIBLE);
                    spnSub4.setVisibility(View.VISIBLE);
                    spnFacDivA4.setVisibility(View.VISIBLE);
                    spnFacDivB4.setVisibility(View.VISIBLE);
                    btnUpdate4.setVisibility(View.VISIBLE);
                    btnDelet4.setVisibility(View.VISIBLE);


                    spnLecHour5.setVisibility(View.VISIBLE);
                    spnTutorHour5.setVisibility(View.VISIBLE);
                    spnPracHour5.setVisibility(View.VISIBLE);
                    spnCredit5.setVisibility(View.VISIBLE);
                    spnSub5.setVisibility(View.VISIBLE);
                    spnFacDivA5.setVisibility(View.VISIBLE);
                    spnFacDivB5.setVisibility(View.VISIBLE);
                    btnUpdate5.setVisibility(View.VISIBLE);
                    btnDelet5.setVisibility(View.VISIBLE);



                    Toast.makeText(getApplicationContext(), "" + arrlst.get(0).lecturehour + "" + arrlst.get(0).subjects + "", Toast.LENGTH_LONG).show();
                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


                    spnLecHour3.setText(arrlst.get(2).lecturehour);
                    spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
                    spnPracHour3.setText(arrlst.get(2).practicalhour);
                    spnCredit3.setText(arrlst.get(2).credits);
                    spnSub3.setText(arrlst.get(2).subjects);
                    spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
                    spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

                    spnLecHour4.setText(arrlst.get(3).lecturehour);
                    spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
                    spnPracHour4.setText(arrlst.get(3).practicalhour);
                    spnCredit4.setText(arrlst.get(3).credits);
                    spnSub4.setText(arrlst.get(3).subjects);
                    spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
                    spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

                    spnLecHour5.setText(arrlst.get(4).lecturehour);
                    spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
                    spnPracHour5.setText(arrlst.get(4).practicalhour);
                    spnCredit5.setText(arrlst.get(4).credits);
                    spnSub5.setText(arrlst.get(4).subjects);
                    spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
                    spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


                }


                if (arrlst.size() == 6) {

                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);

                    spnLecHour3.setVisibility(View.VISIBLE);
                    spnTutorHour3.setVisibility(View.VISIBLE);
                    spnPracHour3.setVisibility(View.VISIBLE);
                    spnCredit3.setVisibility(View.VISIBLE);
                    spnSub3.setVisibility(View.VISIBLE);
                    spnFacDivA3.setVisibility(View.VISIBLE);
                    spnFacDivB3.setVisibility(View.VISIBLE);
                    btnUpdate3.setVisibility(View.VISIBLE);
                    btnDelet3.setVisibility(View.VISIBLE);

                    spnLecHour4.setVisibility(View.VISIBLE);
                    spnTutorHour4.setVisibility(View.VISIBLE);
                    spnPracHour4.setVisibility(View.VISIBLE);
                    spnCredit4.setVisibility(View.VISIBLE);
                    spnSub4.setVisibility(View.VISIBLE);
                    spnFacDivA4.setVisibility(View.VISIBLE);
                    spnFacDivB4.setVisibility(View.VISIBLE);
                    btnUpdate4.setVisibility(View.VISIBLE);
                    btnDelet4.setVisibility(View.VISIBLE);


                    spnLecHour5.setVisibility(View.VISIBLE);
                    spnTutorHour5.setVisibility(View.VISIBLE);
                    spnPracHour5.setVisibility(View.VISIBLE);
                    spnCredit5.setVisibility(View.VISIBLE);
                    spnSub5.setVisibility(View.VISIBLE);
                    spnFacDivA5.setVisibility(View.VISIBLE);
                    spnFacDivB5.setVisibility(View.VISIBLE);
                    btnUpdate5.setVisibility(View.VISIBLE);
                    btnDelet5.setVisibility(View.VISIBLE);

                    spnLecHour6.setVisibility(View.VISIBLE);
                    spnTutorHour6.setVisibility(View.VISIBLE);
                    spnPracHour6.setVisibility(View.VISIBLE);
                    spnCredit6.setVisibility(View.VISIBLE);
                    spnSub6.setVisibility(View.VISIBLE);
                    spnFacDivA6.setVisibility(View.VISIBLE);
                    spnFacDivB6.setVisibility(View.VISIBLE);
                    btnUpdate6.setVisibility(View.VISIBLE);
                    btnDelet6.setVisibility(View.VISIBLE);



                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


                    spnLecHour3.setText(arrlst.get(2).lecturehour);
                    spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
                    spnPracHour3.setText(arrlst.get(2).practicalhour);
                    spnCredit3.setText(arrlst.get(2).credits);
                    spnSub3.setText(arrlst.get(2).subjects);
                    spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
                    spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

                    spnLecHour4.setText(arrlst.get(3).lecturehour);
                    spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
                    spnPracHour4.setText(arrlst.get(3).practicalhour);
                    spnCredit4.setText(arrlst.get(3).credits);
                    spnSub4.setText(arrlst.get(3).subjects);
                    spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
                    spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

                    spnLecHour5.setText(arrlst.get(4).lecturehour);
                    spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
                    spnPracHour5.setText(arrlst.get(4).practicalhour);
                    spnCredit5.setText(arrlst.get(4).credits);
                    spnSub5.setText(arrlst.get(4).subjects);
                    spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
                    spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


                    spnLecHour6.setText(arrlst.get(5).lecturehour);
                    spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
                    spnPracHour6.setText(arrlst.get(5).practicalhour);
                    spnCredit6.setText(arrlst.get(5).credits);
                    spnSub6.setText(arrlst.get(5).subjects);
                    spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
                    spnFacDivB6.setText(arrlst.get(5).facultyBdiv);
                }


                if (arrlst.size() == 7) {

                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);

                    spnLecHour3.setVisibility(View.VISIBLE);
                    spnTutorHour3.setVisibility(View.VISIBLE);
                    spnPracHour3.setVisibility(View.VISIBLE);
                    spnCredit3.setVisibility(View.VISIBLE);
                    spnSub3.setVisibility(View.VISIBLE);
                    spnFacDivA3.setVisibility(View.VISIBLE);
                    spnFacDivB3.setVisibility(View.VISIBLE);
                    btnUpdate3.setVisibility(View.VISIBLE);
                    btnDelet3.setVisibility(View.VISIBLE);

                    spnLecHour4.setVisibility(View.VISIBLE);
                    spnTutorHour4.setVisibility(View.VISIBLE);
                    spnPracHour4.setVisibility(View.VISIBLE);
                    spnCredit4.setVisibility(View.VISIBLE);
                    spnSub4.setVisibility(View.VISIBLE);
                    spnFacDivA4.setVisibility(View.VISIBLE);
                    spnFacDivB4.setVisibility(View.VISIBLE);
                    btnUpdate4.setVisibility(View.VISIBLE);
                    btnDelet4.setVisibility(View.VISIBLE);


                    spnLecHour5.setVisibility(View.VISIBLE);
                    spnTutorHour5.setVisibility(View.VISIBLE);
                    spnPracHour5.setVisibility(View.VISIBLE);
                    spnCredit5.setVisibility(View.VISIBLE);
                    spnSub5.setVisibility(View.VISIBLE);
                    spnFacDivA5.setVisibility(View.VISIBLE);
                    spnFacDivB5.setVisibility(View.VISIBLE);
                    btnUpdate5.setVisibility(View.VISIBLE);
                    btnDelet5.setVisibility(View.VISIBLE);

                    spnLecHour6.setVisibility(View.VISIBLE);
                    spnTutorHour6.setVisibility(View.VISIBLE);
                    spnPracHour6.setVisibility(View.VISIBLE);
                    spnCredit6.setVisibility(View.VISIBLE);
                    spnSub6.setVisibility(View.VISIBLE);
                    spnFacDivA6.setVisibility(View.VISIBLE);
                    spnFacDivB6.setVisibility(View.VISIBLE);
                    btnUpdate6.setVisibility(View.VISIBLE);
                    btnDelet6.setVisibility(View.VISIBLE);

                    spnLecHour7.setVisibility(View.VISIBLE);
                    spnTutorHour7.setVisibility(View.VISIBLE);
                    spnPracHour7.setVisibility(View.VISIBLE);
                    spnCredit7.setVisibility(View.VISIBLE);
                    spnSub7.setVisibility(View.VISIBLE);
                    spnFacDivA7.setVisibility(View.VISIBLE);
                    spnFacDivB7.setVisibility(View.VISIBLE);
                    btnUpdate7.setVisibility(View.VISIBLE);
                    btnDelet7.setVisibility(View.VISIBLE);




                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


                    spnLecHour3.setText(arrlst.get(2).lecturehour);
                    spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
                    spnPracHour3.setText(arrlst.get(2).practicalhour);
                    spnCredit3.setText(arrlst.get(2).credits);
                    spnSub3.setText(arrlst.get(2).subjects);
                    spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
                    spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

                    spnLecHour4.setText(arrlst.get(3).lecturehour);
                    spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
                    spnPracHour4.setText(arrlst.get(3).practicalhour);
                    spnCredit4.setText(arrlst.get(3).credits);
                    spnSub4.setText(arrlst.get(3).subjects);
                    spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
                    spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

                    spnLecHour5.setText(arrlst.get(4).lecturehour);
                    spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
                    spnPracHour5.setText(arrlst.get(4).practicalhour);
                    spnCredit5.setText(arrlst.get(4).credits);
                    spnSub5.setText(arrlst.get(4).subjects);
                    spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
                    spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


                    spnLecHour6.setText(arrlst.get(5).lecturehour);
                    spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
                    spnPracHour6.setText(arrlst.get(5).practicalhour);
                    spnCredit6.setText(arrlst.get(5).credits);
                    spnSub6.setText(arrlst.get(5).subjects);
                    spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
                    spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


                    spnLecHour7.setText(arrlst.get(6).lecturehour);
                    spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
                    spnPracHour7.setText(arrlst.get(6).practicalhour);
                    spnCredit7.setText(arrlst.get(6).credits);
                    spnSub7.setText(arrlst.get(6).subjects);
                    spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
                    spnFacDivB7.setText(arrlst.get(6).facultyBdiv);
                }


                if (arrlst.size() == 8) {

                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);

                    spnLecHour3.setVisibility(View.VISIBLE);
                    spnTutorHour3.setVisibility(View.VISIBLE);
                    spnPracHour3.setVisibility(View.VISIBLE);
                    spnCredit3.setVisibility(View.VISIBLE);
                    spnSub3.setVisibility(View.VISIBLE);
                    spnFacDivA3.setVisibility(View.VISIBLE);
                    spnFacDivB3.setVisibility(View.VISIBLE);
                    btnUpdate3.setVisibility(View.VISIBLE);
                    btnDelet3.setVisibility(View.VISIBLE);

                    spnLecHour4.setVisibility(View.VISIBLE);
                    spnTutorHour4.setVisibility(View.VISIBLE);
                    spnPracHour4.setVisibility(View.VISIBLE);
                    spnCredit4.setVisibility(View.VISIBLE);
                    spnSub4.setVisibility(View.VISIBLE);
                    spnFacDivA4.setVisibility(View.VISIBLE);
                    spnFacDivB4.setVisibility(View.VISIBLE);
                    btnUpdate4.setVisibility(View.VISIBLE);
                    btnDelet4.setVisibility(View.VISIBLE);


                    spnLecHour5.setVisibility(View.VISIBLE);
                    spnTutorHour5.setVisibility(View.VISIBLE);
                    spnPracHour5.setVisibility(View.VISIBLE);
                    spnCredit5.setVisibility(View.VISIBLE);
                    spnSub5.setVisibility(View.VISIBLE);
                    spnFacDivA5.setVisibility(View.VISIBLE);
                    spnFacDivB5.setVisibility(View.VISIBLE);
                    btnUpdate5.setVisibility(View.VISIBLE);
                    btnDelet5.setVisibility(View.VISIBLE);

                    spnLecHour6.setVisibility(View.VISIBLE);
                    spnTutorHour6.setVisibility(View.VISIBLE);
                    spnPracHour6.setVisibility(View.VISIBLE);
                    spnCredit6.setVisibility(View.VISIBLE);
                    spnSub6.setVisibility(View.VISIBLE);
                    spnFacDivA6.setVisibility(View.VISIBLE);
                    spnFacDivB6.setVisibility(View.VISIBLE);
                    btnUpdate6.setVisibility(View.VISIBLE);
                    btnDelet6.setVisibility(View.VISIBLE);

                    spnLecHour7.setVisibility(View.VISIBLE);
                    spnTutorHour7.setVisibility(View.VISIBLE);
                    spnPracHour7.setVisibility(View.VISIBLE);
                    spnCredit7.setVisibility(View.VISIBLE);
                    spnSub7.setVisibility(View.VISIBLE);
                    spnFacDivA7.setVisibility(View.VISIBLE);
                    spnFacDivB7.setVisibility(View.VISIBLE);
                    btnUpdate7.setVisibility(View.VISIBLE);
                    btnDelet7.setVisibility(View.VISIBLE);


                    spnLecHour8.setVisibility(View.VISIBLE);
                    spnTutorHour8.setVisibility(View.VISIBLE);
                    spnPracHour8.setVisibility(View.VISIBLE);
                    spnCredit8.setVisibility(View.VISIBLE);
                    spnSub8.setVisibility(View.VISIBLE);
                    spnFacDivA8.setVisibility(View.VISIBLE);
                    spnFacDivB8.setVisibility(View.VISIBLE);
                    btnUpdate8.setVisibility(View.VISIBLE);
                    btnDelet8.setVisibility(View.VISIBLE);




                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


                    spnLecHour3.setText(arrlst.get(2).lecturehour);
                    spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
                    spnPracHour3.setText(arrlst.get(2).practicalhour);
                    spnCredit3.setText(arrlst.get(2).credits);
                    spnSub3.setText(arrlst.get(2).subjects);
                    spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
                    spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

                    spnLecHour4.setText(arrlst.get(3).lecturehour);
                    spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
                    spnPracHour4.setText(arrlst.get(3).practicalhour);
                    spnCredit4.setText(arrlst.get(3).credits);
                    spnSub4.setText(arrlst.get(3).subjects);
                    spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
                    spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

                    spnLecHour5.setText(arrlst.get(4).lecturehour);
                    spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
                    spnPracHour5.setText(arrlst.get(4).practicalhour);
                    spnCredit5.setText(arrlst.get(4).credits);
                    spnSub5.setText(arrlst.get(4).subjects);
                    spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
                    spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


                    spnLecHour6.setText(arrlst.get(5).lecturehour);
                    spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
                    spnPracHour6.setText(arrlst.get(5).practicalhour);
                    spnCredit6.setText(arrlst.get(5).credits);
                    spnSub6.setText(arrlst.get(5).subjects);
                    spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
                    spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


                    spnLecHour7.setText(arrlst.get(6).lecturehour);
                    spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
                    spnPracHour7.setText(arrlst.get(6).practicalhour);
                    spnCredit7.setText(arrlst.get(6).credits);
                    spnSub7.setText(arrlst.get(6).subjects);
                    spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
                    spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

                    spnLecHour8.setText(arrlst.get(7).lecturehour);
                    spnTutorHour8.setText(arrlst.get(7).tutoriralhour);
                    spnPracHour8.setText(arrlst.get(7).practicalhour);
                    spnCredit8.setText(arrlst.get(7).credits);
                    spnSub8.setText(arrlst.get(7).subjects);
                    spnFacDivA8.setText(arrlst.get(7).facultyAdiv);
                    spnFacDivB8.setText(arrlst.get(7).facultyBdiv);
                }


                if (arrlst.size() == 9) {

                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);

                    spnLecHour3.setVisibility(View.VISIBLE);
                    spnTutorHour3.setVisibility(View.VISIBLE);
                    spnPracHour3.setVisibility(View.VISIBLE);
                    spnCredit3.setVisibility(View.VISIBLE);
                    spnSub3.setVisibility(View.VISIBLE);
                    spnFacDivA3.setVisibility(View.VISIBLE);
                    spnFacDivB3.setVisibility(View.VISIBLE);
                    btnUpdate3.setVisibility(View.VISIBLE);
                    btnDelet3.setVisibility(View.VISIBLE);

                    spnLecHour4.setVisibility(View.VISIBLE);
                    spnTutorHour4.setVisibility(View.VISIBLE);
                    spnPracHour4.setVisibility(View.VISIBLE);
                    spnCredit4.setVisibility(View.VISIBLE);
                    spnSub4.setVisibility(View.VISIBLE);
                    spnFacDivA4.setVisibility(View.VISIBLE);
                    spnFacDivB4.setVisibility(View.VISIBLE);
                    btnUpdate4.setVisibility(View.VISIBLE);
                    btnDelet4.setVisibility(View.VISIBLE);


                    spnLecHour5.setVisibility(View.VISIBLE);
                    spnTutorHour5.setVisibility(View.VISIBLE);
                    spnPracHour5.setVisibility(View.VISIBLE);
                    spnCredit5.setVisibility(View.VISIBLE);
                    spnSub5.setVisibility(View.VISIBLE);
                    spnFacDivA5.setVisibility(View.VISIBLE);
                    spnFacDivB5.setVisibility(View.VISIBLE);
                    btnUpdate5.setVisibility(View.VISIBLE);
                    btnDelet5.setVisibility(View.VISIBLE);

                    spnLecHour6.setVisibility(View.VISIBLE);
                    spnTutorHour6.setVisibility(View.VISIBLE);
                    spnPracHour6.setVisibility(View.VISIBLE);
                    spnCredit6.setVisibility(View.VISIBLE);
                    spnSub6.setVisibility(View.VISIBLE);
                    spnFacDivA6.setVisibility(View.VISIBLE);
                    spnFacDivB6.setVisibility(View.VISIBLE);
                    btnUpdate6.setVisibility(View.VISIBLE);
                    btnDelet6.setVisibility(View.VISIBLE);

                    spnLecHour7.setVisibility(View.VISIBLE);
                    spnTutorHour7.setVisibility(View.VISIBLE);
                    spnPracHour7.setVisibility(View.VISIBLE);
                    spnCredit7.setVisibility(View.VISIBLE);
                    spnSub7.setVisibility(View.VISIBLE);
                    spnFacDivA7.setVisibility(View.VISIBLE);
                    spnFacDivB7.setVisibility(View.VISIBLE);
                    btnUpdate7.setVisibility(View.VISIBLE);
                    btnDelet7.setVisibility(View.VISIBLE);


                    spnLecHour8.setVisibility(View.VISIBLE);
                    spnTutorHour8.setVisibility(View.VISIBLE);
                    spnPracHour8.setVisibility(View.VISIBLE);
                    spnCredit8.setVisibility(View.VISIBLE);
                    spnSub8.setVisibility(View.VISIBLE);
                    spnFacDivA8.setVisibility(View.VISIBLE);
                    spnFacDivB8.setVisibility(View.VISIBLE);
                    btnUpdate8.setVisibility(View.VISIBLE);
                    btnDelet8.setVisibility(View.VISIBLE);

                    spnLecHour9.setVisibility(View.VISIBLE);
                    spnTutorHour9.setVisibility(View.VISIBLE);
                    spnPracHour9.setVisibility(View.VISIBLE);
                    spnCredit9.setVisibility(View.VISIBLE);
                    spnSub9.setVisibility(View.VISIBLE);
                    spnFacDivA9.setVisibility(View.VISIBLE);
                    spnFacDivB9.setVisibility(View.VISIBLE);
                    btnUpdate9.setVisibility(View.VISIBLE);
                    btnDelet9.setVisibility(View.VISIBLE);



                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


                    spnLecHour3.setText(arrlst.get(2).lecturehour);
                    spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
                    spnPracHour3.setText(arrlst.get(2).practicalhour);
                    spnCredit3.setText(arrlst.get(2).credits);
                    spnSub3.setText(arrlst.get(2).subjects);
                    spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
                    spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

                    spnLecHour4.setText(arrlst.get(3).lecturehour);
                    spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
                    spnPracHour4.setText(arrlst.get(3).practicalhour);
                    spnCredit4.setText(arrlst.get(3).credits);
                    spnSub4.setText(arrlst.get(3).subjects);
                    spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
                    spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

                    spnLecHour5.setText(arrlst.get(4).lecturehour);
                    spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
                    spnPracHour5.setText(arrlst.get(4).practicalhour);
                    spnCredit5.setText(arrlst.get(4).credits);
                    spnSub5.setText(arrlst.get(4).subjects);
                    spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
                    spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


                    spnLecHour6.setText(arrlst.get(5).lecturehour);
                    spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
                    spnPracHour6.setText(arrlst.get(5).practicalhour);
                    spnCredit6.setText(arrlst.get(5).credits);
                    spnSub6.setText(arrlst.get(5).subjects);
                    spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
                    spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


                    spnLecHour7.setText(arrlst.get(6).lecturehour);
                    spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
                    spnPracHour7.setText(arrlst.get(6).practicalhour);
                    spnCredit7.setText(arrlst.get(6).credits);
                    spnSub7.setText(arrlst.get(6).subjects);
                    spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
                    spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

                    spnLecHour9.setText(arrlst.get(8).lecturehour);
                    spnTutorHour9.setText(arrlst.get(8).tutoriralhour);
                    spnPracHour9.setText(arrlst.get(8).practicalhour);
                    spnCredit9.setText(arrlst.get(8).credits);
                    spnSub9.setText(arrlst.get(8).subjects);
                    spnFacDivA9.setText(arrlst.get(8).facultyAdiv);
                    spnFacDivB9.setText(arrlst.get(8).facultyBdiv);
                }

                if (arrlst.size() == 10) {


                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);

                    spnLecHour3.setVisibility(View.VISIBLE);
                    spnTutorHour3.setVisibility(View.VISIBLE);
                    spnPracHour3.setVisibility(View.VISIBLE);
                    spnCredit3.setVisibility(View.VISIBLE);
                    spnSub3.setVisibility(View.VISIBLE);
                    spnFacDivA3.setVisibility(View.VISIBLE);
                    spnFacDivB3.setVisibility(View.VISIBLE);
                    btnUpdate3.setVisibility(View.VISIBLE);
                    btnDelet3.setVisibility(View.VISIBLE);

                    spnLecHour4.setVisibility(View.VISIBLE);
                    spnTutorHour4.setVisibility(View.VISIBLE);
                    spnPracHour4.setVisibility(View.VISIBLE);
                    spnCredit4.setVisibility(View.VISIBLE);
                    spnSub4.setVisibility(View.VISIBLE);
                    spnFacDivA4.setVisibility(View.VISIBLE);
                    spnFacDivB4.setVisibility(View.VISIBLE);
                    btnUpdate4.setVisibility(View.VISIBLE);
                    btnDelet4.setVisibility(View.VISIBLE);


                    spnLecHour5.setVisibility(View.VISIBLE);
                    spnTutorHour5.setVisibility(View.VISIBLE);
                    spnPracHour5.setVisibility(View.VISIBLE);
                    spnCredit5.setVisibility(View.VISIBLE);
                    spnSub5.setVisibility(View.VISIBLE);
                    spnFacDivA5.setVisibility(View.VISIBLE);
                    spnFacDivB5.setVisibility(View.VISIBLE);
                    btnUpdate5.setVisibility(View.VISIBLE);
                    btnDelet5.setVisibility(View.VISIBLE);

                    spnLecHour6.setVisibility(View.VISIBLE);
                    spnTutorHour6.setVisibility(View.VISIBLE);
                    spnPracHour6.setVisibility(View.VISIBLE);
                    spnCredit6.setVisibility(View.VISIBLE);
                    spnSub6.setVisibility(View.VISIBLE);
                    spnFacDivA6.setVisibility(View.VISIBLE);
                    spnFacDivB6.setVisibility(View.VISIBLE);
                    btnUpdate6.setVisibility(View.VISIBLE);
                    btnDelet6.setVisibility(View.VISIBLE);

                    spnLecHour7.setVisibility(View.VISIBLE);
                    spnTutorHour7.setVisibility(View.VISIBLE);
                    spnPracHour7.setVisibility(View.VISIBLE);
                    spnCredit7.setVisibility(View.VISIBLE);
                    spnSub7.setVisibility(View.VISIBLE);
                    spnFacDivA7.setVisibility(View.VISIBLE);
                    spnFacDivB7.setVisibility(View.VISIBLE);
                    btnUpdate7.setVisibility(View.VISIBLE);
                    btnDelet7.setVisibility(View.VISIBLE);


                    spnLecHour8.setVisibility(View.VISIBLE);
                    spnTutorHour8.setVisibility(View.VISIBLE);
                    spnPracHour8.setVisibility(View.VISIBLE);
                    spnCredit8.setVisibility(View.VISIBLE);
                    spnSub8.setVisibility(View.VISIBLE);
                    spnFacDivA8.setVisibility(View.VISIBLE);
                    spnFacDivB8.setVisibility(View.VISIBLE);
                    btnUpdate8.setVisibility(View.VISIBLE);
                    btnDelet8.setVisibility(View.VISIBLE);

                    spnLecHour9.setVisibility(View.VISIBLE);
                    spnTutorHour9.setVisibility(View.VISIBLE);
                    spnPracHour9.setVisibility(View.VISIBLE);
                    spnCredit9.setVisibility(View.VISIBLE);
                    spnSub9.setVisibility(View.VISIBLE);
                    spnFacDivA9.setVisibility(View.VISIBLE);
                    spnFacDivB9.setVisibility(View.VISIBLE);
                    btnUpdate9.setVisibility(View.VISIBLE);
                    btnDelet9.setVisibility(View.VISIBLE);


                    spnLecHour10.setVisibility(View.VISIBLE);
                    spnTutorHour10.setVisibility(View.VISIBLE);
                    spnPracHour10.setVisibility(View.VISIBLE);
                    spnCredit10.setVisibility(View.VISIBLE);
                    spnSub10.setVisibility(View.VISIBLE);
                    spnFacDivA10.setVisibility(View.VISIBLE);
                    spnFacDivB10.setVisibility(View.VISIBLE);
                    btnUpdate10.setVisibility(View.VISIBLE);
                    btnDelet10.setVisibility(View.VISIBLE);



                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


                    spnLecHour3.setText(arrlst.get(2).lecturehour);
                    spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
                    spnPracHour3.setText(arrlst.get(2).practicalhour);
                    spnCredit3.setText(arrlst.get(2).credits);
                    spnSub3.setText(arrlst.get(2).subjects);
                    spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
                    spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

                    spnLecHour4.setText(arrlst.get(3).lecturehour);
                    spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
                    spnPracHour4.setText(arrlst.get(3).practicalhour);
                    spnCredit4.setText(arrlst.get(3).credits);
                    spnSub4.setText(arrlst.get(3).subjects);
                    spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
                    spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

                    spnLecHour5.setText(arrlst.get(4).lecturehour);
                    spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
                    spnPracHour5.setText(arrlst.get(4).practicalhour);
                    spnCredit5.setText(arrlst.get(4).credits);
                    spnSub5.setText(arrlst.get(4).subjects);
                    spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
                    spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


                    spnLecHour6.setText(arrlst.get(5).lecturehour);
                    spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
                    spnPracHour6.setText(arrlst.get(5).practicalhour);
                    spnCredit6.setText(arrlst.get(5).credits);
                    spnSub6.setText(arrlst.get(5).subjects);
                    spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
                    spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


                    spnLecHour7.setText(arrlst.get(6).lecturehour);
                    spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
                    spnPracHour7.setText(arrlst.get(6).practicalhour);
                    spnCredit7.setText(arrlst.get(6).credits);
                    spnSub7.setText(arrlst.get(6).subjects);
                    spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
                    spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

                    spnLecHour10.setText(arrlst.get(9).lecturehour);
                    spnTutorHour10.setText(arrlst.get(9).tutoriralhour);
                    spnPracHour10.setText(arrlst.get(9).practicalhour);
                    spnCredit10.setText(arrlst.get(9).credits);
                    spnSub10.setText(arrlst.get(9).subjects);
                    spnFacDivA10.setText(arrlst.get(9).facultyAdiv);
                    spnFacDivB10.setText(arrlst.get(9).facultyBdiv);
                }

                if (arrlst.size() == 11) {


                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);

                    spnLecHour3.setVisibility(View.VISIBLE);
                    spnTutorHour3.setVisibility(View.VISIBLE);
                    spnPracHour3.setVisibility(View.VISIBLE);
                    spnCredit3.setVisibility(View.VISIBLE);
                    spnSub3.setVisibility(View.VISIBLE);
                    spnFacDivA3.setVisibility(View.VISIBLE);
                    spnFacDivB3.setVisibility(View.VISIBLE);
                    btnUpdate3.setVisibility(View.VISIBLE);
                    btnDelet3.setVisibility(View.VISIBLE);

                    spnLecHour4.setVisibility(View.VISIBLE);
                    spnTutorHour4.setVisibility(View.VISIBLE);
                    spnPracHour4.setVisibility(View.VISIBLE);
                    spnCredit4.setVisibility(View.VISIBLE);
                    spnSub4.setVisibility(View.VISIBLE);
                    spnFacDivA4.setVisibility(View.VISIBLE);
                    spnFacDivB4.setVisibility(View.VISIBLE);
                    btnUpdate4.setVisibility(View.VISIBLE);
                    btnDelet4.setVisibility(View.VISIBLE);


                    spnLecHour5.setVisibility(View.VISIBLE);
                    spnTutorHour5.setVisibility(View.VISIBLE);
                    spnPracHour5.setVisibility(View.VISIBLE);
                    spnCredit5.setVisibility(View.VISIBLE);
                    spnSub5.setVisibility(View.VISIBLE);
                    spnFacDivA5.setVisibility(View.VISIBLE);
                    spnFacDivB5.setVisibility(View.VISIBLE);
                    btnUpdate5.setVisibility(View.VISIBLE);
                    btnDelet5.setVisibility(View.VISIBLE);

                    spnLecHour6.setVisibility(View.VISIBLE);
                    spnTutorHour6.setVisibility(View.VISIBLE);
                    spnPracHour6.setVisibility(View.VISIBLE);
                    spnCredit6.setVisibility(View.VISIBLE);
                    spnSub6.setVisibility(View.VISIBLE);
                    spnFacDivA6.setVisibility(View.VISIBLE);
                    spnFacDivB6.setVisibility(View.VISIBLE);
                    btnUpdate6.setVisibility(View.VISIBLE);
                    btnDelet6.setVisibility(View.VISIBLE);

                    spnLecHour7.setVisibility(View.VISIBLE);
                    spnTutorHour7.setVisibility(View.VISIBLE);
                    spnPracHour7.setVisibility(View.VISIBLE);
                    spnCredit7.setVisibility(View.VISIBLE);
                    spnSub7.setVisibility(View.VISIBLE);
                    spnFacDivA7.setVisibility(View.VISIBLE);
                    spnFacDivB7.setVisibility(View.VISIBLE);
                    btnUpdate7.setVisibility(View.VISIBLE);
                    btnDelet7.setVisibility(View.VISIBLE);


                    spnLecHour8.setVisibility(View.VISIBLE);
                    spnTutorHour8.setVisibility(View.VISIBLE);
                    spnPracHour8.setVisibility(View.VISIBLE);
                    spnCredit8.setVisibility(View.VISIBLE);
                    spnSub8.setVisibility(View.VISIBLE);
                    spnFacDivA8.setVisibility(View.VISIBLE);
                    spnFacDivB8.setVisibility(View.VISIBLE);
                    btnUpdate8.setVisibility(View.VISIBLE);
                    btnDelet8.setVisibility(View.VISIBLE);

                    spnLecHour9.setVisibility(View.VISIBLE);
                    spnTutorHour9.setVisibility(View.VISIBLE);
                    spnPracHour9.setVisibility(View.VISIBLE);
                    spnCredit9.setVisibility(View.VISIBLE);
                    spnSub9.setVisibility(View.VISIBLE);
                    spnFacDivA9.setVisibility(View.VISIBLE);
                    spnFacDivB9.setVisibility(View.VISIBLE);
                    btnUpdate9.setVisibility(View.VISIBLE);
                    btnDelet9.setVisibility(View.VISIBLE);


                    spnLecHour10.setVisibility(View.VISIBLE);
                    spnTutorHour10.setVisibility(View.VISIBLE);
                    spnPracHour10.setVisibility(View.VISIBLE);
                    spnCredit10.setVisibility(View.VISIBLE);
                    spnSub10.setVisibility(View.VISIBLE);
                    spnFacDivA10.setVisibility(View.VISIBLE);
                    spnFacDivB10.setVisibility(View.VISIBLE);
                    btnUpdate10.setVisibility(View.VISIBLE);
                    btnDelet10.setVisibility(View.VISIBLE);

                    spnLecHour11.setVisibility(View.VISIBLE);
                    spnTutorHour11.setVisibility(View.VISIBLE);
                    spnPracHour11.setVisibility(View.VISIBLE);
                    spnCredit11.setVisibility(View.VISIBLE);
                    spnSub11.setVisibility(View.VISIBLE);
                    spnFacDivA11.setVisibility(View.VISIBLE);
                    spnFacDivB11.setVisibility(View.VISIBLE);
                    btnUpdate11.setVisibility(View.VISIBLE);
                    btnDelet11.setVisibility(View.VISIBLE);




                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


                    spnLecHour3.setText(arrlst.get(2).lecturehour);
                    spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
                    spnPracHour3.setText(arrlst.get(2).practicalhour);
                    spnCredit3.setText(arrlst.get(2).credits);
                    spnSub3.setText(arrlst.get(2).subjects);
                    spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
                    spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

                    spnLecHour4.setText(arrlst.get(3).lecturehour);
                    spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
                    spnPracHour4.setText(arrlst.get(3).practicalhour);
                    spnCredit4.setText(arrlst.get(3).credits);
                    spnSub4.setText(arrlst.get(3).subjects);
                    spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
                    spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

                    spnLecHour5.setText(arrlst.get(4).lecturehour);
                    spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
                    spnPracHour5.setText(arrlst.get(4).practicalhour);
                    spnCredit5.setText(arrlst.get(4).credits);
                    spnSub5.setText(arrlst.get(4).subjects);
                    spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
                    spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


                    spnLecHour6.setText(arrlst.get(5).lecturehour);
                    spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
                    spnPracHour6.setText(arrlst.get(5).practicalhour);
                    spnCredit6.setText(arrlst.get(5).credits);
                    spnSub6.setText(arrlst.get(5).subjects);
                    spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
                    spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


                    spnLecHour7.setText(arrlst.get(6).lecturehour);
                    spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
                    spnPracHour7.setText(arrlst.get(6).practicalhour);
                    spnCredit7.setText(arrlst.get(6).credits);
                    spnSub7.setText(arrlst.get(6).subjects);
                    spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
                    spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

                    spnLecHour10.setText(arrlst.get(9).lecturehour);
                    spnTutorHour10.setText(arrlst.get(9).tutoriralhour);
                    spnPracHour10.setText(arrlst.get(9).practicalhour);
                    spnCredit10.setText(arrlst.get(9).credits);
                    spnSub10.setText(arrlst.get(9).subjects);
                    spnFacDivA10.setText(arrlst.get(9).facultyAdiv);
                    spnFacDivB10.setText(arrlst.get(9).facultyBdiv);

                    spnLecHour11.setText(arrlst.get(10).lecturehour);
                    spnTutorHour11.setText(arrlst.get(10).tutoriralhour);
                    spnPracHour11.setText(arrlst.get(10).practicalhour);
                    spnCredit11.setText(arrlst.get(10).credits);
                    spnSub11.setText(arrlst.get(10).subjects);
                    spnFacDivA11.setText(arrlst.get(10).facultyAdiv);
                    spnFacDivB11.setText(arrlst.get(10).facultyBdiv);
                }


                if (arrlst.size() == 12) {

                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);

                    spnLecHour3.setVisibility(View.VISIBLE);
                    spnTutorHour3.setVisibility(View.VISIBLE);
                    spnPracHour3.setVisibility(View.VISIBLE);
                    spnCredit3.setVisibility(View.VISIBLE);
                    spnSub3.setVisibility(View.VISIBLE);
                    spnFacDivA3.setVisibility(View.VISIBLE);
                    spnFacDivB3.setVisibility(View.VISIBLE);
                    btnUpdate3.setVisibility(View.VISIBLE);
                    btnDelet3.setVisibility(View.VISIBLE);

                    spnLecHour4.setVisibility(View.VISIBLE);
                    spnTutorHour4.setVisibility(View.VISIBLE);
                    spnPracHour4.setVisibility(View.VISIBLE);
                    spnCredit4.setVisibility(View.VISIBLE);
                    spnSub4.setVisibility(View.VISIBLE);
                    spnFacDivA4.setVisibility(View.VISIBLE);
                    spnFacDivB4.setVisibility(View.VISIBLE);
                    btnUpdate4.setVisibility(View.VISIBLE);
                    btnDelet4.setVisibility(View.VISIBLE);


                    spnLecHour5.setVisibility(View.VISIBLE);
                    spnTutorHour5.setVisibility(View.VISIBLE);
                    spnPracHour5.setVisibility(View.VISIBLE);
                    spnCredit5.setVisibility(View.VISIBLE);
                    spnSub5.setVisibility(View.VISIBLE);
                    spnFacDivA5.setVisibility(View.VISIBLE);
                    spnFacDivB5.setVisibility(View.VISIBLE);
                    btnUpdate5.setVisibility(View.VISIBLE);
                    btnDelet5.setVisibility(View.VISIBLE);

                    spnLecHour6.setVisibility(View.VISIBLE);
                    spnTutorHour6.setVisibility(View.VISIBLE);
                    spnPracHour6.setVisibility(View.VISIBLE);
                    spnCredit6.setVisibility(View.VISIBLE);
                    spnSub6.setVisibility(View.VISIBLE);
                    spnFacDivA6.setVisibility(View.VISIBLE);
                    spnFacDivB6.setVisibility(View.VISIBLE);
                    btnUpdate6.setVisibility(View.VISIBLE);
                    btnDelet6.setVisibility(View.VISIBLE);

                    spnLecHour7.setVisibility(View.VISIBLE);
                    spnTutorHour7.setVisibility(View.VISIBLE);
                    spnPracHour7.setVisibility(View.VISIBLE);
                    spnCredit7.setVisibility(View.VISIBLE);
                    spnSub7.setVisibility(View.VISIBLE);
                    spnFacDivA7.setVisibility(View.VISIBLE);
                    spnFacDivB7.setVisibility(View.VISIBLE);
                    btnUpdate7.setVisibility(View.VISIBLE);
                    btnDelet7.setVisibility(View.VISIBLE);


                    spnLecHour8.setVisibility(View.VISIBLE);
                    spnTutorHour8.setVisibility(View.VISIBLE);
                    spnPracHour8.setVisibility(View.VISIBLE);
                    spnCredit8.setVisibility(View.VISIBLE);
                    spnSub8.setVisibility(View.VISIBLE);
                    spnFacDivA8.setVisibility(View.VISIBLE);
                    spnFacDivB8.setVisibility(View.VISIBLE);
                    btnUpdate8.setVisibility(View.VISIBLE);
                    btnDelet8.setVisibility(View.VISIBLE);

                    spnLecHour9.setVisibility(View.VISIBLE);
                    spnTutorHour9.setVisibility(View.VISIBLE);
                    spnPracHour9.setVisibility(View.VISIBLE);
                    spnCredit9.setVisibility(View.VISIBLE);
                    spnSub9.setVisibility(View.VISIBLE);
                    spnFacDivA9.setVisibility(View.VISIBLE);
                    spnFacDivB9.setVisibility(View.VISIBLE);
                    btnUpdate9.setVisibility(View.VISIBLE);
                    btnDelet9.setVisibility(View.VISIBLE);


                    spnLecHour10.setVisibility(View.VISIBLE);
                    spnTutorHour10.setVisibility(View.VISIBLE);
                    spnPracHour10.setVisibility(View.VISIBLE);
                    spnCredit10.setVisibility(View.VISIBLE);
                    spnSub10.setVisibility(View.VISIBLE);
                    spnFacDivA10.setVisibility(View.VISIBLE);
                    spnFacDivB10.setVisibility(View.VISIBLE);
                    btnUpdate10.setVisibility(View.VISIBLE);
                    btnDelet10.setVisibility(View.VISIBLE);

                    spnLecHour11.setVisibility(View.VISIBLE);
                    spnTutorHour11.setVisibility(View.VISIBLE);
                    spnPracHour11.setVisibility(View.VISIBLE);
                    spnCredit11.setVisibility(View.VISIBLE);
                    spnSub11.setVisibility(View.VISIBLE);
                    spnFacDivA11.setVisibility(View.VISIBLE);
                    spnFacDivB11.setVisibility(View.VISIBLE);
                    btnUpdate11.setVisibility(View.VISIBLE);
                    btnDelet11.setVisibility(View.VISIBLE);


                    spnLecHour12.setVisibility(View.VISIBLE);
                    spnTutorHour12.setVisibility(View.VISIBLE);
                    spnPracHour12.setVisibility(View.VISIBLE);
                    spnCredit12.setVisibility(View.VISIBLE);
                    spnSub12.setVisibility(View.VISIBLE);
                    spnFacDivA12.setVisibility(View.VISIBLE);
                    spnFacDivB12.setVisibility(View.VISIBLE);
                    btnUpdate12.setVisibility(View.VISIBLE);
                    btnDelet12.setVisibility(View.VISIBLE);





                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


                    spnLecHour3.setText(arrlst.get(2).lecturehour);
                    spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
                    spnPracHour3.setText(arrlst.get(2).practicalhour);
                    spnCredit3.setText(arrlst.get(2).credits);
                    spnSub3.setText(arrlst.get(2).subjects);
                    spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
                    spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

                    spnLecHour4.setText(arrlst.get(3).lecturehour);
                    spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
                    spnPracHour4.setText(arrlst.get(3).practicalhour);
                    spnCredit4.setText(arrlst.get(3).credits);
                    spnSub4.setText(arrlst.get(3).subjects);
                    spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
                    spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

                    spnLecHour5.setText(arrlst.get(4).lecturehour);
                    spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
                    spnPracHour5.setText(arrlst.get(4).practicalhour);
                    spnCredit5.setText(arrlst.get(4).credits);
                    spnSub5.setText(arrlst.get(4).subjects);
                    spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
                    spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


                    spnLecHour6.setText(arrlst.get(5).lecturehour);
                    spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
                    spnPracHour6.setText(arrlst.get(5).practicalhour);
                    spnCredit6.setText(arrlst.get(5).credits);
                    spnSub6.setText(arrlst.get(5).subjects);
                    spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
                    spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


                    spnLecHour7.setText(arrlst.get(6).lecturehour);
                    spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
                    spnPracHour7.setText(arrlst.get(6).practicalhour);
                    spnCredit7.setText(arrlst.get(6).credits);
                    spnSub7.setText(arrlst.get(6).subjects);
                    spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
                    spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

                    spnLecHour10.setText(arrlst.get(9).lecturehour);
                    spnTutorHour10.setText(arrlst.get(9).tutoriralhour);
                    spnPracHour10.setText(arrlst.get(9).practicalhour);
                    spnCredit10.setText(arrlst.get(9).credits);
                    spnSub10.setText(arrlst.get(9).subjects);
                    spnFacDivA10.setText(arrlst.get(9).facultyAdiv);
                    spnFacDivB10.setText(arrlst.get(9).facultyBdiv);

                    spnLecHour11.setText(arrlst.get(10).lecturehour);
                    spnTutorHour11.setText(arrlst.get(10).tutoriralhour);
                    spnPracHour11.setText(arrlst.get(10).practicalhour);
                    spnCredit11.setText(arrlst.get(10).credits);
                    spnSub11.setText(arrlst.get(10).subjects);
                    spnFacDivA11.setText(arrlst.get(10).facultyAdiv);
                    spnFacDivB11.setText(arrlst.get(10).facultyBdiv);

                    spnLecHour12.setText(arrlst.get(11).lecturehour);
                    spnTutorHour12.setText(arrlst.get(11).tutoriralhour);
                    spnPracHour12.setText(arrlst.get(11).practicalhour);
                    spnCredit12.setText(arrlst.get(11).credits);
                    spnSub12.setText(arrlst.get(11).subjects);
                    spnFacDivA12.setText(arrlst.get(11).facultyAdiv);
                    spnFacDivB12.setText(arrlst.get(11).facultyBdiv);
                }

                if (arrlst.size() == 13) {


                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);

                    spnLecHour3.setVisibility(View.VISIBLE);
                    spnTutorHour3.setVisibility(View.VISIBLE);
                    spnPracHour3.setVisibility(View.VISIBLE);
                    spnCredit3.setVisibility(View.VISIBLE);
                    spnSub3.setVisibility(View.VISIBLE);
                    spnFacDivA3.setVisibility(View.VISIBLE);
                    spnFacDivB3.setVisibility(View.VISIBLE);
                    btnUpdate3.setVisibility(View.VISIBLE);
                    btnDelet3.setVisibility(View.VISIBLE);

                    spnLecHour4.setVisibility(View.VISIBLE);
                    spnTutorHour4.setVisibility(View.VISIBLE);
                    spnPracHour4.setVisibility(View.VISIBLE);
                    spnCredit4.setVisibility(View.VISIBLE);
                    spnSub4.setVisibility(View.VISIBLE);
                    spnFacDivA4.setVisibility(View.VISIBLE);
                    spnFacDivB4.setVisibility(View.VISIBLE);
                    btnUpdate4.setVisibility(View.VISIBLE);
                    btnDelet4.setVisibility(View.VISIBLE);


                    spnLecHour5.setVisibility(View.VISIBLE);
                    spnTutorHour5.setVisibility(View.VISIBLE);
                    spnPracHour5.setVisibility(View.VISIBLE);
                    spnCredit5.setVisibility(View.VISIBLE);
                    spnSub5.setVisibility(View.VISIBLE);
                    spnFacDivA5.setVisibility(View.VISIBLE);
                    spnFacDivB5.setVisibility(View.VISIBLE);
                    btnUpdate5.setVisibility(View.VISIBLE);
                    btnDelet5.setVisibility(View.VISIBLE);

                    spnLecHour6.setVisibility(View.VISIBLE);
                    spnTutorHour6.setVisibility(View.VISIBLE);
                    spnPracHour6.setVisibility(View.VISIBLE);
                    spnCredit6.setVisibility(View.VISIBLE);
                    spnSub6.setVisibility(View.VISIBLE);
                    spnFacDivA6.setVisibility(View.VISIBLE);
                    spnFacDivB6.setVisibility(View.VISIBLE);
                    btnUpdate6.setVisibility(View.VISIBLE);
                    btnDelet6.setVisibility(View.VISIBLE);

                    spnLecHour7.setVisibility(View.VISIBLE);
                    spnTutorHour7.setVisibility(View.VISIBLE);
                    spnPracHour7.setVisibility(View.VISIBLE);
                    spnCredit7.setVisibility(View.VISIBLE);
                    spnSub7.setVisibility(View.VISIBLE);
                    spnFacDivA7.setVisibility(View.VISIBLE);
                    spnFacDivB7.setVisibility(View.VISIBLE);
                    btnUpdate7.setVisibility(View.VISIBLE);
                    btnDelet7.setVisibility(View.VISIBLE);


                    spnLecHour8.setVisibility(View.VISIBLE);
                    spnTutorHour8.setVisibility(View.VISIBLE);
                    spnPracHour8.setVisibility(View.VISIBLE);
                    spnCredit8.setVisibility(View.VISIBLE);
                    spnSub8.setVisibility(View.VISIBLE);
                    spnFacDivA8.setVisibility(View.VISIBLE);
                    spnFacDivB8.setVisibility(View.VISIBLE);
                    btnUpdate8.setVisibility(View.VISIBLE);
                    btnDelet8.setVisibility(View.VISIBLE);

                    spnLecHour9.setVisibility(View.VISIBLE);
                    spnTutorHour9.setVisibility(View.VISIBLE);
                    spnPracHour9.setVisibility(View.VISIBLE);
                    spnCredit9.setVisibility(View.VISIBLE);
                    spnSub9.setVisibility(View.VISIBLE);
                    spnFacDivA9.setVisibility(View.VISIBLE);
                    spnFacDivB9.setVisibility(View.VISIBLE);
                    btnUpdate9.setVisibility(View.VISIBLE);
                    btnDelet9.setVisibility(View.VISIBLE);


                    spnLecHour10.setVisibility(View.VISIBLE);
                    spnTutorHour10.setVisibility(View.VISIBLE);
                    spnPracHour10.setVisibility(View.VISIBLE);
                    spnCredit10.setVisibility(View.VISIBLE);
                    spnSub10.setVisibility(View.VISIBLE);
                    spnFacDivA10.setVisibility(View.VISIBLE);
                    spnFacDivB10.setVisibility(View.VISIBLE);
                    btnUpdate10.setVisibility(View.VISIBLE);
                    btnDelet10.setVisibility(View.VISIBLE);

                    spnLecHour11.setVisibility(View.VISIBLE);
                    spnTutorHour11.setVisibility(View.VISIBLE);
                    spnPracHour11.setVisibility(View.VISIBLE);
                    spnCredit11.setVisibility(View.VISIBLE);
                    spnSub11.setVisibility(View.VISIBLE);
                    spnFacDivA11.setVisibility(View.VISIBLE);
                    spnFacDivB11.setVisibility(View.VISIBLE);
                    btnUpdate11.setVisibility(View.VISIBLE);
                    btnDelet11.setVisibility(View.VISIBLE);


                    spnLecHour12.setVisibility(View.VISIBLE);
                    spnTutorHour12.setVisibility(View.VISIBLE);
                    spnPracHour12.setVisibility(View.VISIBLE);
                    spnCredit12.setVisibility(View.VISIBLE);
                    spnSub12.setVisibility(View.VISIBLE);
                    spnFacDivA12.setVisibility(View.VISIBLE);
                    spnFacDivB12.setVisibility(View.VISIBLE);
                    btnUpdate12.setVisibility(View.VISIBLE);
                    btnDelet12.setVisibility(View.VISIBLE);

                    spnLecHour13.setVisibility(View.VISIBLE);
                    spnTutorHour13.setVisibility(View.VISIBLE);
                    spnPracHour13.setVisibility(View.VISIBLE);
                    spnCredit13.setVisibility(View.VISIBLE);
                    spnSub13.setVisibility(View.VISIBLE);
                    spnFacDivA13.setVisibility(View.VISIBLE);
                    spnFacDivB13.setVisibility(View.VISIBLE);
                    btnUpdate13.setVisibility(View.VISIBLE);
                    btnDelet13.setVisibility(View.VISIBLE);




                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


                    spnLecHour3.setText(arrlst.get(2).lecturehour);
                    spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
                    spnPracHour3.setText(arrlst.get(2).practicalhour);
                    spnCredit3.setText(arrlst.get(2).credits);
                    spnSub3.setText(arrlst.get(2).subjects);
                    spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
                    spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

                    spnLecHour4.setText(arrlst.get(3).lecturehour);
                    spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
                    spnPracHour4.setText(arrlst.get(3).practicalhour);
                    spnCredit4.setText(arrlst.get(3).credits);
                    spnSub4.setText(arrlst.get(3).subjects);
                    spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
                    spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

                    spnLecHour5.setText(arrlst.get(4).lecturehour);
                    spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
                    spnPracHour5.setText(arrlst.get(4).practicalhour);
                    spnCredit5.setText(arrlst.get(4).credits);
                    spnSub5.setText(arrlst.get(4).subjects);
                    spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
                    spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


                    spnLecHour6.setText(arrlst.get(5).lecturehour);
                    spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
                    spnPracHour6.setText(arrlst.get(5).practicalhour);
                    spnCredit6.setText(arrlst.get(5).credits);
                    spnSub6.setText(arrlst.get(5).subjects);
                    spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
                    spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


                    spnLecHour7.setText(arrlst.get(6).lecturehour);
                    spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
                    spnPracHour7.setText(arrlst.get(6).practicalhour);
                    spnCredit7.setText(arrlst.get(6).credits);
                    spnSub7.setText(arrlst.get(6).subjects);
                    spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
                    spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

                    spnLecHour10.setText(arrlst.get(9).lecturehour);
                    spnTutorHour10.setText(arrlst.get(9).tutoriralhour);
                    spnPracHour10.setText(arrlst.get(9).practicalhour);
                    spnCredit10.setText(arrlst.get(9).credits);
                    spnSub10.setText(arrlst.get(9).subjects);
                    spnFacDivA10.setText(arrlst.get(9).facultyAdiv);
                    spnFacDivB10.setText(arrlst.get(9).facultyBdiv);

                    spnLecHour11.setText(arrlst.get(10).lecturehour);
                    spnTutorHour11.setText(arrlst.get(10).tutoriralhour);
                    spnPracHour11.setText(arrlst.get(10).practicalhour);
                    spnCredit11.setText(arrlst.get(10).credits);
                    spnSub11.setText(arrlst.get(10).subjects);
                    spnFacDivA11.setText(arrlst.get(10).facultyAdiv);
                    spnFacDivB11.setText(arrlst.get(10).facultyBdiv);

                    spnLecHour12.setText(arrlst.get(11).lecturehour);
                    spnTutorHour12.setText(arrlst.get(11).tutoriralhour);
                    spnPracHour12.setText(arrlst.get(11).practicalhour);
                    spnCredit12.setText(arrlst.get(11).credits);
                    spnSub12.setText(arrlst.get(11).subjects);
                    spnFacDivA12.setText(arrlst.get(11).facultyAdiv);
                    spnFacDivB12.setText(arrlst.get(11).facultyBdiv);

                    spnLecHour13.setText(arrlst.get(12).lecturehour);
                    spnTutorHour13.setText(arrlst.get(12).tutoriralhour);
                    spnPracHour13.setText(arrlst.get(12).practicalhour);
                    spnCredit13.setText(arrlst.get(12).credits);
                    spnSub13.setText(arrlst.get(12).subjects);
                    spnFacDivA13.setText(arrlst.get(12).facultyAdiv);
                    spnFacDivB13.setText(arrlst.get(12).facultyBdiv);

                }

                if (arrlst.size() == 14) {

                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);

                    spnLecHour3.setVisibility(View.VISIBLE);
                    spnTutorHour3.setVisibility(View.VISIBLE);
                    spnPracHour3.setVisibility(View.VISIBLE);
                    spnCredit3.setVisibility(View.VISIBLE);
                    spnSub3.setVisibility(View.VISIBLE);
                    spnFacDivA3.setVisibility(View.VISIBLE);
                    spnFacDivB3.setVisibility(View.VISIBLE);
                    btnUpdate3.setVisibility(View.VISIBLE);
                    btnDelet3.setVisibility(View.VISIBLE);

                    spnLecHour4.setVisibility(View.VISIBLE);
                    spnTutorHour4.setVisibility(View.VISIBLE);
                    spnPracHour4.setVisibility(View.VISIBLE);
                    spnCredit4.setVisibility(View.VISIBLE);
                    spnSub4.setVisibility(View.VISIBLE);
                    spnFacDivA4.setVisibility(View.VISIBLE);
                    spnFacDivB4.setVisibility(View.VISIBLE);
                    btnUpdate4.setVisibility(View.VISIBLE);
                    btnDelet4.setVisibility(View.VISIBLE);


                    spnLecHour5.setVisibility(View.VISIBLE);
                    spnTutorHour5.setVisibility(View.VISIBLE);
                    spnPracHour5.setVisibility(View.VISIBLE);
                    spnCredit5.setVisibility(View.VISIBLE);
                    spnSub5.setVisibility(View.VISIBLE);
                    spnFacDivA5.setVisibility(View.VISIBLE);
                    spnFacDivB5.setVisibility(View.VISIBLE);
                    btnUpdate5.setVisibility(View.VISIBLE);
                    btnDelet5.setVisibility(View.VISIBLE);

                    spnLecHour6.setVisibility(View.VISIBLE);
                    spnTutorHour6.setVisibility(View.VISIBLE);
                    spnPracHour6.setVisibility(View.VISIBLE);
                    spnCredit6.setVisibility(View.VISIBLE);
                    spnSub6.setVisibility(View.VISIBLE);
                    spnFacDivA6.setVisibility(View.VISIBLE);
                    spnFacDivB6.setVisibility(View.VISIBLE);
                    btnUpdate6.setVisibility(View.VISIBLE);
                    btnDelet6.setVisibility(View.VISIBLE);

                    spnLecHour7.setVisibility(View.VISIBLE);
                    spnTutorHour7.setVisibility(View.VISIBLE);
                    spnPracHour7.setVisibility(View.VISIBLE);
                    spnCredit7.setVisibility(View.VISIBLE);
                    spnSub7.setVisibility(View.VISIBLE);
                    spnFacDivA7.setVisibility(View.VISIBLE);
                    spnFacDivB7.setVisibility(View.VISIBLE);
                    btnUpdate7.setVisibility(View.VISIBLE);
                    btnDelet7.setVisibility(View.VISIBLE);


                    spnLecHour8.setVisibility(View.VISIBLE);
                    spnTutorHour8.setVisibility(View.VISIBLE);
                    spnPracHour8.setVisibility(View.VISIBLE);
                    spnCredit8.setVisibility(View.VISIBLE);
                    spnSub8.setVisibility(View.VISIBLE);
                    spnFacDivA8.setVisibility(View.VISIBLE);
                    spnFacDivB8.setVisibility(View.VISIBLE);
                    btnUpdate8.setVisibility(View.VISIBLE);
                    btnDelet8.setVisibility(View.VISIBLE);

                    spnLecHour9.setVisibility(View.VISIBLE);
                    spnTutorHour9.setVisibility(View.VISIBLE);
                    spnPracHour9.setVisibility(View.VISIBLE);
                    spnCredit9.setVisibility(View.VISIBLE);
                    spnSub9.setVisibility(View.VISIBLE);
                    spnFacDivA9.setVisibility(View.VISIBLE);
                    spnFacDivB9.setVisibility(View.VISIBLE);
                    btnUpdate9.setVisibility(View.VISIBLE);
                    btnDelet9.setVisibility(View.VISIBLE);


                    spnLecHour10.setVisibility(View.VISIBLE);
                    spnTutorHour10.setVisibility(View.VISIBLE);
                    spnPracHour10.setVisibility(View.VISIBLE);
                    spnCredit10.setVisibility(View.VISIBLE);
                    spnSub10.setVisibility(View.VISIBLE);
                    spnFacDivA10.setVisibility(View.VISIBLE);
                    spnFacDivB10.setVisibility(View.VISIBLE);
                    btnUpdate10.setVisibility(View.VISIBLE);
                    btnDelet10.setVisibility(View.VISIBLE);

                    spnLecHour11.setVisibility(View.VISIBLE);
                    spnTutorHour11.setVisibility(View.VISIBLE);
                    spnPracHour11.setVisibility(View.VISIBLE);
                    spnCredit11.setVisibility(View.VISIBLE);
                    spnSub11.setVisibility(View.VISIBLE);
                    spnFacDivA11.setVisibility(View.VISIBLE);
                    spnFacDivB11.setVisibility(View.VISIBLE);
                    btnUpdate11.setVisibility(View.VISIBLE);
                    btnDelet11.setVisibility(View.VISIBLE);


                    spnLecHour12.setVisibility(View.VISIBLE);
                    spnTutorHour12.setVisibility(View.VISIBLE);
                    spnPracHour12.setVisibility(View.VISIBLE);
                    spnCredit12.setVisibility(View.VISIBLE);
                    spnSub12.setVisibility(View.VISIBLE);
                    spnFacDivA12.setVisibility(View.VISIBLE);
                    spnFacDivB12.setVisibility(View.VISIBLE);
                    btnUpdate12.setVisibility(View.VISIBLE);
                    btnDelet12.setVisibility(View.VISIBLE);

                    spnLecHour13.setVisibility(View.VISIBLE);
                    spnTutorHour13.setVisibility(View.VISIBLE);
                    spnPracHour13.setVisibility(View.VISIBLE);
                    spnCredit13.setVisibility(View.VISIBLE);
                    spnSub13.setVisibility(View.VISIBLE);
                    spnFacDivA13.setVisibility(View.VISIBLE);
                    spnFacDivB13.setVisibility(View.VISIBLE);
                    btnUpdate13.setVisibility(View.VISIBLE);
                    btnDelet13.setVisibility(View.VISIBLE);

                    spnLecHour14.setVisibility(View.VISIBLE);
                    spnTutorHour14.setVisibility(View.VISIBLE);
                    spnPracHour14.setVisibility(View.VISIBLE);
                    spnCredit14.setVisibility(View.VISIBLE);
                    spnSub14.setVisibility(View.VISIBLE);
                    spnFacDivA14.setVisibility(View.VISIBLE);
                    spnFacDivB14.setVisibility(View.VISIBLE);
                    btnUpdate14.setVisibility(View.VISIBLE);
                    btnDelet14.setVisibility(View.VISIBLE);

                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


                    spnLecHour3.setText(arrlst.get(2).lecturehour);
                    spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
                    spnPracHour3.setText(arrlst.get(2).practicalhour);
                    spnCredit3.setText(arrlst.get(2).credits);
                    spnSub3.setText(arrlst.get(2).subjects);
                    spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
                    spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

                    spnLecHour4.setText(arrlst.get(3).lecturehour);
                    spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
                    spnPracHour4.setText(arrlst.get(3).practicalhour);
                    spnCredit4.setText(arrlst.get(3).credits);
                    spnSub4.setText(arrlst.get(3).subjects);
                    spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
                    spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

                    spnLecHour5.setText(arrlst.get(4).lecturehour);
                    spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
                    spnPracHour5.setText(arrlst.get(4).practicalhour);
                    spnCredit5.setText(arrlst.get(4).credits);
                    spnSub5.setText(arrlst.get(4).subjects);
                    spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
                    spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


                    spnLecHour6.setText(arrlst.get(5).lecturehour);
                    spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
                    spnPracHour6.setText(arrlst.get(5).practicalhour);
                    spnCredit6.setText(arrlst.get(5).credits);
                    spnSub6.setText(arrlst.get(5).subjects);
                    spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
                    spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


                    spnLecHour7.setText(arrlst.get(6).lecturehour);
                    spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
                    spnPracHour7.setText(arrlst.get(6).practicalhour);
                    spnCredit7.setText(arrlst.get(6).credits);
                    spnSub7.setText(arrlst.get(6).subjects);
                    spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
                    spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

                    spnLecHour10.setText(arrlst.get(9).lecturehour);
                    spnTutorHour10.setText(arrlst.get(9).tutoriralhour);
                    spnPracHour10.setText(arrlst.get(9).practicalhour);
                    spnCredit10.setText(arrlst.get(9).credits);
                    spnSub10.setText(arrlst.get(9).subjects);
                    spnFacDivA10.setText(arrlst.get(9).facultyAdiv);
                    spnFacDivB10.setText(arrlst.get(9).facultyBdiv);

                    spnLecHour11.setText(arrlst.get(10).lecturehour);
                    spnTutorHour11.setText(arrlst.get(10).tutoriralhour);
                    spnPracHour11.setText(arrlst.get(10).practicalhour);
                    spnCredit11.setText(arrlst.get(10).credits);
                    spnSub11.setText(arrlst.get(10).subjects);
                    spnFacDivA11.setText(arrlst.get(10).facultyAdiv);
                    spnFacDivB11.setText(arrlst.get(10).facultyBdiv);

                    spnLecHour12.setText(arrlst.get(11).lecturehour);
                    spnTutorHour12.setText(arrlst.get(11).tutoriralhour);
                    spnPracHour12.setText(arrlst.get(11).practicalhour);
                    spnCredit12.setText(arrlst.get(11).credits);
                    spnSub12.setText(arrlst.get(11).subjects);
                    spnFacDivA12.setText(arrlst.get(11).facultyAdiv);
                    spnFacDivB12.setText(arrlst.get(11).facultyBdiv);

                    spnLecHour13.setText(arrlst.get(12).lecturehour);
                    spnTutorHour13.setText(arrlst.get(12).tutoriralhour);
                    spnPracHour13.setText(arrlst.get(12).practicalhour);
                    spnCredit13.setText(arrlst.get(12).credits);
                    spnSub13.setText(arrlst.get(12).subjects);
                    spnFacDivA13.setText(arrlst.get(12).facultyAdiv);
                    spnFacDivB13.setText(arrlst.get(12).facultyBdiv);

                    spnLecHour14.setText(arrlst.get(13).lecturehour);
                    spnTutorHour14.setText(arrlst.get(13).tutoriralhour);
                    spnPracHour14.setText(arrlst.get(13).practicalhour);
                    spnCredit14.setText(arrlst.get(13).credits);
                    spnSub14.setText(arrlst.get(13).subjects);
                    spnFacDivA14.setText(arrlst.get(13).facultyAdiv);
                    spnFacDivB14.setText(arrlst.get(13).facultyBdiv);

                }

                if (arrlst.size() == 15) {


                    spnLecHour1.setVisibility(View.VISIBLE);
                    spnTutorHour1.setVisibility(View.VISIBLE);
                    spnPracHour1.setVisibility(View.VISIBLE);
                    spnCredit1.setVisibility(View.VISIBLE);
                    spnSub1.setVisibility(View.VISIBLE);
                    spnFacDivA1.setVisibility(View.VISIBLE);
                    spnFacDivB1.setVisibility(View.VISIBLE);
                    btnUpdate1.setVisibility(View.VISIBLE);
                    btnDelet1.setVisibility(View.VISIBLE);

                    spnLecHour2.setVisibility(View.VISIBLE);
                    spnTutorHour2.setVisibility(View.VISIBLE);
                    spnPracHour2.setVisibility(View.VISIBLE);
                    spnCredit2.setVisibility(View.VISIBLE);
                    spnSub2.setVisibility(View.VISIBLE);
                    spnFacDivA2.setVisibility(View.VISIBLE);
                    spnFacDivB2.setVisibility(View.VISIBLE);
                    btnUpdate2.setVisibility(View.VISIBLE);
                    btnDelet2.setVisibility(View.VISIBLE);

                    spnLecHour3.setVisibility(View.VISIBLE);
                    spnTutorHour3.setVisibility(View.VISIBLE);
                    spnPracHour3.setVisibility(View.VISIBLE);
                    spnCredit3.setVisibility(View.VISIBLE);
                    spnSub3.setVisibility(View.VISIBLE);
                    spnFacDivA3.setVisibility(View.VISIBLE);
                    spnFacDivB3.setVisibility(View.VISIBLE);
                    btnUpdate3.setVisibility(View.VISIBLE);
                    btnDelet3.setVisibility(View.VISIBLE);

                    spnLecHour4.setVisibility(View.VISIBLE);
                    spnTutorHour4.setVisibility(View.VISIBLE);
                    spnPracHour4.setVisibility(View.VISIBLE);
                    spnCredit4.setVisibility(View.VISIBLE);
                    spnSub4.setVisibility(View.VISIBLE);
                    spnFacDivA4.setVisibility(View.VISIBLE);
                    spnFacDivB4.setVisibility(View.VISIBLE);
                    btnUpdate4.setVisibility(View.VISIBLE);
                    btnDelet4.setVisibility(View.VISIBLE);


                    spnLecHour5.setVisibility(View.VISIBLE);
                    spnTutorHour5.setVisibility(View.VISIBLE);
                    spnPracHour5.setVisibility(View.VISIBLE);
                    spnCredit5.setVisibility(View.VISIBLE);
                    spnSub5.setVisibility(View.VISIBLE);
                    spnFacDivA5.setVisibility(View.VISIBLE);
                    spnFacDivB5.setVisibility(View.VISIBLE);
                    btnUpdate5.setVisibility(View.VISIBLE);
                    btnDelet5.setVisibility(View.VISIBLE);

                    spnLecHour6.setVisibility(View.VISIBLE);
                    spnTutorHour6.setVisibility(View.VISIBLE);
                    spnPracHour6.setVisibility(View.VISIBLE);
                    spnCredit6.setVisibility(View.VISIBLE);
                    spnSub6.setVisibility(View.VISIBLE);
                    spnFacDivA6.setVisibility(View.VISIBLE);
                    spnFacDivB6.setVisibility(View.VISIBLE);
                    btnUpdate6.setVisibility(View.VISIBLE);
                    btnDelet6.setVisibility(View.VISIBLE);

                    spnLecHour7.setVisibility(View.VISIBLE);
                    spnTutorHour7.setVisibility(View.VISIBLE);
                    spnPracHour7.setVisibility(View.VISIBLE);
                    spnCredit7.setVisibility(View.VISIBLE);
                    spnSub7.setVisibility(View.VISIBLE);
                    spnFacDivA7.setVisibility(View.VISIBLE);
                    spnFacDivB7.setVisibility(View.VISIBLE);
                    btnUpdate7.setVisibility(View.VISIBLE);
                    btnDelet7.setVisibility(View.VISIBLE);


                    spnLecHour8.setVisibility(View.VISIBLE);
                    spnTutorHour8.setVisibility(View.VISIBLE);
                    spnPracHour8.setVisibility(View.VISIBLE);
                    spnCredit8.setVisibility(View.VISIBLE);
                    spnSub8.setVisibility(View.VISIBLE);
                    spnFacDivA8.setVisibility(View.VISIBLE);
                    spnFacDivB8.setVisibility(View.VISIBLE);
                    btnUpdate8.setVisibility(View.VISIBLE);
                    btnDelet8.setVisibility(View.VISIBLE);

                    spnLecHour9.setVisibility(View.VISIBLE);
                    spnTutorHour9.setVisibility(View.VISIBLE);
                    spnPracHour9.setVisibility(View.VISIBLE);
                    spnCredit9.setVisibility(View.VISIBLE);
                    spnSub9.setVisibility(View.VISIBLE);
                    spnFacDivA9.setVisibility(View.VISIBLE);
                    spnFacDivB9.setVisibility(View.VISIBLE);
                    btnUpdate9.setVisibility(View.VISIBLE);
                    btnDelet9.setVisibility(View.VISIBLE);


                    spnLecHour10.setVisibility(View.VISIBLE);
                    spnTutorHour10.setVisibility(View.VISIBLE);
                    spnPracHour10.setVisibility(View.VISIBLE);
                    spnCredit10.setVisibility(View.VISIBLE);
                    spnSub10.setVisibility(View.VISIBLE);
                    spnFacDivA10.setVisibility(View.VISIBLE);
                    spnFacDivB10.setVisibility(View.VISIBLE);
                    btnUpdate10.setVisibility(View.VISIBLE);
                    btnDelet10.setVisibility(View.VISIBLE);

                    spnLecHour11.setVisibility(View.VISIBLE);
                    spnTutorHour11.setVisibility(View.VISIBLE);
                    spnPracHour11.setVisibility(View.VISIBLE);
                    spnCredit11.setVisibility(View.VISIBLE);
                    spnSub11.setVisibility(View.VISIBLE);
                    spnFacDivA11.setVisibility(View.VISIBLE);
                    spnFacDivB11.setVisibility(View.VISIBLE);
                    btnUpdate11.setVisibility(View.VISIBLE);
                    btnDelet11.setVisibility(View.VISIBLE);


                    spnLecHour12.setVisibility(View.VISIBLE);
                    spnTutorHour12.setVisibility(View.VISIBLE);
                    spnPracHour12.setVisibility(View.VISIBLE);
                    spnCredit12.setVisibility(View.VISIBLE);
                    spnSub12.setVisibility(View.VISIBLE);
                    spnFacDivA12.setVisibility(View.VISIBLE);
                    spnFacDivB12.setVisibility(View.VISIBLE);
                    btnUpdate12.setVisibility(View.VISIBLE);
                    btnDelet12.setVisibility(View.VISIBLE);

                    spnLecHour13.setVisibility(View.VISIBLE);
                    spnTutorHour13.setVisibility(View.VISIBLE);
                    spnPracHour13.setVisibility(View.VISIBLE);
                    spnCredit13.setVisibility(View.VISIBLE);
                    spnSub13.setVisibility(View.VISIBLE);
                    spnFacDivA13.setVisibility(View.VISIBLE);
                    spnFacDivB13.setVisibility(View.VISIBLE);
                    btnUpdate13.setVisibility(View.VISIBLE);
                    btnDelet13.setVisibility(View.VISIBLE);

                    spnLecHour14.setVisibility(View.VISIBLE);
                    spnTutorHour14.setVisibility(View.VISIBLE);
                    spnPracHour14.setVisibility(View.VISIBLE);
                    spnCredit14.setVisibility(View.VISIBLE);
                    spnSub14.setVisibility(View.VISIBLE);
                    spnFacDivA14.setVisibility(View.VISIBLE);
                    spnFacDivB14.setVisibility(View.VISIBLE);
                    btnUpdate14.setVisibility(View.VISIBLE);
                    btnDelet14.setVisibility(View.VISIBLE);

                    spnLecHour15.setVisibility(View.VISIBLE);
                    spnTutorHour15.setVisibility(View.VISIBLE);
                    spnPracHour15.setVisibility(View.VISIBLE);
                    spnCredit15.setVisibility(View.VISIBLE);
                    spnSub15.setVisibility(View.VISIBLE);
                    spnFacDivA15.setVisibility(View.VISIBLE);
                    spnFacDivB15.setVisibility(View.VISIBLE);
                    btnUpdate15.setVisibility(View.VISIBLE);
                    btnDelet15.setVisibility(View.VISIBLE);


                    spnLecHour1.setText(arrlst.get(0).lecturehour);
                    spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
                    spnPracHour1.setText(arrlst.get(0).practicalhour);
                    spnCredit1.setText(arrlst.get(0).credits);
                    spnSub1.setText(arrlst.get(0).subjects);
                    spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
                    spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

                    spnLecHour2.setText(arrlst.get(1).lecturehour);
                    spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
                    spnPracHour2.setText(arrlst.get(1).practicalhour);
                    spnCredit2.setText(arrlst.get(1).credits);
                    spnSub2.setText(arrlst.get(1).subjects);
                    spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
                    spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


                    spnLecHour3.setText(arrlst.get(2).lecturehour);
                    spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
                    spnPracHour3.setText(arrlst.get(2).practicalhour);
                    spnCredit3.setText(arrlst.get(2).credits);
                    spnSub3.setText(arrlst.get(2).subjects);
                    spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
                    spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

                    spnLecHour4.setText(arrlst.get(3).lecturehour);
                    spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
                    spnPracHour4.setText(arrlst.get(3).practicalhour);
                    spnCredit4.setText(arrlst.get(3).credits);
                    spnSub4.setText(arrlst.get(3).subjects);
                    spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
                    spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

                    spnLecHour5.setText(arrlst.get(4).lecturehour);
                    spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
                    spnPracHour5.setText(arrlst.get(4).practicalhour);
                    spnCredit5.setText(arrlst.get(4).credits);
                    spnSub5.setText(arrlst.get(4).subjects);
                    spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
                    spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


                    spnLecHour6.setText(arrlst.get(5).lecturehour);
                    spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
                    spnPracHour6.setText(arrlst.get(5).practicalhour);
                    spnCredit6.setText(arrlst.get(5).credits);
                    spnSub6.setText(arrlst.get(5).subjects);
                    spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
                    spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


                    spnLecHour7.setText(arrlst.get(6).lecturehour);
                    spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
                    spnPracHour7.setText(arrlst.get(6).practicalhour);
                    spnCredit7.setText(arrlst.get(6).credits);
                    spnSub7.setText(arrlst.get(6).subjects);
                    spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
                    spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

                    spnLecHour10.setText(arrlst.get(9).lecturehour);
                    spnTutorHour10.setText(arrlst.get(9).tutoriralhour);
                    spnPracHour10.setText(arrlst.get(9).practicalhour);
                    spnCredit10.setText(arrlst.get(9).credits);
                    spnSub10.setText(arrlst.get(9).subjects);
                    spnFacDivA10.setText(arrlst.get(9).facultyAdiv);
                    spnFacDivB10.setText(arrlst.get(9).facultyBdiv);

                    spnLecHour11.setText(arrlst.get(10).lecturehour);
                    spnTutorHour11.setText(arrlst.get(10).tutoriralhour);
                    spnPracHour11.setText(arrlst.get(10).practicalhour);
                    spnCredit11.setText(arrlst.get(10).credits);
                    spnSub11.setText(arrlst.get(10).subjects);
                    spnFacDivA11.setText(arrlst.get(10).facultyAdiv);
                    spnFacDivB11.setText(arrlst.get(10).facultyBdiv);

                    spnLecHour12.setText(arrlst.get(11).lecturehour);
                    spnTutorHour12.setText(arrlst.get(11).tutoriralhour);
                    spnPracHour12.setText(arrlst.get(11).practicalhour);
                    spnCredit12.setText(arrlst.get(11).credits);
                    spnSub12.setText(arrlst.get(11).subjects);
                    spnFacDivA12.setText(arrlst.get(11).facultyAdiv);
                    spnFacDivB12.setText(arrlst.get(11).facultyBdiv);

                    spnLecHour13.setText(arrlst.get(12).lecturehour);
                    spnTutorHour13.setText(arrlst.get(12).tutoriralhour);
                    spnPracHour13.setText(arrlst.get(12).practicalhour);
                    spnCredit13.setText(arrlst.get(12).credits);
                    spnSub13.setText(arrlst.get(12).subjects);
                    spnFacDivA13.setText(arrlst.get(12).facultyAdiv);
                    spnFacDivB13.setText(arrlst.get(12).facultyBdiv);

                    spnLecHour14.setText(arrlst.get(13).lecturehour);
                    spnTutorHour14.setText(arrlst.get(13).tutoriralhour);
                    spnPracHour14.setText(arrlst.get(13).practicalhour);
                    spnCredit14.setText(arrlst.get(13).credits);
                    spnSub14.setText(arrlst.get(13).subjects);
                    spnFacDivA14.setText(arrlst.get(13).facultyAdiv);
                    spnFacDivB14.setText(arrlst.get(13).facultyBdiv);

                    spnLecHour15.setText(arrlst.get(14).lecturehour);
                    spnTutorHour15.setText(arrlst.get(14).tutoriralhour);
                    spnPracHour15.setText(arrlst.get(14).practicalhour);
                    spnCredit15.setText(arrlst.get(14).credits);
                    spnSub15.setText(arrlst.get(14).subjects);
                    spnFacDivA15.setText(arrlst.get(14).facultyAdiv);
                    spnFacDivB15.setText(arrlst.get(14).facultyBdiv);

                }


                Toast.makeText(getApplicationContext(), arrlst.size() + "", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        Toast.makeText(getApplicationContext(), "Size of Array is : " + arrlst.size() + "", Toast.LENGTH_LONG).show();
        /*if(arrlst.size()==1){
            spnLecHour1.setText(arrlst.get(0).lecturehour);
            spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
            spnPracHour1.setText(arrlst.get(0).practicalhour);
            spnCredit1.setText(arrlst.get(0).credits);
            spnSub1.setText(arrlst.get(0).subjects);
            spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(0).facultyBdiv);
        }
        if(arrlst.size()==2){
            spnLecHour1.setText(arrlst.get(0).lecturehour);
            spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
            spnPracHour1.setText(arrlst.get(0).practicalhour);
            spnCredit1.setText(arrlst.get(0).credits);
            spnSub1.setText(arrlst.get(0).subjects);
            spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);
        }
        if(arrlst.size()==3){
            spnLecHour1.setText(arrlst.get(0).lecturehour);
            spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
            spnPracHour1.setText(arrlst.get(0).practicalhour);
            spnCredit1.setText(arrlst.get(0).credits);
            spnSub1.setText(arrlst.get(0).subjects);
            spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


            spnLecHour3.setText(arrlst.get(2).lecturehour);
            spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
            spnPracHour3.setText(arrlst.get(2).practicalhour);
            spnCredit3.setText(arrlst.get(2).credits);
            spnSub3.setText(arrlst.get(2).subjects);
            spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
            spnFacDivB3.setText(arrlst.get(2).facultyBdiv);



        }

        if(arrlst.size()==4){
            spnLecHour1.setText(arrlst.get(1).lecturehour);
            spnTutorHour1.setText(arrlst.get(1).tutoriralhour);
            spnPracHour1.setText(arrlst.get(1).practicalhour);
            spnCredit1.setText(arrlst.get(1).credits);
            spnSub1.setText(arrlst.get(1).subjects);
            spnFacDivA1.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(1).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


            spnLecHour3.setText(arrlst.get(2).lecturehour);
            spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
            spnPracHour3.setText(arrlst.get(2).practicalhour);
            spnCredit3.setText(arrlst.get(2).credits);
            spnSub3.setText(arrlst.get(2).subjects);
            spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
            spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

            spnLecHour4.setText(arrlst.get(3).lecturehour);
            spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
            spnPracHour4.setText(arrlst.get(3).practicalhour);
            spnCredit4.setText(arrlst.get(3).credits);
            spnSub4.setText(arrlst.get(3).subjects);
            spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
            spnFacDivB4.setText(arrlst.get(3).facultyBdiv);



        }


        if(arrlst.size()==5){

            Toast.makeText(getApplicationContext(),""+arrlst.get(0).lecturehour+""+arrlst.get(0).subjects+"",Toast.LENGTH_LONG).show();
            spnLecHour1.setText(arrlst.get(0).lecturehour);
            spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
            spnPracHour1.setText(arrlst.get(0).practicalhour);
            spnCredit1.setText(arrlst.get(0).credits);
            spnSub1.setText(arrlst.get(0).subjects);
            spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


            spnLecHour3.setText(arrlst.get(2).lecturehour);
            spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
            spnPracHour3.setText(arrlst.get(2).practicalhour);
            spnCredit3.setText(arrlst.get(2).credits);
            spnSub3.setText(arrlst.get(2).subjects);
            spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
            spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

            spnLecHour4.setText(arrlst.get(3).lecturehour);
            spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
            spnPracHour4.setText(arrlst.get(3).practicalhour);
            spnCredit4.setText(arrlst.get(3).credits);
            spnSub4.setText(arrlst.get(3).subjects);
            spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
            spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

            spnLecHour5.setText(arrlst.get(4).lecturehour);
            spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
            spnPracHour5.setText(arrlst.get(4).practicalhour);
            spnCredit5.setText(arrlst.get(4).credits);
            spnSub5.setText(arrlst.get(4).subjects);
            spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
            spnFacDivB5.setText(arrlst.get(4).facultyBdiv);



        }


        if(arrlst.size()==6){
            spnLecHour1.setText(arrlst.get(0).lecturehour);
            spnTutorHour1.setText(arrlst.get(0).tutoriralhour);
            spnPracHour1.setText(arrlst.get(0).practicalhour);
            spnCredit1.setText(arrlst.get(0).credits);
            spnSub1.setText(arrlst.get(0).subjects);
            spnFacDivA1.setText(arrlst.get(0).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(0).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


            spnLecHour3.setText(arrlst.get(2).lecturehour);
            spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
            spnPracHour3.setText(arrlst.get(2).practicalhour);
            spnCredit3.setText(arrlst.get(2).credits);
            spnSub3.setText(arrlst.get(2).subjects);
            spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
            spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

            spnLecHour4.setText(arrlst.get(3).lecturehour);
            spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
            spnPracHour4.setText(arrlst.get(3).practicalhour);
            spnCredit4.setText(arrlst.get(3).credits);
            spnSub4.setText(arrlst.get(3).subjects);
            spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
            spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

            spnLecHour5.setText(arrlst.get(4).lecturehour);
            spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
            spnPracHour5.setText(arrlst.get(4).practicalhour);
            spnCredit5.setText(arrlst.get(4).credits);
            spnSub5.setText(arrlst.get(4).subjects);
            spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
            spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


            spnLecHour6.setText(arrlst.get(5).lecturehour);
            spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
            spnPracHour6.setText(arrlst.get(5).practicalhour);
            spnCredit6.setText(arrlst.get(5).credits);
            spnSub6.setText(arrlst.get(5).subjects);
            spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
            spnFacDivB6.setText(arrlst.get(5).facultyBdiv);
        }



        if(arrlst.size()==7){
            spnLecHour1.setText(arrlst.get(1).lecturehour);
            spnTutorHour1.setText(arrlst.get(1).tutoriralhour);
            spnPracHour1.setText(arrlst.get(1).practicalhour);
            spnCredit1.setText(arrlst.get(1).credits);
            spnSub1.setText(arrlst.get(1).subjects);
            spnFacDivA1.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(1).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


            spnLecHour3.setText(arrlst.get(2).lecturehour);
            spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
            spnPracHour3.setText(arrlst.get(2).practicalhour);
            spnCredit3.setText(arrlst.get(2).credits);
            spnSub3.setText(arrlst.get(2).subjects);
            spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
            spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

            spnLecHour4.setText(arrlst.get(3).lecturehour);
            spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
            spnPracHour4.setText(arrlst.get(3).practicalhour);
            spnCredit4.setText(arrlst.get(3).credits);
            spnSub4.setText(arrlst.get(3).subjects);
            spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
            spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

            spnLecHour5.setText(arrlst.get(4).lecturehour);
            spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
            spnPracHour5.setText(arrlst.get(4).practicalhour);
            spnCredit5.setText(arrlst.get(4).credits);
            spnSub5.setText(arrlst.get(4).subjects);
            spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
            spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


            spnLecHour6.setText(arrlst.get(5).lecturehour);
            spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
            spnPracHour6.setText(arrlst.get(5).practicalhour);
            spnCredit6.setText(arrlst.get(5).credits);
            spnSub6.setText(arrlst.get(5).subjects);
            spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
            spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


            spnLecHour7.setText(arrlst.get(6).lecturehour);
            spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
            spnPracHour7.setText(arrlst.get(6).practicalhour);
            spnCredit7.setText(arrlst.get(6).credits);
            spnSub7.setText(arrlst.get(6).subjects);
            spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
            spnFacDivB7.setText(arrlst.get(6).facultyBdiv);
        }


        if(arrlst.size()==8){
            spnLecHour1.setText(arrlst.get(1).lecturehour);
            spnTutorHour1.setText(arrlst.get(1).tutoriralhour);
            spnPracHour1.setText(arrlst.get(1).practicalhour);
            spnCredit1.setText(arrlst.get(1).credits);
            spnSub1.setText(arrlst.get(1).subjects);
            spnFacDivA1.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(1).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


            spnLecHour3.setText(arrlst.get(2).lecturehour);
            spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
            spnPracHour3.setText(arrlst.get(2).practicalhour);
            spnCredit3.setText(arrlst.get(2).credits);
            spnSub3.setText(arrlst.get(2).subjects);
            spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
            spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

            spnLecHour4.setText(arrlst.get(3).lecturehour);
            spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
            spnPracHour4.setText(arrlst.get(3).practicalhour);
            spnCredit4.setText(arrlst.get(3).credits);
            spnSub4.setText(arrlst.get(3).subjects);
            spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
            spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

            spnLecHour5.setText(arrlst.get(4).lecturehour);
            spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
            spnPracHour5.setText(arrlst.get(4).practicalhour);
            spnCredit5.setText(arrlst.get(4).credits);
            spnSub5.setText(arrlst.get(4).subjects);
            spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
            spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


            spnLecHour6.setText(arrlst.get(5).lecturehour);
            spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
            spnPracHour6.setText(arrlst.get(5).practicalhour);
            spnCredit6.setText(arrlst.get(5).credits);
            spnSub6.setText(arrlst.get(5).subjects);
            spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
            spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


            spnLecHour7.setText(arrlst.get(6).lecturehour);
            spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
            spnPracHour7.setText(arrlst.get(6).practicalhour);
            spnCredit7.setText(arrlst.get(6).credits);
            spnSub7.setText(arrlst.get(6).subjects);
            spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
            spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

            spnLecHour8.setText(arrlst.get(7).lecturehour);
            spnTutorHour8.setText(arrlst.get(7).tutoriralhour);
            spnPracHour8.setText(arrlst.get(7).practicalhour);
            spnCredit8.setText(arrlst.get(7).credits);
            spnSub8.setText(arrlst.get(7).subjects);
            spnFacDivA8.setText(arrlst.get(7).facultyAdiv);
            spnFacDivB8.setText(arrlst.get(7).facultyBdiv);
        }


        if(arrlst.size()==9) {
            spnLecHour1.setText(arrlst.get(1).lecturehour);
            spnTutorHour1.setText(arrlst.get(1).tutoriralhour);
            spnPracHour1.setText(arrlst.get(1).practicalhour);
            spnCredit1.setText(arrlst.get(1).credits);
            spnSub1.setText(arrlst.get(1).subjects);
            spnFacDivA1.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(1).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


            spnLecHour3.setText(arrlst.get(2).lecturehour);
            spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
            spnPracHour3.setText(arrlst.get(2).practicalhour);
            spnCredit3.setText(arrlst.get(2).credits);
            spnSub3.setText(arrlst.get(2).subjects);
            spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
            spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

            spnLecHour4.setText(arrlst.get(3).lecturehour);
            spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
            spnPracHour4.setText(arrlst.get(3).practicalhour);
            spnCredit4.setText(arrlst.get(3).credits);
            spnSub4.setText(arrlst.get(3).subjects);
            spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
            spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

            spnLecHour5.setText(arrlst.get(4).lecturehour);
            spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
            spnPracHour5.setText(arrlst.get(4).practicalhour);
            spnCredit5.setText(arrlst.get(4).credits);
            spnSub5.setText(arrlst.get(4).subjects);
            spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
            spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


            spnLecHour6.setText(arrlst.get(5).lecturehour);
            spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
            spnPracHour6.setText(arrlst.get(5).practicalhour);
            spnCredit6.setText(arrlst.get(5).credits);
            spnSub6.setText(arrlst.get(5).subjects);
            spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
            spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


            spnLecHour7.setText(arrlst.get(6).lecturehour);
            spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
            spnPracHour7.setText(arrlst.get(6).practicalhour);
            spnCredit7.setText(arrlst.get(6).credits);
            spnSub7.setText(arrlst.get(6).subjects);
            spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
            spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

            spnLecHour9.setText(arrlst.get(8).lecturehour);
            spnTutorHour9.setText(arrlst.get(8).tutoriralhour);
            spnPracHour9.setText(arrlst.get(8).practicalhour);
            spnCredit9.setText(arrlst.get(8).credits);
            spnSub9.setText(arrlst.get(8).subjects);
            spnFacDivA9.setText(arrlst.get(8).facultyAdiv);
            spnFacDivB9.setText(arrlst.get(8).facultyBdiv);
        }

        if(arrlst.size()==10) {
            spnLecHour1.setText(arrlst.get(1).lecturehour);
            spnTutorHour1.setText(arrlst.get(1).tutoriralhour);
            spnPracHour1.setText(arrlst.get(1).practicalhour);
            spnCredit1.setText(arrlst.get(1).credits);
            spnSub1.setText(arrlst.get(1).subjects);
            spnFacDivA1.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(1).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


            spnLecHour3.setText(arrlst.get(2).lecturehour);
            spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
            spnPracHour3.setText(arrlst.get(2).practicalhour);
            spnCredit3.setText(arrlst.get(2).credits);
            spnSub3.setText(arrlst.get(2).subjects);
            spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
            spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

            spnLecHour4.setText(arrlst.get(3).lecturehour);
            spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
            spnPracHour4.setText(arrlst.get(3).practicalhour);
            spnCredit4.setText(arrlst.get(3).credits);
            spnSub4.setText(arrlst.get(3).subjects);
            spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
            spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

            spnLecHour5.setText(arrlst.get(4).lecturehour);
            spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
            spnPracHour5.setText(arrlst.get(4).practicalhour);
            spnCredit5.setText(arrlst.get(4).credits);
            spnSub5.setText(arrlst.get(4).subjects);
            spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
            spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


            spnLecHour6.setText(arrlst.get(5).lecturehour);
            spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
            spnPracHour6.setText(arrlst.get(5).practicalhour);
            spnCredit6.setText(arrlst.get(5).credits);
            spnSub6.setText(arrlst.get(5).subjects);
            spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
            spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


            spnLecHour7.setText(arrlst.get(6).lecturehour);
            spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
            spnPracHour7.setText(arrlst.get(6).practicalhour);
            spnCredit7.setText(arrlst.get(6).credits);
            spnSub7.setText(arrlst.get(6).subjects);
            spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
            spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

            spnLecHour10.setText(arrlst.get(9).lecturehour);
            spnTutorHour10.setText(arrlst.get(9).tutoriralhour);
            spnPracHour10.setText(arrlst.get(9).practicalhour);
            spnCredit10.setText(arrlst.get(9).credits);
            spnSub10.setText(arrlst.get(9).subjects);
            spnFacDivA10.setText(arrlst.get(9).facultyAdiv);
            spnFacDivB10.setText(arrlst.get(9).facultyBdiv);
        }

        if(arrlst.size()==11) {
            spnLecHour1.setText(arrlst.get(1).lecturehour);
            spnTutorHour1.setText(arrlst.get(1).tutoriralhour);
            spnPracHour1.setText(arrlst.get(1).practicalhour);
            spnCredit1.setText(arrlst.get(1).credits);
            spnSub1.setText(arrlst.get(1).subjects);
            spnFacDivA1.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(1).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


            spnLecHour3.setText(arrlst.get(2).lecturehour);
            spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
            spnPracHour3.setText(arrlst.get(2).practicalhour);
            spnCredit3.setText(arrlst.get(2).credits);
            spnSub3.setText(arrlst.get(2).subjects);
            spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
            spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

            spnLecHour4.setText(arrlst.get(3).lecturehour);
            spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
            spnPracHour4.setText(arrlst.get(3).practicalhour);
            spnCredit4.setText(arrlst.get(3).credits);
            spnSub4.setText(arrlst.get(3).subjects);
            spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
            spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

            spnLecHour5.setText(arrlst.get(4).lecturehour);
            spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
            spnPracHour5.setText(arrlst.get(4).practicalhour);
            spnCredit5.setText(arrlst.get(4).credits);
            spnSub5.setText(arrlst.get(4).subjects);
            spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
            spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


            spnLecHour6.setText(arrlst.get(5).lecturehour);
            spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
            spnPracHour6.setText(arrlst.get(5).practicalhour);
            spnCredit6.setText(arrlst.get(5).credits);
            spnSub6.setText(arrlst.get(5).subjects);
            spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
            spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


            spnLecHour7.setText(arrlst.get(6).lecturehour);
            spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
            spnPracHour7.setText(arrlst.get(6).practicalhour);
            spnCredit7.setText(arrlst.get(6).credits);
            spnSub7.setText(arrlst.get(6).subjects);
            spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
            spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

            spnLecHour10.setText(arrlst.get(9).lecturehour);
            spnTutorHour10.setText(arrlst.get(9).tutoriralhour);
            spnPracHour10.setText(arrlst.get(9).practicalhour);
            spnCredit10.setText(arrlst.get(9).credits);
            spnSub10.setText(arrlst.get(9).subjects);
            spnFacDivA10.setText(arrlst.get(9).facultyAdiv);
            spnFacDivB10.setText(arrlst.get(9).facultyBdiv);

            spnLecHour11.setText(arrlst.get(10).lecturehour);
            spnTutorHour11.setText(arrlst.get(10).tutoriralhour);
            spnPracHour11.setText(arrlst.get(10).practicalhour);
            spnCredit11.setText(arrlst.get(10).credits);
            spnSub11.setText(arrlst.get(10).subjects);
            spnFacDivA11.setText(arrlst.get(10).facultyAdiv);
            spnFacDivB11.setText(arrlst.get(10).facultyBdiv);
        }


        if(arrlst.size()==12) {
            spnLecHour1.setText(arrlst.get(1).lecturehour);
            spnTutorHour1.setText(arrlst.get(1).tutoriralhour);
            spnPracHour1.setText(arrlst.get(1).practicalhour);
            spnCredit1.setText(arrlst.get(1).credits);
            spnSub1.setText(arrlst.get(1).subjects);
            spnFacDivA1.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(1).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


            spnLecHour3.setText(arrlst.get(2).lecturehour);
            spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
            spnPracHour3.setText(arrlst.get(2).practicalhour);
            spnCredit3.setText(arrlst.get(2).credits);
            spnSub3.setText(arrlst.get(2).subjects);
            spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
            spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

            spnLecHour4.setText(arrlst.get(3).lecturehour);
            spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
            spnPracHour4.setText(arrlst.get(3).practicalhour);
            spnCredit4.setText(arrlst.get(3).credits);
            spnSub4.setText(arrlst.get(3).subjects);
            spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
            spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

            spnLecHour5.setText(arrlst.get(4).lecturehour);
            spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
            spnPracHour5.setText(arrlst.get(4).practicalhour);
            spnCredit5.setText(arrlst.get(4).credits);
            spnSub5.setText(arrlst.get(4).subjects);
            spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
            spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


            spnLecHour6.setText(arrlst.get(5).lecturehour);
            spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
            spnPracHour6.setText(arrlst.get(5).practicalhour);
            spnCredit6.setText(arrlst.get(5).credits);
            spnSub6.setText(arrlst.get(5).subjects);
            spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
            spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


            spnLecHour7.setText(arrlst.get(6).lecturehour);
            spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
            spnPracHour7.setText(arrlst.get(6).practicalhour);
            spnCredit7.setText(arrlst.get(6).credits);
            spnSub7.setText(arrlst.get(6).subjects);
            spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
            spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

            spnLecHour10.setText(arrlst.get(9).lecturehour);
            spnTutorHour10.setText(arrlst.get(9).tutoriralhour);
            spnPracHour10.setText(arrlst.get(9).practicalhour);
            spnCredit10.setText(arrlst.get(9).credits);
            spnSub10.setText(arrlst.get(9).subjects);
            spnFacDivA10.setText(arrlst.get(9).facultyAdiv);
            spnFacDivB10.setText(arrlst.get(9).facultyBdiv);

            spnLecHour11.setText(arrlst.get(10).lecturehour);
            spnTutorHour11.setText(arrlst.get(10).tutoriralhour);
            spnPracHour11.setText(arrlst.get(10).practicalhour);
            spnCredit11.setText(arrlst.get(10).credits);
            spnSub11.setText(arrlst.get(10).subjects);
            spnFacDivA11.setText(arrlst.get(10).facultyAdiv);
            spnFacDivB11.setText(arrlst.get(10).facultyBdiv);

            spnLecHour12.setText(arrlst.get(11).lecturehour);
            spnTutorHour12.setText(arrlst.get(11).tutoriralhour);
            spnPracHour12.setText(arrlst.get(11).practicalhour);
            spnCredit12.setText(arrlst.get(11).credits);
            spnSub12.setText(arrlst.get(11).subjects);
            spnFacDivA12.setText(arrlst.get(11).facultyAdiv);
            spnFacDivB12.setText(arrlst.get(11).facultyBdiv);
        }

        if(arrlst.size()==13) {
            spnLecHour1.setText(arrlst.get(1).lecturehour);
            spnTutorHour1.setText(arrlst.get(1).tutoriralhour);
            spnPracHour1.setText(arrlst.get(1).practicalhour);
            spnCredit1.setText(arrlst.get(1).credits);
            spnSub1.setText(arrlst.get(1).subjects);
            spnFacDivA1.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(1).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


            spnLecHour3.setText(arrlst.get(2).lecturehour);
            spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
            spnPracHour3.setText(arrlst.get(2).practicalhour);
            spnCredit3.setText(arrlst.get(2).credits);
            spnSub3.setText(arrlst.get(2).subjects);
            spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
            spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

            spnLecHour4.setText(arrlst.get(3).lecturehour);
            spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
            spnPracHour4.setText(arrlst.get(3).practicalhour);
            spnCredit4.setText(arrlst.get(3).credits);
            spnSub4.setText(arrlst.get(3).subjects);
            spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
            spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

            spnLecHour5.setText(arrlst.get(4).lecturehour);
            spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
            spnPracHour5.setText(arrlst.get(4).practicalhour);
            spnCredit5.setText(arrlst.get(4).credits);
            spnSub5.setText(arrlst.get(4).subjects);
            spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
            spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


            spnLecHour6.setText(arrlst.get(5).lecturehour);
            spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
            spnPracHour6.setText(arrlst.get(5).practicalhour);
            spnCredit6.setText(arrlst.get(5).credits);
            spnSub6.setText(arrlst.get(5).subjects);
            spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
            spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


            spnLecHour7.setText(arrlst.get(6).lecturehour);
            spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
            spnPracHour7.setText(arrlst.get(6).practicalhour);
            spnCredit7.setText(arrlst.get(6).credits);
            spnSub7.setText(arrlst.get(6).subjects);
            spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
            spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

            spnLecHour10.setText(arrlst.get(9).lecturehour);
            spnTutorHour10.setText(arrlst.get(9).tutoriralhour);
            spnPracHour10.setText(arrlst.get(9).practicalhour);
            spnCredit10.setText(arrlst.get(9).credits);
            spnSub10.setText(arrlst.get(9).subjects);
            spnFacDivA10.setText(arrlst.get(9).facultyAdiv);
            spnFacDivB10.setText(arrlst.get(9).facultyBdiv);

            spnLecHour11.setText(arrlst.get(10).lecturehour);
            spnTutorHour11.setText(arrlst.get(10).tutoriralhour);
            spnPracHour11.setText(arrlst.get(10).practicalhour);
            spnCredit11.setText(arrlst.get(10).credits);
            spnSub11.setText(arrlst.get(10).subjects);
            spnFacDivA11.setText(arrlst.get(10).facultyAdiv);
            spnFacDivB11.setText(arrlst.get(10).facultyBdiv);

            spnLecHour12.setText(arrlst.get(11).lecturehour);
            spnTutorHour12.setText(arrlst.get(11).tutoriralhour);
            spnPracHour12.setText(arrlst.get(11).practicalhour);
            spnCredit12.setText(arrlst.get(11).credits);
            spnSub12.setText(arrlst.get(11).subjects);
            spnFacDivA12.setText(arrlst.get(11).facultyAdiv);
            spnFacDivB12.setText(arrlst.get(11).facultyBdiv);

            spnLecHour13.setText(arrlst.get(12).lecturehour);
            spnTutorHour13.setText(arrlst.get(12).tutoriralhour);
            spnPracHour13.setText(arrlst.get(12).practicalhour);
            spnCredit13.setText(arrlst.get(12).credits);
            spnSub13.setText(arrlst.get(12).subjects);
            spnFacDivA13.setText(arrlst.get(12).facultyAdiv);
            spnFacDivB13.setText(arrlst.get(12).facultyBdiv);

        }

        if(arrlst.size()==14) {
            spnLecHour1.setText(arrlst.get(1).lecturehour);
            spnTutorHour1.setText(arrlst.get(1).tutoriralhour);
            spnPracHour1.setText(arrlst.get(1).practicalhour);
            spnCredit1.setText(arrlst.get(1).credits);
            spnSub1.setText(arrlst.get(1).subjects);
            spnFacDivA1.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(1).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


            spnLecHour3.setText(arrlst.get(2).lecturehour);
            spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
            spnPracHour3.setText(arrlst.get(2).practicalhour);
            spnCredit3.setText(arrlst.get(2).credits);
            spnSub3.setText(arrlst.get(2).subjects);
            spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
            spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

            spnLecHour4.setText(arrlst.get(3).lecturehour);
            spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
            spnPracHour4.setText(arrlst.get(3).practicalhour);
            spnCredit4.setText(arrlst.get(3).credits);
            spnSub4.setText(arrlst.get(3).subjects);
            spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
            spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

            spnLecHour5.setText(arrlst.get(4).lecturehour);
            spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
            spnPracHour5.setText(arrlst.get(4).practicalhour);
            spnCredit5.setText(arrlst.get(4).credits);
            spnSub5.setText(arrlst.get(4).subjects);
            spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
            spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


            spnLecHour6.setText(arrlst.get(5).lecturehour);
            spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
            spnPracHour6.setText(arrlst.get(5).practicalhour);
            spnCredit6.setText(arrlst.get(5).credits);
            spnSub6.setText(arrlst.get(5).subjects);
            spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
            spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


            spnLecHour7.setText(arrlst.get(6).lecturehour);
            spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
            spnPracHour7.setText(arrlst.get(6).practicalhour);
            spnCredit7.setText(arrlst.get(6).credits);
            spnSub7.setText(arrlst.get(6).subjects);
            spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
            spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

            spnLecHour10.setText(arrlst.get(9).lecturehour);
            spnTutorHour10.setText(arrlst.get(9).tutoriralhour);
            spnPracHour10.setText(arrlst.get(9).practicalhour);
            spnCredit10.setText(arrlst.get(9).credits);
            spnSub10.setText(arrlst.get(9).subjects);
            spnFacDivA10.setText(arrlst.get(9).facultyAdiv);
            spnFacDivB10.setText(arrlst.get(9).facultyBdiv);

            spnLecHour11.setText(arrlst.get(10).lecturehour);
            spnTutorHour11.setText(arrlst.get(10).tutoriralhour);
            spnPracHour11.setText(arrlst.get(10).practicalhour);
            spnCredit11.setText(arrlst.get(10).credits);
            spnSub11.setText(arrlst.get(10).subjects);
            spnFacDivA11.setText(arrlst.get(10).facultyAdiv);
            spnFacDivB11.setText(arrlst.get(10).facultyBdiv);

            spnLecHour12.setText(arrlst.get(11).lecturehour);
            spnTutorHour12.setText(arrlst.get(11).tutoriralhour);
            spnPracHour12.setText(arrlst.get(11).practicalhour);
            spnCredit12.setText(arrlst.get(11).credits);
            spnSub12.setText(arrlst.get(11).subjects);
            spnFacDivA12.setText(arrlst.get(11).facultyAdiv);
            spnFacDivB12.setText(arrlst.get(11).facultyBdiv);

            spnLecHour13.setText(arrlst.get(12).lecturehour);
            spnTutorHour13.setText(arrlst.get(12).tutoriralhour);
            spnPracHour13.setText(arrlst.get(12).practicalhour);
            spnCredit13.setText(arrlst.get(12).credits);
            spnSub13.setText(arrlst.get(12).subjects);
            spnFacDivA13.setText(arrlst.get(12).facultyAdiv);
            spnFacDivB13.setText(arrlst.get(12).facultyBdiv);

            spnLecHour14.setText(arrlst.get(13).lecturehour);
            spnTutorHour14.setText(arrlst.get(13).tutoriralhour);
            spnPracHour14.setText(arrlst.get(13).practicalhour);
            spnCredit14.setText(arrlst.get(13).credits);
            spnSub14.setText(arrlst.get(13).subjects);
            spnFacDivA14.setText(arrlst.get(13).facultyAdiv);
            spnFacDivB14.setText(arrlst.get(13).facultyBdiv);

        }

        if(arrlst.size()==15) {
            spnLecHour1.setText(arrlst.get(1).lecturehour);
            spnTutorHour1.setText(arrlst.get(1).tutoriralhour);
            spnPracHour1.setText(arrlst.get(1).practicalhour);
            spnCredit1.setText(arrlst.get(1).credits);
            spnSub1.setText(arrlst.get(1).subjects);
            spnFacDivA1.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB1.setText(arrlst.get(1).facultyBdiv);

            spnLecHour2.setText(arrlst.get(1).lecturehour);
            spnTutorHour2.setText(arrlst.get(1).tutoriralhour);
            spnPracHour2.setText(arrlst.get(1).practicalhour);
            spnCredit2.setText(arrlst.get(1).credits);
            spnSub2.setText(arrlst.get(1).subjects);
            spnFacDivA2.setText(arrlst.get(1).facultyAdiv);
            spnFacDivB2.setText(arrlst.get(1).facultyBdiv);


            spnLecHour3.setText(arrlst.get(2).lecturehour);
            spnTutorHour3.setText(arrlst.get(2).tutoriralhour);
            spnPracHour3.setText(arrlst.get(2).practicalhour);
            spnCredit3.setText(arrlst.get(2).credits);
            spnSub3.setText(arrlst.get(2).subjects);
            spnFacDivA3.setText(arrlst.get(2).facultyAdiv);
            spnFacDivB3.setText(arrlst.get(2).facultyBdiv);

            spnLecHour4.setText(arrlst.get(3).lecturehour);
            spnTutorHour4.setText(arrlst.get(3).tutoriralhour);
            spnPracHour4.setText(arrlst.get(3).practicalhour);
            spnCredit4.setText(arrlst.get(3).credits);
            spnSub4.setText(arrlst.get(3).subjects);
            spnFacDivA4.setText(arrlst.get(3).facultyAdiv);
            spnFacDivB4.setText(arrlst.get(3).facultyBdiv);

            spnLecHour5.setText(arrlst.get(4).lecturehour);
            spnTutorHour5.setText(arrlst.get(4).tutoriralhour);
            spnPracHour5.setText(arrlst.get(4).practicalhour);
            spnCredit5.setText(arrlst.get(4).credits);
            spnSub5.setText(arrlst.get(4).subjects);
            spnFacDivA5.setText(arrlst.get(4).facultyAdiv);
            spnFacDivB5.setText(arrlst.get(4).facultyBdiv);


            spnLecHour6.setText(arrlst.get(5).lecturehour);
            spnTutorHour6.setText(arrlst.get(5).tutoriralhour);
            spnPracHour6.setText(arrlst.get(5).practicalhour);
            spnCredit6.setText(arrlst.get(5).credits);
            spnSub6.setText(arrlst.get(5).subjects);
            spnFacDivA6.setText(arrlst.get(5).facultyAdiv);
            spnFacDivB6.setText(arrlst.get(5).facultyBdiv);


            spnLecHour7.setText(arrlst.get(6).lecturehour);
            spnTutorHour7.setText(arrlst.get(6).tutoriralhour);
            spnPracHour7.setText(arrlst.get(6).practicalhour);
            spnCredit7.setText(arrlst.get(6).credits);
            spnSub7.setText(arrlst.get(6).subjects);
            spnFacDivA7.setText(arrlst.get(6).facultyAdiv);
            spnFacDivB7.setText(arrlst.get(6).facultyBdiv);

            spnLecHour10.setText(arrlst.get(9).lecturehour);
            spnTutorHour10.setText(arrlst.get(9).tutoriralhour);
            spnPracHour10.setText(arrlst.get(9).practicalhour);
            spnCredit10.setText(arrlst.get(9).credits);
            spnSub10.setText(arrlst.get(9).subjects);
            spnFacDivA10.setText(arrlst.get(9).facultyAdiv);
            spnFacDivB10.setText(arrlst.get(9).facultyBdiv);

            spnLecHour11.setText(arrlst.get(10).lecturehour);
            spnTutorHour11.setText(arrlst.get(10).tutoriralhour);
            spnPracHour11.setText(arrlst.get(10).practicalhour);
            spnCredit11.setText(arrlst.get(10).credits);
            spnSub11.setText(arrlst.get(10).subjects);
            spnFacDivA11.setText(arrlst.get(10).facultyAdiv);
            spnFacDivB11.setText(arrlst.get(10).facultyBdiv);

            spnLecHour12.setText(arrlst.get(11).lecturehour);
            spnTutorHour12.setText(arrlst.get(11).tutoriralhour);
            spnPracHour12.setText(arrlst.get(11).practicalhour);
            spnCredit12.setText(arrlst.get(11).credits);
            spnSub12.setText(arrlst.get(11).subjects);
            spnFacDivA12.setText(arrlst.get(11).facultyAdiv);
            spnFacDivB12.setText(arrlst.get(11).facultyBdiv);

            spnLecHour13.setText(arrlst.get(12).lecturehour);
            spnTutorHour13.setText(arrlst.get(12).tutoriralhour);
            spnPracHour13.setText(arrlst.get(12).practicalhour);
            spnCredit13.setText(arrlst.get(12).credits);
            spnSub13.setText(arrlst.get(12).subjects);
            spnFacDivA13.setText(arrlst.get(12).facultyAdiv);
            spnFacDivB13.setText(arrlst.get(12).facultyBdiv);

            spnLecHour14.setText(arrlst.get(13).lecturehour);
            spnTutorHour14.setText(arrlst.get(13).tutoriralhour);
            spnPracHour14.setText(arrlst.get(13).practicalhour);
            spnCredit14.setText(arrlst.get(13).credits);
            spnSub14.setText(arrlst.get(13).subjects);
            spnFacDivA14.setText(arrlst.get(13).facultyAdiv);
            spnFacDivB14.setText(arrlst.get(13).facultyBdiv);

            spnLecHour15.setText(arrlst.get(14).lecturehour);
            spnTutorHour15.setText(arrlst.get(14).tutoriralhour);
            spnPracHour15.setText(arrlst.get(14).practicalhour);
            spnCredit15.setText(arrlst.get(14).credits);
            spnSub15.setText(arrlst.get(14).subjects);
            spnFacDivA15.setText(arrlst.get(14).facultyAdiv);
            spnFacDivB15.setText(arrlst.get(14).facultyBdiv);

        }*/

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnUpdate1:

                Intent i = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i.putExtra("id", arrlst.get(0).id);
                i.putExtra("commonid", arrlst.get(0).commonid);
                i.putExtra("lecturehour", arrlst.get(0).lecturehour);
                i.putExtra("tutoriralhour", arrlst.get(0).tutoriralhour);
                i.putExtra("credits", arrlst.get(0).credits);
                i.putExtra("subjects", arrlst.get(0).subjects);
                i.putExtra("facultyAdiv", arrlst.get(0).facultyAdiv);
                i.putExtra("facultyBdiv", arrlst.get(0).facultyBdiv);
                i.putExtra("practicalhour", arrlst.get(0).practicalhour);
                startActivity(i);

                break;
            case R.id.btnUpdate2:

                Intent i2 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i2.putExtra("id", arrlst.get(1).id);
                i2.putExtra("commonid", arrlst.get(1).commonid);
                i2.putExtra("lecturehour", arrlst.get(1).lecturehour);
                i2.putExtra("tutoriralhour", arrlst.get(1).tutoriralhour);
                i2.putExtra("credits", arrlst.get(1).credits);
                i2.putExtra("subjects", arrlst.get(1).subjects);
                i2.putExtra("facultyAdiv", arrlst.get(1).facultyAdiv);
                i2.putExtra("facultyBdiv", arrlst.get(1).facultyBdiv);
                i2.putExtra("practicalhour", arrlst.get(1).practicalhour);
                startActivity(i2);

                break;

            case R.id.btnUpdate3:

                Intent i3 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i3.putExtra("id", arrlst.get(2).id);
                i3.putExtra("commonid", arrlst.get(2).commonid);
                i3.putExtra("lecturehour", arrlst.get(2).lecturehour);
                i3.putExtra("tutoriralhour", arrlst.get(2).tutoriralhour);
                i3.putExtra("credits", arrlst.get(2).credits);
                i3.putExtra("subjects", arrlst.get(2).subjects);
                i3.putExtra("facultyAdiv", arrlst.get(2).facultyAdiv);
                i3.putExtra("facultyBdiv", arrlst.get(2).facultyBdiv);
                i3.putExtra("practicalhour", arrlst.get(2).practicalhour);
                startActivity(i3);

                break;


            case R.id.btnUpdate4:

                Intent i4 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i4.putExtra("id", arrlst.get(3).id);
                i4.putExtra("commonid", arrlst.get(3).commonid);
                i4.putExtra("lecturehour", arrlst.get(3).lecturehour);
                i4.putExtra("tutoriralhour", arrlst.get(3).tutoriralhour);
                i4.putExtra("credits", arrlst.get(3).credits);
                i4.putExtra("subjects", arrlst.get(3).subjects);
                i4.putExtra("facultyAdiv", arrlst.get(3).facultyAdiv);
                i4.putExtra("facultyBdiv", arrlst.get(3).facultyBdiv);
                i4.putExtra("practicalhour", arrlst.get(3).practicalhour);
                startActivity(i4);

                break;


            case R.id.btnUpdate5:

                Intent i5 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i5.putExtra("id", arrlst.get(4).id);
                i5.putExtra("commonid", arrlst.get(4).commonid);
                i5.putExtra("lecturehour", arrlst.get(4).lecturehour);
                i5.putExtra("tutoriralhour", arrlst.get(4).tutoriralhour);
                i5.putExtra("credits", arrlst.get(4).credits);
                i5.putExtra("subjects", arrlst.get(4).subjects);
                i5.putExtra("facultyAdiv", arrlst.get(4).facultyAdiv);
                i5.putExtra("facultyBdiv", arrlst.get(4).facultyBdiv);
                i5.putExtra("practicalhour", arrlst.get(4).practicalhour);
                startActivity(i5);

                break;

            case R.id.btnUpdate6:

                Intent i6 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i6.putExtra("id", arrlst.get(5).id);
                i6.putExtra("commonid", arrlst.get(5).commonid);
                i6.putExtra("lecturehour", arrlst.get(5).lecturehour);
                i6.putExtra("tutoriralhour", arrlst.get(5).tutoriralhour);
                i6.putExtra("credits", arrlst.get(5).credits);
                i6.putExtra("subjects", arrlst.get(5).subjects);
                i6.putExtra("facultyAdiv", arrlst.get(5).facultyAdiv);
                i6.putExtra("facultyBdiv", arrlst.get(5).facultyBdiv);
                i6.putExtra("practicalhour", arrlst.get(5).practicalhour);
                startActivity(i6);

                break;


            case R.id.btnUpdate7:

                Intent i7 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i7.putExtra("id", arrlst.get(6).id);
                i7.putExtra("commonid", arrlst.get(6).commonid);
                i7.putExtra("lecturehour", arrlst.get(6).lecturehour);
                i7.putExtra("tutoriralhour", arrlst.get(6).tutoriralhour);
                i7.putExtra("credits", arrlst.get(6).credits);
                i7.putExtra("subjects", arrlst.get(6).subjects);
                i7.putExtra("facultyAdiv", arrlst.get(6).facultyAdiv);
                i7.putExtra("facultyBdiv", arrlst.get(6).facultyBdiv);
                i7.putExtra("practicalhour", arrlst.get(6).practicalhour);
                startActivity(i7);

                break;


            case R.id.btnUpdate8:

                Intent i8 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i8.putExtra("id", arrlst.get(7).id);
                i8.putExtra("commonid", arrlst.get(7).commonid);
                i8.putExtra("lecturehour", arrlst.get(7).lecturehour);
                i8.putExtra("tutoriralhour", arrlst.get(7).tutoriralhour);
                i8.putExtra("credits", arrlst.get(7).credits);
                i8.putExtra("subjects", arrlst.get(7).subjects);
                i8.putExtra("facultyAdiv", arrlst.get(7).facultyAdiv);
                i8.putExtra("facultyBdiv", arrlst.get(7).facultyBdiv);
                i8.putExtra("practicalhour", arrlst.get(7).practicalhour);
                startActivity(i8);

                break;

            case R.id.btnUpdate9:

                Intent i9 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i9.putExtra("id", arrlst.get(8).id);
                i9.putExtra("commonid", arrlst.get(8).commonid);
                i9.putExtra("lecturehour", arrlst.get(8).lecturehour);
                i9.putExtra("tutoriralhour", arrlst.get(8).tutoriralhour);
                i9.putExtra("credits", arrlst.get(8).credits);
                i9.putExtra("subjects", arrlst.get(8).subjects);
                i9.putExtra("facultyAdiv", arrlst.get(8).facultyAdiv);
                i9.putExtra("facultyBdiv", arrlst.get(8).facultyBdiv);
                i9.putExtra("practicalhour", arrlst.get(8).practicalhour);
                startActivity(i9);

                break;


            case R.id.btnUpdate10:

                Intent i10 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i10.putExtra("id", arrlst.get(9).id);
                i10.putExtra("commonid", arrlst.get(9).commonid);
                i10.putExtra("lecturehour", arrlst.get(9).lecturehour);
                i10.putExtra("tutoriralhour", arrlst.get(9).tutoriralhour);
                i10.putExtra("credits", arrlst.get(9).credits);
                i10.putExtra("subjects", arrlst.get(9).subjects);
                i10.putExtra("facultyAdiv", arrlst.get(9).facultyAdiv);
                i10.putExtra("facultyBdiv", arrlst.get(9).facultyBdiv);
                i10.putExtra("practicalhour", arrlst.get(9).practicalhour);
                startActivity(i10);

                break;


            case R.id.btnUpdate11:

                Intent i11 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i11.putExtra("id", arrlst.get(10).id);
                i11.putExtra("commonid", arrlst.get(10).commonid);
                i11.putExtra("lecturehour", arrlst.get(10).lecturehour);
                i11.putExtra("tutoriralhour", arrlst.get(10).tutoriralhour);
                i11.putExtra("credits", arrlst.get(10).credits);
                i11.putExtra("subjects", arrlst.get(10).subjects);
                i11.putExtra("facultyAdiv", arrlst.get(10).facultyAdiv);
                i11.putExtra("facultyBdiv", arrlst.get(10).facultyBdiv);
                i11.putExtra("practicalhour", arrlst.get(10).practicalhour);
                startActivity(i11);

                break;


            case R.id.btnUpdate12:

                Intent i12 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i12.putExtra("id", arrlst.get(11).id);
                i12.putExtra("commonid", arrlst.get(11).commonid);
                i12.putExtra("lecturehour", arrlst.get(11).lecturehour);
                i12.putExtra("tutoriralhour", arrlst.get(11).tutoriralhour);
                i12.putExtra("credits", arrlst.get(11).credits);
                i12.putExtra("subjects", arrlst.get(11).subjects);
                i12.putExtra("facultyAdiv", arrlst.get(11).facultyAdiv);
                i12.putExtra("facultyBdiv", arrlst.get(11).facultyBdiv);
                i12.putExtra("practicalhour", arrlst.get(11).practicalhour);
                startActivity(i12);

                break;

            case R.id.btnUpdate13:

                Intent i13 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i13.putExtra("id", arrlst.get(12).id);
                i13.putExtra("commonid", arrlst.get(12).commonid);
                i13.putExtra("lecturehour", arrlst.get(12).lecturehour);
                i13.putExtra("tutoriralhour", arrlst.get(12).tutoriralhour);
                i13.putExtra("credits", arrlst.get(12).credits);
                i13.putExtra("subjects", arrlst.get(12).subjects);
                i13.putExtra("facultyAdiv", arrlst.get(12).facultyAdiv);
                i13.putExtra("facultyBdiv", arrlst.get(12).facultyBdiv);
                i13.putExtra("practicalhour", arrlst.get(12).practicalhour);
                startActivity(i13);

                break;


            case R.id.btnUpdate14:

                Intent i14 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i14.putExtra("id", arrlst.get(13).id);
                i14.putExtra("commonid", arrlst.get(13).commonid);
                i14.putExtra("lecturehour", arrlst.get(13).lecturehour);
                i14.putExtra("tutoriralhour", arrlst.get(13).tutoriralhour);
                i14.putExtra("credits", arrlst.get(13).credits);
                i14.putExtra("subjects", arrlst.get(13).subjects);
                i14.putExtra("facultyAdiv", arrlst.get(13).facultyAdiv);
                i14.putExtra("facultyBdiv", arrlst.get(13).facultyBdiv);
                i14.putExtra("practicalhour", arrlst.get(13).practicalhour);
                startActivity(i14);

                break;


            case R.id.btnUpdate15:

                Intent i15 = new Intent(ViewDrafts.this, UpdateSingleRecords.class);
                i15.putExtra("id", arrlst.get(14).id);
                i15.putExtra("commonid", arrlst.get(14).commonid);
                i15.putExtra("lecturehour", arrlst.get(14).lecturehour);
                i15.putExtra("tutoriralhour", arrlst.get(14).tutoriralhour);
                i15.putExtra("credits", arrlst.get(14).credits);
                i15.putExtra("subjects", arrlst.get(14).subjects);
                i15.putExtra("facultyAdiv", arrlst.get(14).facultyAdiv);
                i15.putExtra("facultyBdiv", arrlst.get(14).facultyBdiv);
                i15.putExtra("practicalhour", arrlst.get(14).practicalhour);
                startActivity(i15);

                break;


            case R.id.btnDelet1:

                Intent del1 = new Intent(getApplicationContext(), DeleteDetails.class);
                del1.putExtra("param", arrlst.get(0).id);
                startActivity(del1);
                break;

                /*DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
                Query applesQuery = ref.child("detailtable").orderByChild("subject").equalTo(spnSub1.getText().toString());

                applesQuery.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for (DataSnapshot appleSnapshot: dataSnapshot.getChildren()) {
                            appleSnapshot.getRef().removeValue();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                break;*/

            case R.id.btnDelet2:

                Intent del2 = new Intent(getApplicationContext(), DeleteDetails.class);
                del2.putExtra("param", arrlst.get(1).id);
                startActivity(del2);
                break;

            case R.id.btnDelet3:

                Intent del3 = new Intent(getApplicationContext(), DeleteDetails.class);
                del3.putExtra("param", arrlst.get(2).id);
                startActivity(del3);
                break;

            case R.id.btnDelet4:

                Intent del4 = new Intent(getApplicationContext(), DeleteDetails.class);
                del4.putExtra("param",arrlst.get(3).id);
                startActivity(del4);
                break;

            case R.id.btnDelet5:

                Intent del5 = new Intent(getApplicationContext(), DeleteDetails.class);
                del5.putExtra("param", arrlst.get(4).id);
                startActivity(del5);
                break;

            case R.id.btnDelet6:

                Intent del6 = new Intent(getApplicationContext(), DeleteDetails.class);
                del6.putExtra("param", arrlst.get(5).id);
                startActivity(del6);
                break;


            case R.id.btnDelet7:

                Intent del7 = new Intent(getApplicationContext(), DeleteDetails.class);
                del7.putExtra("param", arrlst.get(6).id);
                startActivity(del7);
                break;


            case R.id.btnDelet8:

                Intent del8 = new Intent(getApplicationContext(), DeleteDetails.class);
                del8.putExtra("param", arrlst.get(7).id);
                startActivity(del8);
                break;

            case R.id.btnDelet9:

                Intent del9 = new Intent(getApplicationContext(), DeleteDetails.class);
                del9.putExtra("param", arrlst.get(8).id);
                startActivity(del9);
                break;

            case R.id.btnDelet10:

                Intent del10 = new Intent(getApplicationContext(), DeleteDetails.class);
                del10.putExtra("param", arrlst.get(9).id);
                startActivity(del10);
                break;

            case R.id.btnDelet11:

                Intent del11 = new Intent(getApplicationContext(), DeleteDetails.class);
                del11.putExtra("param", arrlst.get(10).id);
                startActivity(del11);
                break;

            case R.id.btnDelet12:

                Intent del12 = new Intent(getApplicationContext(), DeleteDetails.class);
                del12.putExtra("param", arrlst.get(11).id);
                startActivity(del12);
                break;

            case R.id.btnDelet13:

                Intent del13 = new Intent(getApplicationContext(), DeleteDetails.class);
                del13.putExtra("param", arrlst.get(12).id);
                startActivity(del13);
                break;
            case R.id.btnDelet14:

                Intent del14 = new Intent(getApplicationContext(), DeleteDetails.class);
                del14.putExtra("param", arrlst.get(13).id);
                startActivity(del14);
                break;
            case R.id.btnDelet15:

                Intent del15 = new Intent(getApplicationContext(), DeleteDetails.class);
                del15.putExtra("param",arrlst.get(14).id);
                startActivity(del15);
                break;


        }


    }
}
