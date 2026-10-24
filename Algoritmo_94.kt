fun main() {
    print("Digite um número inteiro: ")
    val numero = readln().toInt()

    if (numero % 3 == 0) {
        println("É múltiplo de 3.")
    } else {
        println("Não é múltiplo de 3.")
    }
}
