class Solution {
    fun generate(numRows: Int): List<List<Int>> {
         val res = mutableListOf<List<Int>>()

        for(i in 0 until numRows){
            val row = mutableListOf<Int>()
            for(j in 0..i){
                if(j == 0 || j == i)
                    row.add(1)
                else
                    row.add(res[i-1][j-1] + res[i-1][j])
            }
            res.add(row)
        }
        return res
    }
}