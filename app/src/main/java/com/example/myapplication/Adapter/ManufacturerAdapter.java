package com.example.myapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Models.Manufacturer;
import com.example.myapplication.R;

import java.util.List;

public class ManufacturerAdapter extends RecyclerView.Adapter<ManufacturerAdapter.ManufacturerViewHolder> {

    private final List<Manufacturer> list;

    public ManufacturerAdapter(List<Manufacturer> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ManufacturerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_manufacturer, parent, false);
        return new ManufacturerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ManufacturerViewHolder holder, int position) {
        Manufacturer obj = list.get(position);
        if (obj == null) {
            return;
        }
        holder.name.setText(obj.getName());
    }

    @Override
    public int getItemCount() {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static class ManufacturerViewHolder extends RecyclerView.ViewHolder{

        private final TextView name;

        public ManufacturerViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name_manufacturer);
        }
    }

}
