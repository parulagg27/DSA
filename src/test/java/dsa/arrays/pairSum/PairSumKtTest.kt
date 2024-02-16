package dsa.arrays.pairSum

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class PairSumKtTest {

    @Test
    fun shouldReturnFirstMatchingSetForPairSum8() {
        val numbers = listOf(3, 2, 5, 4, 1)

        val output = pairSumByCompliment(numbers, 8)

        assertEquals(listOf(0, 2), output)
    }
}