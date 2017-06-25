package com.denejkodlj.partfinder.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.denejkodlj.partfinder.Fragments.AbstractFragment;
import com.denejkodlj.partfinder.Fragments.MyPage;
import com.denejkodlj.partfinder.Fragments.PartsList;
import com.denejkodlj.partfinder.Fragments.UserPage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dmitry on 25.06.2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    private Map<Integer, AbstractFragment> tabs;
    private Context context;

    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        tabs  = new HashMap<>();
        tabs.put(0, MyPage.newInstance(context));
        tabs.put(1, PartsList.newInstance(context));
        tabs.put(2, UserPage.newInstance(context));
    }

    @Override
    public Fragment getItem(int position) {

        return tabs.get(position);

    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
