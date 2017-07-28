package com.denejkodlj.partfinder.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.denejkodlj.partfinder.R;
import com.denejkodlj.partfinder.data.Part;

import java.security.PrivilegedAction;
import java.util.List;

/**
 * Created by Dmitry on 28.07.2017.
 */

public class PartsListAdapter extends  RecyclerView.Adapter<PartsListAdapter.MyViewHolder> {

    private List<Part> parts;
    private Context mContext;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView logo;
        public TextView title;
        public TextView description;
        public TextView price;

        public MyViewHolder(View view) {
            super(view);
            logo = (ImageView) view.findViewById(R.id.parts_logo);
            title = (TextView) view.findViewById(R.id.parts_title);
            description = (TextView) view.findViewById(R.id.parts_description);
            price = (TextView) view.findViewById(R.id.price);
        }
    }
    public PartsListAdapter(Context context, List<Part> parts){
        mContext = context;
        this.parts = parts;
    }

    @Override
    public void onBindViewHolder(PartsListAdapter.MyViewHolder holder, int position) {
        Part part = parts.get(position);

        holder.title.setText(part.getTitle());
        holder.description.setText(part.getDescription());
        holder.price.setText(String.valueOf(part.getPrice()));
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public int getItemCount() {
        return parts.size();
    }
}
