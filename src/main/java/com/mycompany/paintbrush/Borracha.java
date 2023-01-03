package com.mycompany.paintbrush;

import java.awt.*;

public class Borracha extends D2 {

    public Borracha(){
        super();
    }



    public Borracha(int xInicial, int yInicial, int xFinal, int yFinal, Color cor){
        super.xInicial=xInicial;
        super.yInicial=yInicial;
        this.xFinal=xFinal;
        this.yFinal=yFinal;
        super.cor=cor;

    }

    public void paint(Graphics g, Color cor){
        g.setColor(Color.WHITE);
        g.drawRect(super.xInicial,super.yInicial, 200 ,200);
    }

    public void preenche(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(super.xInicial,super.yInicial, 100 , 100);
    }

}
