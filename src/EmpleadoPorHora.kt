class EmpleadoPorHora(nombre: String, id: Int,val horasTrabajadas: Double, val tarifaPorHora:Double) : Empleado(nombre, id){

    override fun calcularSalario(): Double {
        val calculo = horasTrabajadas * tarifaPorHora
        return calculo
    }
}