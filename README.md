# Projeto de Automação de Testes com Selenium e JUnit

Este projeto contém exemplos de automação de testes de login e registro usando Selenium WebDriver em Java com JUnit. Os testes são executados no site BugBank, e os casos de teste foram desenvolvidos para validar diferentes cenários

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

- Java Development Kit (JDK).
- Maven
- ChromeDriver (para executar os testes no Google Chrome)

## Configuração do ambiente

<h4> Clone o repositório para a sua máquina local:</h4>
      
      git clone https://github.com/LucasBrito162/bugbank.git
<h4>Navegue até o diretório raiz do projeto:</h4>
     
      cd bugbank
<h4>Instale as dependências do projeto usando o Maven:</h4>

      mvn  install
## Executando os testes
<h5>Siga as etapas abaixo para executar os testes:</h5>

1. Certifique-se de ter o ChromeDriver configurado corretamente no seu sistema.
2. Execute os testes usando o Maven:

       mvn test
Isso executará todos os testes definidos nas classes de teste.

## Estrutura do projeto

- Essa estrutura organiza as classes de teste, Page Objects e classes auxiliares em pacotes 
separados para manter uma estrutura organizada e facilitar a manutenção do projeto.

        |-- src
          |-- main   
          |   |-- java
          |       |-- br.com.automacaodozero
          |           |-- BasePO.java
          |           |-- LoginPO.java
          |           |-- RegisterPO.java
                
          |-- test
          |   |-- java
          |       |-- br.com.automacaodozero
          |           |-- BaseTest.java
          |           |-- LoginTest.java
          |           |-- RegisterTest.java
               
## Contribuição
Contribuições são bem-vindas! Se você encontrar algum problema no projeto ou tiver 
sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

