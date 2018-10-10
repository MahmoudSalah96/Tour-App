package com.example.wolverine.tourapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CairoFragment extends Fragment {

    public CairoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.monument_list, container, false);

        final List<Monument> Giza_monument = new LinkedList<Monument>();

        Giza_monument.add(new Monument("The Great Sphinx", getResources().getString(R.string.GreatSphinxDes),
                getResources().getString(R.string.SphinxBuilder), R.drawable.sphinx));
        Giza_monument.add(new Monument("The Giza pyramids", getResources().getString(R.string.GizapyramidDes),
                getResources().getString(R.string.pyramidsBuilder), R.drawable.pyramid));
        Giza_monument.add(new Monument("The Hanging Church", getResources().getString(R.string.HangingChurchDes), R.drawable.church));
        Giza_monument.add(new Monument("Saladin Citadel", getResources().getString(R.string.SaladinCitadelDes),
                getResources().getString(R.string.CitadelBuilder), R.drawable.salahaldin));
        final MonumentAdapter adapter = new MonumentAdapter(getActivity(), Giza_monument);

        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getActivity(), see_activity.class);
                Bundle b = new Bundle();
                b.putString("monumentname", Giza_monument.get(position).getmMonumentName());
                b.putString("description", Giza_monument.get(position).getmDescription());
                b.putInt("ImageId", Giza_monument.get(position).getmImageId());
                b.putString("BuilderName", Giza_monument.get(position).getmBuildername());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        return rootview;
    }
}
