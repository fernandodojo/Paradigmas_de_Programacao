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
public class Edificio extends Imoveis {

    private int totalDeAndares;

    public Edificio(String cor, int totalDePortas, int totalDeAndares) {
        super(cor, totalDePortas);
        this.totalDeAndares = totalDeAndares;
    }

    public void addAndar(int numAndar) {
        this.totalDeAndares += numAndar;

        System.out.println(" Andar adicionado andar com sucesso");
    }

    public int qtdAndares() {
        return this.totalDeAndares;
    }

    @Override
    public void descricaoImovel() {
        System.out.println("Cor do Imovel: " + getCor() + ", Quantidade de Andares:" + qtdAndares() + ", Qtd. Portas :" + qtdDePortas() + ", Qtd. Portas Abertas:"
                + qtdPortasAbertas());
    }

}
