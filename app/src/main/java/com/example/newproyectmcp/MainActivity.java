package com.example.newproyectmcp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.newproyectmcp.Interfaces.Cuadrado;
import com.example.newproyectmcp.Presentador.CuadradoPresenter;


public class MainActivity extends AppCompatActivity implements Cuadrado.View {

    private EditText etNumber;
    private TextView tvNumber;

    private Cuadrado.Presentador presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNumber = findViewById(R.id.recibirTexto);
        etNumber = findViewById(R.id.texto);
        presenter = new CuadradoPresenter(this);
    }

    public void Calcular(View view){
        presenter.Cuadrado(etNumber.getText().toString());
    }

    @Override
    public void showResult(String result) {
        tvNumber.setText(result);
    }

    @Override
    public void showError(String error) {
        tvNumber.setText(error);
    }
}