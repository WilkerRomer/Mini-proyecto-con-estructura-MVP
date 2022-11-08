package com.example.newproyectmcp.Presentador;

import com.example.newproyectmcp.Interfaces.Cuadrado;
import com.example.newproyectmcp.Modelo.CuadradoModelo;

public class CuadradoPresenter implements Cuadrado.Presentador {

    private Cuadrado.View view;
    private Cuadrado.Modelo model;

    public CuadradoPresenter(Cuadrado.View view){
        this.view = view;
        model = new CuadradoModelo(this);
    }

    @Override
    public void showResult(String result) {
        if(view!= null){
            view.showResult(result);
        }

    }

    @Override
   public void Cuadrado(String data) {
        if(view!= null){
            model.Cuadrado(data);
        }
    }

    @Override
    public void showError(String error) {
        if(view!= null){
            view.showError(error);
        }
    }
}
