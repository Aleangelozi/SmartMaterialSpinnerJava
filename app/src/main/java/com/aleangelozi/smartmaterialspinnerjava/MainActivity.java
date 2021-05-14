package com.aleangelozi.smartmaterialspinnerjava;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.chivorn.smartmaterialspinner.SmartMaterialSpinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SmartMaterialSpinner<String> spProvince;
    private List<String> provinceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initSpinner();
    }

    private void initSpinner() {
        spProvince = findViewById(R.id.spinner1);
        provinceList = new ArrayList<>();

        provinceList.add("Americana");
        provinceList.add("Álvares Machado");
        provinceList.add("Campinas");
        provinceList.add("Cáceres");
        provinceList.add("Santos");
        provinceList.add("São Paulo");


        spProvince.setItem(provinceList);

        spProvince.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView text = findViewById(R.id.textView);
                text.setText(provinceList.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}