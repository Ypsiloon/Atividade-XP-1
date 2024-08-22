package exercicio04

fun exe4() {
    println("Executando exercício 4")
    
    val nomes = mutableListOf<String>()

    for (i in 1..10){
        println("Digite o nome do aluno $i: ")
        val nome = readln()
        nomes.add(nome)
    }
        nomes.sort()

        println("Nomes em ordem alfabetica: ")
        for(nome in nomes){
            println(nome)
        }
    
}