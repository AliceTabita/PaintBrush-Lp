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
public class Piramide extends D3 {
    public Piramide(){
        super();
        
    }
    
    @Override
    public void paint(Graphics graficos){
        int largura = super.xFinal - super.xInicial;
        int altura = super.yFinal - super.yInicial;         
        graficos.drawLine(super.xInicial, super.yInicial, super.xInicial+largura/2, super.yInicial-altura);
        graficos.drawLine(super.xInicial+largura, super.yInicial, super.xInicial+largura/2, super.yInicial-altura);
        graficos.drawLine(super.xInicial, super.yFinal, super.xInicial+largura/2, super.yInicial-altura);
        graficos.drawLine(super.xInicial+largura , super.yFinal, super.xInicial+largura/2, super.yInicial-altura);
        graficos.drawRect(super.xInicial, super.yInicial, largura, altura);
    }
}
