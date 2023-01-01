/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paintbrush;

import java.awt.Graphics;

/**
 *
 * @author gutei
 */
public class D1 extends Ponto {
    private int xFinal;
    private int yFinal;
    
    public D1(){
        super();
        this.xFinal = 0;
        this.yFinal = 0;
        
    }

    public int getxFinal() {
        return xFinal;
    }

    public void setxFinal(int xFinal) {
        this.xFinal = xFinal;
    }

    public int getyFinal() {
        return yFinal;
    }

    public void setyFinal(int yFinal) {
        this.yFinal = yFinal;
    }
    
    @Override
    public void paint(Graphics graficos){
        graficos.setColor(super.cor);
        graficos.drawLine(super.xInicial, super.yInicial, this.xFinal, this.yFinal);

    }
   
    public int calculaComprimento(){
        return (int) Math.sqrt(((this.xFinal - super.xInicial)*(this.xFinal - super.xInicial)) + ((this.yFinal - super.yInicial)*(this.yFinal - super.yInicial)));
    }
    
    
}
