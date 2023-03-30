package com.example.arslanconstraints10.SameAcitivities2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.arslanconstraints10.R;
import com.example.arslanconstraints10.SameActivities.ShipmentDetailsActivity;
import com.example.arslanconstraints10.SameActivities.StepPackageActivity;

public class PaymentAc2 extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_ac2);

        button=findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                Intent intent4=new Intent(PaymentAc2.this, Shipment1.class);
                startActivity(intent4);
            }
        });
    }
}