fun main() {
    print("Digite seu peso em kg, somente a parte inteira: ")
    val peso = readln().toInt()

    val pesoGramas = peso * 1000
    val novoPeso = pesoGramas * 1.12

    println("Peso em gramas: $pesoGramas")
    println("Novo peso em gramas: ${novoPeso.toInt()}")
}
