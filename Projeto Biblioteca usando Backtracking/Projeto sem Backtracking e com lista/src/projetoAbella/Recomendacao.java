package projetoAbella;

import java.util.ArrayList;
import java.util.List;

public class Recomendacao {
    
    public List<Livro> recomendarPorAutor(ArvoreBinaria livros, String autor) {
        List<Livro> recomendados = new ArrayList<>();
        recomendarRecursivo(livros.getRaiz(), autor, recomendados);
        return recomendados;
    }

    private void recomendarRecursivo(NoDaArvore no, String autor, List<Livro> recomendados) {
        if (no != null) {
            recomendarRecursivo(no.esquerda, autor, recomendados);
            if (no.livro.getAutor().equalsIgnoreCase(autor)) {
                recomendados.add(no.livro);
            }
            recomendarRecursivo(no.direita, autor, recomendados);
        }
    }
}
