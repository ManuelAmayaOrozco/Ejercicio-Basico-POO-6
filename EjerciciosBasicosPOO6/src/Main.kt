fun main(args: Array<String>) {
    /*Realizar el ejercicio 1 de Conjuntos de los "Ejercicios básicos con Kotlin" (Ejercicio 3.3.1) orientado a
     objetos.*/

    val repositorioCompras = RepositorioCompras()

    repositorioCompras.agregar(Compra(Cliente("Nuria Costa", Domicilio("Calle de las Flores",
        "355")), 5, 12780.78))
    repositorioCompras.agregar(Compra(Cliente("Jorge Russo", Domicilio("Mirasol",
        "218")), 7, 699.0))
    repositorioCompras.agregar(Compra(Cliente("Nuria Costa", Domicilio("Calle de las Flores",
        "355")), 7, 532.90))
    repositorioCompras.agregar(Compra(Cliente("Julián Rodriguez", Domicilio("La Mancha",
        "761")), 12, 5715.99))
    repositorioCompras.agregar(Compra(Cliente("Jorge Russo", Domicilio("Mirasol",
        "218")), 15, 958.0))

    val domicilios = repositorioCompras.domicilios()

    for (d in domicilios) {
        println(d.dirCompleta())
    }
}