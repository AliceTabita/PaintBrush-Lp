/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.paintbrush;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import javax.swing.JColorChooser;

/**
 *
 * @author gutei
 */
public class Interface extends javax.swing.JFrame {

    Graphics graficos;
        private int tipoFigura;
        private int xInicial;
        private int yInicial;
        private int xFinal;
        private int yFinal;
        private String figura;
    public Interface(){
        initComponents();
        graficos = getGraphics();
        this.xInicial = 0;
        this.xFinal = 0;
        this.yInicial = 0;
        this.yFinal = 0;
        this.figura = " ";
        tipoFigura=1;
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
        ArrayList<Integer> posicoesX = new ArrayList<Integer>();
        ArrayList<Integer> posicoesY = new ArrayList<Integer>();


    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaDesenhos = new javax.swing.JPanel();
        desenhaRetangulo = new javax.swing.JButton();
        colorChooser = new javax.swing.JColorChooser();
        corBorda = new javax.swing.JPanel();
        corPreenchimento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        desenhaCirculo = new javax.swing.JButton();
        desenhaPonto = new javax.swing.JButton();
        Cilindro = new javax.swing.JButton();
        Piramide = new javax.swing.JButton();
        desenharPoligonos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaDesenhos.setBackground(new java.awt.Color(255, 255, 255));
        areaDesenhos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exemplo(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pegarPosicaoXpressed(evt);
                pegarPosicaoYpressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pegarPosicaoXreleased(evt);
                pegarPosicaoYreleased(evt);
            }
        });

        javax.swing.GroupLayout areaDesenhosLayout = new javax.swing.GroupLayout(areaDesenhos);
        areaDesenhos.setLayout(areaDesenhosLayout);
        areaDesenhosLayout.setHorizontalGroup(
            areaDesenhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 897, Short.MAX_VALUE)
        );
        areaDesenhosLayout.setVerticalGroup(
            areaDesenhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        desenhaRetangulo.setText("Retangulo");
        desenhaRetangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desenhaRetanguloActionPerformed(evt);
            }
        });

        corBorda.setBackground(new java.awt.Color(255, 204, 204));
        corBorda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecionaCorBorda(evt);
            }
        });

        javax.swing.GroupLayout corBordaLayout = new javax.swing.GroupLayout(corBorda);
        corBorda.setLayout(corBordaLayout);
        corBordaLayout.setHorizontalGroup(
            corBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        corBordaLayout.setVerticalGroup(
            corBordaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        corPreenchimento.setBackground(new java.awt.Color(255, 204, 204));
        corPreenchimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecionaCorPreenchimento(evt);
            }
        });

        javax.swing.GroupLayout corPreenchimentoLayout = new javax.swing.GroupLayout(corPreenchimento);
        corPreenchimento.setLayout(corPreenchimentoLayout);
        corPreenchimentoLayout.setHorizontalGroup(
            corPreenchimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        corPreenchimentoLayout.setVerticalGroup(
            corPreenchimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("Cor da borda:");

        jLabel2.setText("Cor do preenchimento:");

        jLabel3.setText("Ferramentas:");

        desenhaCirculo.setText("Círculo");
        desenhaCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desenhaCirculoActionPerformed(evt);
            }
        });

        desenhaPonto.setText("Ponto");
        desenhaPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desenhaPontoActionPerformed(evt);
            }
        });

        Cilindro.setText("Cilindro");
        Cilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CilindroActionPerformed(evt);
            }
        });

        Piramide.setText("Pirâmide");
        Piramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiramideActionPerformed(evt);
            }
        });

        desenharPoligonos.setText("Poligono");
        desenharPoligonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desenharPoligonosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(areaDesenhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(corBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(corPreenchimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Piramide, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(desenhaPonto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(desenhaRetangulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(desenhaCirculo)
                                    .addComponent(Cilindro)
                                    .addComponent(desenharPoligonos))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(areaDesenhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desenhaRetangulo)
                            .addComponent(desenhaCirculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desenhaPonto)
                            .addComponent(Cilindro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Piramide)
                            .addComponent(desenharPoligonos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(corBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(corPreenchimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desenhaRetanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desenhaRetanguloActionPerformed
       Retangulo r = new Retangulo(this.xInicial,this.yInicial,this.xFinal,this.yFinal,corPreenchimento.getBackground());
       r.paint(graficos,corBorda.getBackground());
       r.preenche(graficos, corPreenchimento.getBackground());
       System.out.println("Área: " + r.area());
    }//GEN-LAST:event_desenhaRetanguloActionPerformed

    private void exemplo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exemplo

    }//GEN-LAST:event_exemplo

    private void pegarPosicaoXpressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pegarPosicaoXpressed
        int X = evt.getX();
        this.setxInicial(X);
        System.out.println("X inicial " + evt.getX() +" " +evt.getY());
        posicoesX.add(this.xInicial);
    }//GEN-LAST:event_pegarPosicaoXpressed

    private void pegarPosicaoYpressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pegarPosicaoYpressed
        int Y = evt.getY();
        this.setyInicial(Y);
        System.out.println("Y inicial: " + Y);      
        posicoesY.add(this.yInicial);
    }//GEN-LAST:event_pegarPosicaoYpressed

    private void pegarPosicaoXreleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pegarPosicaoXreleased
        int X = evt.getX();
        this.setxFinal(X);
        System.out.println("X final " + X);
        
    }//GEN-LAST:event_pegarPosicaoXreleased

    private void pegarPosicaoYreleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pegarPosicaoYreleased
        int Y = evt.getY();
        this.setyFinal(Y);
        System.out.println("Y final " + Y);
    }//GEN-LAST:event_pegarPosicaoYreleased

    private void selecionaCorBorda(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecionaCorBorda
        Color cor = colorChooser.getColor();
        corBorda.setBackground(cor);
        System.out.println(cor);
    }//GEN-LAST:event_selecionaCorBorda

    private void selecionaCorPreenchimento(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecionaCorPreenchimento
        Color cor = colorChooser.getColor();
        corPreenchimento.setBackground(cor);
        System.out.println(cor);
    }//GEN-LAST:event_selecionaCorPreenchimento

    private void desenhaCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desenhaCirculoActionPerformed
        Circulo c = new Circulo();
        c.setxInicial(this.xInicial);
        c.setyInicial(this.yInicial);
        c.setxFinal(this.xFinal);
        c.setyFinal(this.yFinal);
        c.setCor(corBorda.getBackground());
        graficos.setColor(c.getCor());
        c.paint(graficos);
        c.setCor(corPreenchimento.getBackground());
        graficos.setColor(c.getCor());
        c.preenche(graficos);

    }//GEN-LAST:event_desenhaCirculoActionPerformed

    private void desenhaPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desenhaPontoActionPerformed
        Ponto p = new Ponto();
        graficos.setColor(corBorda.getBackground());
        graficos.drawOval(this.xFinal, this.yFinal, 1, 1);
        
    }//GEN-LAST:event_desenhaPontoActionPerformed

    private void CilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CilindroActionPerformed
        Cilindro c = new Cilindro();  
        c.setxInicial(this.xInicial);
        c.setxFinal(this.xFinal);
        c.setyInicial(this.yInicial);
        c.setyFinal(this.yFinal);
        c.setCor(corBorda.getBackground());
        graficos.setColor(c.getCor());
        c.paint(graficos);

    }//GEN-LAST:event_CilindroActionPerformed

    private void PiramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiramideActionPerformed
        Piramide p = new Piramide();
        p.setxInicial(this.xInicial);
        p.setxFinal(this.xFinal);
        p.setyInicial(this.yInicial);
        p.setyFinal(this.yFinal);
        p.setCor(corBorda.getBackground());
        graficos.setColor(p.getCor());
        p.paint(graficos);
        
    }//GEN-LAST:event_PiramideActionPerformed

    private void desenharPoligonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desenharPoligonosActionPerformed
        System.out.println(posicoesX);
        System.out.println(posicoesY);        
        int []posicoesDoArrayListX = new int[posicoesX.size()];
        int []posicoesDoArrayListY = new int[posicoesY.size()];
        int i = 0;
        while (i < posicoesX.size()){
            posicoesDoArrayListX[i] = posicoesX.get(i);
            posicoesDoArrayListY[i] = posicoesY.get(i);   
            i++;
        }
        Polygon poligono = new Polygon(posicoesDoArrayListX,posicoesDoArrayListY, posicoesX.size());
        graficos.setColor(corBorda.getBackground());
        graficos.drawPolygon(poligono);
        graficos.setColor(corPreenchimento.getBackground());
        graficos.fillPolygon(poligono);
        posicoesX.clear();
        posicoesY.clear();

    }//GEN-LAST:event_desenharPoligonosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cilindro;
    private javax.swing.JButton Piramide;
    private javax.swing.JPanel areaDesenhos;
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JPanel corBorda;
    private javax.swing.JPanel corPreenchimento;
    private javax.swing.JButton desenhaCirculo;
    private javax.swing.JButton desenhaPonto;
    private javax.swing.JButton desenhaRetangulo;
    private javax.swing.JButton desenharPoligonos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
