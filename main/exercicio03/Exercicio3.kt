package exercicio03

package objeto

class Aluno(val nome: String, val notas: DoubleArray) {

    fun calcularmedia() : Double {
        val soma = notas.sum()
        return soma /notas.size
    }

    fun foiaprovado(): Boolean{
        return calcularmedia() >= 7.0
    }
}

fun exe3() {
    println("Executando exercício 3")
    
    val alunos = mutableListOf<Aluno>()
    
    for (i in 1..5){
        println("Cadastro do aluno ${i}")
        println("Digite o nome do aluno")
        var nome = readln()
    
        println("Digite 3 notas: ")
        val notas = DoubleArray(3)
    
        for (j in notas.indices){
            println("Digite a nota ${j+1} do aluno: ")
            notas[j] = readln().toDouble()
        }
    
        val aluno = Aluno(nome,notas)
        alunos.add(aluno)
    }
    
    for (aluno in alunos) {
        var media = aluno.calcularmedia()
        var status = if(aluno.foiaprovado()) "Aprovado" else "Reprovado"
        println("Nome: ${aluno.nome}")
        println("Media: $media")
        println("Status: $status")
        println()
    }
    
}
    