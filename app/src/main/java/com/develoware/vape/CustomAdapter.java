package com.develoware.vape;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter <CustomAdapter.CustomViewHolder> {

    private ArrayList<Product> productArrayList;
    private Context context;

    public CustomAdapter(ArrayList<Product> productArrayList, Context context) {
        this.productArrayList = productArrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_item, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        //Glide.with(holder.itemView)
        //        .load(productArrayList.get(position).getProfile())
        //        .into(holder.iv_profile);
        holder.product_name.setText(String.valueOf(productArrayList.get(position).get_product_name()));
        holder.product_price.setText(String.valueOf(productArrayList.get(position).get_product_price()));
    }

    @Override
    public int getItemCount() {
        return (productArrayList != null ? productArrayList.size() : 0);
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView product_name, product_price;

        public CustomViewHolder (@NonNull View itemView) {
            super(itemView);

            this.product_name = itemView.findViewById(R.id.product_name);
            this.product_price = itemView.findViewById(R.id.product_price);
        }
    }
}
