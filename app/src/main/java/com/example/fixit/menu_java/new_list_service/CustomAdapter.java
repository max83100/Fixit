package com.example.fixit.menu_java.new_list_service;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fixit.R;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> implements Filterable {
    ArrayList<DBData> objDBData;
    Intent intent;

    private List<DBData> exampleListFull ;


    public CustomAdapter(ArrayList<DBData> objDBData) {
        this.objDBData = objDBData;
        exampleListFull = new ArrayList<>(objDBData);

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View singleRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.service_list,parent,false);
        return new MyViewHolder(singleRow);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    DBData objData = objDBData.get(position);
    holder.city_name.setText(objData.getCity_name());
    holder.company_name.setText(objData.getCompany_name());
    holder.company_name.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(!objData.getWeb().equals("отсутствует")) {
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(objData.getWeb()));
                v.getContext().startActivity(CustomAdapter.this.intent);
            }
            else {
                Toast.makeText(v.getContext(), "У компании отсутствует сайт", Toast.LENGTH_SHORT).show();
            }
        }
    });
    holder.map_name.setText(objData.getMap_name());
        holder.map_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:" + objData.getGeo()));
                v.getContext().startActivity(intent);

            }
        });

    holder.phone.setText(objData.getPhone());
        holder.phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + objData.getPhone()));
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return objDBData == null ? 0 : objDBData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView city_name;
        TextView company_name;
        TextView map_name;
        TextView phone;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            city_name = itemView.findViewById(R.id.city_name);
            company_name = itemView.findViewById(R.id.company_name);
            map_name = itemView.findViewById(R.id.map_name);
            phone = itemView.findViewById(R.id.phone);

        }
    }
    public Filter getFilter() {
        return exampleFilter;
    }

    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<DBData> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(exampleListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (DBData item : exampleListFull) {
                    if (item.getCity_name().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            objDBData.clear();
            objDBData.addAll((List)results.values);
            notifyDataSetChanged();
        }
    };

}