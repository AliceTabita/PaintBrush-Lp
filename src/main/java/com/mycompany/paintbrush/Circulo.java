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

    public Circulo(int xInicial, int yInicial, int xFinal, int yFinal, Color cor){
        super.xInicial=xInicial;
        super.yInicial=yInicial;
        this.xFinal=xFinal;
        this.yFinal=yFinal;
        super.cor=cor;
    }
    @Override
    public void paint(Graphics g,Color c){
        g.setColor(c);
        System.out.println(super.largura());
        g.drawOval(super.xInicial,super.yInicial, super.largura(),super.altura());
    }
    
    public void preenche(Graphics g,Color c){
        g.setColor(c);
        g.fillOval(super.xInicial,super.yInicial, super.largura()-1 , super.altura()-1);
    }
    
    public int diametro(int xFinal, int xInicial){
        return super.xFinal - super.xInicial;
    }
    
    public int raio(int xFinal, int xInicial){
        int raio = diametro(super.xFinal, super.xInicial)/2;
        return raio;
    }
}
