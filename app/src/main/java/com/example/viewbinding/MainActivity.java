package com.example.viewbinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.viewbinding.databinding.ActivityMainBinding;
import com.example.viewbinding.databinding.RecyclerRootBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();



       String tv= binding.tvOne.getText().toString();
       binding.button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
startActivity(new Intent(MainActivity.this,DataBindingActivity.class));
           }
       });
        RecyclerRootBinding recyclerRootBinding=RecyclerRootBinding.inflate(getLayoutInflater());
       // recyclerRootBinding.imageView.setImageBitmap();
        recyclerRootBinding.tId.setText("dfsadkjfe");
    }
}