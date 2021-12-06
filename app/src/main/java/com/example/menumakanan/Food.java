package com.example.menumakanan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class Food extends RecyclerView.Adapter<Food.MyViewHolder> {

    Context context;
    String data1[];
    String data2[];
    String data3[];
    int images[];

    public Food(MainActivity ct, String[] s1, String[] s2, String[] s3, int[] img){
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.myrow, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.foodname.setText(data1[position]);
        holder.fooddesc.setText(data2[position]);
        holder.foodprice.setText(data3[position]);
        holder.foodimg.setImageResource(images[position]);
    
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String food_name = data1[position];
                String food_desc = data2[position];
                String food_price = data3[position];
                Integer food_image = images[position];
                Intent intent = new Intent(v.getContext(), MainActivity2.class);
                intent.putExtra("EXTRA_NAME", food_name);
                intent.putExtra("EXTRA_DESC", food_desc);
                intent.putExtra("EXTRA_PRICE", food_price);
                intent.putExtra("EXTRA_IMG", food_image);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView foodname, fooddesc, foodprice;
        ImageView foodimg;
        ConstraintLayout itemView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            foodname = itemView.findViewById(R.id.foodname1);
            fooddesc = itemView.findViewById(R.id.fooddesc1);
            foodprice= itemView.findViewById(R.id.foodprice1);
            foodimg = itemView.findViewById(R.id.foodimg1);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.ConstraintLayout2);
        }
    }
}
