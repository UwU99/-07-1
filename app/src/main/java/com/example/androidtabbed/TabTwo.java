package com.example.androidtabbed;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class TabTwo extends Fragment {

    public TabTwo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_two, container, false);

        Button btn = (Button)view.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}