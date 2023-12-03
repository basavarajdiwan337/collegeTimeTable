package com.proj.timetable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainPage extends Activity {

    GridView coursesGV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_blocks_form);

        coursesGV = findViewById(R.id.idGVcourses);

        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("Add Details", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("Saved Drafts", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("Generate Time Table", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("Generated Time Table", R.drawable.ic_launcher_background));

        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);

        coursesGV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(), "" + position, Toast.LENGTH_LONG).show();


                if (position == 0) {
                        Intent one = new Intent(MainPage.this,AddDetails.class );
                        startActivity(one);

                } else if (position == 1) {
                    Intent two = new Intent(MainPage.this,SavedDrafts.class );
                    startActivity(two);

                } else if (position == 2) {

                    ///Toast.makeText(getApplicationContext(),"Few Functionalities Disabled by Firebase Temporarily",Toast.LENGTH_LONG).show();
                    Intent three = new Intent(MainPage.this,GenerateTimeTable.class);
                    startActivity(three);

                } else if (position == 3) {
                    Intent four = new Intent(MainPage.this,GeneratedTimeTable.class );
                    startActivity(four);
                }

            }
        });
    }


}