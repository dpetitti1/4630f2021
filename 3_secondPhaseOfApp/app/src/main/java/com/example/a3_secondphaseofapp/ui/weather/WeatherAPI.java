package com.example.a3_secondphaseofapp.ui.weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherAPI {
    @GET("weather")
    Call<WeatherResponse> getWeather(
            @Query("lon") double lon,
            @Query("lat") double lat,
            @Query("units") String units,
            @Query("appid") String appid);
}
