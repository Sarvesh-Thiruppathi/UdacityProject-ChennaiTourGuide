package com.example.android.chennaitourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.navigation_tab);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        GuiderViewPager guiderViewPager = new GuiderViewPager(getSupportFragmentManager(),MainActivity.this);
        viewPager.setAdapter(guiderViewPager);
        tabLayout.setupWithViewPager(viewPager);

    }

}

