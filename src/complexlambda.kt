fun main(args: Array<String>) {
    var items: Array<Int> = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var doubled: Array<Int> = loop(items) { item: Int -> item + item
    }

    for (newItem in items){
        println("Doubled items : $newItem")
    }
}

fun loop(items: Array<Int>, cli: (a: Int) -> Int): Array<Int>{
    var newItems: Array<Int> = items
    var index: Int = 0

    for (item in items){
        var transformed: Int = cli(item)
        newItems[index] = transformed
        index++
    }
    return  newItems
}