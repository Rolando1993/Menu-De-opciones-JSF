/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menu.beans;

import com.menu.entidades.MayorDeDos;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author UNIVERSIDAD
 */
@ManagedBean
public class MayorDeDosMB {

    private MayorDeDos mayor2 = new MayorDeDos();
    private  int resultado;
    
    public MayorDeDosMB() {
        mayor2 = new MayorDeDos();
    }

    public MayorDeDos getMayor2() {
        return mayor2;
    }

    public void setMayor2(MayorDeDos mayor2) {
        this.mayor2 = mayor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
     public  void numeroMayor2() {
        int n1= mayor2.getNumero1();
        int n2= mayor2.getNumero2();
         if (n1 > n2) {
            resultado = n1;
        } else {
            resultado =n2;
        }
    }
}
