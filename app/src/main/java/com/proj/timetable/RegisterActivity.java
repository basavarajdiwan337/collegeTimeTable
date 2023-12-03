package com.proj.timetable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends Activity implements View.OnClickListener {

    EditText etUsername, etPassword, etName, etPhone;

    String username, password, name, phonenum;

    Button btnRegister;

    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_form);

        etUsername = (EditText) findViewById(R.id.editEmail);
        etPassword = (EditText) findViewById(R.id.editPass);
        etName = (EditText) findViewById(R.id.editName);
        etPhone = (EditText) findViewById(R.id.editPhone);

        btnRegister = (Button) findViewById(R.id.buttonAcount);

        btnRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.buttonAcount:
               // FirebaseDatabase.getInstance().goOnline();
                    validateAndGetData();

                    rootNode = FirebaseDatabase.getInstance();
                    reference = rootNode.getReference("users");

                    UserHelperClass helper = new UserHelperClass(username,password, name,phonenum);
                    reference.child(phonenum).setValue(helper);
                   // reference.child(phone).child("username").setValue(username);

                break;
        }

    }

    private void validateAndGetData() {

        username  = this.etUsername.getText().toString();
        password = this.etPassword.getText().toString();
        name= this.etName.getText().toString();
        phonenum = this.etPhone.getText().toString();

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