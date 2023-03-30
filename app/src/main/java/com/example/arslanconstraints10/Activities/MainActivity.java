package com.example.arslanconstraints10.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.widget.TextView;

import com.example.arslanconstraints10.Adapter.TabsAdapter;
import com.example.arslanconstraints10.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TextView text1,text11;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      TabLayout tabLayout;
         tabLayout = findViewById(R.id.tab_layout);
         tabLayout.addTab(tabLayout.newTab().setText("Login"));
         tabLayout.addTab(tabLayout.newTab().setText("SignUp"));

         text1=findViewById(R.id.text1);
         text11=findViewById(R.id.textView11);

         tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
         final ViewPager viewPager =(ViewPager)findViewById(R.id.view_pager);
         TabsAdapter tabsAdapter = new TabsAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
         viewPager.setAdapter(tabsAdapter);
         viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
          tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
              @Override
             public void onTabSelected(TabLayout.Tab tab) {
                 viewPager.setCurrentItem(tab.getPosition());

                 if(tab.getPosition()==0)
              {
                  text1.setText("Welcome");
                  text11.setText("Start Sending");

              }
                 else
              {
                  text1.setText("Start");
                  text11.setText("Signup");
              }
          }
             @Override
             public void onTabUnselected(TabLayout.Tab tab) {

             }
             @Override
             public void onTabReselected(TabLayout.Tab tab) {

             }
         });
     }
}