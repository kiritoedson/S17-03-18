package com.example.usuario.myapplication;

import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TextFragmentActivity extends FragmentActivity implements ControldFragment.ControlsListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void onButtonsClick(int textSize, String text) {
        TextFragment fragment=(TextFragment)getSupportFragmentManager().findFragmentById(R.id.textfragment2);
        fragment.changeTextProgress(textSize,text);
    }
}
