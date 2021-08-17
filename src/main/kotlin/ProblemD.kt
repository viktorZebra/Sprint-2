class ProblemD {

    fun main() {

        var n: Int;
        var arrayCoins: List<Long>;
        var maxProfit: Long = 0;

        var t: Int = readInt();

        for (i in 0..t-1)
        {
            n = readInt();
            arrayCoins = readListLong();

            arrayCoins = arrayCoins.sortedDescending();

            var count: Int = 1;
            var buf: Long;
            for (coin in arrayCoins)
            {
                buf = coin * count;

                if (buf > maxProfit)
                {
                    maxProfit = buf;
                }

                count++;
            }

            println(maxProfit);
        }
    }

}