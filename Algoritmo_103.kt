fun main() {
    print("Digite o ano atual: ")
    val anoAtual = readln().toInt()
    print("Digite o ano de nascimento: ")
    val nascimento = readln().toInt()

    if (nascimento > anoAtual) {
        println("Ano de nascimento inválido.")
    } else {
        println("Idade: ${anoAtual - nascimento}")
    }
}
