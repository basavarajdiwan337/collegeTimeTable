package com.proj.timetable;

import android.app.Activity;
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
import java.util.Random;

public class CreateFixedSlot extends Activity implements View.OnClickListener {


    String subject, division, semester, section, session;


    FirebaseDatabase rootNode;
    DatabaseReference reference;
    String commonId = "2021-22-Odd-CSE-2";
    Random r;
    ArrayList<AddDetailsHelper> arrlst = new ArrayList<AddDetailsHelper>();

    Spinner spnTime1;
    TextView spnLecHour1, spnTutorHour1, spnPracHour1, spnCredit1, spnSub1, spnFacDivA1, spnFacDivB1;
    Spinner spnTime2;
    TextView spnLecHour2, spnTutorHour2, spnPracHour2, spnCredit2, spnSub2, spnFacDivA2, spnFacDivB2;
    Spinner spnTime3;
    TextView spnLecHour3, spnTutorHour3, spnPracHour3, spnCredit3, spnSub3, spnFacDivA3, spnFacDivB3;
    Spinner spnTime4;
    TextView spnLecHour4, spnTutorHour4, spnPracHour4, spnCredit4, spnSub4, spnFacDivA4, spnFacDivB4;
    Spinner spnTime5;
    TextView spnLecHour5, spnTutorHour5, spnPracHour5, spnCredit5, spnSub5, spnFacDivA5, spnFacDivB5;
    Spinner spnTime6;
    TextView spnLecHour6, spnTutorHour6, spnPracHour6, spnCredit6, spnSub6, spnFacDivA6, spnFacDivB6;

    Spinner spnTime7, spnLecHour7, spnTutorHour7, spnPracHour7, spnCredit7, spnSub7, spnFacDivA7, spnFacDivB7;
    Spinner spnTime8, spnLecHour8, spnTutorHour8, spnPracHour8, spnCredit8, spnSub8, spnFacDivA8, spnFacDivB8;
    Spinner spnTime9, spnLecHour9, spnTutorHour9, spnPracHour9, spnCredit9, spnSub9, spnFacDivA9, spnFacDivB9;

