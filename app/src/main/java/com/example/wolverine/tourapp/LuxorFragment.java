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
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * A simple {@link Fragment} subclass.
 */
public class LuxorFragment extends Fragment {

    public LuxorFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.monument_list, container, false);

        final List<Monument> Luxor_monument = new LinkedList<Monument>();

        Luxor_monument.add(new Monument("Luxor Temple", getResources().getString(R.string.LuxorTempleDes),
                getResources().getString(R.string.LuxorBuilder), R.drawable.luxor));
        Luxor_monument.add(new Monument("Karnak Temple Complex", getResources().getString(R.string.KarnakDes),
                getResources().getString(R.string.KarnakBuilder), R.drawable.karnak));
        Luxor_monument.add(new Monument("Colossi Of Memnon", getResources().getString(R.string.ColossiOfMemnonDes),
                getResources().getString(R.string.ColossiBuilder), R.drawable.colossi));
        Luxor_monument.add(new Monument("Valley of the Kings", getResources().getString(R.string.ValleyOfTheKingsDes),
                getResources().getString(R.string.ValleyBuilder), R.drawable.kings));

        final MonumentAdapter adapter = new MonumentAdapter(getActivity(), Luxor_monument);

        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getActivity(), see_activity.class);
                Bundle b = new Bundle();
                b.putString("monumentname", Luxor_monument.get(position).getmMonumentName());
                b.putString("description", Luxor_monument.get(position).getmDescription());
                b.putInt("ImageId", Luxor_monument.get(position).getmImageId());
                b.putString("BuilderName", Luxor_monument.get(position).getmBuildername());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        return rootview;
    }
}
