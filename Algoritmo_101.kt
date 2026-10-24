fun main() {
    print("Digite um número: ")
    val numero = readln().toDouble()

    if (numero > 20 && numero < 90) {
        println("O número está na faixa de 20 a 90.")
    } else {
        println("O número está fora da faixa de 20 a 90.")
    }
}
