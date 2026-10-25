fun main() {
    print("Digite um número de três dígitos: ")
    val numero = readln().toInt()

    val centena = numero / 100
    val dezena = (numero % 100) / 10
    val unidade = numero % 10
    val invertido = unidade * 100 + dezena * 10 + centena

    println("Número: $numero")
    println("Invertido: $invertido")
}
