package com.andreas.aplikasisederhanadicoding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class MotorAdapter extends RecyclerView.Adapter<MotorAdapter.ListViewHolder> {
    private ArrayList<MotorClass> listMotor;
    public MotorAdapter(ArrayList<MotorClass>listMotor){
        this.listMotor = listMotor;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_motor,parent,false);
        return new ListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        MotorClass motorClass = listMotor.get(position);
        Glide.with(holder.itemView.getContext())
                .load(motorClass.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvItemNamaMotor.setText(motorClass.getNama());
        holder.tvItemMerkMotor.setText(motorClass.getMerk());
        holder.tvItemCcMotor.setText(motorClass.getCc());

    }

    @Override
    public int getItemCount() {
        return listMotor.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvItemNamaMotor,tvItemMerkMotor,tvItemCcMotor;
        public ListViewHolder(View itemview){
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.imgItemMotor);
            tvItemNamaMotor = itemview.findViewById(R.id.tvItemNamaMotor);
            tvItemMerkMotor = itemview.findViewById(R.id.tvItemMerkMotor);
            tvItemCcMotor = itemview.findViewById(R.id.tvItemCcMotor);
        }
    }
}
