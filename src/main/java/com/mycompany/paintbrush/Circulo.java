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
public class Circulo extends D2{

        public Circulo(){
            super();
        }    

    @Override
    public void paint(Graphics g,Color c){
        int largura = largura(super.xInicial, super.xFinal);
        int altura = altura(super.yInicial, super.yFinal);
        g.setColor(super.cor);
        g.drawOval(super.xInicial,super.yInicial, largura,altura);
    }
    
    public void preenche(Graphics g){
        int largura = largura(super.xInicial, super.xFinal);
        int altura = altura(super.yInicial, super.yFinal);
        g.setColor(super.cor);
        g.fillOval(super.xInicial+1,super.yInicial+1, largura-1 , altura-1);
    }
    
    public int diametro(int xFinal, int xInicial){
        return super.xFinal - super.xInicial;
    }
    
    public int raio(int xFinal, int xInicial){
        int raio = diametro(super.xFinal, super.xInicial)/2;
        return raio;
    }
}
