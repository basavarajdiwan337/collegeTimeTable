package com.proj.timetable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.Nullable;

public class AddDetails extends Activity implements View.OnClickListener {


    Spinner spnYear, spnScheme, spnDept, spnSem,  spnSub;

    String year, schema, dept, sem,  sub;

    Button btnNext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_details_form);

        spnYear = (Spinner) findViewById(R.id.spnYear);
        spnScheme = (Spinner) findViewById(R.id.spnScheme);
        spnDept = (Spinner) findViewById(R.id.spnDept);
        spnSem = (Spinner) findViewById(R.id.spnSem);

        spnSub = (Spinner) findViewById(R.id.spnSub);

        btnNext = (Button) findViewById(R.id.btnNext);

        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.btnNext:

                getData();

                Intent addDetails = new Intent(getApplicationContext(), AddTTDetails.class);
                addDetails.putExtra("year",year);
                addDetails.putExtra("schema",schema);
                addDetails.putExtra("sem",sem);
                addDetails.putExtra("dept",dept);
                addDetails.putExtra("sub",sub);
                startActivity(addDetails);
                break;
        }

    }

    private void getData() {

        year = this.spnYear.getSelectedItem().toString();
        schema = this.spnScheme.getSelectedItem().toString();
        dept = this.spnDept.getSelectedItem().toString();
        sem = this.spnSem.getSelectedItem().toString();

        sub = this.spnSub.getSelectedItem().toString();

    }
}
