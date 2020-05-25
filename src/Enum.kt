enum class Planet(val mass: Double, val radius: Double){
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6)
}

fun main(args: Array<String>) {
    println(Planet.values())
}