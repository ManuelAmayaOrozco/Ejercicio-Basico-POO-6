class RepositorioCompras {
    private val compras = mutableListOf<Compra>()

    fun agregar(compra: Compra) {
        compras.add(compra)
    }

    fun domicilios(): List<Domicilio> {
        return compras.map { compra -> compra.cliente.domicilio}.toSet().toList()
    }
}