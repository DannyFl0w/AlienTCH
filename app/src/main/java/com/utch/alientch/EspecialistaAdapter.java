package com.utch.alientch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class EspecialistaAdapter extends ArrayAdapter<Especialistas> {

    public EspecialistaAdapter(Context context, List<Especialistas> especialistas) {
        super(context, 0, especialistas);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        Especialistas especialista = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        TextView textView = convertView.findViewById(android.R.id.text1);
        assert especialista != null;
        textView.setText(especialista.toString());

        return convertView;
    }
}