package com.example.myapplication.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.myapplication.Adapter.BottomNavAdapter;
import com.example.myapplication.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private static final int BACK_PRESS_INTERVAL = 2000; // Thời gian cho phép giữa hai lần ấn back (2 giây)
    private boolean doubleBackToExitPressedOnce = false;
    private Handler mHandler = new Handler();

    private BottomNavigationView bottomNavigationView;
    private ViewPager2 viewPager2;
    private BottomNavAdapter bottomNavAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        viewPager2.setAdapter(bottomNavAdapter);
        viewPager2.setUserInputEnabled(false);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.item_home){
                    viewPager2.setCurrentItem(0);
                }else if (item.getItemId() == R.id.item_cart){
                    viewPager2.setCurrentItem(1);
                }else if (item.getItemId() == R.id.item_notification){
                    viewPager2.setCurrentItem(2);
                }else if (item.getItemId() == R.id.item_person){
                    viewPager2.setCurrentItem(3);
                }
                return true;
            }
        });


    }

    private void initView(){
        bottomNavigationView = findViewById(R.id.bottomNav);
        viewPager2 = findViewById(R.id.viewpager2_main_activity);
        bottomNavAdapter = new BottomNavAdapter(this);
    }

    @Override
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