package Basico

class Booleanos_dois {

    fun main(){
        //booleanos
        //imutavel - valor fixo
        val t = true
        val f = false

        //negação (NOT)
        println(t.not())
        println(!f)

        //Xor
        //xor - exclusivo ou
        println(t.xor(f))
    }
}