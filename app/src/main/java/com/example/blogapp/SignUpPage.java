package com.example.blogapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        EditText ed1,ed2,ed3,ed4,ed5;
        AppCompatButton b1,b2;

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up_page);

        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.mob);
        ed3=(EditText) findViewById(R.id.uname);
        ed4=(EditText) findViewById(R.id.pass);
        ed5=(EditText) findViewById(R.id.conpass);
        b1=(AppCompatButton) findViewById(R.id.signupbtn);
        b2=(AppCompatButton) findViewById(R.id.backbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName=ed1.getText().toString();
                String getMobNumber=ed2.getText().toString();
                String getUserame=ed3.getText().toString();
                String getPassword=ed4.getText().toString();
                String getConfirmPassword=ed5.getText().toString();
                Toast.makeText(getApplicationContext(), getName+" "+getMobNumber+" "+getUserame+" "+getPassword+" "+getConfirmPassword, Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}