package no1;

public class Palindrome {

    public boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return checker(str,left+1,right) || checker(str,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean checker(String s, int l, int r){
        while(l < r){
            if(s.charAt(l++)!= s.charAt(r--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome("qwerty"));
        System.out.println(p.isPalindrome("abdba"));

    }

}
