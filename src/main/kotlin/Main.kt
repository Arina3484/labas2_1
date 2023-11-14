import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Запрос количества строк и столбцов
    println("Введите количество строк:")
    val rows = scanner.nextInt()

    println("Введите количество столбцов:")
    val columns = scanner.nextInt()

    // Создание двумерного массива
    val array = Array(rows) { IntArray(columns) }

    // Ввод трехзначных чисел
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            println("Введите трехзначное число для ячейки [$i][$j]:")
            array[i][j] = scanner.nextInt()
        }
    }

    // Подсчет различных цифр
    val digitSet = mutableSetOf<Int>()
    for (row in array) {
        for (num in row) {
            val digits = num.toString().toCharArray().map { it.toString().toInt() }
            digitSet.addAll(digits)
        }
    }

    // Вывод массива и количество различных цифр
    println("Двумерный массив:")
    for (row in array) {
        println(row.joinToString("\t"))
    }

    println("В массиве использовано ${digitSet.size} различных цифр")
}