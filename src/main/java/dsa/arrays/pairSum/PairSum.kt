package dsa.arrays.pairSum

fun pairSumByCompliment(numbers: List<Int>, target: Int): List<Int> {
    val numbersWithIndex = mutableMapOf<Int, Int>()
    val listOfIndexWithSum = mutableListOf<Int>()

    numbers.mapIndexed { index, number ->
            val compliment = target - number
            if (numbersWithIndex.containsKey(compliment)) {
                listOfIndexWithSum.add(numbersWithIndex[compliment]!!)
                listOfIndexWithSum.add(index)
            }
            else numbersWithIndex[number] = index
    }
    return listOfIndexWithSum
}