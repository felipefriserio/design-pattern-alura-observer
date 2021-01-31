<p align="center">
    <a href="https://www.alura.com.br">
        <img height=85 src="https://i.pinimg.com/originals/49/72/6e/49726e65f6b35c2e8e366a16c0734fb7.png">
    </a>
</p>

Estudo de Designs patterns ALURA - Observer

Quando temos acoes que devem ser executadas após um comportamento, chamamos essas ações de observadores.
A classe então, após efetuar a ação, invoca/ notifica os observadores.

Vantagem de grande desacoplamento. Nota fiscalbuilder agora depende apenas da interface 'AposGerarNota'. 
Adicionar novos comportamentos fica mais fácil, basta adicionar na lista de ações. 
