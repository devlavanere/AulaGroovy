# Estudos Groovy - Monorepo

Repositório central para armazenamento de resumos, exercícios práticos e experimentações desenvolvidas durante os estudos da linguagem Groovy. A arquitetura segue o modelo de *Monorepo*, concentrando teoria e prática em um único ambiente configurado.

---

## Stack Tecnológico

*   **Linguagem:** Apache Groovy (v4.0.22)
*   **Base:** Java JDK 8
*   **Gerenciador de Dependências/Build:** Gradle
*   **Gerenciador de Ambiente:** SDKMAN!
*   **IDE:** IntelliJ IDEA

---

##  Estrutura do Repositório

O código fonte está organizado dentro de `src/main/groovy/` seguindo as seguintes categorias:

*   `/teoria`: Scripts focados em anotações das aulas e demonstrações de sintaxe (ex: classes, annotations, Grapes).
*   `/exercicios`: Resoluções das propostas práticas do curso (ex: modelagem da classe Tweet).
*   `/sandbox`: Ambiente livre para testes de código, rascunhos e experimentações.

---

## 💻 Comandos Úteis (Guia de Sobrevivência)

### SDKMAN!
Gerenciamento das versões do Groovy e Java:

```bash
# Listar versões disponíveis do Groovy
sdk list groovy

# Verificar a versão atual em uso
sdk version
groovy -version

# Carregar o SDKMAN! (caso o comando 'sdk' não seja reconhecido)
source "$HOME/.sdkman/bin/sdkman-init.sh"