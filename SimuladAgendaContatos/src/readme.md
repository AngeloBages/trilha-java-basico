# Agenda de Contatos em Java

Este é um aplicativo simples de agenda de contatos em Java. As classes `Contato`, `AgendaContatos`, e `Central` trabalham juntas para permitir que você adicione contatos à agenda, exiba os contatos, pesquise por nome e atualize os números de contato.

## Contato.java

A classe `Contato` representa um contato individual com campos para nome e número de telefone. Ela possui métodos `hashCode` e `equals` para garantir a identificação única dos contatos com base no nome e/ou número de telefone.

## AgendaContatos.java

A classe `AgendaContatos` gerencia a agenda de contatos, permitindo que você adicione contatos, exiba os contatos, pesquise por nome e atualize números de contato. Ela utiliza um `Set` para armazenar os contatos, garantindo que não haja duplicatas.

## Central.java

A classe `Central` é a classe principal que inicia o programa. Ela oferece um menu interativo para o usuário escolher entre adicionar contatos, exibir contatos, pesquisar contatos por nome, atualizar números de contato e sair do programa.

## Como Executar

1. Compile todas as classes fornecidas.
2. Execute a classe `Central` no seu ambiente Java.
3. O programa apresentará um menu interativo que permite que você escolha entre as opções de ação.
4. Você pode adicionar contatos à agenda, exibir os contatos, pesquisar contatos por nome e atualizar números de contato até optar por sair.
