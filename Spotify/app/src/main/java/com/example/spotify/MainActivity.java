package com.example.spotify;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView
        .OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView
                = findViewById(R.id.bottomNavigationView);

        bottomNavigationView
                .setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();
    FourthFragment fourthFragment = new FourthFragment();
    FifthFragment fifthFragment = new FifthFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.home) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment,
                    firstFragment).commit();
            return true;
        } else if (item.getItemId() == R.id.search) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment,
                    secondFragment).commit();
            return true;
        } else if (item.getItemId() == R.id.library) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment,
                    thirdFragment).commit();
            return true;
        } else if (item.getItemId() == R.id.friends){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment,
                    fourthFragment).commit();
            return true;
        } else if (item.getItemId() == R.id.profile){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment,
                    fifthFragment).commit();
            return true;
        } return false;
    }
}
