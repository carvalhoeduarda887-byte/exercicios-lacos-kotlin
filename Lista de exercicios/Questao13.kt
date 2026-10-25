fun main() {
    val numero = 29
    var ehPrimo = true

    for (divisor in 2 until numero) {
        if (numero % divisor == 0) {
            ehPrimo = false
            break
        }
    }

    if (ehPrimo) {
        println("$numero é primo.")
    } else {
        println("$numero não é primo.")
    }
}
