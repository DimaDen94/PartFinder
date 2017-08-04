package com.denejkodlj.partfinder.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import com.denejkodlj.partfinder.Fragments.Form;
import com.denejkodlj.partfinder.Fragments.MyPage;
import com.denejkodlj.partfinder.Fragments.PartsList;
import com.denejkodlj.partfinder.Fragments.UserPage;
import com.denejkodlj.partfinder.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, PartsList.FABListener {


    //fragments
    private MyPage fragmentMyPage;
    private PartsList fragmentPartsList;
    private Form fragmentForm;

    private int contId = R.id.container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initNavigationView();
        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();

        fragmentMyPage = MyPage.newInstance(this);
        fragmentPartsList = PartsList.newInstance(this);
        fragmentForm = Form.newInstance(this);


        fTrans.add(R.id.container, fragmentMyPage).commit();

    }

    void initNavigationView() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();
        Log.i("inform","on navigation");
        switch (item.getItemId()) {
            case R.id.myPage:
                Log.i("inform","case");
                fTrans.replace(contId, fragmentMyPage).commit();
                break;
            case R.id.parts:
                fTrans.replace(R.id.container, fragmentPartsList).commit();
                break;
        }
        return true;
    }

    @Override
    public void someEvent() {
        FragmentTransaction fTrans = getSupportFragmentManager().beginTransaction();
        fTrans.replace(contId, fragmentForm).commit();
    }
}
