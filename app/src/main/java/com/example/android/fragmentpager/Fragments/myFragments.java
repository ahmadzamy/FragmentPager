package com.example.android.fragmentpager.Fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.fragmentpager.R;

import java.util.ArrayList;

/**
 * Created by Ahmad Siafaddin on 10/15/2017.
 */

public class myFragments extends FragmentPagerAdapter {
    ArrayList<Fragment> itmes;
    ArrayList<String> lables;
    private Context context;

    public myFragments(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

        itmes = new ArrayList<>();
        itmes.add(new Hospitals());
        itmes.add(new Markets());
        itmes.add(new university());
        itmes.add(new OilStations());

        lables = new ArrayList<>();
        lables.add(context.getString(R.string.label1));
        lables.add(context.getString(R.string.label2));
        lables.add(context.getString(R.string.label3));
        lables.add(context.getString(R.string.label4));

    }


    @Override
    public Fragment getItem(int position) {
        return itmes.get(position);
    }

    @Override
    public int getCount() {
        return itmes.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return lables.get(position);
    }
}
