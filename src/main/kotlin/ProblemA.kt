class ProblemA {

    fun main() {

        var t: Int = readInt();
        var inputString: List<Long>;
        var a: Long;
        var b: Long;
        var k: Long;
        var positionFrog: Long = 0;

        for (i in 0..t-1) {
            inputString = readListLong();
            a = inputString[0];
            b = inputString[1];
            k = inputString[2];

            for (j in 0..k-1) {
                if (j % 2 == 0L) {
                    positionFrog += a;
                } else {
                    positionFrog -= b;
                }
            }

            println(positionFrog);
            positionFrog = 0;
        }
    }

}