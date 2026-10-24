import kotlin.math.*

fun main() {
    print("Digite o valor de X: ")
    val x = readln().toDouble()
    print("Digite o valor de Y: ")
    val y = readln().toDouble()

    if (x > y) {
        println("Raiz quadrada do maior: ${sqrt(x)}")
        println("Quadrado do menor: ${y * y}")
    } else if (y > x) {
        println("Raiz quadrada do maior: ${sqrt(y)}")
        println("Quadrado do menor: ${x * x}")
    } else {
        println("Os números são iguais.")
    }
}
