import kotlin.math.*

fun main() {
    print("Digite a altura da lata: ")
    val altura = readln().toDouble()
    print("Digite o raio da lata: ")
    val raio = readln().toDouble()

    val volume = PI * raio * raio * altura
    println("Volume da lata: $volume")
}
