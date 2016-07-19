package com.example.cristian.myapplication.presenters;


public interface IMascotaRVFragmentPresenter {

    public void obtenerMascotasBD();

    public void mostrarMascotasRV();

    public void obtenerRecientesAPI(String UserID);

    public void obtenerUsuariosAPI();

    public void registrarLikeBtn();

    public void registrarLikeAPI(String idFotoInstagram);
}
