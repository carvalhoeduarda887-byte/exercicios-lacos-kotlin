fun main() {
    print("Digite um número: ")
    val numero = readln().toDouble()

    if (numero > 20) {
        println("Maior que 20.")
    } else if (numero < 20) {
        println("Menor que 20.")
    } else {
        println("Igual a 20.")
    }
}
