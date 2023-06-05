package com.example.myapplication.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {
    private static final int BACK_PRESS_INTERVAL = 2000; // Thời gian cho phép giữa hai lần ấn back (2 giây)

    private boolean doubleBackToExitPressedOnce = false;
    private Handler mHandler = new Handler();
    private TextView titleSignup;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        titleSignup = findViewById(R.id.id_title_signup);
        btnLogin = findViewById(R.id.btn_login);

        titleSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                // Áp dụng transition trượt sang khi chuyển đổi màn hình
                ActivityOptionsCompat options = ActivityOptionsCompat.makeCustomAnimation(LoginActivity.this,  R.anim.slide_in_left,R.anim.slide_out_right);

                // Chuyển đổi màn hình với animation
                startActivity(intent, options.toBundle());
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            finishAffinity(); // Kết thúc tất cả các Activity trong ngăn xếp
            System.exit(0); // Thoát ứng dụng
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Ấn back thêm một lần nữa để thoát", Toast.LENGTH_SHORT).show();

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, BACK_PRESS_INTERVAL);
    }
}