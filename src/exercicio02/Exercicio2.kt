package exercicio02

fun exe2() {
    println("Executando exercício 2")

    println("Digite um parágrafo de texto:")
    val texto = readln()

    // Divide o texto em palavras usando o espaço como delimitador
    val palavras = texto.split(" ")

    // Remove palavras vazias que podem ocorrer devido a múltiplos espaços
    val palavrasNaoVazias = palavras.filter { it.isNotBlank() }

    // Conta o número de palavras
    val numeroDePalavras = palavrasNaoVazias.size

    println("O número total de palavras é: $numeroDePalavras")
}