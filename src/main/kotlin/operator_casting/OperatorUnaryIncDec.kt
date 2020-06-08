package operator_casting

class OperatorUnaryIncDec {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var bilanganSatu = -1
            var bilanganDua = 2
            val booleanSatu = true

            var hasil: Int
            var hasilBoolean: Boolean

            // positif
            hasil = +bilanganSatu
            println("+($bilanganSatu) = $hasil")

            //negatif
            hasil = -bilanganSatu
            println("-($bilanganSatu) = $hasil")

            //negasi
            hasilBoolean = !booleanSatu
            println("!$booleanSatu = $hasilBoolean")

            //increment
            ++bilanganSatu
            println(bilanganSatu)

            //decrement
            --bilanganDua
            println(bilanganDua)
        }
    }
}