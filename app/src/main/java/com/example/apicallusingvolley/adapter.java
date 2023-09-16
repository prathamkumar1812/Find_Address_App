package com.example.apicallusingvolley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.adapterViewholder> {
      public Context context;
      public List<address>addresses;


    public adapter(Context context, List<address> addresses) {
        this.context = context;
        this.addresses = addresses;
    }

    @NonNull
    @Override
    public adapterViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.listofaddress,parent,false);
        return new adapterViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterViewholder holder, int position) {
        address address1= addresses.get(position);
        holder.Name.setText(address1.Name);
        holder.state.setText(address1.State);

    }

    @Override
    public int getItemCount() {
        return addresses.size();
    }

    class adapterViewholder extends RecyclerView.ViewHolder{
     TextView Name,state;
        public adapterViewholder(@NonNull View itemView) {
            super(itemView);
            Name=itemView.findViewById(R.id.Name);
            state=itemView.findViewById(R.id.state);

        }
    }

}
