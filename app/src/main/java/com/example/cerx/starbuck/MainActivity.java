package com.example.cerx.starbuck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View v, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(MainActivity.this,DrinkCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };
        ListView listView =(ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }

}
