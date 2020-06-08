package operator_casting

class OperatorAritmatika {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bilanganSatu = 30.0
            val bilanganDua = 2.0
            var hasil : Double

            //Penjumlahan
            hasil = bilanganSatu + bilanganDua
            println("$bilanganSatu + $bilanganDua = $hasil")

            //pengurangan
            hasil = bilanganSatu - bilanganDua
            println("$bilanganSatu - $bilanganDua = $hasil")

            //perkalian
            hasil = bilanganSatu * bilanganDua
            println("$bilanganSatu * $bilanganDua = $hasil")

            //pembagian
            hasil = bilanganSatu / bilanganDua
            println("$bilanganSatu / $bilanganDua = $hasil")

            //modulus
            hasil = bilanganSatu % bilanganDua
            println("$bilanganSatu % $bilanganDua = $hasil")

        }
    }

}