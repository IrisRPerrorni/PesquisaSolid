# PesquisaSolid

No meu GitHub estão os exemplos no código de todos os princípios de SOLID:

S — Single Responsibility (Responsabilidade Única)

O — Open-Closed (Aberto - Fechado)

L — Liskov Substitution (Substituição de Liskov)

I — Interface Segregation (Segregação por Interface)

D — Dependency Inversion (Inversão de Dependência)

Os códigos foram baseado através de pesquisa cuja a fonte foi retirada do site community do topico Princípios SOLID em JAVA
___________________________
- Single Responsibility Principle (Princípio da Responsabilidade Única);

Esse princípio afirma que uma classe deve ter apenas uma responsabilidade. Ou seja, cada classe ou estrutura semelhante no código da sua aplicação deve fazer apenas um trabalho.

![Single](https://github.com/IrisRPerrorni/PesquisaSolid/assets/133882090/5c17b47e-5cc3-413e-ab78-0be8f266a147)

Imagem 1 : Exemplo de código que não utiliza o princípio da responsabilidade única em Java , autenticação do usuário e lógica de validação de cargos misturados.

![Single2](https://github.com/IrisRPerrorni/PesquisaSolid/assets/133882090/685de4f7-8e32-4d73-8ae7-35a80a0ad9b4)

Imagem 2: Código solucionado utilizando o o problema de acordo com o princípio da Responsabilidade Única, cada responsabilidade foi separada em uma classe, tornando mais fácil a sua alteração e teste
_______________

- Open-Closed (Aberto - Fechado)

O Princípio Aberto-Fechado afirma que as classes ou objetos devem ser abertos para extensão, mas fechados para modificação  

![opencloseErrado](https://github.com/IrisRPerrorni/PesquisaSolid/assets/133882090/5fa2707e-ce6d-4860-a72a-3e0026299e35)

Imagem 3: Exemplos de classes que representam contratos de funcionários, que não utilizam o princípio Aberto-Fechado pois se a empresa for adotar novas formas de contrato, teria que modificar a classe “FolhadePagamento”

![openeClose](https://github.com/IrisRPerrorni/PesquisaSolid/assets/133882090/ab3bce0d-fe4b-4656-b1d4-0e90d2ea3b38)

Imagem 4: Código solucionado utilizando o princípio Open-Close , a classe “FolhaDePagamento” não precisa mais saber quais métodos chamar para calcular o pagamento. Enquanto a interface "Remunerável" estiver implementada, ela poderá calcular corretamente a remuneração de qualquer novo tipo de funcionário criado no futuro sem precisar alterar seu código-fonte.

_____________________

- L — Liskov Substitution (Substituição de Liskov)

Classes derivadas podem ser substitutas de suas classes base, ou ainda: toda e qualquer classe derivada pode ser usada como se fosse a classe base.

![image](https://github.com/IrisRPerrorni/PesquisaSolid/assets/133882090/6b62a1e8-745e-4a9f-b247-3c3a26c324dd)

Imagem 5 : Exemplo de código utilizando o princípio Liskov Substitution. que a classe derivada seja usada de forma transparente onde a classe base é vista. Assim, todo código que depende da classe base poderá usar qualquer uma das derivadas em tempo de execução mesmo sem saber da existência delas.
_________________

 - Interface Segregation (Segregação por Interface)

De acordo com esse princípio, uma classe nunca deve ser obrigada a implementar interfaces e métodos que ela não usará. De modo geral, esse princípio afirma que é melhor construir interfaces pequenas e específicas  em vez de interfaces genéricas.

![image](https://github.com/IrisRPerrorni/PesquisaSolid/assets/133882090/fe7f439e-a757-4ab0-bab1-486d8f3f6ab7)

Imagem 6: Exemplo de código não utilizando a Segregação por interface , observe-se a atribuição de comportamento genérico para todas as demais classe, como a classe pinguim que implmentou o método “setAltitude” , porém pinguim não voam.

![image](https://github.com/IrisRPerrorni/PesquisaSolid/assets/133882090/dd93d501-9aa5-47e4-a391-b3245de933ed)

Imagem 7 : Solucionando o problema do código anterior utilizando o princípio de Segregação por Interface, observa que nesse código foi possível isolar os comportamentos das aves de maneira correta.
_____

- Dependency Inversion (Inversão de Dependência)

Esse princípio afirma que, primeiro, módulos de alto nível não devem depender de módulos de baixo nível, eles devem depender de abstrações; e segundo que as abstrações não devem depender de detalhes; detalhes devem depender de abstrações.

![image](https://github.com/IrisRPerrorni/PesquisaSolid/assets/133882090/e6d0cd4d-530f-4681-aeee-afd1a0dfac98)

Imagem 8: Exemplo de código que não utiliza o conceito Inversão de Dependência, caso quisermos adicionar outro tipo de motor , exigirá a refatoração da classe Carro.

![image](https://github.com/IrisRPerrorni/PesquisaSolid/assets/133882090/86a24cb8-98f6-4f27-b98f-965e1b928612)

Imagem 9: solucionando o problema adicionando uma camada de abstração utilizando uma interface .

![image](https://github.com/IrisRPerrorni/PesquisaSolid/assets/133882090/a68bff67-6f34-446f-863b-fc0671e9de57)

Imagem 10: Agora podemos conectar qualquer tipo de Engine que implemente a interface Engine à classe carro.
_____

Fonte :Princípios SOLID em Java 
https://community.revelo.com.br/principios-solid-em-java/



