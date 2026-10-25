import kotlin.math.*

fun main() {
    print("Digite o primeiro valor: ")
    val x1 = readln().toDouble()
    print("Digite o segundo valor: ")
    val x2 = readln().toDouble()
    print("Digite o terceiro valor: ")
    val x3 = readln().toDouble()

    if (x3 + x1 != 0.0) {
        val x = x1 + x2 / (x3 + x1) +
                2 * (x1 - x2) + ln(64.0) / ln(2.0)
        println("X = $x")
    } else {
        println("Não é possível dividir por zero.")
    }
}
