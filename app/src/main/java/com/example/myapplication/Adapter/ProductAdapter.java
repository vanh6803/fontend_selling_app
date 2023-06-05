package com.example.myapplication.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.Activities.ProductDetailActivity;
import com.example.myapplication.Models.Product;
import com.example.myapplication.R;
import com.example.myapplication.utils.Config;

import java.text.DecimalFormat;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private final List<Product> list;
    private final Context context;

    public ProductAdapter(List<Product> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product obj = list.get(position);
        if (obj == null) {
            return;
        }

        Glide.with(context).load(obj.getImage().replace("localhost", Config.LOCALHOST)).error(R.drawable.baseline_image_24).into(holder.imgProduct);

        holder.tvNameProduct.setText(obj.getName());
        DecimalFormat format = new DecimalFormat("###,###,###");
        String formatPrice = format.format(obj.getPrice()) + " đ";
        holder.tvPriceProduct.setText(formatPrice);

        holder.itemClickProduct.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), ProductDetailActivity.class);
            intent.putExtra("product", String.valueOf(list.get(holder.getAdapterPosition())));
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {

        private final CardView itemClickProduct;
        private final ImageView imgProduct;
        private final TextView tvNameProduct;
        private final TextView tvPriceProduct;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProduct = itemView.findViewById(R.id.img_product);
            tvNameProduct = itemView.findViewById(R.id.tv_name_product);
            tvPriceProduct = itemView.findViewById(R.id.tv_price_product);
            itemClickProduct = itemView.findViewById(R.id.item_click_product);
        }
    }
}
