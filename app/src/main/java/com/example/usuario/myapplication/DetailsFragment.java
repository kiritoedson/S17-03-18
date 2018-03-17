package com.example.usuario.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.usuario.myapplication.R;

/**
 * Created by usuario on 17/03/2018.
 */

public class DetailsFragment extends Fragment {
    private TextView name, location;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.details_fragment, container, false);
        name = (TextView) view.findViewById(R.id.Name);
        location = (TextView) view.findViewById(R.id.Location);
        return view;
    }

    public void change(String uname, String ulocation) {
        name.setText(uname);
        location.setText(ulocation);
    }
}
