package com.example.android.chennaitourguide;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        final ArrayList<GuideView> restaurantList = new ArrayList<>();
        restaurantList.add(new GuideView(R.drawable.famousthrory, getString(R.string.firstRestaurantName), getString(R.string.firstRestaurantLocation), getString(R.string.firstRestaurantTime)));
        restaurantList.add(new GuideView(R.drawable.themarina, getString(R.string.secondRestaurantName), getString(R.string.secondRestaurantLocation), getString(R.string.secondRestaurantTime)));
        restaurantList.add(new GuideView(R.drawable.annalakshmirestaurant, getString(R.string.thirdRestaurantName), getString(R.string.thirdRestaurantLocation), getString(R.string.thirdRestaurantTime)));
        restaurantList.add(new GuideView(R.drawable.panasian, getString(R.string.fourthRestaurantName), getString(R.string.fourthRestaurantLocation), getString(R.string.fourthRestaurantTime)));
        restaurantList.add(new GuideView(R.drawable.thrflyingelephant, getString(R.string.fifthRestaurantName), getString(R.string.fifthRestaurantLocation), getString(R.string.fifthRestaurantTime)));
        restaurantList.add(new GuideView(R.drawable.famousbiriyani, getString(R.string.sixthRestaurantName), getString(R.string.sixthRestaurantLocation), getString(R.string.sixthRestaurantTime)));
        restaurantList.add(new GuideView(R.drawable.rayarmess, getString(R.string.seventhRestaurantName), getString(R.string.seventhRestaurantLocation), getString(R.string.seventhRestaurantTime)));
        restaurantList.add(new GuideView(R.drawable.bombaybiriyani, getString(R.string.eighthRestaurantName), getString(R.string.eighthRestaurantLocation), getString(R.string.eighthRestaurantTime)));
        restaurantList.add(new GuideView(R.drawable.adayaranamdabhavan, getString(R.string.ninethRestaurantName), getString(R.string.ninethRestaurantLocation), getString(R.string.ninethRestaurantTime)));
        restaurantList.add(new GuideView(R.drawable.peshwri, getString(R.string.tenthRestaurantName), getString(R.string.tenthRestaurantLocation), getString(R.string.tenthRestaurantTime)));


        GuideAdapter guideAdapter = new GuideAdapter(getActivity(), restaurantList);

        ListView list = rootView.findViewById(R.id.list_view);
        list.setBackgroundColor(Color.parseColor(getString(R.string.restaurantFragmentColor)));
        list.setAdapter(guideAdapter);
        return rootView;
    }

}
