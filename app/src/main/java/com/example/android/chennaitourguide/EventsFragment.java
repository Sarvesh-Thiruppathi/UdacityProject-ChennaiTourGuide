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
public class EventsFragment extends Fragment {

    final int noImageAvailable = -1;
    final String noLocationAvailable = "noLocation";


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        final ArrayList<GuideView> eventsList = new ArrayList<>();
        eventsList.add(new GuideView(noImageAvailable, getString(R.string.firstEventName), getString(R.string.firstEventLocation), getString(R.string.firstEventDate)));
        eventsList.add(new GuideView(noImageAvailable, getString(R.string.secondEventName), noLocationAvailable, getString(R.string.secondEventDate)));
        eventsList.add(new GuideView(noImageAvailable, getString(R.string.thirdEventName), noLocationAvailable, getString(R.string.thirdEventDate)));
        eventsList.add(new GuideView(noImageAvailable, getString(R.string.fourthEventName), noLocationAvailable, getString(R.string.fourthEventDate)));
        eventsList.add(new GuideView(noImageAvailable, getString(R.string.fifthEventName), noLocationAvailable, getString(R.string.fifthEventDate)));


        GuideAdapter guideAdapter = new GuideAdapter(getActivity(), eventsList);

        ListView list = rootView.findViewById(R.id.list_view);
        rootView.setBackgroundColor(Color.parseColor(getString(R.string.eventsColor)));

        list.setAdapter(guideAdapter);
        return rootView;
    }

}

