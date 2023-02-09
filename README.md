# Programa que faz cálculo do holerite mensal com descontos

## Objetivo
Este programa tem como objetivo realizar o cálculo de um holerite mensal com base em seu sálario bruto, com descontos de IRPF e INSS.
Se caso houver benefícios, estes também entram no cálculo, são eles: Vale Refeição, Vale Alimentação, Vale Transporte e Convênio Médico. Horas extras e bônus de pagamentos podem ser adicionados no cálculo.

Retornar para o usuário todos os créditos e débitos, assim como seu salário líquido mensal.

## Requisitos

IDE utilizada:
* [Apache NetBeans IDE 14](https://netbeans.apache.org/)

## Funcionamento

### Inserção e exibição de dados
 
Ao clicar em 'RUN' é exibida uma mensagem de boas vindas e é solicitada a digitação do nome completo do funcionário. Nessa etapa, são solicitadas algumas informações do funcionário, no qual o usuário as informa manualmente.
![INSERCAO](https://user-images.githubusercontent.com/105086121/217902029-bdb7b929-a588-4fa0-a9ec-b7d6b7ecf438.png)

Após preencher todas as informações, é exibida todos os descontos do holerite mensal, já calculados e o valor final do salário do funcionário.
![EXIBICAO](https://user-images.githubusercontent.com/105086121/217902031-3a7a526d-9f2e-477b-b399-6aa9e177118a.png)

### Cálculo do INSS e do IRPF

Foi utilizado como fundamento de cálculo os descontos do INSS e do IRPF informados pelo governo federal no ano de 2022. 
No caso do INSS, para um salário bruto menor ou igual a R$1212,00 o desconto é de 7,5% do valor total.
Para um salário bruto maior que R$1212,00 e menor ou igual a R$2427,35 o desconto é de 9% do valor total.
Para um salário bruto maior que R$2427,35 e menor ou igual a R$3641,03 o desconto é de 12% do valor total.
Para um salário bruto maior que R$3641,03 o desconto é de 14% do valor total.
![INSS](https://user-images.githubusercontent.com/105086121/217904250-65c1cafa-a47f-4d5e-a5cb-d8c789ac66da.png)

Já no IRPF, para um salário bruto menor ou igual a R$1903,98 não há descontos.
Para um salário bruto maior que R$1903,98 e menor ou igual a R$2826,65 o desconto é de 7,5% do valor total.
Para um salário bruto maior que R$2826,65 e menor ou igual a R$3751,05 o desconto é de 15% do valor total.
Para um salário bruto maior ou igual a R$4664,68 o desconto é de 22,5% do valor total.
![IRPF](https://user-images.githubusercontent.com/105086121/217904244-3df312aa-bf30-4fed-a301-bb82b30aa475.png)
