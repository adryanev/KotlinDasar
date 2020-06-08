package operator_casting

class OperatorIndeks {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val bilangan = arrayOf(1,15,36,131,555)

            //get [i]
            println("Elemen di indeks 2 adalah ${bilangan[2]}")

            //set [i]
            bilangan[0] = 0
            println("Elemen di indeks 0 adalah ${bilangan[0]}")


        }
    }
}