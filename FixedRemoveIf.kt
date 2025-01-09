fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = mutableListOf<Int>()
    for (i in list.size -1 downTo 0){
        if (list[i] % 2 == 0) {
            evenNumbers.add(list[i])
        }
    }
    list.removeAll(evenNumbers)
    println(list)
}

This corrected version creates a new list to store even numbers and then removes them in one go using the `removeAll` function. This is safer than modifying the list during iteration with `removeIf`.