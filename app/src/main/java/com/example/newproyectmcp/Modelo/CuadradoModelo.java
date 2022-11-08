package com.example.newproyectmcp.Modelo;

import android.renderscript.Sampler;

import com.example.newproyectmcp.Interfaces.Cuadrado;

public class CuadradoModelo implements Cuadrado.Modelo {

    private Cuadrado.Presentador presentador;
    private double resultado ;

    public CuadradoModelo(Cuadrado.Presentador presenter){
        this.presentador = presenter ;
    }

    @Override
    public void Cuadrado(String data) {
        if (data.equals("")){
            presentador.showError("Campo vacio");
        }else {
            resultado = Double.valueOf(data) + Double.valueOf(data);
            presentador.showResult(String.valueOf(resultado));
        }
    }
}
