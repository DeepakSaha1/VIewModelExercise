package com.example.viewmodelexercise;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.viewmodelexercise.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MyModel model;
    public static final String TAG = "MainActivity";
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        model = ViewModelProviders.of(this).get(MyModel.class);

        binding.setModel(model);

        binding.linearlayout.setBackgroundColor(model.getColor());
    }

    public void getCol(View v) {
        random = new Random();
//        initialize random color on every click
//        alpha(for opacity) r g b for color
        int color = Color.argb(255, random.nextInt(256),random.nextInt(256),random.nextInt(256));
        model.setColor(color);
        binding.linearlayout.setBackgroundColor(model.getColor());
    }
}
