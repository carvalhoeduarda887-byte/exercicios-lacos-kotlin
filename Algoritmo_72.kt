fun main() {
    print("Digite o valor do depósito: ")
    val deposito = readln().toDouble()
    print("Digite a taxa de juros em porcentagem: ")
    val taxa = readln().toDouble()

    val rendimento = deposito * taxa / 100
    val total = deposito + rendimento

    println("Rendimento: $rendimento")
    println("Total após o rendimento: $total")
}
