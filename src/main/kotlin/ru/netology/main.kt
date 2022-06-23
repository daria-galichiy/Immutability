package ru.netology

fun main() {
    print("Введите число лайков: ")
    val likes = readLine() ?: return
    val lastLetter = likes[likes.length - 1]
    val threeLastLetters = likes.substring(likes.length - 3)

    if (threeLastLetters == "000")  // например, понравилось трем тысячам людей
        print("Понравилось $likes людей")
    else if (lastLetter == '1')
        print("Понравилось $likes человеку")    // например, понравилось девятьсот пятидесяти одному человеку
    else
        print("Понравилось $likes людям")   // например, понравилось пятнадцати людям
}
