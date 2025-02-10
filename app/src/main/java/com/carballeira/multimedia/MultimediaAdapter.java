package com.carballeira.multimedia;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MultimediaAdapter extends RecyclerView.Adapter<MultimediaAdapter.MultimediaViewHolder> {
    @NonNull
    @Override
    public MultimediaAdapter.MultimediaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MultimediaAdapter.MultimediaViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MultimediaViewHolder extends RecyclerView.ViewHolder{

        public MultimediaViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
