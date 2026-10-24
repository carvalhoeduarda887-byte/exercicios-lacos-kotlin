fun main() {
    print("Digite o valor da aplicação mensal: ")
    val p = readln().toDouble()
    print("Digite a taxa de juros em decimal (ex.: 0.01): ")
    val i = readln().toDouble()
    print("Digite o número de meses: ")
    val n = readln().toInt()

    if (i != 0.0) {
        val acumulado = p * (Math.pow(1 + i, n.toDouble()) - 1) / i
        println("Valor acumulado: $acumulado")
    } else {
        println("Com taxa zero, o total das aplicações é: ${p * n}")
    }
}
