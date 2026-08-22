package teoria

println "=== 1. Optional Typing e Tipos de Dados ==="
// No Groovy, tudo é objeto (não existem tipos primitivos reais, o Groovy faz autoboxing).
// Você pode usar tipagem forte (como no Java) ou tipagem dinâmica usando 'def'.

int numeroTipado = 10
def variavelDinamica = "Sou uma String agora"
variavelDinamica = 15 // Vira inteiro, groovy permite sem quebrar o código
println "Variável dinâmica agora é do tipo: ${variavelDinamica.class.name}"

println "\n=== 2. Working with Numbers (Trabalhando com Números) ==="
def decimal = 15.50 // Por padrão, decimais são BigDecimal no Groovy.
println "Tipo do decimal: ${decimal.class.name}"

print "Loop simplificado com números: "
3.times { print "Groovy! " } // Executa o bloco 3 vezes
println ""

print "De 1 até 5: "
1.upto(5) { print "$it " }
println ""


println "\n=== 3. Operator Overloading (Sobrecarga de Operadores) ==="
// No Groovy, cada operador mapeia para um método.
// O operador '+' chama o método .plus(), o '-' chama .minus(), etc.
def lista1 = [1, 2, 3]
def lista2 = [4, 5]
def listaSomada = lista1 + lista2 // Chama lista1.plus(lista2) por baixo dos panos
println "Listas somadas com o operador '+': $listaSomada"

def palavra = "Groovy"
def pedaco = palavra - "vy" // Chama palavra.minus("vy")
println "Subtraindo texto de texto: $pedaco"


println "\n=== 4. Strings e GStrings ==="
// String simples (semelhante ao Java, não aceita variáveis no meio)
String aspasSimples = 'Isso é uma String do Java (java.lang.String)'

// GString (Aceita interpolação de variáveis)
def linguagem = "Groovy"
def aspasDuplas = "Isso é uma GString, aprendendo $linguagem! (org.codehaus.groovy.runtime.GStringImpl)"

// String de Múltiplas Linhas (ótimo para queries SQL, JSON ou HTML)
def multiLinhas = '''
    SELECT * 
    FROM usuarios 
    WHERE ativo = true
'''
println aspasDuplas
println multiLinhas

println "\n=== 5. Regular Expressions (Expressões Regulares) ==="
// O Groovy usa Regex com a notação Slashy (/ /)
def texto = "O CEP da minha rua é 65000-000 e o da empresa é 60000-111"

// Operador Matcher (=~) : Busca padrões dentro de um texto
def padraoCep = /\d{5}-\d{3}/ // Regex para CEP (5 dígitos, um traço, 3 dígitos)
def buscador = texto =~ padraoCep

println "CEPs encontrados no texto:"
buscador.each { match -> println "-> $match" }

// Operador Match Exato (==~) : Verifica se a string INTEIRA bate com o padrão
def apenasUmCep = "65000-000"
def isCepValido = (apenasUmCep ==~ padraoCep)
println "O texto '$apenasUmCep' é um CEP perfeitamente válido? $isCepValido"
