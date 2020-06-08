package operator_casting

class OperatorLogika {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {

            val a = 10
            val b = 9
            val c = -1
            var result: Boolean

            //and
            result = (a>b) && (a>c) // result = (a>b) and (a>c)
            println("($a > $b) and ($a > $c) = $result")

            //or
            result = (a<b) || (a>c) // result = (a<b) or (a>c)
            println("($a < $b) or ($a > $c) = $result")
        }
    }
}