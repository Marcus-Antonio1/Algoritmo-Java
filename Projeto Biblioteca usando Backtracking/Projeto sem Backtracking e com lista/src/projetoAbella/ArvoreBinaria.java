package projetoAbella;

public class ArvoreBinaria {
    private NoDaArvore raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void adicionar(Livro livro) {
        raiz = adicionarRecursivo(raiz, livro);
    }

    private NoDaArvore adicionarRecursivo(NoDaArvore no, Livro livro) {
        if (no == null) {
            return new NoDaArvore(livro);
        }

        if (livro.getTitulo().compareTo(no.livro.getTitulo()) < 0) {
            no.esquerda = adicionarRecursivo(no.esquerda, livro);
        } else if (livro.getTitulo().compareTo(no.livro.getTitulo()) > 0) {
            no.direita = adicionarRecursivo(no.direita, livro);
        }

        return no;
    }

    public NoDaArvore getRaiz() {
        return raiz;
    }

    public void listarEmOrdem() {
        listarEmOrdemRecursivo(raiz);
    }

    private void listarEmOrdemRecursivo(NoDaArvore no) {
        if (no != null) {
            listarEmOrdemRecursivo(no.esquerda);
            System.out.println(no.livro);
            listarEmOrdemRecursivo(no.direita);
        }
    }

    public Livro buscarPorTitulo(String titulo) {
        return buscarPorTituloRecursivo(raiz, titulo);
    }

    private Livro buscarPorTituloRecursivo(NoDaArvore no, String titulo) {
        if (no == null || no.livro.getTitulo().equalsIgnoreCase(titulo)) {
            return no != null ? no.livro : null;
        }

        if (titulo.compareTo(no.livro.getTitulo()) < 0) {
            return buscarPorTituloRecursivo(no.esquerda, titulo);
        } else {
            return buscarPorTituloRecursivo(no.direita, titulo);
        }
    }
}