/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paintbrush;

import java.awt.*;

/**
 *
 * @author gutei
 */
public abstract class D2 extends Ponto{

    protected int xFinal;
    protected int yFinal;
    
    public D2(){
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
    
    public int largura(int xFinal,int xInicial){
        return this.xFinal - super.xInicial;
    }
    
    public int altura(int yFinal, int yInicial){
        return this.yFinal - super.yInicial;
    }
    
    public int area(){
        int altura = altura(this.yFinal, super.yInicial);
        int largura = largura(this.xFinal, super.yInicial);
        return altura * largura;
    }

    public abstract void paint(Graphics g, Color c);
}
