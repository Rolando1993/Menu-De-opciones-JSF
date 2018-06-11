/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menu.beans;

import com.menu.entidades.Ulam;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author UNIVERSIDAD
 */
@ManagedBean
@RequestScoped
public class UlamMB {

    private Ulam ul = new Ulam();
    private String resultado;
    private String serieU;
    
    public UlamMB() {
        ul = new Ulam();
    }

    public Ulam getUl() {
        return ul;
    }

    public void setUl(Ulam ul) {
        this.ul = ul;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
     public  void generarSerie(){
        int num = Integer.parseInt(ul.getNumero());
        serieU = ul.getNumero();
        while(num != 1){
            if((num % 2) == 0){
                num = num / 2;
                serieU = serieU + "-" + num;
            }
            else{
                num = num *  3 + 1;
                serieU = serieU + "-" + num;
            }
        }
        resultado = serieU;
    }
    
}
