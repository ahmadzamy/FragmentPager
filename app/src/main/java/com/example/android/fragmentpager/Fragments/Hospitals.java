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
public class Hospitals extends Fragment {
    ArrayList<TheListItems> HospitalArrayList;
    ListView item;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        HospitalArrayList = new ArrayList<>();

        View convert = inflater.inflate(R.layout.fragment_hospitals, container, false);
        item = (ListView) convert.findViewById(R.id.list_item);

        HospitalArrayList.add(new TheListItems(getString(R.string.Hospital_name), getString(R.string.hospital_loc1), R.drawable.download_web));
        HospitalArrayList.add(new TheListItems(getString(R.string.Hospital_name2), getString(R.string.hospital_loc2), R.drawable.hiwalogo_web));
        HospitalArrayList.add(new TheListItems(getString(R.string.Hospital_name3), getString(R.string.hospital_loc3), R.drawable.duhoklogo_web));

        MyListAdapter adp = new MyListAdapter(getContext(), R.layout.fragment_hospitals, HospitalArrayList);
        item.setAdapter(adp);

        return convert;
    }
}
