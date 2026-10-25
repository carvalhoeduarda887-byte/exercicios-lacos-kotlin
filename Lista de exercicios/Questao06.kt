fun main() {
    var soma = 0

    for (numero in 2..50 step 2) {
        soma = soma + numero
    }

    println("Soma dos números pares: $soma")
}
