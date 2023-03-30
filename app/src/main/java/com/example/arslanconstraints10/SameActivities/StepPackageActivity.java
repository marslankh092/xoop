package com.example.arslanconstraints10.SameActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.arslanconstraints10.R;
import com.example.arslanconstraints10.SameAcitivities2.MyAdapter;
import com.example.arslanconstraints10.SameAcitivities2.NatureModel;

public class StepPackageActivity extends AppCompatActivity {
    TextView pk2;
Button btn_addShipStepPack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_package);

        RecyclerView recyclerViewPkg = (RecyclerView) findViewById(R.id.recyclerViewPkg);
        MyAdapter adapter2 = new MyAdapter(this, NatureModel.getObjectList());
        recyclerViewPkg.setAdapter(adapter2);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerViewPkg.setLayoutManager(layoutManager);
        recyclerViewPkg.setItemAnimator(new DefaultItemAnimator());

        pk2=findViewById(R.id.pk2);
        pk2.setText("step 1 of 3");

        btn_addShipStepPack=findViewById(R.id.btn_addShipStepPack);

        btn_addShipStepPack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent intent4=new Intent(StepPackageActivity.this, ShipmentDetailsActivity.class);
                   startActivity(intent4);
                }
        });
    }
}