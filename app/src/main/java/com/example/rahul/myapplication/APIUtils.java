package com.example.rahul.myapplication;

public class APIUtils {

    private APIUtils() {}

    public static final String BASE_URL = "https://96gw5cphgi.execute-api.ap-south-1.amazonaws.com/";

    public static APIServices getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIServices.class);
    }
}
