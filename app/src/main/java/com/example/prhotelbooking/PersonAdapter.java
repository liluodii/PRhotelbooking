package com.example.prhotelbooking;

import android.content.Context;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.MyViewHolder> {
    private Context mContext;
    private List<Customer> mData;

    public PersonAdapter(Context mContext) {
        this.mContext = mContext;
        this.mData = mData;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Customer customer=CustomerRepo.getInstance().getCustomers().get(position);
        final Intent intent = new Intent(mContext,MovieList.class);
        holder.tvname.setText(mData.get(position).getFirstname());
        holder.userimage.setImageResource(mData.get(position).getImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                intent.putExtra("Firstname",mData.get(position).getFirstname());
                intent.putExtra("Lastname",mData.get(position).getLastname());
                intent.putExtra("Username",mData.get(position).getUsername());
                intent.putExtra("gender",mData.get(position).gender);
                intent.putExtra("Image",mData.get(position).getImage());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return CustomerRepo.getInstance().getCustomers().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvname;
        ImageView userimage;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname= (TextView) itemView.findViewById(R.id.Name);
            userimage= (ImageView) itemView.findViewById(R.id.personimg);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }
}
