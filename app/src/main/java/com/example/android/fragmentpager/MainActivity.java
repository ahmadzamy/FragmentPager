package com.example.android.fragmentpager;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.android.fragmentpager.Fragments.myFragments;

public class MainActivity extends AppCompatActivity {
    ViewPager pager;
    TabLayout myTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = (ViewPager) findViewById(R.id.pager);
        myTab = (TabLayout) findViewById(R.id.tabLyout);

        myFragments adapter = new myFragments(getSupportFragmentManager(), this);
        pager.setAdapter(adapter);
        myTab.setupWithViewPager(pager);
    }
}
