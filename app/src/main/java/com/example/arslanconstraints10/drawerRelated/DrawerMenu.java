package com.example.arslanconstraints10.drawerRelated;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import com.example.arslanconstraints10.Activities.MainActivity;
import com.example.arslanconstraints10.Activities.SettingAct;
import com.example.arslanconstraints10.FranchiseOnly.SettingActivity;
import com.example.arslanconstraints10.SameActivities.MakePaymentActivity;
import com.example.arslanconstraints10.SameActivities.StepPackageActivity;
import com.example.arslanconstraints10.Activities2.TrackParcActivity;
import com.example.arslanconstraints10.R;
import com.example.arslanconstraints10.SearchViewOnly.FranchiseActivity;
import com.example.arslanconstraints10.btmNavFragments.BookingFragment;
import com.example.arslanconstraints10.btmNavFragments.ScheduleFragment;
import com.example.arslanconstraints10.btmNavFragments.TrackFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class DrawerMenu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    private BottomNavigationView bottomNavigationView;
    TrackFragment  trackFragment = TrackFragment.newInstance();
    ScheduleFragment scheduleFragment = ScheduleFragment.newInstance();
    BookingFragment bookingFragment  = BookingFragment.newInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_menu);
        drawer = findViewById(R.id.drawer_layout);
        ImageButton menuRight = findViewById(R.id.leftRight);

        menuRight.setOnClickListener(v -> {
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                drawer.openDrawer(GravityCompat.START);
            }
        });

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        bottomNavigationView = findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {

                case R.id.action_Bookings:
                    selectedFragment =  bookingFragment;
                    break;

                case R.id.action_Schedule:
                    selectedFragment = scheduleFragment;
                    break;

                case R.id.action_Franchises:
                   Intent intent = new Intent(this, SettingActivity.class);
                   startActivity(intent);
                    break;

                case R.id.action_Track:
                    selectedFragment = trackFragment;
                    break;
            }

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (selectedFragment != null) {
                transaction.replace(R.id.f_container, selectedFragment);
                transaction.commit();
            }
            return true;
        });

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
          transaction.replace(R.id.f_container, scheduleFragment);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawer.closeDrawers();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        switch (item.getItemId()) {
            case R.id.nav_Notification:
                 bottomNavigationView.setSelectedItemId(R.id.nav_Notification);
                Intent intent = new Intent(this, MakePaymentActivity.class);
                startActivity(intent);
              //    ft.replace(R.id.f_container, notificationFragment);
                  break;
            case R.id.nav_MyBooking:
                 bottomNavigationView.setSelectedItemId(R.id.nav_MyBooking);
                Intent stepPackage = new Intent(this, StepPackageActivity.class);
                startActivity(stepPackage);
                break;

            case R.id.nav_franchise:
                Intent fran = new Intent(this, FranchiseActivity.class);
                startActivity(fran);
                break;

            case R.id.nav_Logout:
                Intent intent4 = new Intent(this, MainActivity.class);
                startActivity(intent4);
                break;

            case R.id.nav_Setting:
              //  bottomNavigationView.setSelectedItemId(R.id.nav_Setting);
                Intent intent2 = new Intent(this, SettingAct.class);
                startActivity(intent2);
                break;

            case R.id.nav_TrackParcel:
                Intent intent3 = new Intent(this, TrackParcActivity.class);
                startActivity(intent3);
                break;
        }
        ft.commit();
        return true;
    }
}
