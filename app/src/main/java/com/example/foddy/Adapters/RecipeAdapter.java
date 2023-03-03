package com.example.foddy.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foddy.Models.RecipeModel;
import com.example.foddy.R;
import com.example.foddy.ScrollingActivity;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.viewHolder> {

    ArrayList<RecipeModel> list;
    Context context;

    public RecipeAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent , int viewType ) {

        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview , parent ,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        RecipeModel model = list.get(position);

        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());

        switch (position) {
            case 0:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
//                        Toast.makeText(context, "Image one clicked", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(context, ScrollingActivity.class);
                        intent.putExtra("title1",model.getText());
                        intent.putExtra("img",model.getPic());
                        context.startActivity(intent);

                    }
                });

                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Burger is on your way", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 1:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       // Toast.makeText(context, "Image Two clicked", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(context, ScrollingActivity.class);
                        intent.putExtra("title1",model.getText());
                        intent.putExtra("img",model.getPic());
                        context.startActivity(intent);
                    }
                });

                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Pizza is on your way", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 2:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Image Third clicked", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(context, ScrollingActivity.class);
                        intent.putExtra("title1",model.getText());
                        intent.putExtra("img",model.getPic());
                        context.startActivity(intent);
                    }
                });

                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Burger is on your way", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 3:
                holder.imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Image Four clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Burger is on your way", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            default:
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);

        }
    }
}
