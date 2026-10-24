import kotlin.math.*

fun main() {
    print("Digite o primeiro cateto: ")
    val a = readln().toDouble()
    print("Digite o segundo cateto: ")
    val b = readln().toDouble()

    val hipotenusa = sqrt(a * a + b * b)
    println("A hipotenusa é: $hipotenusa")
}
