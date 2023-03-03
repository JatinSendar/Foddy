package com.example.foddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.foddy.Adapters.RecipeAdapter;
import com.example.foddy.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList <RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.food1 , "Burger"));
        list.add(new RecipeModel(R.drawable.food2 , "Pizza"));
        list.add(new RecipeModel(R.drawable.food3 , "Burger & Fires"));
        list.add(new RecipeModel(R.drawable.food4 , "Pizza"));
        list.add(new RecipeModel(R.drawable.food5 , "FastFood"));
        list.add(new RecipeModel(R.drawable.food6 , "Fired Rise"));
        list.add(new RecipeModel(R.drawable.food7 , "Paneer Tikka"));
        list.add(new RecipeModel(R.drawable.food8 , "Burger"));
        list.add(new RecipeModel(R.drawable.food9 , "Burger"));
        list.add(new RecipeModel(R.drawable.food1 , "Burger"));
        list.add(new RecipeModel(R.drawable.food2 , "Pizza"));
        list.add(new RecipeModel(R.drawable.food3 , "Burger"));
        list.add(new RecipeModel(R.drawable.food4 , "Burger"));
        list.add(new RecipeModel(R.drawable.food5 , "Burger"));
        list.add(new RecipeModel(R.drawable.food6 , "Burger"));
        list.add(new RecipeModel(R.drawable.food7 , "Burger"));
        list.add(new RecipeModel(R.drawable.food8 , "Burger"));
        list.add(new RecipeModel(R.drawable.food9 , "Burger"));

        RecipeAdapter adapter = new RecipeAdapter(list, this);
        recyclerView.setAdapter(adapter);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
//         recyclerView.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);



    }
}