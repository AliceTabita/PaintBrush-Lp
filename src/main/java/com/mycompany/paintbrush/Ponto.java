/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paintbrush;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author gutei
 */
public class Ponto {
    protected int xInicial;
    protected int yInicial;
    protected Color cor = Color.BLACK;
    
    public Ponto(){
        this.xInicial = 0;
        this.yInicial = 0;                
    }

    public int getxInicial() {
        return xInicial;
    }

    public void setxInicial(int xInicial) {
        this.xInicial = xInicial;
    }

    public int getyInicial() {
        return yInicial;
    }

    public void setyInicial(int yInicial) {
        this.yInicial = yInicial;
    }
    
    public void setCor(Color cor){
        this.cor = cor;
    }
    
    public Color getCor(){
        return cor;
    }
    
    public void paint(Graphics graficos){
        System.out.println(this.xInicial);        
        graficos.setColor(cor);
        graficos.drawOval(this.xInicial,this.yInicial,1,1);
    }
    
    
}
