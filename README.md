# API RESTful para Planejamento de Viagens



## Índice

- [Sobre](https://www.notion.so/first-1d6e04471b3c47f6bdd1c56345a0a350?pvs=21)
- [Instalação](https://www.notion.so/first-1d6e04471b3c47f6bdd1c56345a0a350?pvs=21)
- [Funcionalidades](https://www.notion.so/first-1d6e04471b3c47f6bdd1c56345a0a350?pvs=21)
- [Tecnologias](https://www.notion.so/first-1d6e04471b3c47f6bdd1c56345a0a350?pvs=21)
- [Contribuição](https://www.notion.so/first-1d6e04471b3c47f6bdd1c56345a0a350?pvs=21)
- [Licença](https://www.notion.so/first-1d6e04471b3c47f6bdd1c56345a0a350?pvs=21)
- [Contato](https://www.notion.so/first-1d6e04471b3c47f6bdd1c56345a0a350?pvs=21)

## Sobre

Este projeto consiste em uma API RESTful conectada a um banco de dados H2, destinada ao planejamento de viagens. A API gerencia quatro entidades principais: `Trip`, `Activity`, `Link` e `Participant`, que se relacionam por chaves estrangeiras. Cada entidade possui pacotes separados em `java.com.planner` (trip, activity, link, participant), e cada pacote contém os arquivos de Data, Repository, Service, Controller, RequestPayload e CreateResponse.

O banco de dados H2 é reiniciado e as migrações são controladas pelo sistema a cada inicialização da aplicação, começando sempre com um banco em branco.

## Instalação

Passo a passo de como instalar e configurar o ambiente de desenvolvimento.

```bash
# Clone o repositório
git clone <https://github.com/seu-usuario/nome-do-projeto.git>

# Entre no diretório do projeto
cd nome-do-projeto

# Instale as dependências usando Maven
mvn install

# Inicie a aplicação
mvn spring-boot:run

```

Para testar a aplicação, utilizei o Insomnia na porta 8080, passando os endpoints definidos na aplicação Java. Exemplos de uso:

```bash
# Exemplo de JSON para criar uma viagem
{
  "destination": "Florianópolis, SC",
  "starts_at": "2024-06-25T21:51:54.7342",
  "ends_at": "2024-06-25T21:51:54.7342",
  "emails_to_invite": ["fwefwe.fWEF@wef.com"],
  "owner_name": "wefwefwefsdfe3",
  "owner_email": "teste.teste@lore.com"
}

```

## Funcionalidades

- Gerenciamento de viagens (`Trip`)
- Criação e atualização de atividades (`Activity`)
- Gerenciamento de participantes (`Participant`)
- Criação e atualização de links (`Link`)
- Métodos para confirmar participantes, criar atividades, recuperar detalhes das viagens, entre outros

## Tecnologias

Liste as principais tecnologias usadas no projeto:

- Java 21
- Maven
- Spring Web
- Flyway
- Spring Dev Tools
- Lombok
- JPA
- H2 Database

## Contribuição

Como outros desenvolvedores podem contribuir para o projeto:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`).
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`).
4. Envie para a branch (`git push origin feature/AmazingFeature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

## Contato

Rafael Napolitano

LinkedIn: https://www.linkedin.com/in/rafaelnapolitano/



## Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

## Contato
Rafael Napolitano
LinkedIn: https://www.linkedin.com/in/rafaelnapolitano/
