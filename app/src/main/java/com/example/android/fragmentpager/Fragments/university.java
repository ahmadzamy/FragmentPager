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
public class university extends Fragment {

    ArrayList<TheListItems> UniversityArrayList;
    ListView UniversityItem;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        UniversityArrayList = new ArrayList<>();
        View convert = inflater.inflate(R.layout.fragment_uneversity, container, false);
        UniversityItem = (ListView) convert.findViewById(R.id.list_item);

        UniversityArrayList.add(new TheListItems(getString(R.string.Uni_name1), getString(R.string.uni_loc1), R.drawable.salahlogo_web));
        UniversityArrayList.add(new TheListItems(getString(R.string.uni_name2), getString(R.string.uni_loc2), R.drawable.sulilogo_web));
        UniversityArrayList.add(new TheListItems(getString(R.string.uni_name3), getString(R.string.uni_loc3), R.drawable.ishklogo_web));
        UniversityArrayList.add(new TheListItems(getString(R.string.uni_name4), getString(R.string.uni_loc4), R.drawable.koyalogo_web));

        MyListAdapter universityAdapter = new MyListAdapter(getContext(), R.layout.fragment_uneversity, UniversityArrayList);
        UniversityItem.setAdapter(universityAdapter);

        return convert;
    }

}
