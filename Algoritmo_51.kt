import kotlin.math.*

fun main() {
    print("Digite o raio: ")
    val raio = readln().toDouble()

    println("Perímetro: ${2 * PI * raio}")
    println("Área: ${PI * raio * raio}")
}
