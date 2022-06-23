package ru.netology


const val COMMISSION_PERCENT = 0.75
const val MIN_COMMISSION = 3500

fun main() {
    print("Введите сумму денежного перевода в копейках: ")
    val transferAmount = readLine()?.toUInt() ?: return

    val commissionAmount = transferAmount.toDouble() * COMMISSION_PERCENT / 100

    val finalCommission = if (commissionAmount > MIN_COMMISSION)
        commissionAmount.toUInt()
    else
        MIN_COMMISSION
    print("При сумме перевода $transferAmount коп. комиссия составит $finalCommission коп.")
}
