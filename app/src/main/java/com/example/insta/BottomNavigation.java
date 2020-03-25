package com.example.insta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.insta.databinding.ActivityBottomNavigationBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigation extends AppCompatActivity {
    ActivityBottomNavigationBinding binding;

    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBottomNavigationBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        navigationView = binding.navigationView;

        BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            /*case R.id.home:
                                openFragment(HomeFragment.newInstance("", ""));
                                return true;
                            case R.id.navigation_sms:
                                openFragment(SmsFragment.newInstance("", ""));
                                return true;
                            case R.id.navigation_notifications:
                                openFragment(NotificationFragment.newInstance("", ""));
                                return true;*/
                        }
                        return false;
                    }
                };
    }
}
