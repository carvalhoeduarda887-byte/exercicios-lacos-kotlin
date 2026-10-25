import kotlin.math.*

fun main() {
    print("Digite um número: ")
    val numero = readln().toDouble()

    println("Número: $numero")
    println("Quadrado: ${numero * numero}")

    if (numero >= 0) {
        println("Raiz quadrada: ${sqrt(numero)}")
    } else {
        println("Não existe raiz quadrada real desse número.")
    }
}
