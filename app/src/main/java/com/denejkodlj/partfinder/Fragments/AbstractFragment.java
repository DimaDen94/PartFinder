package com.denejkodlj.partfinder.Fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;


public abstract class AbstractFragment extends Fragment {
    protected Context context;
    protected View view;

    public void setContext(Context context) {
        this.context = context;
    }

}
