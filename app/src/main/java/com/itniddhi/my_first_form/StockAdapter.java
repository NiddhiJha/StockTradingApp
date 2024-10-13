package com.itniddhi.my_first_form;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.itniddhi.my_first_form.databinding.NewsLayoutBinding;
import com.itniddhi.my_first_form.model_class.Entity;

import java.util.ArrayList;
import java.util.List;

public class StockAdapter extends RecyclerView.Adapter<StockAdapter.ViewHolder> {

    private ArrayList<Entity> list = new ArrayList<>();

    // A function to update the list of Entity objects
    public void setData(List<Entity> list) {
        java.util.Collections.shuffle(list); // Optional: shuffle the list
        this.list = new ArrayList<>(list);
        notifyDataSetChanged(); // Notify the adapter about the data change
    }

    // ViewHolder class to hold the view of a single item in the RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {
        NewsLayoutBinding binding;

        public ViewHolder(NewsLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflating the item view layout using the NewsLayoutBinding
        NewsLayoutBinding binding = NewsLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Entity entity = list.get(position);

        holder.binding.textViewTitle.setText(entity.getName());

        holder.binding.textViewDescription.setText(String.valueOf(entity.getMatch_score()));
        holder.binding.tvSymbol.setText(String.valueOf(entity.getSymbol()));

//        holder.itemView.setOnClickListener(view -> {
//            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://example.com")); // You can use the actual URL from the entity
//            holder.itemView.getContext().startActivity(intent);
//        });
//    }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
