package com.bdtask.fragmentandviewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerViewAdapter extends FragmentPagerAdapter {
    public PagerViewAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new AllFragment();
                break;
            case 1:
                fragment = new DinnerFragment();
                break;
            case 2:
                fragment = new LunchFragment();
                break;
        }

        return fragment;

    }
}
