fun main() {
    val numero = 6
    var fatorial = 1
    var contador = numero

    if (numero == 0 || numero == 1) {
        fatorial = 1
    } else {
        while (contador >= 1) {
            fatorial = fatorial * contador
            contador--
        }
    }

    println("Fatorial de $numero = $fatorial")
}
