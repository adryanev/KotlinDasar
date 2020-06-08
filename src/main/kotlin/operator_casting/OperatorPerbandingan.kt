package operator_casting

class OperatorPerbandingan{
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val bilanganSatu = 25
            val bilanganDua = 12

            // >
            println("$bilanganSatu > $bilanganDua = ${bilanganSatu > bilanganDua}")

            // <
            println("$bilanganSatu < $bilanganDua = ${bilanganSatu < bilanganDua}")

            // >=
            println("$bilanganSatu >= $bilanganDua = ${bilanganSatu >= bilanganDua}")

            // <=
            println("$bilanganSatu <= $bilanganDua = ${bilanganSatu <= bilanganDua}")

            // ==
            println("$bilanganSatu == $bilanganDua = ${bilanganSatu == bilanganDua}")

            // !=
            println("$bilanganSatu != $bilanganDua = ${bilanganDua != bilanganDua}")
        }
    }
}