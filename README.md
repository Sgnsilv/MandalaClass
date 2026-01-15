# 🎓 MandalaClass - Sistema de Gestão Escolar

O **MandalaClass** é uma API RESTful desenvolvida para gerenciar o ecossistema acadêmico, permitindo o cadastro de professores, gestão de turmas e matrículas. O projeto foca em boas práticas de arquitetura (Camadas), segurança (JWT) e modelagem de dados relacionais.

## 🚀 Tecnologias Utilizadas

* **Java 17** & **Spring Boot 3**
* **Spring Security** + **JWT (Auth0)** para autenticação stateless.
* **Spring Data JPA** (Hibernate) para persistência.
* **H2 Database** (Banco em memória para prototipagem rápida).
* **Lombok** (Redução de código boilerplate).
* **Maven** (Gerenciamento de dependências).

---

## ⚙️ Como Rodar o Projeto

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/Sgnsilv/MandalaClass.git
    ```
2.  **Entre na pasta:**
    ```bash
    cd mandalaclass
    ```
3.  **Execute via terminal (Linux/WSL):**
    ```bash
    ./mvnw spring-boot:run
    ```
    *A aplicação iniciará na porta `8080`.*

---

## 🚧 Próximos Passos (Roadmap)
- [x] CRUD de Professores.
- [x] Autenticação JWT e Segurança.
- [x] CRUD de Turmas e Vínculo com Professores.
- [x] CRUD de Alunos e Matrículas.
- [ ] **Configuração de Docker (PostgreSQL).**
- [ ] Sistema de Lançamento de Notas.
- [ ] Tratamento de Exceções Global (ControllerAdvice).