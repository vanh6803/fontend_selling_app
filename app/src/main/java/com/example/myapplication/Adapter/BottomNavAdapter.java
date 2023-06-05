package com.example.myapplication.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.Fragments.CartFragment;
import com.example.myapplication.Fragments.HomeFragment;
import com.example.myapplication.Fragments.NotificationFragment;
import com.example.myapplication.Fragments.PersonFragment;

public class BottomNavAdapter extends FragmentStateAdapter {
    public BottomNavAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = HomeFragment.newInstance();
                break;
            case 1:
                fragment = CartFragment.newInstance();
                break;
            case 2:
                fragment = NotificationFragment.newInstance();
                break;
            case 3:
                fragment = PersonFragment.newInstance();
                break;

        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
