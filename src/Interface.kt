interface Pet{
    fun eat()
    fun sleep()
}
class Cat : Pet{
    override
    fun eat(){
        println("The cat eats fish")
    }
    override
    fun sleep(){
        println("Cat sleeps alot")
    }
}
fun main(args: Array<String>){
    val cat = Cat()
    println(cat.eat())
    println(cat.sleep())
}