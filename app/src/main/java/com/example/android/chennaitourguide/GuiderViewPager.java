package com.example.android.chennaitourguide;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sarvesh_Programmer on 11/19/17.
 */

public class GuiderViewPager extends FragmentPagerAdapter {

    private Activity myActivity;

    public GuiderViewPager(android.support.v4.app.FragmentManager fm, Activity activity) {
        super(fm);
        this.myActivity = activity;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TouristAttractionsFragment();
        } else if (position == 1) {
            return new ShoppingPlaceFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else
            return new EventsFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return myActivity.getString(R.string.touristAttractions);
        } else if (position == 1) {
            return myActivity.getString(R.string.shoppingPlaces);
        } else if (position == 2) {
            return myActivity.getString(R.string.restaurant);
        } else
            return myActivity.getString(R.string.events);
    }
}
