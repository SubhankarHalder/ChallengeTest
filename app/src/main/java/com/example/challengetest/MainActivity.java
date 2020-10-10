package com.example.challengetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view) {
        TextView usrFirstName = findViewById(R.id.textFirstName);
        TextView usrLastName = findViewById(R.id.textLastName);
        TextView useEmail = findViewById(R.id.textEmail);

        EditText edtFirstName = findViewById(R.id.firstName);
        EditText edtLastName = findViewById(R.id.lastName);
        EditText edtEmail = findViewById(R.id.email);

        usrFirstName.setText("First Name: " + edtFirstName.getText().toString());
        usrLastName.setText("Last Name: " + edtLastName.getText().toString());
        useEmail.setText("Email: " + edtEmail.getText().toString());
    }
}