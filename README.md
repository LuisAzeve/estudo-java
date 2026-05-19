# ☕ Estudo Java & Projetos

Repositório dedicado ao estudo da linguagem Java, evolução da lógica de programação, estruturas de dados e desenvolvimento de APIs robustas com o ecossistema Spring.

---

## 🏎️ Projeto Destaque: Sistema de Gestão de Estoque Automotivo

Este projeto simula um ambiente real de gerenciamento de inventário para uma concessionária de veículos, resolvendo problemas clássicos de desorganização operacional e inconsistência de dados através de uma arquitetura escalável e segura.

> **Evolução Arquitetural:** O sistema nasceu originalmente em Java Puro utilizando conexão direta via JDBC e interface por terminal (CLI). Para atingir os padrões exigidos pelo mercado atual, a aplicação foi totalmente migrada e refatorada para uma **API REST com Spring Boot**, persistência de dados relacional com **MySQL** e mapeamento objeto-relacional (ORM) dinâmico.


### 🛠️ Tecnologias Utilizadas

* **Java 26** (JDK)
* **Spring Boot 3.x** (Web MVC)
* **Spring Data JPA & Hibernate**
* **MySQL Server**
* **Project Lombok**
* **Maven** (Gerenciador de Dependências)

---

### 💻 Como Executar a Aplicação

#### Pré-requisitos
* JDK instalado configurado nas variáveis de ambiente.
* Servidor MySQL ativo.
* Ferramenta para testes de API (Postman, Insomnia ou extensão de sua escolha).

#### 1. Clonar o repositório
```bash
git clone [https://github.com/LuisAzeve/estudo-java.git](https://github.com/LuisAzeve/estudo-java.git)
cd estudo-java/concessionaria-springboot
