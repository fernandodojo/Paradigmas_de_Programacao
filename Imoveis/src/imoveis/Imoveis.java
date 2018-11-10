/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imoveis;

import java.util.ArrayList;

/**
 *
 * @author fernando
 */
public abstract class Imoveis {

    private String cor;
    protected ArrayList<Porta> listaPortas;
    protected int totalDePortas;

    public Imoveis(String cor, int totalDePortas) {
        this.listaPortas = new ArrayList<>();
        this.cor = cor;
        this.totalDePortas = totalDePortas;
    }

    public void addPorta(boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ,
            int numPortas) {
        int i = 0;
        while (this.listaPortas.size() < this.totalDePortas && i < numPortas) {// verifica se a lista ainda cabe novas
            // portas e continua a adicionar até o
            // numero desejado
            this.listaPortas.add(new Porta(aberta, cor, dimensaoX, dimensaoY, dimensaoZ));// a mesma informacao é
            // passada para todas as novas
            // portas criadas na chamada
            i++;
        }
        System.out.println(i + " adicionada com sucesso");
    }

    public String getCor() { // acessa valor cor do Objeto Imoveis
        return this.cor;
    }

    public void pintar(String s) { // modifica valor do Objeto Imoveis
        this.cor = s;
    }

    public void fecharPortaN(int n) {
        if((n-1)<qtdDePortas()){
            this.listaPortas.get(n - 1).fecha(); // acesso ao nó no indice especificado por parametro, e método de
        // modificação de estado
        }       
    }

    public void abrirPortaN(int n) {
        this.listaPortas.get(n - 1).abre(); // acesso ao nó no indice especificado por parametro, e método de
        // modificação de estado
    }

    public void pintarPortaN(int n, String c) { // acesso ao nó no indice especificado por parametro, e método pintar
        this.listaPortas.get(n - 1).pinta(c);
    }

    public void editarLargura(int n, double valor) {
        this.listaPortas.get(n - 1).setX(valor); // acesso ao nó no indice especificado por parametro, e método de
        // modificação x
    }

    public void editarAltura(int n, double valor) {
        this.listaPortas.get(n - 1).setY(valor); // acesso ao nó no indice especificado por parametro, e método de
        // modificação y
    }

    public void editarEspessura(int n, double valor) {
        this.listaPortas.get(n - 1).setZ(valor); // acesso ao nó no indice especificado por parametro, e método de
        // modificação z
    }

    public int qtdDePortas() {
        return this.listaPortas.size(); // retorna o tamanho da listaPortas
    }

    public int totalDePortas() {
        return this.totalDePortas;
    }

    public int qtdPortasAbertas() {
        int count = 0;
        for (Porta aux : this.listaPortas) { // ponteiro aux aponta para todos os nós da listaPortas e utiliza o método
            // de objeto do tipo Porta estaAberta
            if (aux.estaAberta() == true) {
                count++;
            }
        }
        return count;
    }

    public void descricaoPortaN(int n) { // ponteiro aux aponta nós da listaPortas especificado por parametro e utiliza
        // o método do objeto do tipo para descrição
        this.listaPortas.get(n - 1).descreverPorta();
    }

    public void descricaoAllPortas() { // ponteiro aux aponta para todos os nós da listaPortas e utiliza o método do
        // objeto do tipo Porta descrição
        for (Porta aux : this.listaPortas) {
            aux.descreverPorta();
        }
    }

    public abstract void descricaoImovel();

//    {
//        System.out.println("Cor do Imovel: " + this.cor + ", Qtd. Portas :" + qtdDePortas() + ", Qtd. Portas Abertas:"
//                + qtdPortasAbertas());
//    }
}
