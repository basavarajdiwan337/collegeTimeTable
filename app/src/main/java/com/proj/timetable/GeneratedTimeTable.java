package com.proj.timetable;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


public class GeneratedTimeTable extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {


    ListView lstDrafts;

    ArrayList<String> arrayList = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generated_time_table_forms);

        lstDrafts = (ListView) findViewById(R.id.lstDrafts);


        DatabaseReference peopleReference = FirebaseDatabase.getInstance().getReference("draft");



        // Now set the adapter with a given layout
        lstDrafts.setAdapter(new FirebaseListAdapter<GetDrafts>(this, GetDrafts.class,
                android.R.layout.simple_list_item_1, peopleReference) {

            // Populate view as needed
            @Override
            protected void populateView(View view, GetDrafts draft, int position) {
                ((TextView) view.findViewById(android.R.id.text1)).setText(draft.getDraft());
                Toast.makeText(getApplicationContext(),draft.getDraft(),Toast.LENGTH_LONG) .show();

            }
        });

        lstDrafts.setOnItemClickListener(this);

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String data = ((TextView)view).getText().toString();
        Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG ).show();

        Intent viewDrafts = new Intent(GeneratedTimeTable.this, CreateTimeTablePDF.class);
        viewDrafts.putExtra("draft",data);
        startActivity(viewDrafts);
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