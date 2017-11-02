package com.example.abhinavchinta.adoptionapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class fragment1 extends android.support.v4.app.Fragment  {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);


    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView image = (ImageView)getView().findViewById(R.id.imageView);
        image.setAdjustViewBounds(true);
        image.setScaleType(ImageView.ScaleType.FIT_XY);
    }



}
