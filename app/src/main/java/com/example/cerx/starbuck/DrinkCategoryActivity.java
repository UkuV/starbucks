package com.example.cerx.starbuck;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class DrinkCategoryActivity extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDrinks = getListView();

        ArrayAdapter<Drinks> listAdapter = new ArrayAdapter<Drinks>(this, android.R.layout.simple_list_item_1, Drinks.drinks);
        listDrinks.setAdapter(listAdapter);
    }
        public void onListItemClick(ListView listView,View itemView, int postition, long id){
        if (postition == 1){
            Intent intent = new Intent(DrinkCategoryActivity.this,DrinkActivity.class);
            startActivity(intent);
        }
        else if (postition == 0){
            Intent intent = new Intent(DrinkCategoryActivity.this,LatteActivity.class);
            startActivity(intent);
        }
        else if (postition == 2){
            Intent intent = new Intent(DrinkCategoryActivity.this,FilterActivity.class);
            startActivity(intent);
        }
        }
    }

