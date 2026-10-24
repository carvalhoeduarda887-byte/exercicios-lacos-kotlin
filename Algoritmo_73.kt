import kotlin.math.*

fun main() {
    print("Digite um número decimal: ")
    val numero = readln().toDouble()

    val parteInteira = numero.toInt()
    val parteFracionaria = numero - parteInteira
    val arredondado = round(numero).toInt()

    println("Parte inteira: $parteInteira")
    println("Parte fracionária: $parteFracionaria")
    println("Número arredondado: $arredondado")
}
