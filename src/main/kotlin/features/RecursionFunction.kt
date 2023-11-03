package features/*
Uma função recursiva é aquele que chama a ela mesmo.
Ela não propriamente performa melhor, mas sem dúvida é um meio simples e elegante de implementação.
*/

class RecursionFunction {

    fun factorial(fat: Int): Int {
        return if (fat == 1) {
            1
        } else {
            fat * factorial(fat - 1)
        }
    }

    fun sum(numbers: List<Int>): Int {
        return if (numbers.isEmpty()) {
            0
        } else {
            1 + sum(numbers.drop(1))
        }
    }

    fun maxValue(numbers: List<Int>): Int {
        return if (numbers.isEmpty()) {
            Int.MIN_VALUE
        } else {
            val max = numbers[0]
            val maxSubList = maxValue(numbers.drop(1))
            if (max > maxSubList) {
                max
            } else {
                maxSubList
            }
        }
    }

    fun maxValueOtimizado(numbers: List<Int>): Int {
        return numbers.fold(Int.MIN_VALUE) { maior, atual ->
            maior.coerceAtLeast(atual)
        }
    }
}