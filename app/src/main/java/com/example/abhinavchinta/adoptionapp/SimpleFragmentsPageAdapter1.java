package com.example.abhinavchinta.adoptionapp;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Abhinav Chinta on 10/29/2017.
 */

public class SimpleFragmentsPageAdapter1 extends FragmentPagerAdapter{
    private String tabTitles[] = new String[] { "", "", "" };
    public SimpleFragmentsPageAdapter1(FragmentManager fm) {
        super(fm);
    }





    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            //Bundle args = new Bundle();
            //args.putInt("key",0);
            return new card1();
        } else if (position == 1){
            //return new PaidAppsFragment();
            return new card2();
        } else if (position==2){
            //return new SongsFragment();
            return new card3();
        } else {
            return new card4();
        }
        //return null;
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}

