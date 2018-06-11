/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.menu.beans;

import com.menu.entidades.Primo;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author UNIVERSIDAD
 */
@ManagedBean
public class PrimoMB {

    private Primo pri = new Primo();
    private String resultado;
    
    public PrimoMB() {
        pri = new Primo();
    }

    public Primo getPri() {
        return pri;
    }

    public void setPri(Primo pri) {
        this.pri = pri;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public  void verPrimo(){
        int c=1, r=0,x = 0;
        while(c <= pri.getNumero()){
             r = pri.getNumero()% c;
	     if (r == 0)
	        x = x + 1;
	     c = c + 1;
        }
	if(x==2){
           resultado = "Primo";
        }else{
            resultado = "No Primo";
        }
    }
    
}
