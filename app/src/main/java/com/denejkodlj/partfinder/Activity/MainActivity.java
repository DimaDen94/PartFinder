package com.denejkodlj.partfinder.Activity;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.denejkodlj.partfinder.R;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void initNavigationView(){
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

    }
}