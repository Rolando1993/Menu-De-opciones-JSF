/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menu.entidades;

/**
 *
 * @author UNIVERSIDAD
 */
public class MenorDeTres {

    private int numero1;
    private int numero2;
    private int numero3;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    @Override
    public String toString() {
        return "MenorDeTres{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", numero3=" + numero3 + '}';
    }
    
    
}
