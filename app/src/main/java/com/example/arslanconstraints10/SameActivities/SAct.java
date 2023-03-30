package com.example.arslanconstraints10.SameActivities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.arslanconstraints10.R;
import com.example.arslanconstraints10.SameAcitivities2.PaymentAc2;

public class SAct extends AppCompatActivity {

    Button buttonPaymentAc,buttonshipmentDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s);

        buttonshipmentDetails=findViewById(R.id.buttonshipmentDetails);
        buttonPaymentAc=findViewById(R.id.buttonPaymentAc);

        buttonshipmentDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SAct.this , StepPackageActivity.class);
                startActivity(intent);
            }
        });



        buttonPaymentAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SAct.this , MakePaymentActivity.class);
               // Intent intent = new Intent(SAct.this , PaymentAc2.class);
                startActivity(intent);
            }
        });
    }
}