fun main() {
    print("Digite o primeiro número: ")
    val num1 = readln().toDouble()
    print("Digite o segundo número: ")
    val num2 = readln().toDouble()

    val soma = num1 + num2

    if (soma > 20) {
        println("Resultado: ${soma + 8}")
    } else {
        println("Resultado: ${soma - 5}")
    }
}
