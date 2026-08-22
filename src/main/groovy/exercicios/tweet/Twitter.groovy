package exercicios.tweet

println "--- Iniciando o App Twitter ---"

// 1. Criando os Tweets usando o construtor gerado pelo @Canonical
def primeiroTweet = new Tweet("Michel", "Revisando o exercício do Tweet no meu monorepo Groovy!")
def segundoTweet = new Tweet("Visitante", "Aprendendo Groovy com Gradle", 5)

// 2. Imprimindo as instâncias
println primeiroTweet
println segundoTweet

println "-------------------------------"

// 3. Testando o método de alterar propriedades
primeiroTweet.curtir()
primeiroTweet.curtir()

println "\nStatus atualizado do primeiro tweet:"
println primeiroTweet

