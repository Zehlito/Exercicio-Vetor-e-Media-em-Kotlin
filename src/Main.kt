//Faça um algoritmo que leia um vetor inteiro de 10 posições e calcule a sua média

fun main() {
    var LIMITE : Int = 10
    var soma : Double = 0.0
    var media : Double

    // Declaração do vetor de 10 posições
    val vetor = IntArray(LIMITE)

    for (x in 0..<LIMITE)
    {
        print("Informe um valor para a posição [ $x ]: ")
        vetor[x] = readLine()!!.toInt()
    }
    for(x in 0..<LIMITE)
    {
        soma = soma + vetor[x]
    }

    media = soma/LIMITE

    println("A média foi de $media" )

}