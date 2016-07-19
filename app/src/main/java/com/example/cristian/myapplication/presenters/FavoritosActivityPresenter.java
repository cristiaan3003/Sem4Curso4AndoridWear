package com.example.cristian.myapplication.presenters;

import android.content.Context;

import com.example.cristian.myapplication.activities.IFavoritosActivity;
import com.example.cristian.myapplication.db.ConstructorMascotas;
import com.example.cristian.myapplication.pojo.Mascota;

import java.util.ArrayList;


public class FavoritosActivityPresenter implements IFavoritosActivityPresenter {

    private IFavoritosActivity iFavoritosActivity;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> topMascotas;

    public FavoritosActivityPresenter(IFavoritosActivity iFavoritosActivity, Context context) {
        this.iFavoritosActivity = iFavoritosActivity;
        this.context = context;
        obtenerTopMascotasBD();
    }

    @Override
    public void obtenerTopMascotasBD() {
        constructorMascotas = new ConstructorMascotas(context);
        topMascotas = constructorMascotas.obtenerTopMascotas();
        mostrarTopMascotasRV();
    }

    @Override
    public void mostrarTopMascotasRV() {
        iFavoritosActivity.inicMascotaAdapter(iFavoritosActivity.crearAdaptador(topMascotas));
        iFavoritosActivity.generarLLVertical();
    }
}
