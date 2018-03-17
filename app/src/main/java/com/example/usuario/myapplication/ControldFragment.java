package com.example.usuario.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

/**
 * Created by usuario on 17/03/2018.
 */

public class ControldFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {
    private static int seekvalue = 10;
    private static EditText editText;
    ControlsListener activityCallback;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.controlsfragment, container, false);
        editText = (EditText) view.findViewById(R.id.editText1);
        final SeekBar seekBar = (SeekBar) view.findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(this);
        final Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCallback = (ControlsListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activityCallback.toString() + "Se debe implementar ControlsListener");
        }
    }

    public void buttonClicked(View view) {
        try {
            activityCallback.onButtonsClick(seekvalue, editText.getText().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public interface ControlsListener {
        public void onButtonsClick(int textSize, String text);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        seekvalue = progress;
        activityCallback.onButtonsClick(seekvalue, editText.getText().toString());
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
