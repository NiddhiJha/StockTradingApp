package com.itniddhi.my_first_form.retrofit;

import android.util.Log;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Repository {
    private static WebService apiInstance;

    public static synchronized WebService getApi() {
        if (apiInstance == null) {
            // Create a custom interceptor to log the endpoint
            Interceptor endpointLoggingInterceptor = new Interceptor() {
                @Override
                public okhttp3.Response intercept(Chain chain) throws IOException {
                    // Get the request from the chain
                    Request request = chain.request();

                    // Get the full URL
                    HttpUrl url = request.url();

                    // Extract the endpoint (path after the base URL)
                    String endpoint = url.encodedPath();

                    // Log the endpoint
                    Log.d("RetrofitEndpoint", "Endpoint: " + endpoint);

                    // Proceed with the request
                    return chain.proceed(request);
                }
            };

            // Create an OkHttpClient with the interceptor
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(endpointLoggingInterceptor)
                    .build();

            // Build the Retrofit instance
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.marketaux.com/v1/")  // Your base URL
                    .client(client)  // Attach the OkHttp client
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            // Create the API instance
            apiInstance = retrofit.create(WebService.class);
        }
        return apiInstance;
    }
}
