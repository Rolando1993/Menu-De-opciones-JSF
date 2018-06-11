/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menu.beans;

import com.menu.entidades.Fibonacci;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author UNIVERSIDAD
 */
@ManagedBean
@RequestScoped
public class FibonacciMB {
    
    private Fibonacci fibo = new Fibonacci();
    private String serie;
    private String resultado;

    public FibonacciMB() {
        fibo = new Fibonacci();
    }

    public Fibonacci getFibo() {
        return fibo;
    }

    public void setFibo(Fibonacci fibo) {
        this.fibo = fibo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }


    public  void serieFibonacci(){
        int n1 = 0;
        int n2 = 1;
        int c = 0;
        int aux;
        int lim = fibo.getNumero();
        serie = n1 + "-" + n2;
        while ( c < lim - 2) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;
            serie = serie + "-" + n2;
            c++;
        }
        resultado= serie;
    }
}
