## 📚 Documentação da API

### 🔐 Autenticação

Para acessar as rotas protegidas (como criar turmas), você precisa primeiro obter um **Token JWT**.

#### 1. Login (Gerar Token)
* **POST** `/auth/login`
* **Body:**
    ```json
    {
      "email": "sara@teste.com",
      "senha": "123"
    }
    ```
* **Resposta:** Retorna uma `String` com o Token JWT.

---

### 👩‍🏫 Professores

#### 2. Cadastrar Professor
* **POST** `/professores`
* **Acesso:** Público (Por enquanto)
* **Body:**
    ```json
    {
      "nome": "Sara Silva",
      "email": "sara@teste.com",
      "senha": "123"
    }
    ```

#### 3. Listar Professores
* **GET** `/professores`
* **Header:** `Authorization: Bearer <SEU_TOKEN>`

---

### 🏫 Turmas

#### 4. Criar Turma
* **POST** `/turmas`
* **Header:** `Authorization: Bearer <SEU_TOKEN>`
* **Body:**
    ```json
    {
      "nome": "Engenharia de Software",
      "ano": "2026.1"
    }
    ```

#### 5. Matricular Professor na Turma
* **POST** `/turmas/{id_turma}/professores/{id_professor}`
* **Header:** `Authorization: Bearer <SEU_TOKEN>`
* **Descrição:** Vincula um professor existente a uma turma existente.

---