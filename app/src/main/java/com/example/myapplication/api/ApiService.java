package com.example.myapplication.api;

import com.example.myapplication.Models.Manufacturer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();

    ApiService apiService = new Retrofit.Builder()
            .baseUrl("http://192.168.1.14:8080/api/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService.class);

    @GET("manufacturer")
    Call<List<Manufacturer>> getListManufacturers();
}