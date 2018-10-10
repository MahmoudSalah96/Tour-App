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
public class AswanFragment extends Fragment {

    public AswanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.monument_list, container, false);

        final List<Monument> Aswan_monument = new LinkedList<Monument>();

        Aswan_monument.add(new Monument("Nubian Museum", getResources().getString(R.string.NubianMuseumDes),
                getResources().getString(R.string.MuseumBuilder), R.drawable.museum));
        Aswan_monument.add(new Monument("Elephantine", getResources().getString(R.string.ElephantineDes), R.drawable.elephantine));
        Aswan_monument.add(new Monument("Unfinished Obelisk", getResources().getString(R.string.UnfinishedObeliskDes),
                getResources().getString(R.string.ObeliskBuilder), R.drawable.unfinished));

        final MonumentAdapter adapter = new MonumentAdapter(getActivity(), Aswan_monument);

        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getActivity(), see_activity.class);
                Bundle b = new Bundle();
                b.putString("monumentname", Aswan_monument.get(position).getmMonumentName());
                b.putString("description", Aswan_monument.get(position).getmDescription());
                b.putInt("ImageId", Aswan_monument.get(position).getmImageId());
                b.putString("BuilderName", Aswan_monument.get(position).getmBuildername());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        return rootview;
    }

}
