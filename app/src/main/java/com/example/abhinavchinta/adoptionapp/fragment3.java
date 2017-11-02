package com.example.abhinavchinta.adoptionapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class fragment3 extends android.support.v4.app.Fragment  {


    //@BindView(R.id.textView2)TextView textView1;
    //@BindView(R.id.textView2)TextView textView2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment3, container, false);

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView image = (ImageView)getView().findViewById(R.id.imageView2);
        image.setAdjustViewBounds(true);
        image.setScaleType(ImageView.ScaleType.FIT_XY);

        TextView textView = (TextView)getView().findViewById(R.id.textView2);
        TextView textView1 = (TextView)getView().findViewById(R.id.textView3);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegisterActivity.class);
                startActivity(intent);
            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginPage.class);
                startActivity(intent);
            }
        });


    }


}
