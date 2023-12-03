package com.proj.timetable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Random;

public class UpdateSingleRecords extends Activity implements View.OnClickListener {


    String id, lecturehour, tutoriralhour, practicalhour, credits, subjects, facultyAdiv, facultyBdiv, commonid;

    Spinner spnScheme, spnPrac, spnSub, spnCredits, spnDivA, spnDivB, spnLec;


    Button btnUpdate;


    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_single_form);

        spnScheme = (Spinner) findViewById(R.id.spnScheme);
        spnPrac = (Spinner) findViewById(R.id.spnPrac);
        spnSub = (Spinner) findViewById(R.id.spnSub);
        spnCredits = (Spinner) findViewById(R.id.spnCredits);
        spnDivA = (Spinner) findViewById(R.id.spnDivA);
        spnDivB = (Spinner) findViewById(R.id.spnDivB);
        spnLec = (Spinner) findViewById(R.id.spnLec);

        btnUpdate = (Button) findViewById(R.id.btnUpdate);

        btnUpdate.setOnClickListener(this);

        Intent i = getIntent();
        id =  i.getStringExtra("id");
        lecturehour = i.getStringExtra("lecturehour");
        tutoriralhour = i.getStringExtra("tutoriralhour");
        practicalhour = i.getStringExtra("practicalhour");
        credits = i.getStringExtra("credits");
        subjects = i.getStringExtra("subjects");
        facultyAdiv  = i.getStringExtra("facultyAdiv");
        facultyBdiv = i.getStringExtra("facultyBdiv");
        commonid = i.getStringExtra("commonid");



        spnScheme.setSelection(((ArrayAdapter<String>)spnScheme.getAdapter()).getPosition(lecturehour));
        spnPrac.setSelection(((ArrayAdapter<String>)spnPrac.getAdapter()).getPosition(practicalhour));
        spnSub.setSelection(((ArrayAdapter<String>)spnSub.getAdapter()).getPosition(subjects));
        spnCredits.setSelection(((ArrayAdapter<String>)spnCredits.getAdapter()).getPosition(credits));
        spnDivA.setSelection(((ArrayAdapter<String>)spnDivA.getAdapter()).getPosition(facultyAdiv));
        spnDivB.setSelection(((ArrayAdapter<String>)spnDivB.getAdapter()).getPosition(facultyBdiv));
        spnLec.setSelection(((ArrayAdapter<String>)spnLec.getAdapter()).getPosition(lecturehour));


    }

    @Override
    public void onClick(View view) {
        Random r = new Random();
        //int i = r.nextInt(10000);
        rootNode = FirebaseDatabase.getInstance();

        reference = FirebaseDatabase.getInstance().getReference("detailtable");
        //reference.setValue("Setting Value");

        Query checkUser = reference.orderByChild("id").equalTo(id);

        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    reference = rootNode.getReference("detailtable").child(id).child("credits");
                    reference.removeValue();
                    reference = rootNode.getReference("detailtable").child(id).child("facutlyAdiv");
                    reference.removeValue();
                    reference = rootNode.getReference("detailtable").child(id).child("facutlyBdiv");
                    reference.removeValue();
                    reference = rootNode.getReference("detailtable").child(id).child("lecturerhour");
                    reference.removeValue();
                    reference = rootNode.getReference("detailtable").child(id).child("practicalhour");
                    reference.removeValue();
                    reference = rootNode.getReference("detailtable").child(id).child("subjects");
                    reference.removeValue();
                    reference = rootNode.getReference("detailtable").child(id).child("tutoriralhour");
                    reference.removeValue();


                    reference = rootNode.getReference("detailtable").child(id).child("credits");
                    reference.setValue(spnCredits.getSelectedItem().toString());
                    reference = rootNode.getReference("detailtable").child(id).child("facutlyAdiv");
                    reference.setValue(spnDivA.getSelectedItem().toString());
                    reference = rootNode.getReference("detailtable").child(id).child("facutlyBdiv");
                    reference.setValue(spnDivB.getSelectedItem().toString());
                    reference = rootNode.getReference("detailtable").child(id).child("lecturerhour");
                    reference.setValue(spnLec.getSelectedItem().toString());
                    reference = rootNode.getReference("detailtable").child(id).child("practicalhour");
                    reference.setValue(spnPrac.getSelectedItem().toString());
                    reference = rootNode.getReference("detailtable").child(id).child("subjects");
                    reference.setValue(spnSub.getSelectedItem().toString());
                    reference = rootNode.getReference("detailtable").child(id).child("tutoriralhour");
                    reference.setValue(spnScheme.getSelectedItem().toString());

                    Toast.makeText(getApplicationContext(), "Updated With New Values", Toast.LENGTH_LONG).show();

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });



       /* AddDetailsHelper adh = new AddDetailsHelper(this.commonid,this.spnLec.getSelectedItem().toString(), this.spnScheme.getSelectedItem().toString(), this.spnPrac.getSelectedItem().toString(), this.spnCredits.getSelectedItem().toString(), this.spnSub.getSelectedItem().toString(),this.spnDivA.getSelectedItem().toString(), this.spnDivB.getSelectedItem().toString());
        reference.child(""+spnSub.getSelectedItem().toString()).setValue(adh);
        Toast.makeText(getApplicationContext(), "Updated To Firebase",Toast.LENGTH_LONG).show();*/
    }
}
