package com.example.myapplication.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.R;

public class IntroActivity extends AppCompatActivity {
    private ImageView img;

    private boolean userchecked = false;

    private Handler handler = new Handler();
    private Runnable delayRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        img = findViewById(R.id.logo);

        delayRunnable = new Runnable() {
            @Override
            public void run() {
                if (!userchecked) { // Kiểm tra nếu người dùng không đã nhấp vào hình ảnh
                    Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        handler.postDelayed(delayRunnable, 3000);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userchecked = true;
                handler.removeCallbacks(delayRunnable); // Xóa chỉ mục của callback này trong hàng đợi
                Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(delayRunnable); // Xóa callback khi hoạt động bị hủy
    }
}