package com.example.atividade8;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class AgendamentoActivity extends AppCompatActivity {
    private EditText editNome, editLocal;
    private String dataSelecionada = "", horaSelecionada = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamento);
        Toast.makeText(this, "onCreate AgendamentoActivity", Toast.LENGTH_SHORT).show();

        editNome = findViewById(R.id.editNome);
        editLocal = findViewById(R.id.editLocal);


        findViewById(R.id.btnSelecionarData).setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            new DatePickerDialog(this, (view, year, month, day) -> {
                dataSelecionada = day + "/" + (month + 1) + "/" + year;
            }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
        });


        findViewById(R.id.btnSalvar).setOnClickListener(v -> {
            Intent intent = new Intent(AgendamentoActivity.this, ResumoActivity.class);
            intent.putExtra("nome", editNome.getText().toString());
            intent.putExtra("data", dataSelecionada);
            intent.putExtra("local", editLocal.getText().toString());
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart AgendamentoActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume AgendamentoActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause AgendamentoActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop AgendamentoActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy AgendamentoActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart AgendamentoActivity", Toast.LENGTH_SHORT).show();
    }

}
