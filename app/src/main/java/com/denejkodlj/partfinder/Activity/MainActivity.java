package com.denejkodlj.partfinder.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.denejkodlj.partfinder.Fragments.MyPage;
import com.denejkodlj.partfinder.Fragments.PartsList;
import com.denejkodlj.partfinder.Fragments.UserPage;
import com.denejkodlj.partfinder.R;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    MyPage fragmentMyPage;
    PartsList fragmentPartsList;
    UserPage fragmentUserPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void initNavigationView(){
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

    }
}
