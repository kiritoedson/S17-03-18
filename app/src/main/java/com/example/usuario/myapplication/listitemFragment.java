package com.example.usuario.myapplication;


import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by usuario on 17/03/2018.
 */

public class listitemFragment extends ListFragment {
    String[] users = new String[]{"Juan", "Pedro", "Marina", "Adriana", "Javier", "Rosalia", "Carlos", "Oscar", "Julia", "Karla"};
    String[] locations = new String[]{"CDMX", "MTY", "GDA", "QRO", "BCS", "CDMX", "MTY", "GDA", "QRO", "BCS"};
    private User[] Data = new User[]{
            new User("Oscar", "GDA", "IBM"),
            new User("Julia", "CDMX", "UNAM"),
            new User("Ricardo", "MTY", "SAP"),
            new User("Ernesto", "GDA", "IBM"),
            new User("Linda", "BCS", "APPLE")};

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        DetailsFragment details = (DetailsFragment) getFragmentManager().findFragmentById(R.id.fragmentDetail);
        /*details.change("Nombre: " + users[position], "Localidad: " + locations[position]);*/
        details.change("Nombre: "+Data[position].getName(),"Localidad: "+Data[position].getLocation()+ "\nCompania: "+Data[position].getCompania());
        getListView().setSelector(android.R.color.holo_blue_dark);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listitem_fragment, container, false);
       /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, users);
        setListAdapter(adapter);*/
        setListAdapter(new UserAdapter(this));
        return view;
    }

    class UserAdapter extends ArrayAdapter<User> {
        Activity context;

        public UserAdapter(listitemFragment context) {
            super(context.getActivity(), R.layout.usetitemlayout,Data);
            this.context = context.getActivity();
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View view = inflater.inflate(R.layout.usetitemlayout, null);

            TextView tvname = (TextView) view.findViewById(R.id.tvName);
            tvname.setText(Data[position].getName());
            TextView tvcompany = (TextView) view.findViewById(R.id.tvcompany);
            tvcompany.setText(Data[position].getCompania());

            return view;

        }

    }
}
