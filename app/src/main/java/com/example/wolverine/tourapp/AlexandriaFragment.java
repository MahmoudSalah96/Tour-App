package com.example.wolverine.tourapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlexandriaFragment extends Fragment {

    public AlexandriaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.monument_list, container, false);

        final List<Monument> Alex_monument = new LinkedList<Monument>();

        Alex_monument.add(new Monument("Citadel Of Qaitbay", getResources().getString(R.string.CitadelOfQaitbayDes),
                getResources().getString(R.string.QaitbayBuilder), R.drawable.qaitbay));
        Alex_monument.add(new Monument("Pompey's Pillar", getResources().getString(R.string.PompeysPillarDes),
                getResources().getString(R.string.PillarBuilder), R.drawable.pompeys));
        Alex_monument.add(new Monument("Royal Jewelry Museum", getResources().getString(R.string.RoyalJewelryMuseumDes),
                getResources().getString(R.string.JewelryMuseumBuilder), R.drawable.jewelry));
        Alex_monument.add(new Monument("Stanley Bridge", getResources().getString(R.string.StanleyDes), R.drawable.stanly));

        final MonumentAdapter adapter = new MonumentAdapter(getActivity(), Alex_monument);

        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getActivity(), see_activity.class);
                Bundle b = new Bundle();
                b.putString("monumentname", Alex_monument.get(position).getmMonumentName());
                b.putString("description", Alex_monument.get(position).getmDescription());
                b.putInt("ImageId", Alex_monument.get(position).getmImageId());
                b.putString("BuilderName", Alex_monument.get(position).getmBuildername());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        return rootview;
    }
}
