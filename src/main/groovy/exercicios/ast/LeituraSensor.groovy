package exercicios.ast

import groovy.transform.Sortable
import groovy.transform.ToString

/**
 * O @Sortable permite ordenar listas dessa classe.
 * Usa de "includes" para ordenar especificamente pelo valor da temperatura.
 */
@Sortable(includes = ['temperatura'])
@ToString
class LeituraSensor {
    String local
    double temperatura
}
