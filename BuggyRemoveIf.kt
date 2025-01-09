fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}

This code snippet uses `removeIf` to remove even numbers from a list. However, modifying a list while iterating over it using `removeIf` can lead to unexpected behavior if not handled properly.  The even numbers might not be removed correctly or it could throw exceptions, depending on the implementation.