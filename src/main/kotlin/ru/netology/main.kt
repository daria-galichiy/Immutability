package ru.netology

import kotlin.random.Random

fun main() {
    val purchaseAmount = (0..30_000).random()
    val isUserMusicLover = Random.nextBoolean()
    println("Полная стоимость выбранных композиций: $purchaseAmount руб.")
    if (isUserMusicLover)
        println("Пользователь - \"меломан\"")
    else
        println("Пользователь не совершает ежемесячные покупки")

    val priceInKopecks = purchaseAmount * 100

    val afterDiscountPriceKopecks: Double =
        if (priceInKopecks > 10_000_00) priceInKopecks * 0.95
        else if (priceInKopecks > 1_000_00) priceInKopecks.toDouble() - 100_00
        else priceInKopecks.toDouble()

    val finalPriceKopecks = if (isUserMusicLover) afterDiscountPriceKopecks * 0.99 else afterDiscountPriceKopecks
    val priceKopecks = finalPriceKopecks.toInt() % 100
    val priceRub = (finalPriceKopecks.toInt() - priceKopecks) / 100
    println("Стоимость покупки с учётом скидок составила: $priceRub руб. $priceKopecks коп.")

}
