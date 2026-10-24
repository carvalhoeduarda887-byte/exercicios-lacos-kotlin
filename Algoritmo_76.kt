fun main() {
    print("Digite um número entre 0 e 60: ")
    val numero = readln().toInt()

    println("Sucessor: ${(numero + 1) % 61}")
}
