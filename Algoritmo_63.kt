fun main() {
    print("Digite o número de aulas dadas no mês: ")
    val aulas = readln().toInt()
    print("Digite o valor da hora-aula: ")
    val horaAula = readln().toDouble()
    print("Digite o percentual de desconto do INSS: ")
    val desconto = readln().toDouble()

    val salarioBruto = aulas * horaAula
    val valorDesconto = salarioBruto * desconto / 100
    val salarioLiquido = salarioBruto - valorDesconto

    println("Salário líquido: $salarioLiquido")
}
