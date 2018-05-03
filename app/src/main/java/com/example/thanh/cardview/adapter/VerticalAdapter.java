package com.example.thanh.cardview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thanh.cardview.R;
import com.example.thanh.cardview.pojos.SingleHorizontal;
import com.example.thanh.cardview.pojos.SingleVertical;

import java.util.ArrayList;

/**
 * Created by thanh on 4/27/2018.
 */

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.MyViewHolder> {
    ArrayList<SingleVertical> data = new ArrayList<>();

    public VerticalAdapter(ArrayList<SingleVertical> data) {
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_single_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.description.setText(data.get(position).getSubHeader());
        holder.title.setText(data.get(position).getHeader());
        holder.image.setImageResource(data.get(position).getImage());
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, description;
        ImageView image;
        public MyViewHolder(View itemView){
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);
            image = (ImageView) itemView.findViewById(R.id.image_view);

        }
    }
}
