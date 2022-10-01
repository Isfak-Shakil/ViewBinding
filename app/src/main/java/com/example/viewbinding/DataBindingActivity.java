package com.example.viewbinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.viewbinding.databinding.ActivityDataBindingBinding;

public class DataBindingActivity extends AppCompatActivity {
    private ActivityDataBindingBinding bindingB;
    private  int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindingB= DataBindingUtil.setContentView(this,R.layout.activity_data_binding);

        bindingB.addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score++;
                bindingB.textViewId.setText(String.valueOf(score));
            }
        });
        bindingB.minBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score--;
                bindingB.textViewId.setText(String.valueOf(score));
            }
        });

    }
}