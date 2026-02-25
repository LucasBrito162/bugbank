# Projeto de Automação de Testes com Selenium e JUnit

Este projeto contém exemplos de automação de testes de login e registro usando Selenium WebDriver em Java com JUnit. Os testes são executados no site BugBank, e os casos de teste foram desenvolvidos para validar diferentes cenários

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

- Java Development Kit (JDK).
- Maven
- Google Chrome (os testes rodam em modo headless por padrão via ChromeDriver gerenciado automaticamente pelo WebDriverManager)

## Configuração do ambiente

<h4> Clone o repositório para a sua máquina local:</h4>
      
      git clone https://github.com/LucasBrito162/bugbank.git
<h4>Navegue até o diretório raiz do projeto:</h4>
     
      cd bugbank
<h4>Instale as dependências do projeto usando o Maven:</h4>

      mvn  install
## Executando os testes
<h5>Siga as etapas abaixo para executar os testes:</h5>

1. Execute os testes usando o Maven:

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



## Melhorias de organização

- O diretório `target/` (artefatos de build) foi removido do versionamento e incluído no `.gitignore`.
- Arquivos de lock do Node que não são utilizados por este projeto Java também foram removidos.
- A configuração base de testes foi ajustada para execução estável em CI (modo headless).
