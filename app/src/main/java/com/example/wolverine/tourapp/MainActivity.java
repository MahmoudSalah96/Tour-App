package com.example.wolverine.tourapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewpager = (ViewPager) findViewById(R.id.viewpager);

        CategoryAdabter adabter = new CategoryAdabter(this, getSupportFragmentManager());
        viewpager.setAdapter(adabter);

        TabLayout layout = (TabLayout) findViewById(R.id.tabs);

        layout.setupWithViewPager(viewpager);
    }
}
