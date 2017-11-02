package com.example.abhinavchinta.adoptionapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Abhinav Chinta on 10/22/2017.
 */

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "", "", "" };
    public SimpleFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }





    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            //Bundle args = new Bundle();
            //args.putInt("key",0);
            return new fragment1();
        } else if (position == 1){
            //return new PaidAppsFragment();
            return new fragment2();
        } else {
            //return new SongsFragment();
            return new fragment3();
        }
        //return null;
    }


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
