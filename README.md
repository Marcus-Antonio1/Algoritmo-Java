 O projeto tem como objetivo organizar uma coleção de livros usando as técnicas de Árvore
 binária e o backtracking.
 De forma que a árvore foi usada para a organização dos livros de uma maneira mais
 eficiente que permite operações de busca e de inserção de certa forma mais rápidas e
 tendo a organização dos livros baseados no titulos
 O uso do backtracking foi o melhor escolhido para a função de recomendação, pelo fato de
 ser necessário explorar toda a árvore para encontrar todos os livros de um autor. O
 backtracking atua para não deixar de verificar nenhuma possibilidade e é uma solução
 simples e eficiente nesse caso.
 Funcionando dessa maneira:
 Percorre a árvore de maneira recursiva: Começa pela raiz e percorre todas as subárvores
 (esquerda e direita) de forma recursiva.
 Verifica o autor em cada nó: Para cada nó da árvore, o algoritmo verifica se o autor do livro
 no nó corresponde ao autor buscado.
 Armazena as soluções: Se o autor corresponder, o livro é adicionado à lista de
 recomendados.
 Retrocede (backtrack): O algoritmo vai retrocedendo, ou seja, volta para o nó anterior assim
 que termina de percorrer todas as subárvores de um nó, garantindo que todas as
 possibilidades sejam verificadas
