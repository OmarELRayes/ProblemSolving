class Solution {
    fun addBinary(a: String, b: String): String {
        var res = ""
        val A = a.reversed()
        val B = b.reversed()
        var carry = 0
        for (i in 0 until Math.max(A.length, B.length)){
            
            //A[i].digitToInt() since kotlin 1.5
            val charA = if(i < A.length) A[i].toInt() - '0'.toInt() else 0
            val charB = if(i < B.length) B[i].toInt() - '0'.toInt() else 0

            val total = charA + charB + carry
            res = (total%2).toString() + res
            carry = Math.floorDiv(total, 2)
        }

        if (carry > 0)
            res = "1$res"

        return res
    }
}