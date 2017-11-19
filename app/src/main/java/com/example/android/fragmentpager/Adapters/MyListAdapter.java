package com.example.android.fragmentpager.Adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.fragmentpager.R;

import java.util.List;

/**
 * Created by Ahmad Siafaddin on 10/15/2017.
 */

public class MyListAdapter extends ArrayAdapter<TheListItems> {
    Context context;
    int resource;
    List<TheListItems> objects;

    public MyListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<TheListItems> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_lists, parent, false);
        }
        ImageView image = (ImageView) convertView.findViewById(R.id.profile_image);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView location = (TextView) convertView.findViewById(R.id.location);

        TheListItems myData = objects.get(position);

        image.setImageResource(myData.getImageResourec());
        name.setText(myData.getName());
        location.setText(myData.getLocation());
        return convertView;
    }
}
