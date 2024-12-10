package com.example.test

import kotlin.random.Random

class NumberGenerator {

    fun processNumbers(): String {
        val numbersList = generateRandomNumbers(10) // Генерируем 10 случайных чисел
        val negativeSum = numbersList.filter { it < 0 }.sum()
        val positiveCount = numbersList.count { it > 0 }

        return "Сгенерированные числа: $numbersList\n" +
                "Сумма отрицательных чисел: $negativeSum\n" +
                "Количество положительных чисел: $positiveCount"
    }

    private fun generateRandomNumbers(size: Int): List<Int> {
        return List(size) { Random.nextInt(-10, 10) } // Генерация случайных чисел от -10 до 9
    }
}