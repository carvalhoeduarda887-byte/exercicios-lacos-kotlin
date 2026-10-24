fun main() {
    print("Digite o valor do salário mínimo: ")
    val salarioMinimo = readln().toDouble()
    print("Digite o salário da pessoa: ")
    val salarioPessoa = readln().toDouble()

    if (salarioMinimo != 0.0) {
        println("A pessoa ganha ${salarioPessoa / salarioMinimo} salários mínimos.")
    } else {
        println("O salário mínimo não pode ser zero.")
    }
}
