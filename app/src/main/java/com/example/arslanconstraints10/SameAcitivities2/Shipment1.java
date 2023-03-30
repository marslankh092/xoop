package com.example.arslanconstraints10.SameAcitivities2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.arslanconstraints10.R;
import java.util.ArrayList;
public class Shipment1 extends AppCompatActivity {

    Button button_SenderName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipment1);





        button_SenderName=findViewById(R.id.button_SenderName);
        button_SenderName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intShip=new Intent(Shipment1.this,Shipment2Payment.class);
                startActivity(intShip);
            }
        });
    }
}