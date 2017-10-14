package com.example.hannes.app3;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity implements FragMe.OnFragmentInteractionListener , FragWeb.OnFragmentInteractionListener, FragMap.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragMe fragMe = new FragMe();
        FragmentManager fM = getSupportFragmentManager();
        FragmentTransaction fT = fM.beginTransaction();
        fT.add(R.id.fragme, fragMe);

        FragWeb fW= new FragWeb();
        FragmentManager fM2 = getSupportFragmentManager();
        FragmentTransaction fT2 = fM2.beginTransaction();
        fT2.add(R.id.fragweb, fW);

        FragMap fMap= new FragMap();
        FragmentManager fM3 = getSupportFragmentManager();
        FragmentTransaction fT3 = fM3.beginTransaction();
        fT3.add(R.id.fragmap, fMap);

        fT.commit();
        fT2.commit();
        fT3.commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
