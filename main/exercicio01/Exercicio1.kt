package exercicio01

fun exe1() {
    println("Executando exercício 1")

    println("Digite um numero inteiro para descobrir se é primo: ")
    var num1 = readln().toInt()
    var count1 = 0

    if (num1 <= 1){
        println("$num1 não é um número primo.")
    }else if (num1 % 2 == 0){
        println("$num1 não é um número primo.")
    }else  if (num1 == 2){
        println("$num1 é um número primo.")
    }else{
        var isPrime = true
        for (i in 2..(num1 / 2)) {
            if (num1 % i == 0) {
                println("$num1 não é um número primo.")
                isPrime = false
                break
            }
        }
        if (isPrime) {
            println("$num1 é um número primo.")
        }
    }
}