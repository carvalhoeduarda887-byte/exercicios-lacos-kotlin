fun main() {
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana")
    val idades = listOf(17, 21, 15, 30)

    for (i in nomes.indices) {
        val nome = nomes[i]
        val idade = idades[i]

        if (idade < 18) {
            println("$nome: Acesso Negado (Menor de idade)")
        } else if (idade <= 25) {
            println("$nome: Acesso Permitido (Perfil Jovem)")
        } else {
            println("$nome: Acesso Permitido (Perfil Sênior)")
        }
    }
}
