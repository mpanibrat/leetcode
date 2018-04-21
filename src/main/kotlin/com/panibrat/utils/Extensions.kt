package com.panibrat.utils

fun Char.asDigit(): Int {
    return this - '0'
}

fun String.digitAt(index: Int): Int {
    if (index !in this.indices) return 0
    return this[index].asDigit()
}

fun CharArray.swap(left: Int, right: Int) {
    val tmp = this[left]
    this[left] = this[right]
    this[right] = tmp
}

fun Char.isVowel(): Boolean {
    return this in "eEaAiIoOuU"
}
