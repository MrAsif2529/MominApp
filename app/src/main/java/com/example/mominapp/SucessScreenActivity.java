package com.example.mominapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SucessScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucess_screen);


        Button signInFromSuccess = findViewById(R.id.signin_from_success);
        signInFromSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(SucessScreenActivity.this, LoginActivity.class);
                startActivity(l);
            }
        });
    }
}