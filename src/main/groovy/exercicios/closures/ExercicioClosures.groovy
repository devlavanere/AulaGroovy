package exercicios.closures

println "=== PARTE 1: CLOSURE BASICS ==="

// 1. Método que recebe uma Closure como argumento
def executarTarefa(Closure tarefa) {
    println "Preparando para executar a tarefa..."
    tarefa() // Executa a closure
    println "Tarefa concluída!\n"
}

// 2. Criando um Closure que realiza uma ação
def minhaClosure = {
    println "-> Imprimindo algo de dentro da Closure"
}

// 3. Passando Closure para o método
executarTarefa(minhaClosure)

println "=== PARTE 2: ITERAÇÕES (Listas e Mapas) ==="

// 4. Lista iterada com .each
def linguagens = [
        "Java", "Groovy", "Python"
]
print "Lista: "
linguagens.each { print "$it" }
println "\n"

// 5. Mapa iterado com .each passando 2 argumentos (chave e valor)
def cargos = [
        "Michel": "Full Stack Developer",
        "João": "DevOps",
        "Maria": "Tech Lead"
]
println "Mapa de Cargos:"
cargos.each { nome, cargo ->
    println "- $nome atua como $cargo"
}

println "\n=== PARTE 3: CURRY (Congelando Parâmetros) ==="
// O método curry() permite preencher alguns parâmetros de uma Closure com antecedência,
// criando uma nova Closure que exige menos parâmetros.

def logMensagem = { tipo, mensagem ->
    println "[$tipo] $mensagem"
}

// Novas closures 'curried' criadas, onde o primeiro parâmetro já está preenchido
def logInfo = logMensagem.curry("INFO")
def logErro = logMensagem.curry("ERROR")

println "\n=== PARTE 4: EXPLORANDO O GDK ==="

def numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

// 1. find vs findAll
// 'find' retorna apenas o PRIMEIRO elemento que bater com a condição.
// 'findAll' retorna UMA NOVA LISTA com TODOS os elementos que baterem com a condição.

println "find (primeiro > 5): " + numeros.find { it > 5 }
println "findAll (todos > 5): " + numeros.findAll { it > 5 }

// 2. any vs every
// 'any' retorna booleano (true) se PELO MENOS UM elemento bater com a condição.
// 'every' retorna booleano (true) se TODOS os elementos baterem com a condição.
println "any (tem número par?): " + numeros.any { it % 2 == 0 }
println "every (todos são > 0?): " + numeros.every { it > 0 }
println "every (todos são < 5?): " + numeros.every { it < 5 }

// 3. groupBy
// 'groupBy' cria um Mapa. A chave é o retorno da Closure,
// e o valor é a lista de itens que geraram aquela chave.
def agrupadosPorParidade = numeros.groupBy { it % 2 == 0 ? "Pares" : "Ímpares" }

println "\ngroupBy (Agrupando números):"
agrupadosPorParidade.each { chave, lista ->
    println "$chave: $lista"
}

