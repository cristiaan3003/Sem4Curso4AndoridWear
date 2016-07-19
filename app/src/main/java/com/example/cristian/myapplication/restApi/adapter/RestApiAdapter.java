package com.example.cristian.myapplication.restApi.adapter;

import com.example.cristian.myapplication.restApi.ConstantesRestApi;
import com.example.cristian.myapplication.restApi.EndpointsApi;
import com.example.cristian.myapplication.restApi.deserializador.MascotaDeserialRecentMedia;
import com.example.cristian.myapplication.restApi.deserializador.MascotaDeserialUsersFollows;
import com.example.cristian.myapplication.restApi.deserializador.MediaLikeDeserial;
import com.example.cristian.myapplication.restApi.deserializador.RelationshipDeserial;
import com.example.cristian.myapplication.restApi.model.MascotaResponse;
import com.example.cristian.myapplication.restApi.model.MediaLikeResponse;
import com.example.cristian.myapplication.restApi.model.RelationshipResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RestApiAdapter {

    public EndpointsApi conexionRestApi(Gson gson){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit.create(EndpointsApi.class);
    }

    public EndpointsApi conexionRestApi(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(EndpointsApi.class);
    }

    public Gson gsonDeserialRecentMedia(){

        GsonBuilder gsonBuilder = new GsonBuilder()
                .registerTypeAdapter(MascotaResponse.class, new MascotaDeserialRecentMedia());

        return gsonBuilder.create();

    }

    public Gson gsonDeserialUsersFollows(){
        GsonBuilder gsonBuilder = new GsonBuilder()
                .registerTypeAdapter(MascotaResponse.class,new MascotaDeserialUsersFollows());

        return gsonBuilder.create();
    }

    public Gson gsonDeserialSetLikeMedia(){
        GsonBuilder gsonBuilder = new GsonBuilder()
                .registerTypeAdapter(MediaLikeResponse.class,new MediaLikeDeserial());

        return gsonBuilder.create();
    }

    public Gson gsonDeserialRelationship(){
        GsonBuilder gsonBuilder = new GsonBuilder()
                .registerTypeAdapter(RelationshipResponse.class, new RelationshipDeserial());
        return gsonBuilder.create();
    }

}
