class Solution {
    public boolean isPalindrome(String s) {
        String S = s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            sb.append(S.charAt(i));
        }
        String original = sb.toString();
        StringBuilder sb1 = new StringBuilder();
        for (int i = S.length() - 1; i >= 0; i--) {
            sb1.append(S.charAt(i));
        }
        String reversed = sb1.toString();
        if (original.equals(reversed)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        Solution s1 = new Solution();
        System.out.println(s1.isPalindrome(str));
    }
}
