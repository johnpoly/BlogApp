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

public class AddPostPage extends AppCompatActivity {

    EditText ed1,ed2,ed3;
    AppCompatButton b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_post_page);

        ed1=(EditText) findViewById(R.id.title);
        ed2=(EditText) findViewById(R.id.content);
        ed3=(EditText) findViewById(R.id.postedby);
        b1=(AppCompatButton) findViewById(R.id.postbtn);
        b2=(AppCompatButton) findViewById(R.id.backbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getTitle=ed1.getText().toString();
                String getContent=ed2.getText().toString();
                String getPostedBY=ed3.getText().toString();
                Toast.makeText(getApplicationContext(),getTitle+" "+getContent+" "+getPostedBY,Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), SignInPage.class);
                startActivity(i);
            }
        });

    }
}