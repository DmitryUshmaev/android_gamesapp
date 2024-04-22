package com.example.gamesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<GameModel> gamesList;
    RecyclerView recyclerView;

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        gamesList = new ArrayList<>();
        gamesList.add(new GameModel("Horizon chase", R.drawable.card1));
        gamesList.add(new GameModel("PUBG", R.drawable.card2));
        gamesList.add(new GameModel("Head Ball 2", R.drawable.card3));
        gamesList.add(new GameModel("Hooked on You", R.drawable.card4));
        gamesList.add(new GameModel("Fifa 2022", R.drawable.card5));
        gamesList.add(new GameModel("Fortnite", R.drawable.card6));

        adapter = new MyAdapter(getApplicationContext(), gamesList);

        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}