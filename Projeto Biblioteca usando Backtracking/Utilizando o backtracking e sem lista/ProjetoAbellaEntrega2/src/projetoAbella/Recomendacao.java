package projetoAbella;

public class Recomendacao {
    
    public void recomendarPorAutor(ArvoreBinaria livros, String autor) {
        recomendarRecursivo(livros.getRaiz(), autor);
    }
    
    private void recomendarRecursivo(NoDaArvore no, String autor) {
        if (no != null) {
            recomendarRecursivo(no.esquerda, autor);
            if (no.livro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(no.livro);
            }
            recomendarRecursivo(no.direita, autor);
        }
    }
    public void recomendacaoMelhor(ArvoreBinaria livros, String autor) {
        System.out.println("Caminho de leitura melhor sugerido: ");
        recomendarCaminhoBacktracking(livros.getRaiz(), autor, null);
    }
    
    private boolean recomendarCaminhoBacktracking(NoDaArvore no, String autor, Livro anterior) {
        if (no == null) return false;
    
        // Se encontramos um livro com o mesmo autor
        if (no.livro.getAutor().equalsIgnoreCase(autor)) {
            if (anterior == null || Math.abs(no.livro.getAnoPublicacao() - anterior.getAnoPublicacao()) <= 5) {
                System.out.println(no.livro);
                // Continue procurando pelo próximo livro
                return recomendarCaminhoBacktracking(no.esquerda, autor, no.livro) || 
                       recomendarCaminhoBacktracking(no.direita, autor, no.livro);
            }
        }
        return recomendarCaminhoBacktracking(no.esquerda, autor, anterior) || 
               recomendarCaminhoBacktracking(no.direita, autor, anterior);
    }




}

