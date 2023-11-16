package list_m02s04.SuperHerois.cli;

import list_m02s04.SuperHerois.model.Heroi;
import list_m02s04.SuperHerois.model.Personagem;
import list_m02s04.SuperHerois.model.Vilao;

import java.util.*;

public class Display {

    public void exibirMenu() {
        System.out.println("Menu - Selecione a opção desejada:");
        System.out.println("1 - Cadastrar Herói");
        System.out.println("2 - Cadastrar Vilão");
        System.out.println("3 - Listar");
        System.out.println("4 - Sair");


    }

    public int obterMenu() {
        System.out.println("Informe a opção desejada do menu: ");
        Scanner scanner = new Scanner(System.in);

        try {
            int op = scanner.nextInt();
            return op;
        } catch (InputMismatchException e ) {
            return -1;
        }
    }

    public void exibirMensagem(String message) {
        System.out.println(message);
    }

    public Heroi obterDadosHeroi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do heroi:");
        String nome = scanner.nextLine();
        System.out.println("Informe o superpoder:");
        String superPoder = scanner.nextLine();
        System.out.println("Informe o nome na vida real:");
        String nomeVidaReal = scanner.nextLine();
        return new Heroi(nome, superPoder, nomeVidaReal);
    }

    public Vilao obterDadosVilao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do vilao:");
        String nome = scanner.nextLine();
        System.out.println("Informe o superpoder:");
        String superPoder = scanner.nextLine();
        System.out.println("Informe o tempo de prisão:");
        Integer tempoDePrisao = scanner.nextInt();
        return new Vilao(nome, superPoder, tempoDePrisao);
    }

    public void listar(List<Personagem> personagens) {
        Collections.sort(personagens);
        System.out.println("Listando: ");
        personagens.forEach(p -> System.out.println(p));
        System.out.println();
    }
}
