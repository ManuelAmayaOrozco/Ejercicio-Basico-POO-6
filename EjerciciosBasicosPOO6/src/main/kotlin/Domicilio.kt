data class Domicilio (val calle: String, val numero: String){
    fun dirCompleta() = "$calle, $numero"
}