package projetoAbella;

public class NoDaArvore {
    Livro livro;
    NoDaArvore esquerda, direita;

    public NoDaArvore(Livro livro) {
        this.livro = livro;
        this.esquerda = null;
        this.direita = null;
    }
}