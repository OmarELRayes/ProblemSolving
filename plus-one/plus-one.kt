class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val arr = arrayListOf(*digits.toTypedArray())
        for (i in arr.size - 1 downTo  0) {
            if (arr[i] != 9) {
                arr[i]++
                return arr.toIntArray()
            }
            arr[i] = 0
        }
        if (arr[0] == 0)
            arr.add(0, 1)
        return arr.toIntArray()
    }
}