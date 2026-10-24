import kotlin.math.*

fun main() {
    print("Digite o número: ")
    val numero = readln().toDouble()

    if (numero > 0) {
        println("Logaritmo: ${ln(numero) / ln(10.0)}")
    } else {
        println("O número precisa ser positivo.")
    }
}
