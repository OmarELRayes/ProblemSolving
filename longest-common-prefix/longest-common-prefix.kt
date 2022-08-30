class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var res = ""
        var index = 0
        var char = '1'
        while (true) {
            for (i in strs.indices) {
                if (index >= strs[i].length) return res
                if (i == 0) {
                    char = strs[i][index]
                    continue
                }
                if (strs[i][index] != char) return res
            }
            index++
            res += char
        }
    }
}