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

import com.example.arslanconstraints10.Activities.OtpVerification;
import com.example.arslanconstraints10.R;

public class SignUpFragment extends Fragment {
   Button btn_signup;
    View view;
   // FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
    // FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        btn_signup= view.findViewById(R.id.btn_signup);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  Intent intent = new Intent(getActivity(), OtpVerification.class);
                 startActivity(intent);
            }
        });

    }

    protected void onButtonClicked()
 {
    // Intent intent = new Intent(SignUpFragment.this, OtpVerification.class);
   //  startActivity(intent);

 }
}
