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
public class Casa extends Imoveis {

    public Casa(String cor, int totalDePortas) {
        super(cor, totalDePortas); 
    }
    
    @Override
    public void descricaoImovel() {
        System.out.println("Cor do Imovel: " + getCor() + ", Qtd. Portas :" + qtdDePortas() + ", Qtd. Portas Abertas:"
                + qtdPortasAbertas());
    }
}
