package ru.netology

fun main() {
    val commisionPersent = 0.75
    val minAmount = 35
    val amount = 10000
    val commision = amount / 100 * commisionPersent
    if (amount < minAmount) println("Сумма ниже минимальной суммы")
    else println("Коммисия ${commision.toInt()} рублей ${((commision - commision.toInt()) * 100).toInt()} копеек.")
}