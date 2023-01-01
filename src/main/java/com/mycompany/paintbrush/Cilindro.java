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
public class Cilindro extends D3{
    public Cilindro(){
        super();
    }

    @Override
    public void paint(Graphics graficos){
        int largura = super.xFinal - super.xInicial;
        int raio = largura/2;
        int altura = super.yFinal - super.yInicial;        
        
        graficos.drawOval(super.xInicial, super.yInicial,largura, raio);
        graficos.drawOval(super.xInicial, super.yInicial + altura,(raio*2), raio);
        graficos.drawLine(super.xInicial, super.yInicial+(raio/2), super.xInicial, super.yInicial + altura + raio/2);
        graficos.drawLine(super.xFinal, super.yInicial+(raio/2), super.xFinal, super.yInicial + altura + raio/2);
        
    }

}


