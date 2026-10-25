fun main() {
    print("Digite o numerador: ")
    val numerador = readln().toDouble()
    print("Digite o denominador: ")
    val denominador = readln().toDouble()

    if (denominador != 0.0) {
        println("Decimal: ${numerador / denominador}")
    } else {
        println("O denominador não pode ser zero.")
    }
}
