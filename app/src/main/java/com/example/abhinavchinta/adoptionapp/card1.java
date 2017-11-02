package com.example.abhinavchinta.adoptionapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Abhinav Chinta on 10/29/2017.
 */

public class card1 extends android.support.v4.app.Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.card1, container, false);



    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView image = (ImageView)getView().findViewById(R.id.imageView3);
        image.setAdjustViewBounds(true);
        image.setScaleType(ImageView.ScaleType.FIT_XY);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Card1Activity.class);
                startActivity(intent);
            }
        });
        //ImageView image = (ImageView)getView().findViewById(R.id.imageView);
        //image.setAdjustViewBounds(true);
        //image.setScaleType(ImageView.ScaleType.FIT_XY);
    }


}

