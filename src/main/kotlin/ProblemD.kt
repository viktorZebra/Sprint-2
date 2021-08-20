class ProblemD {

    fun main() {

        var maxProfit = 0L

        val t = readInt()

        for (i in 0 until t)
        {
            val n = readInt()
            val arrayCoins = readListLong().sortedDescending()

            var count = 1
            var buf: Long
            for (coin in arrayCoins)
            {
                buf = coin * count

                if (buf > maxProfit)
                {
                    maxProfit = buf
                }

                count++
            }

            println(maxProfit)
        }
    }

}