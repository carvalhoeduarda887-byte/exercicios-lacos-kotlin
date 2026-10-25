fun main() {
    print("Digite o salário bruto: ")
    val salario = readln().toDouble()
    print("Digite o valor da prestação: ")
    val prestacao = readln().toDouble()

    if (prestacao <= 0.3 * salario) {
        println("Empréstimo concedido.")
    } else {
        println("Empréstimo negado.")
    }
}
