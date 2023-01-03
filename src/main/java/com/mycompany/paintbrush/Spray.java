package com.mycompany.paintbrush;

import java.awt.*;
import java.util.Random;

public class Spray extends Ponto{
    Spray(){
        super();
    }
    Spray(int xInicial, int yInicial){
        super.xInicial=xInicial;
        super.yInicial= yInicial;
    }

    @Override
    public void paint(Graphics graficos, Color c){
        Random aleatorio = new Random();
        int maxX=super.xInicial+50;
        int minX=super.xInicial-50;
        int maxY=super.yInicial+50;
        int minY=super.yInicial-50;
        graficos.setColor(c);
        for(int i=0;i<200;i++){

            int valX= aleatorio.nextInt((maxX-minX))+minX;
            int valY= aleatorio.nextInt((maxY-minY))+minY;
            double distancia = Math.sqrt(Math.pow(xInicial - valX,2) + Math.pow(yInicial - valY,2));

            if(distancia <= 50) {

                graficos.fillOval(valX, valY, aleatorio.nextInt(3), aleatorio.nextInt(3));
            }
        }
        System.out.println(this.xInicial);

    }
}
