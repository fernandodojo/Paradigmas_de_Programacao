/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imoveis;

/**
 *
 * @author fernando
 */
public class Porta {

    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public Porta(boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    public void abre() { // modifica estado da porta
        this.aberta = true;
        System.out.println("Porta aberta com sucesso");
    }

    public void fecha() { // modifica estado da porta
        this.aberta = false;
        System.out.println("Porta fechada com sucesso");
    }

    public void setX(double x) { // modifica valor de x
        this.dimensaoX = x;
    }

    public void setY(double y) { // modifica valor de y
        this.dimensaoY = y;
    }

    public void setZ(double z) { // modifica valor de z
        this.dimensaoZ = z;
    }

    public double getX() { // acessa valor de x
        return this.dimensaoX;
    }

    public double getY() { // acessa valor de y
        return this.dimensaoY;
    }

    public double getZ() { // acessa valor de z
        return this.dimensaoZ;
    }

    public boolean estaAberta() { // verifica se uma unica porta esta aberta
        return this.aberta;
    }

    public void pinta(String s) { // modifica a cor
        this.cor = s;
        System.out.println("Porta pintada com sucesso na cor:" + this.cor);
    }

    public String getCor() { // acessa a cor
        return this.cor;
    }

    public void descreverPorta() {
        System.out.println("Cor da porta: " + this.cor + ", Altura:" + getY() + ", Largura:" + getX() + ", Espessura:"
                + getZ() + ", Estado:" + estaAberta());
    }

}
