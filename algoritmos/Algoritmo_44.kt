import kotlin.math.*

fun main() {
    print("Digite o número: ")
    val numero = readln().toDouble()
    print("Digite a base: ")
    val base = readln().toDouble()

    if (numero > 0 && base > 0 && base != 1.0) {
        println("Logaritmo de $numero na base $base: ${ln(numero) / ln(base)}")
    } else {
        println("Número ou base inválidos.")
    }
}
