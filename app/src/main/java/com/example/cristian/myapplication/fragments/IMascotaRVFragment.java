package com.example.cristian.myapplication.fragments;

import com.example.cristian.myapplication.adapters.MascotaAdapter;
import com.example.cristian.myapplication.pojo.Mascota;

import java.util.ArrayList;


public interface IMascotaRVFragment {

    public void generarLLVertical();

    public MascotaAdapter crearAdaptador (ArrayList<Mascota> mascotas);

    public void inicMascotaAdapter (MascotaAdapter mascotaAdapter);
}
