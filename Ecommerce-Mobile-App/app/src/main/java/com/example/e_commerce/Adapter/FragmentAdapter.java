package com.example.e_commerce.Adapter;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.e_commerce.fragment.Cart;
import com.example.e_commerce.fragment.Home;
import com.example.e_commerce.fragment.Team;

public class FragmentAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Home","Team","My Cart" };
    private Context context;



    public FragmentAdapter(FragmentManager fm , Context context) {
        super(fm);
        this.context=context;

    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new Home();
                break;
            case 1:
                fragment = new Team();
                break;
            case 2:
                fragment = new Cart();
                break;
        }
        return fragment;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
