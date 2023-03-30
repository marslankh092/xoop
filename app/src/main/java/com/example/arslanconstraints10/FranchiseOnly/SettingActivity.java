package com.example.arslanconstraints10.FranchiseOnly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.example.arslanconstraints10.R;
import com.google.android.material.tabs.TabLayout;

public class SettingActivity extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting2);
        viewPager = findViewById(R.id.viewPager);
        addTabs(viewPager);
        ((TabLayout) findViewById(R.id.tabLayout)).setupWithViewPager( viewPager );
    }
    private void addTabs(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new FragmentPersonal(), "Persoanl");
        adapter.addFrag(new FragmentNotification(), "Notifications");
        viewPager.setAdapter(adapter);
    }
}