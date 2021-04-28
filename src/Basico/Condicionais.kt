package Basico

class Condicionais {
    fun main(){
        val a = 2
        val b = 3

        //if em uma unica linha
        var max = a
        if (a < b) max = b
        println(max)

        //if/else
        var min : Int
        if (a < b){
            min = a
        } else {
            min = b
        }
        println(min)
    }
}