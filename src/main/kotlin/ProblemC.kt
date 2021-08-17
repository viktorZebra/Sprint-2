class ProblemC {

    fun main() {

        var inputString: List<Int>;
        var n: Int = readInt();
        var minCountTasks: Int = 0;

        inputString = readListInt();
        inputString = inputString.sorted();
        for (i in 0..n-2 step 2)
        {
            minCountTasks += inputString[i + 1] - inputString[i];
        }

        println(minCountTasks);
    }

}