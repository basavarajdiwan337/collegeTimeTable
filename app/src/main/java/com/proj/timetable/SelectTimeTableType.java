package com.proj.timetable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class SelectTimeTableType extends Activity implements View.OnClickListener {

    Button btnTheory, btnLab;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_time_table_type_form);

        btnTheory = (Button) findViewById(R.id.btnTheory);
        btnLab = (Button) findViewById(R.id.btnLab);

        btnTheory.setOnClickListener(this);
        btnLab.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnTheory:

                Intent theory = new Intent(this, AddDetails.class);
                startActivity(theory);

                break;
            case R.id.btnLab:


                break;
        }
    }
}
