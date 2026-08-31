# 🍣 Sakura_Sushis

> Sistema desktop desenvolvido em Java para gerenciamento de uma loja de sushis, com cadastro de produtos, realização de pedidos e acompanhamento das vendas.

---

## 📌 Sobre o projeto

O **Sakura_Sushis** é um sistema desenvolvido individualmente durante minha formação no **Ensino Médio Técnico Integrado em Informática pelo Instituto Federal do Norte de Minas Gerais (IFNMG) – Campus Arinos**.

O projeto simula o funcionamento básico de uma loja de sushis, permitindo cadastrar os produtos disponíveis, realizar pedidos e acompanhar o resumo das vendas realizadas.

Embora seja um projeto de nível acadêmico e não tenha como objetivo implementar regras extremamente complexas de um sistema comercial real, ele foi muito importante para minha formação, principalmente no desenvolvimento do **raciocínio lógico, organização de código e aplicação prática dos conceitos de programação em Java**.

---

## 🎯 Objetivo

O principal objetivo do projeto foi colocar em prática conhecimentos adquiridos durante o curso técnico, desenvolvendo uma aplicação funcional com **interface gráfica**, manipulação de dados e implementação de regras de negócio.

Durante o desenvolvimento, pude trabalhar principalmente com:

- Programação em Java;
- Desenvolvimento de interfaces gráficas;
- JavaFX;
- Estruturas de dados;
- Manipulação de informações;
- Regras de negócio;
- Lógica de programação;
- Organização e apresentação de dados;
- Desenvolvimento individual de uma aplicação do início ao fim.

---

## ⚙️ Funcionalidades

### 🍣 Cadastro de Sushis

O sistema permite cadastrar os sushis disponíveis na loja, armazenando informações como:

- **Código**
- **Peixe**
- **Tipo**
- **Recheio**
- **Quantidade disponível**
- **Preço**

Os produtos cadastrados são apresentados em tabelas dentro da aplicação, facilitando a visualização das informações.

---

### 🛒 Realização de pedidos

Através do módulo de pedidos, o usuário pode informar o **código do sushi desejado**.

O sistema então verifica se o produto está cadastrado e se existe quantidade disponível em estoque.

Quando o pedido é realizado, a quantidade disponível do sushi é atualizada, realizando a **baixa do produto no estoque**.

Esse processo permitiu aplicar na prática conceitos de:

- Busca de informações;
- Validação de dados;
- Manipulação de objetos;
- Controle de quantidade;
- Atualização de informações;
- Regras condicionais.

---

### 📊 Resumo de vendas

O sistema também possui uma área destinada ao acompanhamento das vendas realizadas.

Entre as informações apresentadas estão:

- **Código**
- **Tipo**
- **Acréscimos**
- **Peixe**
- **Preço de venda**
- **Preço de custo**
- **Quantidade vendida**

Essas informações são organizadas em tabelas para facilitar a consulta e visualização dos resultados.

---

## 🖥️ Interface

A aplicação possui uma interface gráfica desenvolvida com **JavaFX**, utilizando botões, tabelas e diferentes elementos visuais para facilitar a interação com o sistema.

O design utiliza principalmente uma combinação de **tons de rosa, laranja, preto e cinza**, buscando criar uma identidade visual relacionada ao tema de uma loja de sushi.

### Tela inicial

![Tela inicial do Sakura Sushis](./screenshots/tela-inicial.png)

A tela inicial apresenta as principais opções do sistema:

- Cadastrar Sushi
- Fazer Pedido
- Resumo de Vendas

---

## 🛠️ Tecnologias utilizadas

| Tecnologia | Utilização |
|---|---|
| ☕ **Java** | Linguagem principal do projeto |
| 🎨 **JavaFX** | Desenvolvimento da interface gráfica |
| 🧠 **Programação Orientada a Objetos** | Estruturação do sistema |
| 📋 **Tabelas JavaFX** | Exibição dos dados |
| 🖥️ **Aplicação Desktop** | Plataforma do sistema |

---

## 🧩 Estrutura do sistema

De maneira geral, o funcionamento do sistema pode ser representado pelo seguinte fluxo:

```text
                 ┌─────────────────────┐
                 │   Sakura_Sushis     │
                 └──────────┬──────────┘
                            │
             ┌──────────────┼──────────────┐
             │              │              │
             ▼              ▼              ▼
       ┌───────────┐  ┌────────────┐  ┌───────────────┐
       │ Cadastro  │  │   Pedido   │  │ Resumo vendas │
       │ de Sushi  │  │            │  │               │
       └─────┬─────┘  └──────┬─────┘  └───────────────┘
             │               │
             ▼               ▼
       ┌───────────┐   ┌─────────────┐
       │ Produtos  │   │ Verificação │
       │ cadastrados│  │ de estoque  │
       └───────────┘   └──────┬──────┘
                              │
                              ▼
                       ┌─────────────┐
                       │ Baixa no    │
                       │ estoque     │
                       └─────────────┘
