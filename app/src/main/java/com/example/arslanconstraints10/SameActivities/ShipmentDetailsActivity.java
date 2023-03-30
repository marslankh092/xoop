package com.example.arslanconstraints10.SameActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.arslanconstraints10.R;

public class ShipmentDetailsActivity extends AppCompatActivity {
TextView pk2;
Button btn_proceedpayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipment_details);

        pk2=findViewById(R.id.pk2);
        pk2.setText("step 2 of 3");
        btn_proceedpayment = findViewById(R.id.btn_proceedpayment);
        btn_proceedpayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   Intent intent = new Intent(ShipmentDetailsActivity.this , StepPackageActivity.class);
                Intent intent = new Intent(ShipmentDetailsActivity.this , MakePaymentActivity.class);
                startActivity(intent);
            }
        });
    }
}