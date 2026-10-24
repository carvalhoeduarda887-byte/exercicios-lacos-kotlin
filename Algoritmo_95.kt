fun main() {
    print("Digite um número inteiro: ")
    val numero = readln().toInt()

    if (numero % 5 == 0) {
        println("É divisível por 5.")
    } else {
        println("Não é divisível por 5.")
    }
}
