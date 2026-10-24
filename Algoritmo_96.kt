fun main() {
    print("Digite um número inteiro: ")
    val numero = readln().toInt()

    if (numero % 3 == 0 && numero % 7 == 0) {
        println("É divisível por 3 e por 7.")
    } else {
        println("Não é divisível por 3 e por 7.")
    }
}
