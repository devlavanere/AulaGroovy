package exercicios.controle

// 1. Criação da Classe Account
class Account {
    BigDecimal balance = 0.0

    // 2. Método deposit simples
    def deposit(BigDecimal amount) {
        // CONDITIONAL STRUCTURE & EXCEPTION HANDLING
        if (amount < 0) {
            // Lança exceção se o número for negativo
            throw new Exception("Operação negada! O valor do depósito não pode ser negativo: $amount")
        }

        balance += amount
        "Depósito de R\$ $amount realizado com sucesso. Saldo atual: R\$ $balance"
    }

    // 3. Método deposit que aceita uma Lista (Sobrecarga de método)
    def deposit(List amounts) {
        // GROOVY TRUTH na prática:
        // Se a lista for nula ou vazia, o Groovy avalia como 'false'.
        // Se tiver itens, é 'true'.
        if (amounts) {
            println "\nProcessando lote de ${amounts.size()} depósitos..."

            // Looping
            for (valor in amounts) {
                // Chama o deposit único para cada item
                deposit(valor as BigDecimal)
            }
        }else {
            println "A lista de depósito está vazia"
        }
    }
}

println "=== INICIANDO TESTES DO SISTEMA BANCÁRIO ==="

// 4. Criando instância da conta
def minhaConta = new Account()

// A) Depósito Válido
println "\n--- Teste 1: Depósito Válido ---"
minhaConta.deposit(150.00)

/*
   B) Depósito Inválido (O que acontece?)
   Se descomentar a linha abaixo, o programa VAI "QUEBRAR".
   A execução para imediatamente e o console imprime o rastreio da Exception (Stacktrace),
   pois a exceção foi lançada e ninguém estava lá para "capturá-la".
*/
// minhaConta.deposit(-50.00)


// C) Try / Catch no valor inválido (Tratamento de Exceção)
println "\n--- Teste 2: Try / Catch com valor negativo ---"
try {
    minhaConta.deposit(-25.50)
} catch (Exception e) {
    // Aqui nós "capturamos" o erro para que o sistema não quebre
    println "ERRO CAPTURADO: ${e.message}"
}

// D) Depósito via Lista de Valores
println "\n--- Teste 3: Lote de Depósitos (Loop) ---"
def loteDepositos = [10.00, 20.00, 30.50]
minhaConta.deposit(loteDepositos)

println "\nSaldo Final da Conta: R\$ ${minhaConta.balance}"

