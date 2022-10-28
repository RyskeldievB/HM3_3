package com.example.recyclerview3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberViewHolder extends RecyclerView.ViewHolder {
private TextView name;
    public NumberViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.textview);
    }

    public void bind(String s) {
        name.setText(s);
    }
}
