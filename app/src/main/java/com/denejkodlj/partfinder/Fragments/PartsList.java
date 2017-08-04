package com.denejkodlj.partfinder.Fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.denejkodlj.partfinder.R;
import com.denejkodlj.partfinder.adapter.FragmentAdapter;
import com.denejkodlj.partfinder.adapter.PartsListAdapter;
import com.denejkodlj.partfinder.data.Part;
import com.denejkodlj.partfinder.data.User;

import java.util.ArrayList;
import java.util.Date;


public class PartsList extends AbstractFragment {
    private ArrayList<Part> parts;
    private Context context;
    private PartsListAdapter adapter;
    private RecyclerView recyclerView;
    private GridLayoutManager mLayoutManager;

    public interface FABListener {
        public void someEvent();
    }
    FloatingActionButton button;
    FABListener fABListener;

    public static PartsList newInstance(Context context) {
        PartsList fragment = new PartsList();
        Bundle args = new Bundle();
        fragment.setContext(context);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            fABListener = (FABListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement onSomeEventListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_of_parts, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mockParts();
        adapter = new PartsListAdapter(context,parts);
        recyclerView = (RecyclerView) getView().findViewById(R.id.recyclerView);
        mLayoutManager = new GridLayoutManager(context, 1);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);



        button = (FloatingActionButton) getView().findViewById(R.id.floatingActionButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fABListener.someEvent();
            }
        });
    }


    void mockParts(){
        parts = new ArrayList<>();

        //User vasya = new User("Вася", "Васьков", "+380 99 213 1456", "Студент, в хорошей физическо форме, могу выполнять тяжелую физическую работу");
        //User nik = new User("Николай", "Даньков", "+380 99 213 1457", "Студент, готов выполнять курьерские задание. Имею велосипед.");
        User petr = new User("Петр", "Верис", "+380 99 213 1459", "Хозяин строительного участка");

        Part courier = new Part("Доставка","Доставить ключи с Греческой на Софиевскую", 30,petr,new Date());
        Part handyman = new Part("Работа на стройке","Работа на строительном обьекте. Ройка траншей, уборка, разгрузка и погрузка материала.", 300,petr,new Date());

        parts.add(courier);
        parts.add(handyman);

    }
}