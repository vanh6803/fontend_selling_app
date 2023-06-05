package com.example.myapplication.api;

import com.example.myapplication.Models.ApiResponseManufacturer;
import com.example.myapplication.Models.ApiResponseProduct;
import com.example.myapplication.utils.Config;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface ApiService {

    Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();

    ApiService apiService = new Retrofit.Builder()
            .baseUrl("http://"+ Config.LOCALHOST+":"+Config.PORT+"/api/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService.class);

    //todo: get manufacturer
    @GET("manufacturer")
    Call<ApiResponseManufacturer> getListManufacturers();

    //todo: get product
    @GET("product")
    Call<ApiResponseProduct> getListProduct();
}
