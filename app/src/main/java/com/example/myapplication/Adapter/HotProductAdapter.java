package com.example.myapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.Models.HotProduct;

import java.util.List;

public class HotProductAdapter extends RecyclerView.Adapter<HotProductAdapter.HotProductViewHoder> {

    List<HotProduct> list;

    public HotProductAdapter(List<HotProduct> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public HotProductViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_intro_hot_product, parent, false);
        return new HotProductViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotProductViewHoder holder, int position) {
        HotProduct obj = list.get(position);
        if (obj == null) {
            return;
        }
        holder.img.setImageResource(obj.getResourceId());
        holder.title.setText(obj.getTitleHotProduct());
    }

    @Override
    public int getItemCount() {
        if (list != null) return list.size();
        return 0;
    }

    public static class HotProductViewHoder extends RecyclerView.ViewHolder {
        private final TextView title;
        private final ImageView img;

        public HotProductViewHoder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_hot_product);
            img = itemView.findViewById(R.id.img_hot_product);
        }
    }

}
