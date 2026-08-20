package teoria

import groovy.transform.Canonical

// Comentários

/*
Comentário de múltiplas linhas.
Veja o exemplo abaixo da classe:
*/

// 4. ANNOTATIONS E AST TRANSFORMATIONS
@Canonical
class Produto {

    // KEYWORDS: Tipagem Estática
    String nome
    BigDecimal preco

    // Keyword 'def' para: Tipagem Dinâmica
    def aplicaDesconto(desconto) {
        return preco - desconto
    }
}

// Scripts códigos executáveis
println "--------Iniciando Script da Aula--------"

// Numbers
int quantidade = 5;
def precoUnitario = 19.99
def total = quantidade * precoUnitario

// Assertions
assert total instanceof BigDecimal
assert quantidade == 5
println "Total calculado: R\$ $total (As asserções passaram!)"

def produto = new Produto("Teclado Mecânico", 250.50)
println "Produto criado: $produto"

// Operations
def nomeCliente = null
def saudacao = nomeCliente ?: "Visitante" // Luciono Operator
def tamanhoNome = nomeCliente?.size() // Save navagation operator
def comparacao = (10 <=> 5) // Spaceship operator

println "A saudação é: $saudacao e o tamanho do nome: $tamanhoNome"

// GROOVY CONTROL STRUCTURE
println "\n--- Estruturas de Controle ---"
print "Contagem: "

for (i in 1..3) {
    print "$i "
}

println ""

// Jeito nativo sem precisar do Grape
def textoGroovy = "groovy com gradle é incrivel!".toUpperCase()
println "Uso do Groovy puro: $textoGroovy"

