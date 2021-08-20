class ProblemA {

    fun main() {

        val t = readInt()
        var a: Long
        var b: Long
        var k: Long
        var positionFrog = 0L

        for (i in 0 until t) {
            val inputString = readListLong()

            a = inputString[0]
            b = inputString[1]
            k = inputString[2]

            for (j in 0 until k) {
                if (j % 2 == 0L) {
                    positionFrog += a
                } else {
                    positionFrog -= b
                }
            }

            println(positionFrog)
            positionFrog = 0
        }
    }

}