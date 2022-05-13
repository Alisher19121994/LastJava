package com.example.lastjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class Chat_Adapter_RecyclerView extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<ContactLists> list;

    public Chat_Adapter_RecyclerView(Context context, ArrayList<ContactLists> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_items, parent, false);
        return new MyViews(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ContactLists contactLists = list.get(position);
        if (holder instanceof MyViews) {
            ((MyViews) holder).shapeableImageView.setImageResource(contactLists.profile);
            ((MyViews) holder).textView1.setText(contactLists.fullname);
            ((MyViews) holder).textView2.setText(contactLists.online);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViews extends RecyclerView.ViewHolder {
        ShapeableImageView shapeableImageView;
        TextView textView1;
        TextView textView2;

        public MyViews(@NonNull View itemView) {
            super(itemView);
            shapeableImageView = itemView.findViewById(R.id.iv_profile);
            textView1 = itemView.findViewById(R.id.fullname);
            textView2 = itemView.findViewById(R.id.tv_count_online);
        }
    }
}
