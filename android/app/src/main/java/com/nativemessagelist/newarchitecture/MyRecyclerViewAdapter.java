package com.nativemessagelist.newarchitecture;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.nativemessagelist.R;
import java.util.List;


public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private List<Movies> mData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    private Context context;

    // data is passed into the constructor
    MyRecyclerViewAdapter(Context context, List<Movies> data) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.context = context;
    }

    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_message, parent, false);
        this.context = parent.getContext();

        return new ViewHolder(view);
    }

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Movies movie = mData.get(position);
        holder.textViewMovieName.setText(movie.getName());
        holder.textViewDirectorName.setText(movie.getDirector());
        holder.textViewYear.setText(""+movie.getYear());



        Glide
                .with(holder.imageView.getContext())
                .load(movie.getImage())
                .into(holder.imageView);



    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mData.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textViewMovieName;
        TextView textViewDirectorName;
        TextView textViewYear;
        ImageView imageView;

        ViewHolder(View itemView) {
            super(itemView);
            textViewMovieName = itemView.findViewById(R.id.textViewMovieName);
            textViewDirectorName = itemView.findViewById(R.id.textViewDirectorName);
            textViewYear = itemView.findViewById(R.id.textViewYear);
            imageView = itemView.findViewById(R.id.imageView);



            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    Movies getItem(int id) {
        return mData.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}