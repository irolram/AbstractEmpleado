class EmpleadoFijo(nombre: String, id: Int,val numPagas: Int, val salarioFijo: Double ): Empleado(nombre, id) {

    override fun calcularSalario(): Double {
        val salarioTotal = salarioFijo / numPagas
        return  salarioTotal
    }
}