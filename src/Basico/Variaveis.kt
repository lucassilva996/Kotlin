package Basico

class Variaveis {
    fun main(){
        //mutavel - declarada com var - pode ser modificada
        var x = 1
        x = 5

        //imutavel - declarada com val - não pode ser modificada, valor fixo
        val y = 2
        //impossivel fazer isso: y = 1 ou y = 10 e etc...
        println ("Primeiro numero: " + x)
        println ("Segundo numero: " + y)
    }
}