package ru.netology

fun main() {
    val summaPokupok = 5_000 //накполения на карте
    val isFan: Boolean = true // постоянный покупатель

    val fanDiscount = 1 // скидка % для постоянный покупатель
    val volumeSuperDiscount = 5 //скидка % за объем
    val volumeDiscount = 100.0 // скидка % за объем

    var itemPrice = 100.0 //стомость 1 ед товара
    val itemCount = 3 // кол-во товарв

    println("Приобретается $itemCount шт. товара по цене $itemPrice за единицу товара")
    if (summaPokupok > 0) println("Ранее вы совершали покупки. Сумма ваших накоплений $summaPokupok руб \n")
    var totalPrice = itemPrice * itemCount
    println("Стоимость товара без учета скидок: $totalPrice")

    var discount = 0 //размер скидки в %
    if (summaPokupok < 1_000) {
    } else {
        if (summaPokupok < 10_000) {
            if (totalPrice <= volumeDiscount) {
                println("Поздравляем, товар достается вам бесплатно")
            }
            totalPrice -= volumeDiscount
        } else {
            discount = volumeSuperDiscount
        }
    }
    if (totalPrice > 0) {
        totalPrice = totalPrice * (100 - discount) / 100
        println("Стоимость товара с учетом скидки за объем: $totalPrice")
    }

    if (isFan && totalPrice > 0) {
        totalPrice = totalPrice * (100 - fanDiscount)/100
        println("""
            Поздравляем, вы постоянный покупатель +$fanDiscount% к вашей скидке.
            Итоговая стоимость товара с учетом всех скидок: $totalPrice
        """.trimIndent())
    }


}