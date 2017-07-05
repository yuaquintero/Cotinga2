package com.sennova.cotinga;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by sennova on 13/06/2017.
 */

public class Rutas extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    RecyclerView rv;
    public static List<Rutas_constructor> rutas;
    adaptadorRutas adapter;
    private View miLayout;
    final Context contexto = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutas);
        miLayout = findViewById(R.id.lydialogo);
        rv = (RecyclerView) findViewById(R.id.lista_rutas);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rutas = new ArrayList<>();

        initializeData();
        adapter= new adaptadorRutas(rutas);
        rv.setAdapter(adapter);


        adapter.notifyDataSetChanged();

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num =rv.getChildAdapterPosition(v);
             //  String msg="se presionó  "+ Integer.toString(num);
              // Toast.makeText(Rutas.this,msg, Toast.LENGTH_SHORT).show();
                lanzarRuta(v,num);
            }
        });

    }

    public void  lanzarRuta(View view, int pos){
        Intent i = new Intent(this, Ruta_info.class);
        i.putExtra("id", pos);
        startActivity(i);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    private void initializeData(){

        rutas.add(new Rutas_constructor("La Herrera", " 1", "","3.914 Km"));
        rutas.add(new Rutas_constructor("La Salada", "  2", "","5.925 Km"));
        rutas.add(new Rutas_constructor("Verdun-Mesenia", " 3","", "24,62 Km"));
        rutas.add(new Rutas_constructor("Ventanas", " 4","", "19,75 Km"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.info, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch ( item.getItemId() )
        {
            case R.id.boton_info:{
                final Dialog dialog = new Dialog(contexto);
                dialog.setContentView(R.layout.dialogo);
                dialog.setTitle(R.string.info);
                TextView TvDialogo =(TextView) dialog.findViewById(R.id.tv_dialogo);
                TvDialogo.setText(R.string.dialogo1);
                Button botAceptar = (Button) dialog.findViewById(R.id.btDialogo);


                botAceptar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
            break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

}
