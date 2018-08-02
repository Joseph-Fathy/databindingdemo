package com.example.josephfathi.myapplication;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.josephfathi.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        editText = findViewById(R.id.editTextCelsius);
        TemperatureData temperatureData = new TemperatureData("Hamburg", "10", "http://lorempixel.com/40/40/");
        binding.setTemp(temperatureData);
        binding.setMain(this);

    }

    public void showMyData(TemperatureData temperatureData){
        String txt= (editText.getText().toString());
        if(txt!=null&&txt.length()>0){
            temperatureData.setCelsius(txt);
            String celsius = temperatureData.getCelsius();
            Toast.makeText(this, celsius, Toast.LENGTH_SHORT).show();
        }
        else {
            ((EditText)binding.editTextCelsius).setError("wrong");
        }

    }

    public void startNextActivity(){
        startActivity(new Intent(this,SecondActivity.class));
    }
}
