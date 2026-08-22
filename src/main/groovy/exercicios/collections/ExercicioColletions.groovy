package exercicios.collections

println "=== PARTE 1: RANGES COM ENUMS ==="

// Criando o Range do Domingo até o Sábado usando os Enums
def diasRange = DiasDaSemana.DOMINGO..DiasDaSemana.SABADO

println "$diasRange"
println "Tamanho do Range: ${diasRange.size()}"
println "O Range comtém QUARTA? ${diasRange.contains(DiasDaSemana.QUARTA)}"
println "Elemento inicial (from): ${diasRange.from}"
println "Elemento final (to): ${diasRange.to}"

println "\n=== PARTE 2: LISTS (Listas) ==="

// Groovy, declara listas apenas usando colchetes []
def diasLista = [
    "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"
]

println "Lista Inicial: $diasLista"
println "Tamanho da Lista: ${diasLista.size()}"

// Removendo o Sábado
diasLista.remove("Sábado")
println "Após remover Sábado: $diasLista"

// Adicionando o Sábado de volta usando o operador de append (<<)
diasLista << "Sábado"
println "Após adicionar Sábado novamente: $diasLista"

// Acessando a Quarta-feira pelo índice (Obs: índices começam em 0)
println "Acessando pelo índice [3]: ${diasLista[3]}"

println "\n=== PARTE 3: MAPS (Mapas/Dicionários) ==="

// Mapas no Groovy também usam colchetes, com a estrutura Chave:Valor
def diasMapa = [
        1: "Domingo",
        2: "Segunda",
        3: "Terça",
        4: "Quarta",
        5: "Quinta",
        6: "Sexta",
        7: "Sábado"
]

println "Mapa completo: $diasMapa"
println "Nome da classe do Mapa: ${diasMapa.getClass().getName()}" // O Groovy usa java.util.LinkedHashMap por padrão
println "Tamanho do mapa: ${diasMapa.size()}"

// O exercício pede para imprimir os valores (os dias) SEM usar Closures.
// Nesse usei o método nativo do Java API .values()
println "Imprimindo apenas os valores: ${diasMapa.values()}"
