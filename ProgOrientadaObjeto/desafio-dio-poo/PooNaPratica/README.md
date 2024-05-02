## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

# Estrutura o Teste:

## Explicação d´ código:

### Importações:

Importa as classes necessárias para trabalhar com listas (ArrayList e LinkedList), entrada de dados (Scanner) e tratamento de exceções (Exception).
Classe principal:
`main(String[] args)`: Ponto de entrada do programa.

### Variáveis:

`saldoInicial`: Armazena o saldo inicial da conta.
`quantidadeTransacoes`: Armazena a quantidade de transações que o cliente deseja realizar.
`transacoes`: Uma lista para armazenar as transações realizadas.

### Entrada de dados:

Solicita ao usuário o saldo inicial e a quantidade de transações.
Utiliza o Scanner para ler os valores digitados pelo usuário.

### Entrada de transações:

- Percorre a quantidade de transações informada pelo usuário.
- Para cada transação:
- Solicita ao usuário o tipo de transação (D para depósito ou S para saque) e o valor da transação.
- Cria um objeto Transacao com as informações coletadas.
- Adiciona a transação à lista transacoes.
  Atualiza o saldo da conta com base na transação realizada.
  Exibição do saldo final e transações:
  Exibe o saldo final da conta.
  Percorre a lista de transações e imprime cada transação formatada.
  Classe Transacao:
  Representa uma transação bancária.
  Possui atributos para armazenar o tipo de transação (tipoTransacao) e o valor da transação (`valor`)
