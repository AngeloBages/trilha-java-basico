# Catálogo de Livros em Java

Este é um aplicativo simples de catálogo de livros em Java. As classes `CatalogoLivros`, `Central`, e `Livro` trabalham juntas para permitir que você adicione livros ao catálogo, pesquise livros por autor, por intervalo de anos ou por título.

## CatalogoLivros.java

A classe `CatalogoLivros` gerencia o catálogo de livros, permitindo que você adicione livros e pesquise por autor, intervalo de anos ou título. Ela utiliza o Java Stream API para realizar as pesquisas.

## Central.java

A classe `Central` é a classe principal que inicia o programa. Ela oferece um menu interativo para o usuário escolher entre adicionar livros, pesquisar por autor, intervalo de anos ou título, e sair do programa.

## Livro.java

A classe `Livro` representa um livro individual com campos para título, autor e ano de publicação. Ela também possui um método `toString` para formatar a exibição dos detalhes do livro.

## Como Executar

1. Compile todas as classes fornecidas.
2. Execute a classe `Central` no seu ambiente Java.
3. O programa apresentará um menu interativo que permite que você escolha entre as opções de ação.
4. Você pode adicionar livros ao catálogo e realizar pesquisas por autor, intervalo de anos ou título até optar por sair.
