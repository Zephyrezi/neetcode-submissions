class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder strbldr = new StringBuilder();
        for (char c : s.toCharArray()) {
        if (Character.isLetterOrDigit(c)) {
            strbldr.append(Character.toLowerCase(c));
        }
        }
    return strbldr.toString().equals(strbldr.reverse().toString());
    }
}
