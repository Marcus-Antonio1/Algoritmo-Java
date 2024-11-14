package projetoAbella;

import java.util.Scanner;

public class Interface {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Livros");
            System.out.println("2. Listar Livros");
            System.out.println("3. Buscar Livro por Título");
            System.out.println("4. Recomendar Livros por Autor");
            System.out.println("5. Recomendar Caminho de Leitura por Autor");
            System.out.println("6. SAIR");
            System.out.println(" ");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    addLivro(scanner, biblioteca);
                    break;

                case 2:
                    biblioteca.listarLivros();
                    break;

                case 3:
                    System.out.print("Digite o título: ");
                    String tituloBusca = scanner.nextLine();
                    biblioteca.buscarLivroPorTitulo(tituloBusca);
                    break;

                case 4:
                    System.out.print("Digite o nome do autor: ");
                    String autorBusca = scanner.nextLine();
                    biblioteca.recomendarLivrosPorAutor(autorBusca);
                break;

                case 5:
                    System.out.print("Digite o nome do autor: ");  // Backtracking
                    String autorCaminho = scanner.nextLine();
                    biblioteca.recomendacaoMelhor(autorCaminho);
                    break;

                case 6:
                    System.out.println("Ok você finalizou sua ação, até mais e Volte sempre!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void addLivro(Scanner scanner, Biblioteca biblioteca) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ano de Publicação: ");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine();
        
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        biblioteca.addLivro(livro);
        System.out.println("Livro adicionado!");
    }
}