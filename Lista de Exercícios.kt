// ---------- Questão 1: Sistema de Cupons (when + Null Safety) ----------
fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor - 10
        "PROMO20" -> valor - 20
        else -> valor // cobre null e qualquer outro código
    }
}

// ---------- Questão 2: Auditoria de Entregas (for + Elvis) ----------
fun auditarEntregas(enderecos: List<String?>) {
    for (item in enderecos) {
        val endereco = item ?: "Endereço Desconhecido"
        if (endereco == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $endereco")
        }
    }
}

// ---------- Questão 3: Validação de Perfil (if/else + Safe Call) ----------
fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0
    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

// ---------- Questão 4: Transações Pix (for + if/else) ----------
fun processarPix() {
    val transferencias: List<Double?> = listOf(50.0, null, 120.5, null, 10.0)
    var total = 0.0

    for (valor in transferencias) {
        if (valor != null) {
            total += valor
        } else {
            println("Transação ignorada")
        }
    }
    println("Total processado: $total")
}

// ---------- Questão 5: Feedback de Motoristas (when + Elvis) ----------
fun avaliarMotorista(nota: Int?) {
    val notaFinal = nota ?: 0
    when (notaFinal) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
        else -> println("Nota inválida.")
    }
}

// ---------- Questão 6: Lambda de Gorjeta (it + Null Safety) ----------
val calcularGorjeta: (Double?) -> Double = {
    if (it == null || it < 0) 0.0 else it
}

// ---------- Questão 7: Limpeza de E-mails (for + múltiplas condições) ----------
fun limparEmails(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        val tamanho = email?.trim()?.length ?: 0
        if (email == null || tamanho == 0) {
            contasInvalidas++
            println("Aviso: conta inválida, será deletada.")
        } else {
            println("Conta válida: $email")
        }
    }
    println("Contas que precisam ser apagadas: $contasInvalidas")
}

// ---------- Testes ----------
fun main() {
    println("=== Questão 1 ===")
    println(calcularDesconto(100.0, "PROMO10")) // 90.0
    println(calcularDesconto(100.0, "PROMO20")) // 80.0
    println(calcularDesconto(100.0, null))      // 100.0
    println(calcularDesconto(100.0, "OUTRO"))   // 100.0

    println("\n=== Questão 2 ===")
    auditarEntregas(listOf("Rua A, 10", null, "Av. Brasil, 200"))

    println("\n=== Questão 3 ===")
    validarBioInfantil("Adoro desenhos animados")
    validarBioInfantil("a".repeat(60))
    validarBioInfantil(null)

    println("\n=== Questão 4 ===")
    processarPix()

    println("\n=== Questão 5 ===")
    avaliarMotorista(5)
    avaliarMotorista(4)
    avaliarMotorista(2)
    avaliarMotorista(null)

    println("\n=== Questão 6 ===")
    println(calcularGorjeta(null))  // 0.0
    println(calcularGorjeta(-3.0))  // 0.0
    println(calcularGorjeta(8.5))   // 8.5

    println("\n=== Questão 7 ===")
    limparEmails(listOf("ana@email.com", null, "", "joao@email.com"))
}
