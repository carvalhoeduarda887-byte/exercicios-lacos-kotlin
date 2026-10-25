import kotlin.math.*

fun main() {
    print("Digite um número: ")
    val numero = readln().toDouble()

    if (numero > 0) {
        println("Raiz: ${sqrt(numero)}")
    } else if (numero < 0) {
        println("Quadrado: ${numero * numero}")
    } else {
        println("O número é zero.")
    }
}
