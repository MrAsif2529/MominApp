package com.example.mominapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        TextView signup = findViewById(R.id.sign_up);
        String text = "Sign up";
        Spannable ss = new SpannableString(text);
        UnderlineSpan underlineSpan = new UnderlineSpan();
        ss.setSpan(underlineSpan, 0,7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        signup.setText(ss);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(k);
            }
        });

        TextView forgetPassword = findViewById(R.id.forget_password);
        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(LoginActivity.this, ForgetPasswordActivity.class);
                startActivity(p);
            }
        });
    }
}