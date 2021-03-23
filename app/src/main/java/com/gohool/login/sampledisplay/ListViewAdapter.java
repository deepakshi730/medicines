package com.gohool.login.sampledisplay;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    Context mcontext;
    LayoutInflater inflater;
    List<ItemsModel> itemsModels;
    ArrayList<ItemsModel> arrayList;

    public ListViewAdapter(Context context, List<ItemsModel> itemsModels) {
        mcontext = context;
        this.itemsModels = itemsModels;
        inflater = LayoutInflater.from(context);
        this.arrayList = new ArrayList<ItemsModel>();
        this.arrayList.addAll(itemsModels);
    }

    public  class ViewHolder{
        TextView name;
        ImageView img;
    }

    @Override
    public int getCount() {
        return itemsModels.size();
    }

    @Override
    public Object getItem(int position) {
        return itemsModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.medicine_categories,null);

            holder.name = convertView.findViewById(R.id.categories_name);
            holder.img = convertView.findViewById(R.id.categories_image);

            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.name.setText(itemsModels.get(position).getName());
        holder.img.setImageResource(itemsModels.get(position).getImg());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(itemsModels.get(position).getName().equals("Anti Diabetic"))
                {
                    Toast.makeText(mcontext, "Anti Diabetic", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(mcontext, AntiDiabetic_ayurvedic.class);
                    mcontext.startActivity(i);
                }
                if(itemsModels.get(position).getName().equals("Blood Pressure"))
                {
                    Toast.makeText(mcontext, "Blood Pressure", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(mcontext, Blood_pressure_ayurvedic.class);
                    mcontext.startActivity(i);
                }
                if(itemsModels.get(position).getName().equals("Pain Killer"))
                {
                    Toast.makeText(mcontext, "Pain Killer", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(mcontext, Pain_killer_ayurvedic.class);
                    mcontext.startActivity(i);
                }
            }
        });

        return convertView;
    }

    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        itemsModels.clear();
        if(charText.length()==0){
            itemsModels.addAll(arrayList);
        }
        else {
            for(ItemsModel itemsModel : arrayList){
                if(itemsModel.getName().toLowerCase(Locale.getDefault()).contains(charText)){
                    itemsModels.add(itemsModel);
                }
            }
        }
        notifyDataSetChanged();
    }

}
