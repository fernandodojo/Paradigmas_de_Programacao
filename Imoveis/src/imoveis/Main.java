/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imoveis;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scanf; // recebimento de opção do menu

        String string;

        //Imoveis test = new Imoveis("preta", 12);
        System.out.println("\nDigite uma cor para a casa\n");
        string = input.next();
        System.out.println("\nInforma o limite de portas da casa\n");
        scanf = input.nextInt();
        Casa house = new Casa(string, scanf); // instacimanto da classe Casa

        System.out.println("Casa criada com sucesso\n\n");

        System.out.println("\nDigite uma cor para o edificio\n\n");
        string = input.next();
        System.out.println("\nInforma o limite de portas da casa\n");
        scanf = input.nextInt();
        Edificio apartamento = new Edificio(string, scanf, 0); // instacimanto da classe Casa

        do {
            System.out.println("Escolha um para acessar:");
            System.out.println("1 - CASA");
            System.out.println("2 - EDIFICIO");
            scanf = input.nextInt();

            if (scanf == 1) {

                System.out.printf("\n\n");
                System.out.println("Digite uma opção entre 0 e 9");
                System.out.println("1 - Adicionar porta");
                System.out.println("2 - Abrir/Fechar uma porta n");
                System.out.println("3 - Alterar dimensões de uma porta n");
                System.out.println("4 - Pintar uma porta n");
                System.out.println("5 - Total de portas abertas");
                System.out.println("6 - Pintar a casa");
                System.out.println("7 - Imprimir Descrição");
                System.out.println("0 - Sair");
                System.out.printf("\n\n");
                scanf = input.nextInt();

                int tamanho = house.qtdDePortas();
                int numPorta = -1;

                switch (scanf) {
                    case 1:
                        double x,
                         y,
                         z; // recebimento das dimensões
                        //String string; // recebimento de cor
                        boolean aberta; // recebimento de estado da porta                   

                        System.out.println("Digite o numero de portas para adicionar");
                        numPorta = input.nextInt();

                        System.out.println("Digite uma cor");
                        string = input.next();

                        System.out.println("Digite a largura  da porta");
                        x = input.nextDouble();

                        System.out.println("Digite a altura da porta");
                        y = input.nextDouble();

                        System.out.println("Digite a espessura da porta");
                        z = input.nextDouble();
                        System.out.println("Informe o estado da porta(Aberta = true /Fechada = false)");
                        aberta = input.nextBoolean();

                        house.addPorta(aberta, string, x, y, z, numPorta);
                        break;

                    case 2:
                        System.out.println("Digite o numero da porta");
                        numPorta = input.nextInt();

                        if (numPorta > tamanho) {
                            System.out.println("Porta Inexistente");
                            break;
                        }

                        System.out.println("Digite uma opção");
                        System.out.println("a - Abrir a porta");
                        System.out.println("b - Fechar uma porta");
                        string = input.next();

                        switch (string) {
                            case "a":
                                house.abrirPortaN(numPorta);
                                break;

                            case "b":
                                house.fecharPortaN(numPorta);
                                break;

                        }
                        house.descricaoPortaN(numPorta);

                        break;

                    case 3:
                        System.out.println("Digite o numero da porta");
                        numPorta = input.nextInt();
                        if (numPorta > tamanho) {
                            System.out.println("Porta Inexistente");
                            break;
                        }

                        System.out.println("Digite uma opção");
                        System.out.println("x - Editar largura da porta");
                        System.out.println("y - Editar altura da porta");
                        System.out.println("z - Editar espessura da porta");
                        string = input.next();

                        switch (string) {

                            case "x":
                                System.out.println("Digite a nova dimenção x");
                                x = input.nextDouble();

                                house.editarLargura(numPorta, x);
                                break;

                            case "y":
                                System.out.println("Digite a nova dimenção y");
                                y = input.nextDouble();

                                house.editarAltura(numPorta, y);
                                break;

                            case "z":
                                System.out.println("Digite a nova dimenção z");
                                z = input.nextDouble();

                                house.editarEspessura(numPorta, z);
                                break;
                        }
                        house.descricaoPortaN(numPorta);
                        break;

                    case 4:
                        System.out.println("Digite o numero da porta");
                        numPorta = input.nextInt();
                        if (numPorta > tamanho) {
                            System.out.println("Porta Inexistente");
                            break;
                        }

                        System.out.println("Digite a cor para pintar");
                        string = input.next();

                        house.pintarPortaN(numPorta, string);
                        break;

                    case 5:
                        System.out.println("Total de portas abertas: " + house.qtdPortasAbertas());
                        break;

                    case 6:
                        System.out.println("Digite a cor para pintar");
                        string = input.next();
                        house.pintar(string);
                        house.descricaoImovel();
                        break;

                    case 7:
                        System.out.printf("\n\n");
                        house.descricaoImovel();
                        System.out.printf("\n");
                        house.descricaoAllPortas();
                        System.out.printf("\n\n");
                        break;
                }
            }
            if (scanf == 2) {

                System.out.println("Edificio Criado com sucesso;");
                System.out.printf("\n\n");
                System.out.println("Digite uma opção:");
                System.out.printf("\n");
                System.out.println("1 - Adicionar uma andar");
                System.out.println("2 - Total de Andares");
                System.out.printf("\n");
                System.out.println("3 - Adicionar porta");
                System.out.println("4 - Abrir/Fechar uma porta n");
                System.out.println("5 - Alterar dimensões de uma porta n");
                System.out.printf("\n");
                System.out.println("6 - Total de Porta no Edificio");
                System.out.println("7 - Total de Porta Abertas no Edificio");
                System.out.printf("\n");
                System.out.println("8 - Pintar o prédio");
                System.out.println("9 - Imprimir");
                System.out.println("0 - Sair");
                System.out.printf("\n\n");
                scanf = input.nextInt();

                int numPorta = -1;
                int numAndar = -1;
                //String string;

                // int qtdAndares = apartamento.qtdAndares();
                // int tamanhoporta = apartamento.totalDePortasAndar(numAndar);
                switch (scanf) {
                    case 1:

                        System.out.println("Digite um numero de andares que deseja adicionar");
                        numAndar = input.nextInt();

                        //System.out.println("Digite o numero máximo de portas permitido por andar");
                        //numPorta = input.nextInt();
                        //System.out.println("Digite uma cor");
                        //string = input.next();
                        apartamento.addAndar(numAndar);

                        break;

                    case 2:
                        System.out.println(apartamento.qtdAndares());
                        break;

                    case 3:
                        double x,
                         y,
                         z; // recebimento das dimensões
                        boolean aberta; // recebimento de estado da porta

                        System.out.println("Digite o numero do andar para adicionar porta");
                        numAndar = input.nextInt();

                        System.out.println("Digite o numero de portas para adicionar");
                        numPorta = input.nextInt();

                        System.out.println("Digite uma cor");
                        string = input.next();

                        System.out.println("Digite a largura  da porta");
                        x = input.nextDouble();

                        System.out.println("Digite a altura da porta");
                        y = input.nextDouble();

                        System.out.println("Digite a espessura da porta");
                        z = input.nextDouble();

                        System.out.println("Informe o estado da porta(Aberta = true /Fechada = false)");
                        aberta = input.nextBoolean();

                        apartamento.addPorta(aberta, string, x, y, z, numPorta);
                        break;

                    case 4:
                        System.out.println("Digite o numero do andar");
                        numAndar = input.nextInt();

                        if (numAndar > apartamento.qtdAndares()) {
                            System.out.println("Andar Inexistente");
                            break;
                        }

                        System.out.println("Digite o numero da porta");
                        numPorta = input.nextInt();

                        if (numPorta > apartamento.qtdDePortas()) {
                            System.out.println("Porta Inexistente");
                            break;
                        }

                        System.out.println("Digite uma opção");
                        System.out.println("a - Abrir a porta");
                        System.out.println("b - Fechar uma porta");

                        string = input.next();
                        switch (string) {
                            case "a":
                                apartamento.abrirPortaN(numPorta);
                                break;

                            case "b":
                                apartamento.fecharPortaN(numPorta);
                                break;
                        }
                        break;

                    case 5:

                        System.out.println("Digite o numero do andar");
                        numAndar = input.nextInt();

                        if (numAndar > apartamento.qtdAndares()) {
                            System.out.println("Andar Inexistente");
                            break;
                        }

                        System.out.println("Digite o numero da porta");
                        numPorta = input.nextInt();

                        if (numPorta > apartamento.totalDePortas()) {
                            System.out.println("Porta Inexistente");
                            break;
                        }

                        System.out.println("Digite uma opção");
                        System.out.println("x - Editar largura da porta");
                        System.out.println("y - Editar altura da porta");
                        System.out.println("z - Editar espessura da porta");
                        string = input.next();

                        switch (string) {

                            case "x":
                                System.out.println("Digite a nova dimenção x");
                                x = input.nextDouble();
                                apartamento.editarLargura(numPorta, x);
                                break;

                            case "y":
                                System.out.println("Digite a nova dimenção y");
                                y = input.nextDouble();
                                apartamento.editarAltura(numPorta, y);
                                break;

                            case "z":
                                System.out.println("Digite a nova dimenção z");
                                z = input.nextDouble();
                                apartamento.editarEspessura(numPorta, z);
                                break;
                        }
                        break;

                    case 6:
                        System.out.println("Numero de portas no Edificio: " + apartamento.totalDePortas());
                        break;

                    case 7:
                        System.out.println("Numero de portas abertas no Edificio: " + apartamento.qtdPortasAbertas());
                        break;

                    case 8:
                        System.out.println("Digite a cor para pintar");
                        string = input.next();
                        apartamento.pintar(string);
                        break;

                    case 9:
                        System.out.printf("\n\n");
                        apartamento.descricaoImovel();
                        break;
                }
            }

        } while (scanf != 0);
        System.out.println("Encerrando...");
    }
}
