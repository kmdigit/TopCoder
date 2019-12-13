/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun ListNode?.value() = this?.`val` ?: 0

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?, carry: Int = 0): ListNode? {
        if (l1 == null && l2 == null && carry == 0) return null
        val sum = l1.value() + l2.value() + carry
        return ListNode(sum % 10).apply { next = addTwoNumbers(l1?.next, l2?.next, sum / 10) }
    }
}
