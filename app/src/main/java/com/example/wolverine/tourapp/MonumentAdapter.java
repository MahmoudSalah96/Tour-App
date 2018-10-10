package com.example.wolverine.tourapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by wolverine on 27/07/18.
 */

public class MonumentAdapter extends ArrayAdapter<Monument> {

    public MonumentAdapter(Context context, List<Monument> mMonument) {
        super(context, 0, mMonument);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Monument local_monument = getItem(position);

        TextView MonumentName = (TextView) listItemView.findViewById(R.id.monument_name);
        MonumentName.setText(local_monument.getmMonumentName());

        TextView Description = (TextView) listItemView.findViewById(R.id.description);
        Description.setText("See More");

        ImageView MonumentImage = (ImageView) listItemView.findViewById(R.id.image);
        MonumentImage.setImageResource(local_monument.getmImageId());

        return listItemView;
    }
}
