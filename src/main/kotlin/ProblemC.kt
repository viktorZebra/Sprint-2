class ProblemC {

    fun main() {

        val n = readInt()
        val inputString = readListInt().sorted()

        var minCountTasks = 0
        for (i in 0 until n-1 step 2)
        {
            minCountTasks += inputString[i + 1] - inputString[i]
        }

        println(minCountTasks)
    }

}