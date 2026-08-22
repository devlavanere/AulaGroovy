package exercicios.tweet

import groovy.transform.Canonical

/**
 * A anotação @Canonical gera automaticamente:
 * - O construtor com todos os parâmetros
 * - Os métodos getters e setters
 * - O método toString()
 */
@Canonical
class Tweet {
    String usuario
    String texto;
    int curtida = 0

    // Método para alterar uma propriedade
    def curtir() {
        this.curtida++
        println("O Tweet do usuário: $usuario, ganhou curtida igual a $curtida")
    }
}
