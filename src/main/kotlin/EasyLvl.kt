package org.example

class EasyLvl {

    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        val temp = str.reversed()
        return str == temp
    }

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val end = IntArray(2)
        var i = 0
        var j = 1
        while (i < nums.size - 1) {
            while (j < nums.size) {
                val temp = nums[i] + nums[j]
                println(temp)
                if (nums[i] + nums[j] == target) {
                    end[1] = j
                    end[0] = i
                    break
                } else j++
            }
            i++
            j = i + 1
        }
        return end
    }


    fun romanToInt(s: String): Int {
        var i = 0
        var num = 0
        while (s.length > i) {
            if (s[i] == 'I') {
                if (i == s.length-1) return num+1
                else if (s[i + 1] == 'V' || s[i + 1] == 'X') num -= 1
                else num += 1
            } else if (s[i] == 'X') {
                if (i == s.length-1) return num + 10
                if (s[i + 1] == 'L' || s[i + 1] == 'C') num -= 10
                else num += 10
            } else if (s[i] == 'C') {
                if (i == s.length-1) return num+100
                if (s[i + 1] == 'D' || s[i + 1] == 'M') num -= 100
                else num += 100
            } else if (s[i] == 'V') {
                num += 5
            } else if (s[i] == 'L') {
                num += 50
            } else if (s[i] == 'D') {
                num += 500
            } else if (s[i] == 'M') {
                num += 1000
            }
            i++
        }
        return num
    }
}