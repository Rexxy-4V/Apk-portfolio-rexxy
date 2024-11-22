package com.example.portofolio.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portofolio.Domain.TrendsDomain;
import com.example.portofolio.R;

import java.util.ArrayList;

public class TrendsAdaptor extends RecyclerView.Adapter<TrendsAdaptor.ViewHolder> {
    ArrayList<TrendsDomain> items;
    Context context;

    public TrendsAdaptor(ArrayList<TrendsDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public TrendsAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context= parent.getContext();
        View inflator= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_trends,parent,false);
        return new ViewHolder(inflator);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendsAdaptor.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title,subtitel;
        ImageView pic;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.titleTxt);
            subtitel=itemView.findViewById(R.id.subtitelTxt);
            pic=itemView.findViewById(R.id.pic);
        }
    }
}