    Button btnGenerateTT;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fixed_slot_form);

        r = new Random();


        btnGenerateTT = (Button) findViewById(R.id.btnGenerateTT);

        spnTime1 = (Spinner) findViewById(R.id.spnTime1);
        spnLecHour1 = (TextView) findViewById(R.id.spnLecHour1);
        spnTutorHour1 = (TextView) findViewById(R.id.spnTutorHour1);
        spnPracHour1 = (TextView) findViewById(R.id.spnPracHour1);
        spnCredit1 = (TextView) findViewById(R.id.spnCredit1);
        spnSub1 = (TextView) findViewById(R.id.spnSub1);
        spnFacDivA1 = (TextView) findViewById(R.id.spnFacDivA1);
        spnFacDivB1 = (TextView) findViewById(R.id.spnFacDivB1);

        spnTime2 = (Spinner) findViewById(R.id.spnTime2);
        spnLecHour2 = (TextView) findViewById(R.id.spnLecHour2);
        spnTutorHour2 = (TextView) findViewById(R.id.spnTutorHour2);
        spnPracHour2 = (TextView) findViewById(R.id.spnPracHour2);
        spnCredit2 = (TextView) findViewById(R.id.spnCredit2);
        spnSub2 = (TextView) findViewById(R.id.spnSub2);
        spnFacDivA2 = (TextView) findViewById(R.id.spnFacDivA2);
        spnFacDivB2 = (TextView) findViewById(R.id.spnFacDivB2);

        spnTime3 = (Spinner) findViewById(R.id.spnTime3);
        spnLecHour3 = (TextView) findViewById(R.id.spnLecHour3);
        spnTutorHour3 = (TextView) findViewById(R.id.spnTutorHour3);
        spnPracHour3 = (TextView) findViewById(R.id.spnPracHour3);
        spnCredit3 = (TextView) findViewById(R.id.spnCredit3);
        spnSub3 = (TextView) findViewById(R.id.spnSub3);
        spnFacDivA3 = (TextView) findViewById(R.id.spnFacDivA3);
        spnFacDivB3 = (TextView) findViewById(R.id.spnFacDivB3);

        spnTime4 = (Spinner) findViewById(R.id.spnTime4);
        spnLecHour4 = (TextView) findViewById(R.id.spnLecHour4);
        spnTutorHour4 = (TextView) findViewById(R.id.spnTutorHour4);
        spnPracHour4 = (TextView) findViewById(R.id.spnPracHour4);
        spnCredit4 = (TextView) findViewById(R.id.spnCredit4);
        spnSub4 = (TextView) findViewById(R.id.spnSub4);
        spnFacDivA4 = (TextView) findViewById(R.id.spnFacDivA4);
        spnFacDivB4 = (TextView) findViewById(R.id.spnFacDivB4);

        spnTime5 = (Spinner) findViewById(R.id.spnTime5);
        spnLecHour5 = (TextView) findViewById(R.id.spnLecHour5);
        spnTutorHour5 = (TextView) findViewById(R.id.spnTutorHour5);
        spnPracHour5 = (TextView) findViewById(R.id.spnPracHour5);
        spnCredit5 = (TextView) findViewById(R.id.spnCredit5);
        spnSub5 = (TextView) findViewById(R.id.spnSub5);
        spnFacDivA5 = (TextView) findViewById(R.id.spnFacDivA5);
        spnFacDivB5 = (TextView) findViewById(R.id.spnFacDivB5);

        spnTime6 = (Spinner) findViewById(R.id.spnTime6);
        spnLecHour6 = (TextView) findViewById(R.id.spnLecHour6);
        spnTutorHour6 = (TextView) findViewById(R.id.spnTutorHour6);
        spnPracHour6 = (TextView) findViewById(R.id.spnPracHour6);
        spnCredit6 = (TextView) findViewById(R.id.spnCredit6);
        spnSub6 = (TextView) findViewById(R.id.spnSub6);
        spnFacDivA6 = (TextView) findViewById(R.id.spnFacDivA6);
        spnFacDivB6 = (TextView) findViewById(R.id.spnFacDivB6);

        spnTime7 = (Spinner) findViewById(R.id.spnTime7);
        spnLecHour7 = (Spinner) findViewById(R.id.spnLecHour7);
        spnTutorHour7 = (Spinner) findViewById(R.id.spnTutorHour7);
        spnPracHour7 = (Spinner) findViewById(R.id.spnPracHour7);
        spnCredit7 = (Spinner) findViewById(R.id.spnCredit7);
        spnSub7 = (Spinner) findViewById(R.id.spnSub7);
        spnFacDivA7 = (Spinner) findViewById(R.id.spnFacDivA7);
        spnFacDivB7 = (Spinner) findViewById(R.id.spnFacDivB7);

        spnTime8 = (Spinner) findViewById(R.id.spnTime8);
        spnLecHour8 = (Spinner) findViewById(R.id.spnLecHour8);
        spnTutorHour8 = (Spinner) findViewById(R.id.spnTutorHour8);
        spnPracHour8 = (Spinner) findViewById(R.id.spnPracHour8);
        spnCredit8 = (Spinner) findViewById(R.id.spnCredit8);
        spnSub8 = (Spinner) findViewById(R.id.spnSub8);
        spnFacDivA8 = (Spinner) findViewById(R.id.spnFacDivA8);
        spnFacDivB8 = (Spinner) findViewById(R.id.spnFacDivB8);

        spnTime9 = (Spinner) findViewById(R.id.spnTime9);
        spnLecHour9 = (Spinner) findViewById(R.id.spnLecHour9);
        spnTutorHour9 = (Spinner) findViewById(R.id.spnTutorHour9);
        spnPracHour9 = (Spinner) findViewById(R.id.spnPracHour9);
        spnCredit9 = (Spinner) findViewById(R.id.spnCredit9);
        spnSub9 = (Spinner) findViewById(R.id.spnSub9);
        spnFacDivA9 = (Spinner) findViewById(R.id.spnFacDivA9);
        spnFacDivB9 = (Spinner) findViewById(R.id.spnFacDivB9);

        btnGenerateTT.setOnClickListener(this);


        loadDetails();

    }

    private void loadDetails() {

        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference("detailtable");

        Query checkUser = reference.orderByChild("commonid").equalTo("2021-22-Odd-CSE-2");

        checkUser.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if (dataSnapshot.exists()) {
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        AddDetailsHelper helper = snapshot.getValue(AddDetailsHelper.class);
                        arrlst.add(helper);
                    }
                }

                Toast.makeText(getApplicationContext(), "Size : "+arrlst.size(), Toast.LENGTH_LONG).show();

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



               /* spnLecHour1.
                        spnTutorHour1
                        spnPracHour1
                spnCredit1
                        spnSub1
                spnFacDivA1
                        spnFacDivB1*/


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    @Override
    public void onClick(View view) {


        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference("fixedslots");

        switch (view.getId()) {

            case R.id.btnGenerateTT:
                String one = "" + r.nextInt(10000);
                AddFixedSlotHelper afsh = new AddFixedSlotHelper(one, commonId, spnTime1.getSelectedItem().toString(),
                        spnLecHour1.getText().toString().toString(), spnTutorHour1.getText().toString(),
                        spnPracHour1.getText().toString(), spnCredit1.getText().toString(), spnSub1.getText().toString(),
                        spnFacDivA1.getText().toString(), spnFacDivB1.getText().toString());
                reference.child(one).setValue(afsh);

                String two = "" + r.nextInt(10000);
                AddFixedSlotHelper afsh2 = new AddFixedSlotHelper(two, commonId, spnTime2.getSelectedItem().toString(),
                        spnLecHour2.getText().toString(), spnTutorHour2.getText().toString(),
                        spnPracHour2.getText().toString(), spnCredit2.getText().toString(), spnSub2.getText().toString(),
                        spnFacDivA2.getText().toString(), spnFacDivB2.getText().toString());
                reference.child(two).setValue(afsh2);

                String three = "" + r.nextInt(10000);
                AddFixedSlotHelper afsh3 = new AddFixedSlotHelper(three, commonId, spnTime3.getSelectedItem().toString(),
                        spnLecHour3.getText().toString(), spnTutorHour3.getText().toString(),
                        spnPracHour3.getText().toString(), spnCredit3.getText().toString(),
                        spnSub3.getText().toString(),
                        spnFacDivA3.getText().toString(), spnFacDivB3.getText().toString());
                reference.child(three).setValue(afsh3);

                String four = "" + r.nextInt(10000);
                AddFixedSlotHelper afsh4 = new AddFixedSlotHelper(four, commonId, spnTime4.getSelectedItem().toString(),
                        spnLecHour4.getText().toString(), spnTutorHour4.getText().toString(),
                        spnPracHour4.getText().toString(), spnCredit4.getText().toString(),
                        spnSub4.getText().toString(),
                        spnFacDivA4.getText().toString(), spnFacDivB4.getText().toString());
                reference.child(four).setValue(afsh4);

                String five = "" + r.nextInt(10000);
                AddFixedSlotHelper afsh5 = new AddFixedSlotHelper(five, commonId, spnTime5.getSelectedItem().toString(),
                        spnLecHour5.getText().toString(), spnTutorHour5.getText().toString(),
                        spnPracHour5.getText().toString(), spnCredit5.getText().toString(),
                        spnSub5.getText().toString(),
                        spnFacDivA5.getText().toString(), spnFacDivB5.getText().toString());
                reference.child(five).setValue(afsh5);


                String six = "" + r.nextInt(10000);
                AddFixedSlotHelper afsh6 = new AddFixedSlotHelper(six, commonId, spnTime6.getSelectedItem().toString(),
                        spnLecHour6.getText().toString(), spnTutorHour6.getText().toString(),
                        spnPracHour6.getText().toString(), spnCredit6.getText().toString(),
                        spnSub6.getText().toString(),
                        spnFacDivA6.getText().toString(), spnFacDivB6.getText().toString());
                reference.child(six).setValue(afsh6);


                String seven = "" + r.nextInt(10000);
                AddFixedSlotHelper afsh7 = new AddFixedSlotHelper(seven, commonId, spnTime7.getSelectedItem().toString(),
                        spnLecHour7.getSelectedItem().toString(), spnTutorHour7.getSelectedItem().toString(),
                        spnPracHour7.getSelectedItem().toString(), spnCredit7.getSelectedItem().toString(),
                        spnSub7.getSelectedItem().toString(),
                        spnFacDivA7.getSelectedItem().toString(), spnFacDivB7.getSelectedItem().toString());
                reference.child(seven).setValue(afsh7);


                String eight = "" + r.nextInt(10000);
                AddFixedSlotHelper afsh8 = new AddFixedSlotHelper(seven, commonId, spnTime8.getSelectedItem().toString(),
                        spnLecHour8.getSelectedItem().toString(), spnTutorHour8.getSelectedItem().toString(),
                        spnPracHour8.getSelectedItem().toString(), spnCredit8.getSelectedItem().toString(),
                        spnSub8.getSelectedItem().toString(),
                        spnFacDivA8.getSelectedItem().toString(), spnFacDivB8.getSelectedItem().toString());
                reference.child(eight).setValue(afsh8);


                String nine = "" + r.nextInt(10000);
                AddFixedSlotHelper afsh9 = new AddFixedSlotHelper(seven, commonId, spnTime9.getSelectedItem().toString(),
                        spnLecHour9.getSelectedItem().toString(), spnTutorHour9.getSelectedItem().toString(),
                        spnPracHour9.getSelectedItem().toString(), spnCredit9.getSelectedItem().toString(),
                        spnSub9.getSelectedItem().toString(),
                        spnFacDivA9.getSelectedItem().toString(), spnFacDivB9.getSelectedItem().toString());
                reference.child(eight).setValue(afsh9);


                break;

        }


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
