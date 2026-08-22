package exercicios.ast

println "=== Testando @Builder ==="

// Não precisamos lembrar ordem dos parâmetros no construtor.
def placaPrincipal = DispositivoIot.builder()
        .microcontrolador("ESP32")
        .protocolo("MQTT")
        .linguagem("MicroPython")
        .ativo(true)
        .build()

println "Dispositivo configurado: $placaPrincipal"

println "\n=== Testando @Sortable ==="

// Criando uma lista de leitura desordenada
def leituras = [
        new LeituraSensor(local: "Sala", temperatura: 26.5),
        new LeituraSensor(local: "Servidor", temperatura: 19.0),
        new LeituraSensor(local: "Cozinha", temperatura: 31.2)
]

println "Antes da ordenação:"
leituras.each {
    println it
}

// Com uso o @Sortable, chama-se o .sort()
// e o Groovy saberá que deve ordenar pela temperatura (do menor pro maior)
def leiturasOrdenadas = leituras.sort()

println "\nDepois da ordenação (por temperatura):"
leiturasOrdenadas.each {
    println it
}

