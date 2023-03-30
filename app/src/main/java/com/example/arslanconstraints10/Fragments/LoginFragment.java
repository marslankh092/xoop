package com.example.arslanconstraints10.Fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.arslanconstraints10.Activities.VerificationSuccess;
import com.example.arslanconstraints10.R;
import com.example.arslanconstraints10.SameAcitivities2.Shipment2Payment;
import com.example.arslanconstraints10.SameActivities.SAct;
import com.example.arslanconstraints10.SameActivities.StepPackageActivity;

public class LoginFragment extends Fragment {
     Button login;
    View view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
        login= view.findViewById(R.id.btn_lgn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //  Intent intent = new Intent(getActivity() , SAct.class);
             //  Intent intent = new Intent(getActivity() , Shipment2Payment.class);
                Intent intent = new Intent(getActivity() , StepPackageActivity.class);

              // Intent intent = new Intent(getActivity() , VerificationSuccess.class);

                 startActivity(intent);
            }
        });
    }
}