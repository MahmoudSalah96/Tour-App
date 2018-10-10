package com.example.wolverine.tourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by wolverine on 27/07/18.
 */

public class CategoryAdabter extends FragmentPagerAdapter {

    Context mcontext;

    public CategoryAdabter(Context context, FragmentManager fm) {
        super(fm);
        mcontext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LuxorFragment();
        } else if (position == 1) {
            return new CairoFragment();
        } else if (position == 2) {
            return new AswanFragment();
        } else {
            return new AlexandriaFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Luxor";
        } else if (position == 1) {
            return "Cairo";
        } else if (position == 2) {
            return "Aswan";
        } else {
            return "Alex";
        }
    }
}
