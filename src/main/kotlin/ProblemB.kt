/*

 */
class ProblemB {

    fun main() {

        var n: Int;
        var k: Int;
        var inputValue: List<Int>;
        var resultString: String = "";

        var t: Int = readInt();

        for (i in 0..t-1)
        {
            inputValue = readListInt();
            n = inputValue[0];
            k = inputValue[1];

            var count: Int = 0;
            for (j in 0..n-1)
            {
                resultString += ('a' + count);

                if (count == k - 1)
                {
                    count = 0;
                }
                else
                {
                    count++;
                }
            }

            println(resultString);
            resultString = "";
        }

    }

}