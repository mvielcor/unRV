package pmdm.manel.unrv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by profesor on 18/12/2018.
 */

public class ElMeuPrimerAdaptador extends RecyclerView.Adapter<ElMeuPrimerAdaptador.ElViewHolder> {
    ArrayList<CicleFlorida> llistatCicles;

    public ElMeuPrimerAdaptador(ArrayList<CicleFlorida> llista){
       llistatCicles=llista;
    }

    public static class ElViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitol,tvDescripcio;

        public ElViewHolder(View itemView) {
            super(itemView);
            tvTitol= (TextView) itemView.findViewById(R.id.tv_titol);
            tvDescripcio = (TextView) itemView.findViewById(R.id.tv_descripcio);
        }
    }

    @Override
    public ElViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.un_element_de_la_llista,parent,false);
        return new ElViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ElViewHolder holder, int position) {
        holder.tvTitol.setText(llistatCicles.get(position).getTitol());
        holder.tvDescripcio.setText(llistatCicles.get(position).getDescripcio());

    }

    @Override
    public int getItemCount() {
        return llistatCicles.size();
    }





}
