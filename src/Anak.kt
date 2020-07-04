open class Anak(override var warnaRambut :String="" ,override var warnaKulit :String="") : Turunan {
    var orangtua = Orangtua(this)

    fun hasil(){
        orangtua.ciriKeturunan()
    }
//    var bakat = arrayListOf<String>("Menyanyi", "Memasak", "Berkebun")

    override fun bakat(bakat:ArrayList<String>) {
//        var bakat = arrayListOf<String>("Menyanyi", "Memasak", "Berkebun")
        println("Memiliki warna kulit ${warnaKulit} dan warna rambut ${warnaRambut}")
        println("Bakat-bakat yang dimiliki:")
        for ((index, value) in bakat.withIndex()) {
            println("${index + 1}: ${value}")
        }
    }
}

