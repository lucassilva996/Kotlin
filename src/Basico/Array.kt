package Basico

class Array {
    fun main(){
        //array
        val iArray = intArrayOf(1,2,3)
        var dArray = doubleArrayOf(1.0, 2.0, 3.0)

        dArray = dArray.reversedArray()

        for(i in iArray){
            val index = iArray.indexOf(i)
            println(i + dArray[index])
        }
        println(iArray.size)
    }
}