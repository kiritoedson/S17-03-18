package com.example.usuario.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by usuario on 17/03/2018.
 */

public class TextFragment extends Fragment {
    private TextView tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.text_fragment,container,false);
        tv=(TextView)view.findViewById(R.id.textView1);
        return view;
    }

    public void changeTextProgress(int fontSize,String text){
        tv.setTextSize(fontSize);
        tv.setText(text);
    }
}
