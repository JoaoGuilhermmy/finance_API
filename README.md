<div align="center">

# 💰 Finance API

### _Plataforma de Gestão Financeira com Tecnologias Bleeding Edge_

[![Java](https://img.shields.io/badge/Java-25_Latest_Features-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.2-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-316192?style=for-the-badge&logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![Railway](https://img.shields.io/badge/Railway-Deployed-0B0D0E?style=for-the-badge&logo=railway&logoColor=white)](https://railway.app/)
[![Swagger](https://img.shields.io/badge/OpenAPI-3.0-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)](https://swagger.io/)
[![MIT License](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](https://choosealicense.com/licenses/mit/)

<br>

[![Live Demo](https://img.shields.io/badge/🚀_ACESSE_O_DEMO_AO_VIVO-Experimente_Agora-00C7B7?style=for-the-badge&labelColor=000000)](https://financeapi-production-cc70.up.railway.app/swagger-ui/index.html)

<br>

_API RESTful de alta performance para gerenciamento de finanças pessoais, construída com o que há de mais recente no ecossistema Java (2026)._

</div>

---

## 📢 Sobre o Projeto

Este projeto **explora o poder do ecossistema Java moderno** (Java 25 + Spring Boot 4.0.2), demonstrando **alta performance, código limpo e arquitetura escalável**. Desenvolvido com **o que há de mais recente no ecossistema Java em 2026**, este não é apenas um CRUD básico — é uma **plataforma completa** que exemplifica as melhores práticas de desenvolvimento backend.

### 🎯 Diferenciais Técnicos

- ⚡ **Java 25 (Latest Features)**: Aproveitando as funcionalidades mais recentes da linguagem, incluindo Virtual Threads, Record Patterns, Sequenced Collections e Structured Concurrency
- 🚀 **Spring Boot 4.0.2**: Framework de última geração com otimizações de performance e suporte nativo às novidades do Java 25
- 🏗️ **Arquitetura em Camadas**: Separação clara de responsabilidades (Presentation → Business → Data Access)
- 🔒 **Exception Handling Robusto**: Tratamento centralizado com `@ControllerAdvice` e respostas padronizadas
- 📊 **Persistência Multi-Ambiente**: PostgreSQL 16 em produção, H2 in-memory para testes
- 🔗 **Relacionamentos JPA**: Modelagem de dados com entidades relacionadas bidirecionalmente
- 📚 **Documentação OpenAPI 3.0**: Interface Swagger interativa para testes em tempo real
- ☁️ **CI/CD Automatizado**: Deploy contínuo na Railway com zero downtime

---

## 🚀 Stack Tecnológica

<table>
<thead>
<tr>
<th><b>Tecnologia</b></th>
<th><b>Versão</b></th>
<th><b>Função no Projeto</b></th>
</tr>
</thead>
<tbody>
<tr>
<td><img src="https://img.shields.io/badge/Java-25-ED8B00?logo=openjdk&logoColor=white" /></td>
<td><b>25 (Latest)</b></td>
<td>Linguagem base com Virtual Threads, Record Patterns, Sequenced Collections, Structured Concurrency e as features mais modernas de 2026</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/Spring_Boot-4.0.2-6DB33F?logo=spring-boot&logoColor=white" /></td>
<td><b>4.0.2</b></td>
<td>Framework moderno com <b>melhorias de performance</b>, suporte nativo ao Java 25 e Spring Framework 6.2</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/Spring_Data_JPA-4.0-6DB33F?logo=spring&logoColor=white" /></td>
<td>4.0.x</td>
<td>Abstração de persistência com repositórios declarativos e suporte a queries derivadas</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/Hibernate-6.6-59666C?logo=hibernate&logoColor=white" /></td>
<td>6.6.x</td>
<td>ORM de alta performance com otimizações para Java moderno</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/PostgreSQL-16-316192?logo=postgresql&logoColor=white" /></td>
<td>16</td>
<td>Banco de dados relacional em produção (Railway) com suporte a JSON, arrays e queries avançadas</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/H2_Database-2.2-00008B" /></td>
<td>2.2.x</td>
<td>Banco em memória para testes automatizados (perfil <code>test</code>)</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/SpringDoc_OpenAPI-2.8.5-85EA2D?logo=swagger&logoColor=black" /></td>
<td>2.8.5</td>
<td>Geração automática de documentação Swagger/OpenAPI 3.0 com anotações Jakarta</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/Maven-3.9-C71A36?logo=apache-maven&logoColor=white" /></td>
<td>3.9.12</td>
<td>Build automation e gerenciamento de dependências</td>
</tr>
<tr>
<td><img src="https://img.shields.io/badge/Railway-Cloud-0B0D0E?logo=railway&logoColor=white" /></td>
<td>Latest</td>
<td>Plataforma PaaS com PostgreSQL gerenciado, CI/CD e HTTPS nativo</td>
</tr>
</tbody>
</table>

> 💡 **Por que Java 25 + Spring Boot 4?** Esta combinação traz melhorias significativas de performance, redução no tempo de startup, suporte nativo às Virtual Threads e Structured Concurrency do Java 25, e integração otimizada com o ecossistema moderno de observabilidade.

---

## 🧩 Arquitetura do Sistema

### Diagrama de Fluxo

```mermaid
graph TD
    A[Cliente HTTP/REST] -->|Requisição JSON| B[Controllers Layer]
    B -->|Validação de Entrada| C[Services Layer]
    C -->|Lógica de Negócio| D[Repositories Layer]
    D -->|JPA/Hibernate ORM| E[(PostgreSQL 16 - Railway)]
    
    B -->|Exception Lançada| F[Exception Handler]
    F -->|StandardError JSON| A
    
    C -->|@Transactional| D
    E -->|Dados Persistidos| D
    
    style A fill:#e1f5ff,stroke:#0077cc,stroke-width:3px
    style B fill:#ffe1e1,stroke:#cc0000,stroke-width:3px
    style C fill:#fff4e1,stroke:#cc8800,stroke-width:3px
    style D fill:#e1ffe1,stroke:#00cc00,stroke-width:3px
    style E fill:#f0e1ff,stroke:#8800cc,stroke-width:3px
    style F fill:#ffe1f5,stroke:#cc0077,stroke-width:3px
```

### Camadas da Aplicação

| Camada | Responsabilidade | Principais Anotações |
|--------|------------------|---------------------|
| **Presentation** | Receber requisições HTTP, serializar/deserializar JSON, validar entrada | `@RestController`, `@RequestMapping`, `@GetMapping`, `@PostMapping` |
| **Business Logic** | Processar regras de negócio, orquestrar transações, aplicar validações | `@Service`, `@Transactional` |
| **Data Access** | Abstração de persistência, queries SQL/JPQL, gerenciamento de entidades | `@Repository`, `JpaRepository<T, ID>` |
| **Domain Model** | Representar entidades de negócio e seus relacionamentos | `@Entity`, `@Table`, `@ManyToOne`, `@OneToMany` |
| **Exception Handling** | Capturar e tratar exceções de forma centralizada | `@ControllerAdvice`, `@ExceptionHandler` |

---

## 🔌 Endpoints da API

### 👤 Gerenciamento de Usuários (`/users`)

| Método | Endpoint | Descrição | Status Code |
|--------|----------|-----------|-------------|
| `GET` | `/users` | Lista todos os usuários cadastrados | 200 OK |
| `GET` | `/users/{id}` | Busca usuário específico por ID | 200 OK / 404 Not Found |
| `POST` | `/users` | Cria novo usuário | 201 Created |
| `PUT` | `/users/{id}` | Atualiza dados de usuário existente | 200 OK / 404 Not Found |
| `DELETE` | `/users/{id}` | Remove usuário (verifica integridade referencial) | 204 No Content / 400 Bad Request |
| `GET` | `/users/{id}/expenses` | Lista todas as despesas de um usuário | 200 OK / 404 Not Found |

### 💳 Gerenciamento de Despesas (`/expenses`)

| Método | Endpoint | Descrição | Status Code |
|--------|----------|-----------|-------------|
| `GET` | `/expenses` | Lista todas as despesas registradas | 200 OK |
| `GET` | `/expenses/{id}` | Busca despesa específica por ID | 200 OK / 404 Not Found |
| `POST` | `/expenses` | Registra nova despesa | 201 Created |
| `PUT` | `/expenses/{id}` | Atualiza despesa existente | 200 OK / 404 Not Found |
| `DELETE` | `/expenses/{id}` | Remove despesa | 204 No Content / 404 Not Found |

---

## 📄 Exemplos de Payloads JSON

### Criar Novo Usuário

<details>
<summary><b>POST /users</b></summary>

**Request Body:**
```json
{
  "name": "João Dev",
  "email": "joao@tech.com"
}
```

**Response (201 Created):**
```json
{
  "id": 1,
  "name": "João Dev",
  "email": "joao@tech.com"
}
```

**Response Header:**
```
Location: https://financeapi-production-cc70.up.railway.app/users/1
```

</details>

### Registrar Nova Despesa

<details>
<summary><b>POST /expenses</b></summary>

**Request Body:**
```json
{
  "description": "Almoço Executivo - Restaurante Italiano",
  "price": 125.50,
  "date": "2026-01-30T12:30:00Z",
  "user": {
    "id": 1
  }
}
```

**Response (201 Created):**
```json
{
  "id": 1,
  "description": "Almoço Executivo - Restaurante Italiano",
  "price": 125.50,
  "date": "2026-01-30T12:30:00Z",
  "user": {
    "id": 1,
    "name": "João Dev",
    "email": "joao@tech.com"
  }
}
```

**Response Header:**
```
Location: https://financeapi-production-cc70.up.railway.app/expenses/1
```

</details>

### Atualizar Despesa Existente

<details>
<summary><b>PUT /expenses/{id}</b></summary>

**Request Body:**
```json
{
  "description": "Almoço Executivo - Valor Atualizado",
  "price": 135.00,
  "date": "2026-01-30T13:00:00Z"
}
```

**Response (200 OK):**
```json
{
  "id": 1,
  "description": "Almoço Executivo - Valor Atualizado",
  "price": 135.00,
  "date": "2026-01-30T13:00:00Z",
  "user": {
    "id": 1,
    "name": "João Dev",
    "email": "joao@tech.com"
  }
}
```

</details>

### Listar Despesas de um Usuário

<details>
<summary><b>GET /users/{id}/expenses</b></summary>

**Response (200 OK):**
```json
[
  {
    "id": 1,
    "description": "Almoço Executivo",
    "price": 125.50,
    "date": "2026-01-30T12:30:00Z",
    "user": {
      "id": 1,
      "name": "João Dev",
      "email": "joao@tech.com"
    }
  },
  {
    "id": 2,
    "description": "Uber - Casa → Escritório",
    "price": 28.00,
    "date": "2026-01-30T08:15:00Z",
    "user": {
      "id": 1,
      "name": "João Dev",
      "email": "joao@tech.com"
    }
  },
  {
    "id": 3,
    "description": "Café da Manhã - Padaria",
    "price": 15.50,
    "date": "2026-01-30T07:45:00Z",
    "user": {
      "id": 1,
      "name": "João Dev",
      "email": "joao@tech.com"
    }
  }
]
```

</details>

### Tratamento de Erros

<details>
<summary><b>Exemplo de Erro 404 - Recurso Não Encontrado</b></summary>

**Request:**
```
GET /users/9999
```

**Response (404 Not Found):**
```json
{
  "timestamp": "2026-01-30T15:45:30Z",
  "status": 404,
  "error": "Resource not found!",
  "message": "Resource not found id: 9999",
  "path": "/users/9999"
}
```

</details>

---

## 📦 Como Rodar o Projeto

### Pré-requisitos

- ☕ **Java 25** ou superior ([Download OpenJDK](https://openjdk.org/projects/jdk/25/))
- 📦 **Maven 3.9+** (ou use o wrapper incluído: `./mvnw`)
- 🐳 **Docker** (opcional, para containerização)
- 🐘 **PostgreSQL 16** (para ambiente de produção local)

---

### 🐳 Opção 1: Rodando com Docker (Recomendado)

```bash
# Clone o repositório
git clone https://github.com/JoaoGuilhermmy/finance_API.git
cd finance_API

# Construa a imagem Docker
docker build -t finance-api:latest .

# Execute o container (configure as variáveis de ambiente)
docker run -p 8080:8080 \
  -e PGHOST=seu-postgresql-host \
  -e PGPORT=5432 \
  -e PGDATABASE=finance-db \
  -e PGUSER=seu-usuario \
  -e PGPASSWORD=sua-senha-segura \
  finance-api:latest
```

---

### ⚙️ Opção 2: Rodando com Maven (Desenvolvimento Local)

#### 🧪 Modo Teste (H2 Database em Memória)

```bash
# Clone o repositório
git clone https://github.com/JoaoGuilhermmy/finance_API.git
cd finance_API

# Execute com perfil de teste
./mvnw spring-boot:run -Dspring-boot.run.profiles=test

# Acesse a aplicação
# 🌐 API Base: http://localhost:8080
# 🗄️ H2 Console: http://localhost:8080/h2-console
# 📚 Swagger UI: http://localhost:8080/swagger-ui/index.html
```

**Configurações do H2 Console:**
```
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: (deixe em branco)
```

---

#### 🚀 Modo Produção (PostgreSQL)

```bash
# Configure as variáveis de ambiente
export PGHOST=localhost
export PGPORT=5432
export PGDATABASE=finance-db
export PGUSER=postgres
export PGPASSWORD=sua-senha-segura

# Compile e execute a aplicação
./mvnw clean package -DskipTests
./mvnw spring-boot:run

# Acesse o Swagger UI
# 📚 http://localhost:8080/swagger-ui/index.html
```

---

### 🔐 Configuração de Variáveis de Ambiente

Para rodar em produção local, configure as seguintes variáveis de ambiente:

```bash
# PostgreSQL Connection
PGHOST=seu-postgresql-host          # Ex: localhost ou IP do servidor
PGPORT=5432                          # Porta padrão do PostgreSQL
PGDATABASE=finance-db                # Nome do banco de dados
PGUSER=seu-usuario                   # Usuário do PostgreSQL
PGPASSWORD=sua-senha-segura          # Senha do usuário
```

**Método 1: Arquivo `.env` (recomendado para desenvolvimento)**

Crie um arquivo `.env` na raiz do projeto:

```bash
PGHOST=localhost
PGPORT=5432
PGDATABASE=finance-db
PGUSER=postgres
PGPASSWORD=SuaSenhaForte123!
```

**Método 2: Export direto no terminal**

```bash
export PGHOST=localhost
export PGPORT=5432
export PGDATABASE=finance-db
export PGUSER=postgres
export PGPASSWORD=SuaSenhaForte123!
```

> ⚠️ **Segurança Crítica**: 
> - Nunca commite arquivos `.env` ou credenciais no Git
> - Adicione `.env` ao `.gitignore`
> - Use serviços de gerenciamento de secrets em produção (AWS Secrets Manager, HashiCorp Vault, etc.)

---

## ☁️ Deploy em Produção (Railway)

A aplicação está atualmente **hospedada na Railway**, uma plataforma moderna de deploy com as seguintes características:

### ✨ Features da Railway

- ✅ **CI/CD Totalmente Automatizado**: Deploy automático a cada push na branch `main`
- ✅ **PostgreSQL 16 Gerenciado**: Banco de dados provisionado e mantido automaticamente
- ✅ **HTTPS Nativo**: Certificados SSL/TLS gerenciados pela plataforma
- ✅ **Logs em Tempo Real**: Monitoramento completo via dashboard
- ✅ **Rollback Instantâneo**: Voltar para versões anteriores com um clique
- ✅ **Variáveis de Ambiente Seguras**: Gerenciamento de secrets integrado
- ✅ **Auto-scaling**: Escala horizontal conforme demanda

### 🌐 Acessar Aplicação em Produção

**URL Base:** [https://financeapi-production-cc70.up.railway.app](https://financeapi-production-cc70.up.railway.app/swagger-ui/index.html)  
**Swagger UI:** [https://financeapi-production-cc70.up.railway.app/swagger-ui/index.html](https://financeapi-production-cc70.up.railway.app/swagger-ui/index.html)

### ⚙️ Configurações do Deploy

| Configuração | Valor |
|--------------|-------|
| **Runtime** | Java 25 (OpenJDK) |
| **Build Command** | `mvn clean package -DskipTests` |
| **Start Command** | `java -jar target/finance-api-0.0.1-SNAPSHOT.jar` |
| **Port** | 8080 (detectado automaticamente) |
| **Database** | PostgreSQL 16 (gerenciado) |
| **Region** | US West |

---

## 🧪 Testes

```bash
# Executar todos os testes
./mvnw test

# Executar testes com relatório detalhado
./mvnw test -Dtest=* --debug

# Executar com cobertura (requer plugin JaCoCo)
./mvnw clean test jacoco:report

# Relatório de cobertura em: target/site/jacoco/index.html
```

---

## 📚 Documentação Interativa (Swagger/OpenAPI)

Toda a API está documentada com **Swagger/OpenAPI 3.0**. Acesse a interface interativa:

- **🌐 Produção**: [https://financeapi-production-cc70.up.railway.app/swagger-ui/index.html](https://financeapi-production-cc70.up.railway.app/swagger-ui/index.html)
- **💻 Local**: `http://localhost:8080/swagger-ui/index.html`

### 🎯 Recursos do Swagger UI

- ✅ Visualizar todos os endpoints disponíveis organizados por tags
- ✅ Testar requisições HTTP diretamente no navegador
- ✅ Ver schemas completos dos modelos de dados (DTOs/Entities)
- ✅ Consultar códigos de resposta HTTP e exemplos
- ✅ Autenticação integrada (quando habilitada)
- ✅ Download da especificação OpenAPI em JSON/YAML

---

## 🛠️ Tecnologias e Padrões Aplicados

### Arquitetura & Design Patterns

- ✅ **Layered Architecture** (Presentation → Business → Data → Domain)
- ✅ **Repository Pattern** via Spring Data JPA
- ✅ **Dependency Injection** com inversão de controle (IoC)
- ✅ **DTO Pattern** (implícito via entidades JPA serializáveis)

### Boas Práticas de Código

- ✅ **REST API** com verbos HTTP semânticos (GET, POST, PUT, DELETE)
- ✅ **HTTP Status Codes** corretos para cada operação
- ✅ **Exception Handling Centralizado** com `@ControllerAdvice`
- ✅ **Validação de Dados** em múltiplas camadas
- ✅ **Profiles do Spring** para ambientes (test, dev, prod)

### Persistência & Banco de Dados

- ✅ **JPA/Hibernate** para ORM
- ✅ **Relacionamentos bidirecionais** com `@JsonIgnore` para evitar loops
- ✅ **Auto-incremento de IDs** com estratégia `GenerationType.AUTO`
- ✅ **Timestamps ISO 8601** com `Instant` e `@JsonFormat`
- ✅ **Transações gerenciadas** com `@Transactional`

---

## 📁 Estrutura do Projeto

```
finance_API/
│
├── src/
│   ├── main/
│   │   ├── java/com/joaoguilhermmy/finance/
│   │   │   ├── config/                        # Configurações da aplicação
│   │   │   │   ├── OpenApiConfig.java         # Configuração Swagger/OpenAPI
│   │   │   │   └── TesteConfig.java           # Seed de dados para testes
│   │   │   │
│   │   │   ├── entities/                      # Modelos de domínio (JPA Entities)
│   │   │   │   ├── User.java                  # Entidade Usuário
│   │   │   │   └── Expense.java               # Entidade Despesa
│   │   │   │
│   │   │   ├── repositories/                  # Camada de acesso a dados
│   │   │   │   ├── UserRepository.java        # Repositório de Usuários
│   │   │   │   └── ExpenseRepository.java     # Repositório de Despesas
│   │   │   │
│   │   │   ├── services/                      # Lógica de negócio
│   │   │   │   ├── UserService.java           # Serviço de Usuários
│   │   │   │   ├── ExpenseService.java        # Serviço de Despesas
│   │   │   │   └── exception/                 # Exceções customizadas
│   │   │   │       ├── ResourceNotFoundExcepetion.java
│   │   │   │       └── DatabaseExcepition.java
│   │   │   │
│   │   │   ├── resources/                     # Controllers REST
│   │   │   │   ├── UserResource.java          # Endpoints de Usuários
│   │   │   │   ├── ExpenseResource.java       # Endpoints de Despesas
│   │   │   │   └── exception/                 # Exception Handlers
│   │   │   │       ├── ResourceExceptionHandler.java
│   │   │   │       └── StandardError.java
│   │   │   │
│   │   │   └── PersonalFinanceApiApplication.java  # Classe principal
│   │   │
│   │   └── resources/
│   │       ├── application.properties              # Configuração produção
│   │       └── application-test.properties         # Configuração testes
│   │
│   └── test/
│       └── java/com/joaoguilhermmy/finance/
│           └── PersonalFinanceApiApplicationTests.java
│
├── .mvn/                                      # Maven Wrapper
├── pom.xml                                    # Dependências Maven
├── .gitignore                                 # Arquivos ignorados pelo Git
├── LICENSE                                    # Licença MIT
└── README.md                                  # Documentação do projeto
```

---

## 🤝 Autor & Contato

<div align="center">

### João Guilhermmy

**Backend Developer | Java & Spring Specialist**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-João_Guilhermmy-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/joão-guilhermmy-93661b29b)
[![Email](https://img.shields.io/badge/Email-joaoguilhermmy2@gmail.com-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:joaoguilhermmy2@gmail.com)
[![GitHub](https://img.shields.io/badge/GitHub-JoaoGuilhermmy-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/JoaoGuilhermmy)

</div>

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

<div align="center">

**⭐ Se este projeto foi útil para você, considere dar uma estrela no repositório!**

Desenvolvido com ☕ e ❤️ por **João Guilhermmy**

</div>
