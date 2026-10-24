fun main() {
    print("Entre com o dividendo: ")
    val dividendo = readln().toInt()
    print("Entre com o divisor: ")
    val divisor = readln().toInt()
    if (divisor != 0) {
        val quociente = dividendo / divisor
        val resto = dividendo % divisor
        println("Dividendo: $dividendo")
        println("Divisor: $divisor")
        println("Quociente: $quociente")
        println("Resto: $resto")
    } else {
        println("O divisor não pode ser zero.")
    }
}
