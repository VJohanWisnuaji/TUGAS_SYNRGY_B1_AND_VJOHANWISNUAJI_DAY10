class Orangtua(val turunan: Turunan) {
    var warnaRambut = "Biru"
    var warnaKulit = "Kuning"
    var bakatOrangtua = arrayListOf<String>("Bermusik", "Makan", "Bertani")

    fun ciriKeturunan() {
        println("Ciri-ciri keturunanku:")
        turunan.bakat(bakatOrangtua)
    }
}
