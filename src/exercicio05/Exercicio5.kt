package exercicio05

fun exe5() {
    println("Executando exercício 5")

    while(true){

        println("Digite quantas vezes deseja lançar o dado (digite 0 para sair): ")
        val numLancamento = readLine()?.toIntOrNull() ?: continue

        if (numLancamento == 0){
            println("Saindo...")
            break
        }

        for (i in 1..numLancamento){
            val dado1 = (1..6).random()
            val dado2 = (1..6).random()
            val soma = dado1+dado2

            println("Lançamento $i: Dado 1 = $dado1, Dado 2 = $dado2, Soma = $soma")
        }
    }
}