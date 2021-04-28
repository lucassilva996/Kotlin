package Basico

class Strings {
    fun main() {
        //string
        //imutavel - valor fixo
        val s1 = "Hi"

        //iterando
        for (c in s1){
            println(c)
        }

        //Concatenacao
        val s2 = s1 + "!"
        println(s2)

        //modelo de string
        val i = 3
        val s3 = "${i}rd String"
        println(s3)
    }
}