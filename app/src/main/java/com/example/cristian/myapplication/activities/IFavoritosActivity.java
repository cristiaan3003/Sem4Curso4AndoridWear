package com.example.cristian.myapplication.activities;

import com.example.cristian.myapplication.adapters.MascotaAdapterFav;
import com.example.cristian.myapplication.pojo.Mascota;

import java.util.ArrayList;


public interface IFavoritosActivity {

    public void generarLLVertical();

    public MascotaAdapterFav crearAdaptador (ArrayList<Mascota> mascotas);

    public void inicMascotaAdapter (MascotaAdapterFav mascotaAdapter);

}
