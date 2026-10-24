import kotlin.math.*

fun main() {
    print("Digite a base: ")
    val base = readln().toDouble()
    print("Digite a altura: ")
    val altura = readln().toDouble()

    println("Perímetro: ${2 * (base + altura)}")
    println("Área: ${base * altura}")
    println("Diagonal: ${sqrt(base * base + altura * altura)}")
}
