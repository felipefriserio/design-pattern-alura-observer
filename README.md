Estudo de Designs patterns ALURA - Observer

Quando temos acoes que devem ser executadas após um comportamento, chamamos essas ações de observadores.
A classe então, após efetuar a ação, invoca/ notifica os observadores.

Vantagem de grande desacoplamento. Nota fiscalbuilder agora depende apenas da interface 'AposGerarNota'. 
Adicionar novos comportamentos é fácil, basta adicionar na lista de ações  
