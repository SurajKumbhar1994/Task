class Solution {
    
    public boolean isPalindrome (int x){
        
        int a =x;
        int rev= 0;
        if(x < 0)
        {
            return false;
            
        }
        while (x!=0)
        {
            rev=rev*10 +(x%10);
            x=x/10;
        }
        if(rev == a)
        {
            return true;
        }
        return false;
        }
       public static void main(String args[]){
             Solution sol=new Solution ();
        int num =121;
        boolean isPalindrome = sol.isPalindrome (num);
        if (isPalindrome )
        {
            System.out.println(num+ " is Palindrome Number ");
        }
        else
        {
            System.out.println(num+ "is not Palindrome Number");
        }
    
    }
}
