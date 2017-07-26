package com.denejkodlj.partfinder.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denejkodlj.partfinder.R;


public class PartFragment extends Fragment {


    public PartFragment() {
        // Required empty public constructor
    }

    public static PartFragment newInstance(String param1, String param2) {
        PartFragment fragment = new PartFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_part, container, false);
    }





}
