package com.itniddhi.my_first_form;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.itniddhi.my_first_form.databinding.ActivityMainBinding;
import com.itniddhi.my_first_form.model_class.Data;
import com.itniddhi.my_first_form.model_class.Entity;
import com.itniddhi.my_first_form.model_class.News;
import com.itniddhi.my_first_form.retrofit.Repository;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private StockAdapter myAdapter;

    public static final String URL = "News URL";
    private List<Entity> entityList; // Declare entityList as a class-level variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Initializing the adapter for the RecyclerView
        myAdapter = new StockAdapter();

        EditText etSearch = binding.etSearch;

        // Setting up the RecyclerView with a LinearLayoutManager
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(myAdapter);

        // TextWatcher for filtering as the user types
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                // Filter the list based on the search query
                filterVisitorList(s.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // You can leave this empty if no action is needed
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // You can leave this empty if no action is needed
            }
        });

        // Making a network request to get the news data
        Repository.getApi()
                .getAllDetails("BSE", "ixxnnaiVNGyR2StAS2Ny51vRubP7VMlONNJ7ZSwl") // Your API key here
                .enqueue(new Callback<News>() {
                    @Override
                    public void onResponse(Call<News> call, Response<News> response) {
                        // Checking if the response body is not null
                        if (response.body() != null) {
                            // Extracting the list of Data objects
                            List<Data> dataList = response.body().getData();

                            // Initializing the class-level entityList
                            entityList = new ArrayList<>(); // Initialize it here

                            // Looping through each Data object and collecting the Entities
                            for (Data data : dataList) {
                                entityList.addAll(data.getEntities()); // Assuming getEntities() returns List<Entity>
                            }

                            // Updating the RecyclerView adapter with the full Entity list
                            myAdapter.setData(entityList);
                        } else {
                            Log.d("TAG", "Response body is null");
                        }
                    }

                    @Override
                    public void onFailure(Call<News> call, Throwable t) {
                        Log.d("TAG", t.getMessage());
                    }
                });
    }

    private void filterVisitorList(String query) {
        if (entityList != null) { // Check if entityList is not null
            List<Entity> filteredList = new ArrayList<>();

            for (Entity item : entityList) {
                boolean matches = (item.getName() != null &&
                        item.getSymbol().toLowerCase().contains(query.toLowerCase()));

                if (matches) {
                    filteredList.add(item);
                }
            }

            // Update the adapter with the filtered list
            myAdapter.setData(filteredList);
        }
    }
}
