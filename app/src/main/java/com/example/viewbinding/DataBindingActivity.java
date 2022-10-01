package com.example.viewbinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.viewbinding.databinding.ActivityDataBindingBinding;

public class DataBindingActivity extends AppCompatActivity {

    private ActivityDataBindingBinding bindingB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindingB= DataBindingUtil.setContentView(this,R.layout.activity_data_binding);

        MyViewModel myViewModel=new ViewModelProvider(this).get(MyViewModel.class);
  bindingB.textViewId.setText(String.valueOf(myViewModel.score));

        bindingB.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 myViewModel.increment();
                bindingB.textViewId.setText(String.valueOf(myViewModel.score));
            }
        });
        bindingB.minBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModel.decrement();
                bindingB.textViewId.setText(String.valueOf(myViewModel.score));
            }
        });

    }
}