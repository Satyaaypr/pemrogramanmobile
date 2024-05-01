package com.example.aplikasiuts;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Terima_Data2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_terima_data2);
        TextView hasil= findViewById(R.id.tvHasil);
        String hasil_data= getIntent().getStringExtra("hasil_data");
        hasil.setText(hasil_data);
    }
}