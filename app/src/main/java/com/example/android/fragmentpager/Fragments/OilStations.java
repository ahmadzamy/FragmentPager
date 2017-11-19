package com.example.android.fragmentpager.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.fragmentpager.Adapters.MyListAdapter;
import com.example.android.fragmentpager.Adapters.TheListItems;
import com.example.android.fragmentpager.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class OilStations extends Fragment {

    ArrayList<TheListItems> OilStationArrayList;
    ListView OilStaition;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        OilStationArrayList = new ArrayList<>();

        View convert = inflater.inflate(R.layout.fragment_oil_stations, container, false);
        OilStaition = (ListView) convert.findViewById(R.id.list_item);

        OilStationArrayList.add(new TheListItems(getString(R.string.oil_one_name), getString(R.string.oilLocation1), R.drawable.oilstation));
        OilStationArrayList.add(new TheListItems(getString(R.string.oil_two_name), getString(R.string.oilLocation2), R.drawable.mhtaboillogo_web));
        OilStationArrayList.add(new TheListItems(getString(R.string.oil_three_name), getString(R.string.oilLocation3), R.drawable.download_web));

        MyListAdapter universityAdapter = new MyListAdapter(getContext(), R.layout.fragment_uneversity, OilStationArrayList);
        OilStaition.setAdapter(universityAdapter);

        return convert;
    }
}
