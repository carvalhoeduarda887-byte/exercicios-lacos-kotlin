fun main() {
    print("Digite o número da conta com três dígitos: ")
    val conta = readln().toInt()

    if (conta in 100..999) {
        val centena = conta / 100
        val dezena = (conta / 10) % 10
        val unidade = conta % 10

        val inverso = unidade * 100 + dezena * 10 + centena
        val soma = conta + inverso

        val d1 = (soma / 100) * 1
        val d2 = ((soma / 10) % 10) * 2
        val d3 = (soma % 10) * 3

        val digito = (d1 + d2 + d3) % 10
        println("Dígito verificador: $digito")
    } else {
        println("Digite um número de exatamente três dígitos.")
    }
}
