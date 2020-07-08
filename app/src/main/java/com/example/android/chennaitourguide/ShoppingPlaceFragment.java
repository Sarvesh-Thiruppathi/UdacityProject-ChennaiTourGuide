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
public class ShoppingPlaceFragment extends Fragment {


    public ShoppingPlaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        final ArrayList<GuideView> shoppingList = new ArrayList<>();
        shoppingList.add(new GuideView(R.drawable.phoenixmall, getString(R.string.firstShoppingPlaceName), getString(R.string.firstShoppingPlaceLocation), getString(R.string.firstShoppingPlaceTime)));
        shoppingList.add(new GuideView(R.drawable.thegrandmall, getString(R.string.secondShoppingPlaceName), getString(R.string.secondShoppingPlaceLocation), getString(R.string.secondShoppingPlaceTime)));
        shoppingList.add(new GuideView(R.drawable.rameemall, getString(R.string.thirdShoppingPlaceName), getString(R.string.thirdShoppingPlaceLocation), getString(R.string.thirdShoppingPlaceTime)));
        shoppingList.add(new GuideView(R.drawable.expressavanuemall, getString(R.string.fourthShoppingPlaceName), getString(R.string.fourthShoppingPlaceLocation), getString(R.string.fourthShoppingPlaceTime)));
        shoppingList.add(new GuideView(R.drawable.tnagar, getString(R.string.fifthShoppingPlaceName), getString(R.string.fifthShoppingPlaceLocation), getString(R.string.fifthShoppingPlaceTime)));
        shoppingList.add(new GuideView(R.drawable.bergamomall, getString(R.string.sixthShoppingPlaceName), getString(R.string.sixthShoppingPlaceLocation), getString(R.string.sixthShoppingPlaceTime)));
        shoppingList.add(new GuideView(R.drawable.abiramimegamall, getString(R.string.seventhShoppingPlaceName), getString(R.string.seventhShoppingPlaceLocation), getString(R.string.seventhShoppingPlaceTime)));
        shoppingList.add(new GuideView(R.drawable.fourmmall, getString(R.string.eightShoppingPlaceName), getString(R.string.eighthShoppingPlaceLocation), getString(R.string.eighthShoppingPlaceTime)));
        shoppingList.add(new GuideView(R.drawable.spectrummall, getString(R.string.ninthShoppingPlaceName), getString(R.string.ninethShoppingPlaceLocation), getString(R.string.ninethShoppingPlaceTime)));
        shoppingList.add(new GuideView(R.drawable.spencersplaza, getString(R.string.tenthShoppingPlaceName), getString(R.string.tenthShoppingPlaceLocation), getString(R.string.tenthShoppingPlaceTime)));


        GuideAdapter guideAdapter = new GuideAdapter(getActivity(), shoppingList);

        ListView list = rootView.findViewById(R.id.list_view);
        list.setBackgroundColor(Color.parseColor(getString(R.string.shoppingColor)));

        list.setAdapter(guideAdapter);
        return rootView;
    }

}
