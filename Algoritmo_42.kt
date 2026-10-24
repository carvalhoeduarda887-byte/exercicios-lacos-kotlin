import kotlin.math.*

fun main() {
    print("Digite o ângulo em graus: ")
    val angulo = readln().toDouble()
    val rad = Math.toRadians(angulo)

    println("Seno: ${sin(rad)}")
    println("Cosseno: ${cos(rad)}")
    println("Tangente: ${tan(rad)}")

    if (sin(rad) != 0.0) println("Cossecante: ${1 / sin(rad)}")
    if (cos(rad) != 0.0) println("Secante: ${1 / cos(rad)}")
    if (tan(rad) != 0.0) println("Cotangente: ${1 / tan(rad)}")
}
