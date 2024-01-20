# Repositório do projeto `Regra de Progressão` 📈

Repositório possuí projeto desenvolvido abordando conceitos
de `Classes e tipos de dados`, `Controle de fluxo e entrada de dados`
e `Gerenciamento de dependência`.

## Informações de aprendizados

- Primeiro projeto desenvolvido em `Java`;
- Primeiro projeto usando `Apache Maven`.

## Linguagens e ferramentas usadas

[![Git][Git-logo]][Git-url]
[![Java][Java-logo]][Java-url]
[![Apache-Maven][Apache-Maven-logo]][Apache-Maven-url]

## O que foi desenvolvido

Neste projeto, implementei um programa em Java com uma interface intuitiva no terminal, que
permitirá:

- a. Cadastrar atividades avaliativas para o período, seja exercícios ou projetos.

- b. Inserir as notas dos exercícios e projetos cadastrados para o período. O programa calculará
  automaticamente o percentual alcançado, revelando seu desempenho de forma nítida e objetiva.

- c. Com base no percentual alcançado, você descobrirá se foi aprovado ou reprovado. A mágica
  acontece quando você supera o limite de 85%.

## Habilidades trabalhadas

- `Lembrar` Será necessário lembrar os conceitos e as instruções relacionados ao programa em Java,
  bem como as regras e as etapas do sistema de avaliação da Trybe.

- `Compreender` Será necessário compreender os requisitos e as funcionalidades do programa em Java,
  assim como a lógica por trás do cálculo do percentual alcançado.

- `Aplicar` Será necessário aplicar seus conhecimentos em programação Java para desenvolver o
  programa que permite cadastrar atividades, inserir notas e calcular o percentual alcançado.

- `Analisar` Durante o desenvolvimento do programa, a pessoa estudante analisará diferentes casos de
  uso e situações para garantir que o programa funcione corretamente em diversas circunstâncias.

- `Avaliar` A avaliação das notas e dos cálculos do percentual alcançados permitirá à pessoa
  estudante que avalie o próprio desempenho e determine se ela foi aprovada ou reprovada.

- `Criar` A criação do programa em Java em si é um ato criativo, em que a pessoa estudante
  construirá um sistema funcional que atende aos requisitos estabelecidos.

- `Solucionar problemas` Durante o desenvolvimento do programa, podem surgir desafios e problemas
  que exigirão habilidades de resolução de problemas para identificar e corrigir os erros.

## Instruções para instalar e rodar

<details>

1. Clone o repositório (recomendado usar em SSH) e entre na pasta:

    ```bash
    git clone git@github.com:ludson96/regra-progressao.git
    cd regra-progressao
    ```

1. Instale as dependências:

    ```bash
    mvn install
    ```
1. Para executar o a classe principal `App`:

    ```bash
    mvn exec:java
    ```

</details>

[//]: # (## Detalhamento das funções)

[//]: # ()

[//]: # (Abaixo está uma lista das funções disponíveis.)

[//]: # ()

[//]: # (<details>)

[//]: # ()

[//]: # (### `study_schedule&#40;permanence_period, target_time&#41;`)

[//]: # ()

[//]: # (- localizado em `challenges/challenge_study_schedule.py`)

[//]: # ()

[//]: # (Essa função recebe uma lista de tuplas &#40;`permanence_period`&#41; em que cada tupla representa o período de permanência de uma pessoa estudante no sistema com seu horário de entrada e de saída e um numero inteiro &#40;`target_time`&#41; que será o objetivo  de tempo a ser analisado como parâmetro, retorna a quantidade de pessoas estudantes estavam no sistema neste horário.)

[//]: # ()

[//]: # (Exemplo de uso:)

[//]: # ()

[//]: # (```python)

[//]: # (permanence_period = [&#40;2, 2&#41;, &#40;1, 2&#41;, &#40;2, 3&#41;, &#40;1, 5&#41;, &#40;4, 5&#41;, &#40;4, 5&#41;])

[//]: # (students_quantity = study_schedule&#40;permanence_period, 5&#41;)

[//]: # (```)

[//]: # ()

[//]: # (Exemplo de retorno:)

[//]: # ()

[//]: # (```md)

[//]: # (# Nos arrays temos 6 estudantes)

[//]: # ()

[//]: # (# estudante             1       2       3       4       5       6)

[//]: # (permanence_period = [&#40;2, 2&#41;, &#40;1, 2&#41;, &#40;2, 3&#41;, &#40;1, 5&#41;, &#40;4, 5&#41;, &#40;4, 5&#41;])

[//]: # ()

[//]: # (target_time = 5  # saída: 3, pois a quarta, a quinta e a sexta pessoa estudante ainda estavam estudando nesse horário.)

[//]: # (target_time = 4  # saída: 3, pois a quinta e a sexta pessoa estudante começaram a estudar nesse horário e a quarta ainda estava estudando.)

[//]: # (target_time = 3  # saída: 2, pois a terceira e a quarta pessoa estudante ainda estavam estudando nesse horário.)

[//]: # (target_time = 2  # saída: 4, pois a primeira, a segunda, a terceira e a quarta pessoa estudante estavam estudando nesse horário.)

[//]: # (target_time = 1  # saída: 2, pois a segunda e a quarta pessoa estudante estavam estudando nesse horário.)

[//]: # ()

[//]: # (Para esse exemplo, depois de rodar a função para todos esses `target_times`, julgamos que o melhor horário é o `2`, pois esse retornou `4`, já que 4 estudantes estavam presentes nesse horário!)

[//]: # (```)

[//]: # ()

[//]: # (</details>)

[Git-logo]: https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white

[Git-url]: https://git-scm.com

[Java-logo]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white

[Java-url]: https://www.java.com/pt-BR/

[Apache-Maven-logo]: https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white

[Apache-Maven-url]: https://maven.apache.org/