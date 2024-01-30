/**
 * Clase Domicilio
 * @param calle calle del domicilio
 * @param numero numero del domicilio
 */

data class Domicilio (val calle: String, val numero: String){
    fun dirCompleta() = "$calle, $numero"
}