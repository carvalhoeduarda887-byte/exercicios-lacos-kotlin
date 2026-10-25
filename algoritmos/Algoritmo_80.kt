fun main() {
    print("Digite a quantidade de fitas: ")
    val quantidade = readln().toInt()
    print("Digite o valor de cada aluguel: ")
    val aluguel = readln().toDouble()

    val faturamentoAnual = (quantidade / 3.0) * aluguel * 12
    val multasMensais = aluguel * 0.1 * (quantidade / 3.0) / 10
    val quantidadeFinal = quantidade - quantidade * 0.02 + quantidade / 10.0

    println("Faturamento anual: $faturamentoAnual")
    println("Multas mensais: $multasMensais")
    println("Quantidade de fitas no final do ano: $quantidadeFinal")
}
