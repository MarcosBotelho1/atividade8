package com.example.atividade8;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ResumoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);
        Toast.makeText(this, "onCreate ResumoActivity", Toast.LENGTH_SHORT).show();

        TextView txtResumo = findViewById(R.id.txtResumo);
        Intent intent = getIntent();
        String resumo = "Compromisso: " + intent.getStringExtra("nome") +
                "\nData: " + intent.getStringExtra("data") +
                "\nLocal: " + intent.getStringExtra("local");
        txtResumo.setText(resumo);

        findViewById(R.id.btnVoltar).setOnClickListener(v -> {
            finish();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart ResumoActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume ResumoActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause ResumoActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop ResumoActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy ResumoActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart ResumoActivity", Toast.LENGTH_SHORT).show();
    }
}
