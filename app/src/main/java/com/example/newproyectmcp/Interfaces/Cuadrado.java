package com.example.newproyectmcp.Interfaces;

public interface Cuadrado {

    interface View{
        void showResult(String result);
        void showError(String error);
    }
    interface Presentador{
        void showResult(String result);
        void Cuadrado(String data);
        void showError(String error);
    }
    interface Modelo{
        void Cuadrado(String data);
    }
}
