package com.example.cristian.myapplication.activities;

import com.example.cristian.myapplication.adapters.MascotaAdapter;
import com.example.cristian.myapplication.pojo.Mascota;

import java.util.ArrayList;


public interface IPerfilUsuarioActivity {
    public void generarLLVertical();

    public MascotaAdapter crearAdaptador (ArrayList<Mascota> mascotas);

    public void inicMascotaAdapter (MascotaAdapter mascotaAdapter);
}
