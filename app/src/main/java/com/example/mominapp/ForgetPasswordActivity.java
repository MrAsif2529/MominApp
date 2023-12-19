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
import android.widget.TextView;

public class ForgetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        TextView signinPw = findViewById(R.id.sign_in_pw);
        String text = "Sign in";
        Spannable ss = new SpannableString(text);
        UnderlineSpan underlineSpan = new UnderlineSpan();
        ss.setSpan(underlineSpan, 0,7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        signinPw.setText(ss);
        signinPw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(ForgetPasswordActivity.this,LoginActivity.class);
                startActivity(k);
            }
        });

        Button sendCode = findViewById(R.id.send_code_btn);
        sendCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendcode = new Intent(ForgetPasswordActivity.this, EmailSuccessActivity.class);
                startActivity(sendcode);
            }
        });
    }
}