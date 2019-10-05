package com.example.todolist.main;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdapter
        extends RecyclerView.Adapter<MainAdapter.MainAdapterViewHolder> {

    

    public static class MainAdapterViewHolder
            extends RecyclerView.ViewHolder {

        public MainAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    @NonNull
    @Override
    public MainAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
