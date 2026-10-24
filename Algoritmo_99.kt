fun main() {
    print("Digite um número de três dígitos: ")
    val numero = readln().toInt()

    val centena = numero / 100

    if (centena % 2 == 0) {
        println("O algarismo das centenas é par: $centena")
    } else {
        println("O algarismo das centenas é ímpar: $centena")
    }
}
