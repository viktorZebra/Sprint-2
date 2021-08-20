/*

 */
class ProblemB {

    fun main() {

        val t = readInt()

        var n: Int
        var k: Int
        var resultString: String = ""

        for (i in 0 until t)
        {
            val inputValue = readListInt()
            n = inputValue[0]
            k = inputValue[1]

            var count = 0
            for (j in 0 until n)
            {
                resultString += ('a' + count)

                if (count == k - 1)
                {
                    count = 0
                }
                else
                {
                    count++
                }
            }

            println(resultString)
            resultString = ""
        }

    }

}