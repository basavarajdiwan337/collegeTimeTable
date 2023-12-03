package com.proj.timetable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.Nullable;

public class GenerateTimeTable extends Activity implements View.OnClickListener {

    Button btnCreateTimeTable;
    Spinner spnSelSub, spnSelDiv, spnSelSem, spnSelSection, spnSession;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generate_timetable_form);

        btnCreateTimeTable = (Button) findViewById(R.id.btnCreateTimeTable);

        btnCreateTimeTable.setOnClickListener(this);


        spnSelSub = (Spinner) findViewById(R.id.spnSelSub);
        spnSelDiv = (Spinner) findViewById(R.id.spnSelDiv);
        spnSelSem = (Spinner) findViewById(R.id.spnSelSem);
        spnSelSection = (Spinner) findViewById(R.id.spnSelSection);
        spnSession = (Spinner) findViewById(R.id.spnSession);

    }

    @Override
    public void onClick(View view) {

        Intent r = new Intent(GenerateTimeTable.this, CreateFixedSlot.class);
        r.putExtra("subject",spnSelSub.getSelectedItem().toString());
        r.putExtra("division",spnSelDiv.getSelectedItem().toString());
        r.putExtra("semester",spnSelSem.getSelectedItem().toString());
        r.putExtra("section",spnSelSection.getSelectedItem().toString());
        r.putExtra("session",spnSession.getSelectedItem().toString());
        startActivity(r);

    }
}
