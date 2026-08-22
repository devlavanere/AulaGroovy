package exercicios.ast

import groovy.transform.builder.Builder
import groovy.transform.ToString

/**
 * O @Builder cria os métodos de construção fluente.
 * O @ToString (que o curso já citou) nos ajuda a imprimir o resultado.
 */
@Builder
@ToString
class DispositivoIot {
    String microcontrolador
    String protocolo
    String linguagem
    boolean ativo
}
