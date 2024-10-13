package com.itniddhi.my_first_form.retrofit;

import com.itniddhi.my_first_form.model_class.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WebService {
@GET("news/all")
Call<News>
getAllDetails(
        @Query("exchanges")
                String exchanges,
        @Query("api_token")
                String api_token);
}
