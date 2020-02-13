/*
pair data types helps in defining common pair of values
 */
fun main(args: Array<String>){
    val capitalCity = listOf("Kenya" to "Nairobi", "Uganda" to "Kampala")
    for ((country, city) in capitalCity){
        println("Capital city of ${country} is ${city}")
        /*
        output:
        Capital city of Kenya is Nairobi
        Capital city of Uganda is Kampala
         */
    }
}