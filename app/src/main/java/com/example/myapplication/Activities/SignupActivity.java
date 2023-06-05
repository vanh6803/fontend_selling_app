package com.example.myapplication.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class SignupActivity extends AppCompatActivity {
    private TextView titleLogin;
    private Button btnSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        titleLogin = findViewById(R.id.id_title_login);
        btnSignup = findViewById(R.id.btn_signup);


        titleLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeCustomAnimation(SignupActivity.this, R.anim.slide_in_right, R.anim.slide_out_left);
                startActivity(intent, optionsCompat.toBundle());
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeCustomAnimation(SignupActivity.this, R.anim.slide_in_right, R.anim.slide_out_left);
                startActivity(intent, optionsCompat.toBundle());
            }
        });
    }

}