fun main() {
    print("Digite a sigla do estado: ")
    val sigla = readln().uppercase()

    if (sigla == "RJ") {
        println("Carioca.")
    } else if (sigla == "SP") {
        println("Paulista.")
    } else if (sigla == "MG") {
        println("Mineiro.")
    } else {
        println("Outros estados.")
    }
}
