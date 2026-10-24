fun main() {
    print("Digite o valor da prestação: ")
    val valor = readln().toDouble()
    print("Digite a taxa de juros em porcentagem: ")
    val taxa = readln().toDouble()
    print("Digite o tempo de atraso em meses: ")
    val tempo = readln().toInt()

    val prestacao = valor + valor * (taxa / 100) * tempo
    println("Valor da prestação em atraso: $prestacao")
}
