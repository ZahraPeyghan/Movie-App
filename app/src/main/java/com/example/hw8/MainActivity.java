package com.example.hw8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.example.hw8.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<CategoryModel> categories = new ArrayList<>();
        categories.add(new CategoryModel("","Soul(2020)","https://musicinsight.ir/wp-content/uploads/2021/01/Cover_650x650-3.jpg"));
        categories.add(new CategoryModel("","Onward (2020)","https://www.doostihaa.com/img/uploads/2020/03/Onward-2020.jpg"));
        categories.add(new CategoryModel("","Knives Out (2019)","https://fardisfilm.ir/wp-content/uploads/2020/02/Knives-Out-2019-fardisfilm.jpg"));
        categories.add(new CategoryModel("","Mulan (2020)","https://static.wikia.nocookie.net/disney/images/e/e9/Mulan_%282020%2C_Disney%2B_Original_Poster%29.jpg/revision/latest?cb=20200809175515"));
        categories.add(new CategoryModel("","Beauty and the Beast ","https://www.film2serial.ir/wp-content/uploads/2018/03/Beauty-and-the-Beast.jpg"));
        categories.add(new CategoryModel("","The Jungle Book","https://www.film2serial.ir/wp-content/uploads/2016/08/The-Jungle-Book-2016.jpg"));

        CategoryAdapter adapter = new CategoryAdapter(this,categories);
        binding.categoryList.setLayoutManager(new GridLayoutManager(this,2));
        binding.categoryList.setAdapter(adapter);
    }
}