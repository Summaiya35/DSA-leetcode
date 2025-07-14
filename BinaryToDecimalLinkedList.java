/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public static  int getsize(ListNode head)
    {
        int count=0;
        ListNode current=head;

        while(current!=null)
        {  count++;
            current=current.next;
        }
    return count;
    
    }
    public int getDecimalValue(ListNode head) {
             int decimal=0;
             int power=0;
             int data=0;
        int arr[]=new int [getsize(head)];
           ListNode current=head;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=current.val;
            current=current.next;
        }

 
 for(int i=arr.length-1;i>=0;i--)
    {  
         data=arr[i]*(int)Math.pow(2,power); 
         decimal+=data;
         power++;       
    }

    return decimal;
    }

   
}
