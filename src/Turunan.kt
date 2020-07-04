interface Turunan {
    var warnaRambut: String
    var warnaKulit: String

    fun bakat(bakat:ArrayList<String>) {
        var bakat = arrayListOf<String>("Menyanyi", "Memasasak", "Berkebun")
        println("Aku memiliki warna kulit ${warnaKulit} dan warna rambut ${warnaRambut}")
        for ((index, value) in bakat.withIndex()) {
            println("Bakatku ${index+1}: ${value}")
        }
    }
}