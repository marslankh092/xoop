package com.example.arslanconstraints10.SameAcitivities2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.TextView;
import com.example.arslanconstraints10.R;
import java.util.ArrayList;

public class Shipment2Payment extends AppCompatActivity {

   TextView pk,pk2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipment2_payment);

        pk=findViewById(R.id.pk);
        pk2=findViewById(R.id.pk2);
        pk.setText("Payment");
        pk2.setText("Step 3 of 3");

        //2nd rv for visa mastercard payments to add new payment method
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.recyclerView);
        MyAdapter adapter2 = new MyAdapter(this, NatureModel.getObjectList());
        recyclerView2.setAdapter(adapter2);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(layoutManager);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());

        //rv items with recyclrview
        ArrayList<ModelCardView> items = new ArrayList<>();

        //for 3 screens
        for (int i = 0; i < 3; i++) {
            //data is set here
            items.add(new ModelCardView(R.id.item_date+"",R.id.item_ccard+"",R.id.itemName+"",R.id.fImage));

                  }

        //this is adapter in main
        CustomAdapter adapter = new CustomAdapter(this, items);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        //setting adapter in recyclr view 1
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapter.notifyDataSetChanged();


    }
}