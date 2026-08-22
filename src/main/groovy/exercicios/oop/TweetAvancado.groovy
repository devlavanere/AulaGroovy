package exercicios.oop

class TweetAvancado {
    // Propriedades
    String usuario
    String texto
    Date dataPublicacao = new Date() // Já inicializa com a data e hora atuais
    int curtidas = 0

    // 2. Extraindo Hashtags
    List<String> getHashtags() {
        // O findAll() procura na String tudo que bate com a Regex.
        // /#\w+/ significa: o símbolo '#' seguido de uma ou mais letras/números
        return texto.findAll(/#\w+/)
    }

    // 3. Extraindo Menções
    List<String> getMentions() {
        // /@\w+/ significa: o símbolo '@' seguido de uma ou mais letras/números
        return texto.findAll(/@\w+/)
    }
}
