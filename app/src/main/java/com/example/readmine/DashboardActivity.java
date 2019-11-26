package com.example.readmine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    String EmailHolder;
    TextView Email, Name;
    Button home ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Email = (TextView)findViewById(R.id.textView1);



        Intent intent = getIntent();

        // Receiving User Email Send By MainActivity.
        EmailHolder = intent.getStringExtra(LoginActivity.UserEmail);

        // Setting up received email to TextView.
        Email.setText(Email.getText().toString()+ EmailHolder);


    }

    public void homeButton(View view) {
        Toast.makeText(DashboardActivity.this,"Log in Successful", Toast.LENGTH_LONG).show();
                // Opening new user registration activity using intent on button click.
                Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(intent);

    }

    public void camera(View view) {
    }
}