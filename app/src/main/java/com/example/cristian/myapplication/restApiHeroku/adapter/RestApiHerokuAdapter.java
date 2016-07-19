package com.example.cristian.myapplication.restApiHeroku.adapter;


import com.example.cristian.myapplication.restApiHeroku.ConstantesRestApiHeroku;
import com.example.cristian.myapplication.restApiHeroku.EndpointsHeroku;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RestApiHerokuAdapter {

    public EndpointsHeroku conexionRestAPIHeroku(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApiHeroku.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                ;
        return retrofit.create(EndpointsHeroku.class);
    }
}
