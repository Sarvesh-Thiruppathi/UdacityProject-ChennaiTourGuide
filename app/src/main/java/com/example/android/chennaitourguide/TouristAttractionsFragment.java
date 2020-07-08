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
public class TouristAttractionsFragment extends Fragment {


    public TouristAttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);
        final ArrayList<GuideView> touristAttractions = new ArrayList<>();
        touristAttractions.add(new GuideView(R.drawable.marina, getString(R.string.firstTouristAttractionName), getString(R.string.firstTouristAttractionLocation), getString(R.string.firstTouristAttractionTime)));
        touristAttractions.add(new GuideView(R.drawable.arignarzeologicalpark, getString(R.string.secondTouristAttractionName), getString(R.string.secondTouristAttractionLocation), getString(R.string.secondTouristAttractionTime)));
        touristAttractions.add(new GuideView(R.drawable.dakshinachitra, getString(R.string.thirdTouristAttractionName), getString(R.string.thirdTouristAttractionLocation), getString(R.string.thirdTouristAttractionTime)));
        touristAttractions.add(new GuideView(R.drawable.kapaleeshwarar, getString(R.string.fourthTouristAttractionName), getString(R.string.fourthTouristAttractionLocation), getString(R.string.fourthTouristAttractionTime)));
        touristAttractions.add(new GuideView(R.drawable.guindynationalpark, getString(R.string.fifthTouristAttractionName), getString(R.string.fifthTouristAttractionLocation), getString(R.string.fifthTouristAttractionTime)));
        touristAttractions.add(new GuideView(R.drawable.cavelong, getString(R.string.sixthTouristAttractionName), getString(R.string.sixthTouristAttractionLocation), getString(R.string.sixthTouristAttractionTime)));
        touristAttractions.add(new GuideView(R.drawable.governmentmusiumchennai, getString(R.string.seventhTouristAttractionName), getString(R.string.seventhTouristAttractionLocation), getString(R.string.seventhTouristAttractionTime)));
        touristAttractions.add(new GuideView(R.drawable.vellurjottam, getString(R.string.eightTouristAttractionName), getString(R.string.eightTouristAttractionLocation), getString(R.string.eightTouristAttractionTime)));
        touristAttractions.add(new GuideView(R.drawable.vpguniversalkingdom, getString(R.string.ninethTouristAttractionName), getString(R.string.ninethTouristAttractionLocation), getString(R.string.ninethTouristAttractionTime)));
        touristAttractions.add(new GuideView(R.drawable.queensland, getString(R.string.tenthTouristAttractionName), getString(R.string.tenthTouristAttractionLocation), getString(R.string.tenthTouristAttractionTime)));


        GuideAdapter guideAdapter = new GuideAdapter(getActivity(), touristAttractions);

        ListView list = rootView.findViewById(R.id.list_view);
        rootView.setBackgroundColor(Color.parseColor(getString(R.string.touristAttractionColor)));
        list.setAdapter(guideAdapter);
        return rootView;
    }

}
