package com.denejkodlj.partfinder.Fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

import com.denejkodlj.partfinder.R;
import com.denejkodlj.partfinder.data.Part;
import com.denejkodlj.partfinder.data.User;

import java.util.Date;


public class Form extends AbstractFragment {


    private EditText name;
    private EditText price;
    private MultiAutoCompleteTextView description;

    public static Form newInstance(Context context) {
        Form fragment = new Form();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        fragment.setContext(context);
        return fragment;
    }
    public void pressBtn(View view) {
        try {
            String name = String.valueOf(this.name.getText());
            String description = String.valueOf(this.description.getText());
            int price = Integer.parseInt(String.valueOf(this.price));
            if (name != null && description != null && price != 0) {
                Part part = new Part(name, description,price,mockUser(),new Date());
            }
        } catch (Exception e) {
            //nothing
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_form, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        name = (EditText) getView().findViewById(R.id.et_parts_name);
        price = (EditText) getView().findViewById(R.id.et_price);
        description = (MultiAutoCompleteTextView) getView().findViewById(R.id.et_description);
    }



    private User mockUser(){
        return new User("Василий", "Степовой", "0969696969","Так себе парень");
    }
}
