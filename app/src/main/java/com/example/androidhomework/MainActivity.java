package com.example.androidhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.Toast;

import com.example.androidhomework.viewPager.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_main);
        TabLayout tabLayout =(TabLayout) findViewById(R.id.tablayout);
        for (int i = 0; i < 7; i++) {
            tabLayout.addTab(tabLayout.newTab().setText("" + i));
        }
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this,"你切换到了第"+(tab.getPosition()+1) +"个界面",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        ViewPager viewPager = (ViewPager)findViewById(R.id.vp);
           viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
           tabLayout.setupWithViewPager(viewPager);    //---------------与viewPager共用
    }
}
