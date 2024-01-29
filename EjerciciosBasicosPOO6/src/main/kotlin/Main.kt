fun main(args: Array<String>) {
    /**/
    val repositorioCompras = RepositorioCompras()

    repositorioCompras.agregar(Compra(Cliente("Nuria Costa", Domicilio("Calle de las Flores",
        "355")), 5, 12780.78))
    repositorioCompras.agregar(Compra(Cliente("Jorge Russo", Domicilio("Mirasol",
        "218")), 7, 699.0))

    val domicilios = repositorioCompras.domicilios()
}