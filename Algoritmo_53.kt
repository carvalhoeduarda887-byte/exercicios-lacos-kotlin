import kotlin.math.*

fun main() {
    print("Digite a base: ")
    val a = readln().toDouble()
    print("Digite a altura: ")
    val b = readln().toDouble()
    print("Digite a profundidade: ")
    val c = readln().toDouble()

    val diagonal = sqrt(a * a + b * b + c * c)
    println("Diagonal: $diagonal")
}
