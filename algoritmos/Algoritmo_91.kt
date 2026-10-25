fun main() {
    print("Digite o primeiro número: ")
    val num1 = readln().toInt()
    print("Digite o segundo número: ")
    val num2 = readln().toInt()

    val soma = num1 + num2

    if (soma > 10) {
        println("Soma: $soma")
    }
}
