package com.example.usuario.myapplication;


import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by usuario on 17/03/2018.
 */

public class listitemFragment extends ListFragment {
    String[] users = new String[]{"Juan", "Pedro", "Marina", "Adriana", "Javier", "Rosalia", "Carlos", "Oscar", "Julia", "Karla"};
    String[] locations = new String[]{"CDMX", "MTY", "GDA", "QRO", "BCS", "CDMX", "MTY", "GDA", "QRO", "BCS"};

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        DetailsFragment details = (DetailsFragment) getFragmentManager().findFragmentById(R.id.fragmentDetail);
        details.change("Nombre: " + users[position], "Localidad: " + locations[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listitem_fragment, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, users);
        setListAdapter(adapter);
        return view;
    }
}
