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
public class Retangulo extends D2{

        public Retangulo(){
            super();
        }
        public Retangulo(int xInicial, int yInicial, int xFinal, int yFinal, Color cor){
            super.xInicial=xInicial;
            super.yInicial=yInicial;
            super.xFinal=xFinal;
            super.yFinal=yFinal;
            super.cor=cor;
        }
        
       

        @Override
        public void paint(Graphics g, Color c){
        int largura = super.largura(super.xInicial, super.xFinal);
        int altura = super.altura(super.yFinal, super.yInicial);
        g.setColor(c);
        g.drawRect(super.xInicial,super.yInicial, largura , altura);
     }
    
    public void preenche(Graphics g,Color c){
        int largura = super.largura(super.xInicial, super.xFinal);
        int altura = super.altura(super.yFinal, super.yInicial);
        g.setColor(c);
        g.fillRect(super.xInicial+1,super.yInicial+1, largura-1 , altura-1);
    }
    
}
