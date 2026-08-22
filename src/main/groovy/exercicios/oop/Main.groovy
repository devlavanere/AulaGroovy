package exercicios.oop

println "=== TESTANDO A MODELAGEM DO TWEET ==="

// Usando o construtor nomeado (Map constructor)
def meuTweet = new TweetAvancado(
        usuario: "Michel",
        texto: "Revisando conceitos de #Groovy e #OOP"
)

println "Usuário: ${meuTweet.usuario}"
println "Data: ${meuTweet.dataPublicacao}"
println "Texto original: ${meuTweet.texto}"

println "\n--- Extração Automática via Regex ---"
// A "Groovy Truth" do encapsulamento:
// Quando chama '.hashtags', o Groovy automaticamente executa o método 'getHashtags()'
println "Hashtags encontradas: ${meuTweet.hashtags}"
println "Menções encontradas: ${meuTweet.mentions}"

