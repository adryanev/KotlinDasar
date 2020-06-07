package tipe_operator_init

class Bilangan {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //Bytes
            val byte1: Byte = 1
            println(byte1.javaClass.kotlin.simpleName) // Byte

            //Short
            val bilShort: Short = 1;
            println(bilShort.javaClass.kotlin.simpleName) // Short

            //Int
            val bilanganInteger = 1;
            println(bilanganInteger.javaClass.kotlin.simpleName) // Int

            //Long
            val bilLong = 1L;
            println(bilLong.javaClass.kotlin.simpleName) // Long


        }
    }
}