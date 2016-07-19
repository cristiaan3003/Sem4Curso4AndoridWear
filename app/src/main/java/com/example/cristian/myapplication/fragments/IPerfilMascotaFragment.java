package com.example.cristian.myapplication.fragments;


import com.example.cristian.myapplication.adapters.MiMascotaAdapter;
import com.example.cristian.myapplication.pojo.Mascota;

import java.util.ArrayList;


public interface IPerfilMascotaFragment {

    public void generarGridLayout();

    public MiMascotaAdapter crearAdaptadorMiMascota (ArrayList<Mascota> mascotas);

    public void inicMiMascotaAdapter (MiMascotaAdapter miMascotaAdapter);

    public void datosMiMascota (Mascota mascotaPerfil);
}
