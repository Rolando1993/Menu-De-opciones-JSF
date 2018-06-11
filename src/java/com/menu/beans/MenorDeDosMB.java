/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menu.beans;

import com.menu.entidades.MenorDeDos;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author UNIVERSIDAD
 */
@ManagedBean
@RequestScoped
public class MenorDeDosMB {

    private MenorDeDos menor2 = new MenorDeDos();
    private int resultado;

    public MenorDeDosMB() {
        menor2 = new MenorDeDos();
    }

    public MenorDeDos getMenor2() {
        return menor2;
    }

    public void setMenor2(MenorDeDos menor2) {
        this.menor2 = menor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void numeroMenor2() {
        int a = menor2.getNumero1();
        int b = menor2.getNumero2();
        if (a < b) {
            resultado = a;
        } else {
            resultado = b;
        }
    }
}
