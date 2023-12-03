package com.proj.timetable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Login extends Activity implements View.OnClickListener {

    Button btnlogin;
    TextView createnewac;
    EditText etemail, mypass;

    String phone, password;
    String passwordFromDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_form);

        etemail = (EditText) findViewById(R.id.etemail);
        mypass = (EditText) findViewById(R.id.mypass);

        btnlogin = (Button) findViewById(R.id.btnlogin);
        createnewac = (TextView) findViewById(R.id.createnewac);

        btnlogin.setOnClickListener(this);
        createnewac.setOnClickListener(this);
    }

    public void getData(){
        phone = etemail.getText().toString();
        password = mypass.getText().toString();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.createnewac:
                Intent reg = new Intent(Login.this, RegisterActivity.class);
                startActivity(reg);
                break;
            case R.id.btnlogin:

                getData();

               // Toast.makeText(getApplicationContext(),"phone "+phone+" - Password = "+password,Toast.LENGTH_LONG).show();
               // FirebaseDatabase.getInstance().goOnline();
                //Intent i = new Intent(Login.this, MainPage.class);
               // startActivity(i);
               DatabaseReference  reference = FirebaseDatabase.getInstance().getReference("users");
               //reference.setValue("Setting Value");

               Query checkUser = reference.orderByChild("phone").equalTo(phone);

                checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if(dataSnapshot.exists()){
                            passwordFromDb  = dataSnapshot.child(phone).child("password").getValue(String.class);

                            if(passwordFromDb.equals(password)){
                                Intent i = new Intent(Login.this, MainPage.class);
                                startActivity(i);
                            }else{
                                Toast.makeText(getApplicationContext(), "Wrong credentials",Toast.LENGTH_LONG).show();
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

                //Toast.makeText(getApplicationContext(), "Direct Login"+passwordFromDb, Toast.LENGTH_LONG).show();
                Intent i = new Intent(Login.this, MainPage.class);
                startActivity(i);
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