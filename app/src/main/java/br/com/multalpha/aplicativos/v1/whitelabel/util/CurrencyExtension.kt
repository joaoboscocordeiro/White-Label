package br.com.multalpha.aplicativos.v1.appbikes.util

import java.text.DecimalFormat

/**
 * Created by João Bosco on 15/08/2021.
 * e-mail - Support: ti.junior@gmail.com
 */

private val onlyNumberRegex by lazy { "[^0-9 ]".toRegex() }
private const val DECIMAL_FACTOR = 100
private const val CURRENCY_PATTERN = "R$ #,###,##0.00"

fun String.fromCurrency(): Double = this
    .replace(onlyNumberRegex, "")
    .toDouble()
    .div(DECIMAL_FACTOR)

fun Double.toCurrency(): String = DecimalFormat(CURRENCY_PATTERN)
    .format(this)