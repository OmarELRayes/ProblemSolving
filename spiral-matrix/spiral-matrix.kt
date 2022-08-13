class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        var count = 0
    val m = matrix.size
    val n = matrix[0].size
    var i = 0
    var j = 0
    val visited = matrix.map { it.map { false }.toTypedArray() }
    val res = mutableListOf<Int>()

    var direction = 0
    /*
    0 => right
    1 => bottom
    2 => left
    3 => top

     */


    while (count < m * n) {
        res.add(matrix[i][j])
        visited[i][j] = true

        when (direction) {
            0 -> {
                if (j + 1 < n && !visited[i][j + 1])
                    j++
                else {
                    direction = 1
                    i++
                }
            }
            1 -> {
                if (i + 1 < m && !visited[i + 1][j])
                    i++
                else {
                    direction = 2
                    j--
                }
            }

            2 -> {
                if (j - 1 >= 0 && !visited[i][j - 1])
                    j--
                else {
                    direction = 3
                    i--
                }
            }

            3 -> {
                if (i - 1 >= 0 && !visited[i - 1][j])
                    i--
                else {
                    direction = 0
                    j++
                }
            }
        }
        count++

    }
    return res
    }
}