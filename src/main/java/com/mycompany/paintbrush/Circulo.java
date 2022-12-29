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
public class Circulo {
        private int xInicial;
        private int yInicial;
        private int xFinal;
        private int yFinal;
        Graphics g;
        private Color borda;
        private Color preenchimento;
        public Circulo(){
            this.xInicial = 0;
            this.xFinal = 0;
            this.yInicial = 0;
            this.yFinal = 0;
        }
        
        
    public int getxInicial(){
        return this.xInicial;
    }
    public void setxInicial(int xInicial){
        this.xInicial = xInicial;
    }
    public int getxFinal(){
        return this.xFinal;
    }
    public void setxFinal(int xFinal){
        this.xFinal = xFinal;
    }
    public int getyInicial(){
        return this.yInicial;
    }
    public void setyInicial(int yInicial){
        this.yInicial = yInicial;
    }
    public int getyFinal(){
        return this.yFinal;
    }
    public void setyFinal(int yFinal){
        this.yFinal = yFinal;
    }

    public int largura(int xInicial, int xFinal){
        return this.xFinal - this.xInicial;
    }

    public int altura(int yInicial, int yFinal){
        return this.yFinal - this.yInicial;
    }
    
    
    public void paint(Graphics g){
        System.out.println(this.xFinal);        
        int largura = largura(xInicial, xFinal);
        int altura = altura(yInicial, yFinal);
        g.setColor(borda);
        g.drawOval(this.xInicial,this.yInicial, largura , altura);
    }
    
    public void preenche(Graphics g){
        int largura = largura(xInicial, xFinal);
        int altura = altura(yInicial, yFinal);
        g.fillOval(this.xInicial,this.yInicial, largura , altura);
    }
}
