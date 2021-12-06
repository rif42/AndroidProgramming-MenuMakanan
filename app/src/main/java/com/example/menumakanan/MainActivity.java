package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recview;

    String s1[], s2[], s3[];
    int images[] = {
        R.drawable.cordonbleu,
        R.drawable.wagyusteak,
        R.drawable.fishchips,
        R.drawable.zuppasoup,
        R.drawable.chickenyakiniku,
        R.drawable.scallop,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recview = findViewById(R.id.recview);

        s1 = getResources().getStringArray(R.array.Makanan);
        s2 = getResources().getStringArray(R.array.Description);
        s3 = getResources().getStringArray(R.array.Price);

        Food Food = new Food(this,s1,s2,s3,images);

        recview.setAdapter(Food);
        recview.setLayoutManager(new LinearLayoutManager(this));

//        TextView foodname1 = findViewById(R.id.foodname1);
//        foodname1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String food_name = s1[0];
//                String food_desc = s2[1];
//                String food_price = s3[1];
////              Integer food_image = images[1];
//
//                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//                intent.putExtra("EXTRA_NAME", food_name);
//                intent.putExtra("EXTRA_DESC", food_desc);
//                intent.putExtra("EXTRA_PRICE", food_price);
////                intent.putExtra("EXTRA_IMG", food_image);
//                startActivity(intent);
//            }
//        });
    }




}