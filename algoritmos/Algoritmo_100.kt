fun main() {
    print("Digite um número de quatro dígitos: ")
    val numero = readln().toInt()

    val milharECentena = (numero / 100) % 100

    if (milharECentena % 4 == 0) {
        println("O número formado é múltiplo de 4: $milharECentena")
    } else {
        println("O número formado não é múltiplo de 4: $milharECentena")
    }
}
