package com.example.planet_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class custom_planet_adapter extends ArrayAdapter<model_planet_class> {
    Context context;
    private ArrayList<model_planet_class> arrayList;

    public custom_planet_adapter(@NonNull Context context, ArrayList<model_planet_class> arrayList) {
        super(context, R.layout.planet_list_item,arrayList);
        this.context = context;
        this.arrayList = arrayList;
    }


    static class ViewHolder{
        ImageView img;
        TextView planet;
        TextView moons;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        model_planet_class planet_class=getItem(position);
        ViewHolder viewHolder ;
        final View result;

        if(convertView==null){
            viewHolder=new ViewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.planet_list_item,parent,false);

            viewHolder.planet=(TextView) convertView.findViewById(R.id.planet_name);
            viewHolder.img=(ImageView) convertView.findViewById(R.id.img);
            viewHolder.moons=(TextView) convertView.findViewById(R.id.moons);

            result=convertView;
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder=(ViewHolder) convertView.getTag();
            result=convertView;
        }

        viewHolder.planet.setText(planet_class.getPlanet());
        viewHolder.moons.setText(planet_class.getMoons());
        viewHolder.img.setImageResource(planet_class.getImg());

        return result;
    }
}
