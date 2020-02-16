package com.example.rahul.myapplication;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIServices {
    @POST("/latest")
    @Headers("Content-Type: application/json")
    Call<String> savePost(@Body HashMap<String, String> s);
}
