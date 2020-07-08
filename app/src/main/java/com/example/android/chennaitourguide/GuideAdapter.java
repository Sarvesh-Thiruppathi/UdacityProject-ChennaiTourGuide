package com.example.android.chennaitourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Used https://github.com/udacity/android-custom-arrayadapter/blob/master/app/src/main/java/demo/example/com/customarrayadapter/AndroidFlavorAdapter.java
 * for reference.
 */

public class GuideAdapter extends ArrayAdapter<GuideView> {


    public GuideAdapter(Activity context, ArrayList<GuideView> guides) {
        super(context, 0, guides);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemListView = convertView;
        if (itemListView == null) {
            itemListView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_layout, parent, false);
        }

        GuideView guideView = getItem(position);

        ImageView image = (ImageView) itemListView.findViewById(R.id.image);

        if (guideView.getmImageId() == -1) {
            image.setVisibility(View.GONE);
        } else {
            image.setImageResource(guideView.getmImageId());
        }

        TextView name = (TextView) itemListView.findViewById(R.id.place_name);
        name.setText(guideView.getmName());

        TextView location = (TextView) itemListView.findViewById(R.id.location);

        if (guideView.getmLocation() == "noLocation") {
            location.setVisibility(View.GONE);
        } else {
            location.setText(guideView.getmLocation());
        }

        TextView time = (TextView) itemListView.findViewById(R.id.hours_of_operation);
        time.setText(guideView.getmTime());


        return itemListView;
    }
}