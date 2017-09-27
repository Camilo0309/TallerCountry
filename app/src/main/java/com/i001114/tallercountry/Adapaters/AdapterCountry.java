package com.i001114.tallercountry.Adapaters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.i001114.tallercountry.Models.Country;
import com.i001114.tallercountry.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CAMILO on 26/09/2017.
 */

public class AdapterCountry extends RecyclerView.Adapter<AdapterCountry.ViewHolder> {

    List<Country> countryList = new ArrayList<>();
    Context context;
    // Constructor de la clase
    public AdapterCountry(List<Country> countryList, Context context) {
        this.countryList = countryList;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
// Configuracion del ViewAdapter
// Obtener la vista (item.xml)
        View item2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2, parent, false);
// Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item2);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
// Encargado de trabajar con el item.xml y sus componentes
        holder.textViewName.setText(countryList.get(position).getName());
        holder.textViewCapital.setText(countryList.get(position).getCapital());
        holder.textViewAlphs.setText(countryList.get(position).getAlphacode());
        holder.textViewRegion.setText(countryList.get(position).getRegion());
        holder.textViewTimeZone.setText(countryList.get(position).getTimezones());



    }
    @Override
    public int getItemCount() {
        return countryList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewName;
        TextView textViewCapital;
        TextView textViewAlphs;
        TextView textViewRegion;
        TextView textViewTimeZone;

        public ViewHolder(View item2) {
            super(item2);
            textViewName = (TextView) item2.findViewById(R.id.id_tv_item_namecountry);
            textViewCapital = (TextView) item2.findViewById(R.id.id_tv_item_namecapital);
            textViewAlphs = (TextView) item2.findViewById(R.id.id_tv_item_nameabbreviation);
            textViewRegion = (TextView) item2.findViewById(R.id.id_tv_item_ubicacion);
            textViewTimeZone = (TextView) item2.findViewById(R.id.id_tv_item_Zonahoraria);
        }
    }

}
