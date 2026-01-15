
##Documentação da API

### 🔐 Autenticação

**1. Login (Gerar Token)**
* **POST** `/auth/login`
* **Body:** `{"email": "...", "senha": "..."}`
* **Resposta:** Retorna o Token JWT (Bearer).
* *Obs: Necessário para acessar as rotas de escrita abaixo.*

---

### 👩‍🏫 Professores

**2. Cadastrar Professor**
* **POST** `/professores`
* **Body:** `{"nome": "...", "email": "...", "senha": "..."}`

**3. Listar Professores**
* **GET** `/professores`

---

### 🎓 Alunos (Novo!)

**4. Cadastrar Aluno**
* **POST** `/alunos`
* **Header:** `Authorization: Bearer <TOKEN>`
* **Body:**
    ```json
    {
      "nome": "Joãozinho",
      "matricula": "2026001",
      "dataNascimento": "2010-05-20"
    }
    ```

**5. Listar Alunos**
* **GET** `/alunos`
* **Header:** `Authorization: Bearer <TOKEN>`

---

### 🏫 Turmas & Matrículas

**6. Criar Turma**
* **POST** `/turmas`
* **Header:** `Authorization: Bearer <TOKEN>`
* **Body:** `{"nome": "Engenharia de Software", "ano": "2026.1"}`

**7. Vincular Professor na Turma**
* **POST** `/turmas/{id_turma}/professores/{id_professor}`
* **Header:** `Authorization: Bearer <TOKEN>`

**8. Matricular Aluno na Turma (Novo!)**
* **POST** `/turmas/{id_turma}/matriculas/{id_aluno}`
* **Header:** `Authorization: Bearer <TOKEN>`
* **Descrição:** Cria o vínculo oficial entre o aluno e a turma.

---