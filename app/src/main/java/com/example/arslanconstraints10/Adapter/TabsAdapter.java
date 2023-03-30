package com.example.arslanconstraints10.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.arslanconstraints10.Fragments.LoginFragment;
import com.example.arslanconstraints10.Fragments.SignUpFragment;

public class TabsAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter(FragmentManager fm, int NoofTabs){
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }
    @Override
    public int getCount() {
        return 2;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                LoginFragment login = new LoginFragment();
                return login;
            case 1:
                SignUpFragment signup = new SignUpFragment();
                return signup;
        }
        return null;
    }
}