fun main() {
    print("Digite um número inteiro: ")
    val numero = readln().toInt()

    if (numero % 10 == 0) {
        println("Múltiplo de 10.")
    } else if (numero % 2 == 0) {
        println("Múltiplo de 2.")
    } else if (numero % 5 == 0) {
        println("Múltiplo de 5.")
    } else {
        println("Não é múltiplo de 2 nem de 5.")
    }
}
