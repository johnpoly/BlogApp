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

public class DeletePostPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        EditText ed1;
        AppCompatButton b1,b2;

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_delete_post_page);

        ed1=(EditText) findViewById(R.id.title);
        b1=(AppCompatButton) findViewById(R.id.delbtn);
        b2=(AppCompatButton) findViewById(R.id.backbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getTitle=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),"Deleting "+getTitle,Toast.LENGTH_SHORT).show();
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