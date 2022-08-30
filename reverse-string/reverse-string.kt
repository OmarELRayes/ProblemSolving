class Solution {
    fun reverseString(s: CharArray): Unit {
        var i = 0
        var j = s.size - 1
        while (i < j){
            s[i] = s[j].also { s[j] = s[i] }
            i++
            j--
        }
    }
}