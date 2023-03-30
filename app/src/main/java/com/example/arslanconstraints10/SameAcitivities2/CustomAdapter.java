package com.example.arslanconstraints10.SameAcitivities2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.arslanconstraints10.R;
import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private Context context;
    private ArrayList<ModelCardView> items;

    public CustomAdapter(Context context, ArrayList<ModelCardView> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.items_credtcard, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.item_date.setText(items.get(position).getItem_date());
        holder.item_ccard.setText(items.get(position).getItem_ccard());
        holder.itemName.setText(items.get(position).getItemName());

        //this is for card view color chjange now showing u main and items
        if(position==1)
            holder.card_view.setBackgroundColor(Color.parseColor("#3558D5"));

        if(position==2)
            holder.card_view.setBackgroundColor(Color.parseColor("#FFBD12"));
            // notifyDataSetChanged(); // We do not need this line

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private TextView item_date,itemName,item_ccard;
        CardView card_view;

        public CustomViewHolder(View view) {
            super(view);
            card_view=view.findViewById(R.id.card_view);
            item_date = view.findViewById(R.id.item_date);
            item_ccard = view.findViewById(R.id.item_ccard);
            itemName = view.findViewById(R.id.itemName);
        }
    }

    public interface Data
    {
        public void getData(String a,String b,String c);
    }
}