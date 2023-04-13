class Calculadora {
    fun sumar(a: Int, b: Int): Int {
        return a + b
    }

    fun restar(a: Int, b: Int): Int {
        return a - b
    }

    fun multiplicar(a: Int, b: Int): Int {
        return a * b
    }

    fun dividir(a: Int, b: Int): Int {
        if (b == 0) {
            throw IllegalArgumentException("No se puede dividir por cero")
        }
        return a / b
    }

    fun porcentaje(numero: Double, porcentaje: Double): Double {
        return numero * (porcentaje / 100.0)
    }

}

