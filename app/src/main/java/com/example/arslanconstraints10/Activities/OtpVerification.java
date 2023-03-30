package com.example.arslanconstraints10.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.arslanconstraints10.R;

public class OtpVerification extends AppCompatActivity {

    int SPLASH_TIME = 443;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mySuperIntent = new Intent(OtpVerification.this, VerificationSuccess.class);
                startActivity(mySuperIntent);

                //This 'finish()' is for exiting the app when back button pressed from Home page which is LoginAcitiy
                finish();
            }
        } , SPLASH_TIME);
    }
}