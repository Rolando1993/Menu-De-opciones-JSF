/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menu.beans;

import com.menu.entidades.MayorDeTres;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author UNIVERSIDAD
 */
@ManagedBean
public class MayorDeTresMB {

   private MayorDeTres mayor3 = new MayorDeTres();
   private int resultado;
   
    public MayorDeTresMB() {
        mayor3 = new MayorDeTres();
    }

    public MayorDeTres getMayor3() {
        return mayor3;
    }

    public void setMayor3(MayorDeTres mayor3) {
        this.mayor3 = mayor3;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void numeroMayor3() {
        int n1 = mayor3.getNumero1();
        int n2 = mayor3.getNumero2();
        int n3 = mayor3.getNumero3();
        if (n1 > n2) {
            if (n1 > n3) {
                resultado = n1;
            } else {
                resultado = n3;
            }
        } else if (n2 > n3) {
            resultado = n2;
        } else {
            resultado = n3;
        }
    }
   
    
}
