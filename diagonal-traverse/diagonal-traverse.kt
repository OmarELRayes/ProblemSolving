class Solution {
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
   var i = 0
    var j = 0
    var index = 0
    val m = mat.size
    val n = mat[0].size
    var direction = 0
    // 0 = going up
    // 1 = going down
    val res = IntArray(m * n)
    while (i < m && j < n) {
        res[index++] = mat[i][j]

        if (direction == 0) {
            i--
            j++

            if (j >= n) {
                j--
                i += 2
                direction = 1
            } else if (i < 0) {
                i++
                direction = 1
            }
        } else {
            i++
            j--
            if (i >= m) {
                j += 2
                i--
                direction = 0
            } else if (j < 0) {
                j++
                direction = 0
            }
        }

    }

    return res
    }
}