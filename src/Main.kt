fun main() {
    print("введите первое число: ")
    val chislo1 = readLine()!!.toDouble()

    print("введите второе число:20 ")
    val chislo2 = readLine()!!.toDouble()

    // сравнение чисел
    if (chislo1 > chislo2) {
        println("число $chislo1 больше числа $chislo2")
        println("число $chislo2 меньше числа $chislo1")
    } else {
        println("число $chislo2 больше числа $chislo1")
        println("число $chislo1 меньше числа $chislo2")
    }
}
