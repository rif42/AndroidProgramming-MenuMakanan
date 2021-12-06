package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String d_foodname_extra = intent.getStringExtra("EXTRA_NAME");
        String d_fooddesc_extra = intent.getStringExtra("EXTRA_DESC");
        String d_foodprice_extra = intent.getStringExtra("EXTRA_PRICE");
        String d_foodimage_extra = intent.getStringExtra("EXTRA_IMG");

        TextView d_foodname = findViewById(R.id.d_foodname);
        TextView d_fooddesc = findViewById(R.id.d_fooddesc);
        TextView d_foodprice = findViewById(R.id.d_foodprice);
        ImageView d_foodimage = findViewById(R.id.d_img);
        Bundle bundle = intent.getExtras();
        Integer EXTRA_IMG = bundle.getInt("EXTRA_IMG");

        d_foodname.setText(d_foodname_extra);
        d_fooddesc.setText(d_fooddesc_extra);
        d_foodprice.setText(d_foodprice_extra);
        d_foodimage.setImageResource(EXTRA_IMG);
    }
}