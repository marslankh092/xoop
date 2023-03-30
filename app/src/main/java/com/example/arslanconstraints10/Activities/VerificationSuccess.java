package com.example.arslanconstraints10.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.example.arslanconstraints10.R;
import com.example.arslanconstraints10.drawerRelated.DrawerMenu;

public class VerificationSuccess extends AppCompatActivity {
    int SPLASH_TIME =  489; //This is 3 seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_success);

        //Code to start timer and take action after the timer ends
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do any action here. Now we are moving to next page
                Intent mySuperIntent = new Intent(VerificationSuccess.this, DrawerMenu.class);
                startActivity(mySuperIntent);

                //This 'finish()' is for exiting the app when back button pressed from Home page which is LoginAcitiy
                finish();
            }
        } , SPLASH_TIME);
    }
}