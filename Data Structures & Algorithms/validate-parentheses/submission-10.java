class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hmap = new HashMap<>();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        hmap.put(')','(');
        hmap.put(']','[');
        hmap.put('}','{');
        for (char cs : s.toCharArray()) {
            if(hmap.containsKey(cs)) {
                if(!stack.isEmpty() && stack.peek() == hmap.get(cs)) {
                stack.pop();
            } else {
                return false;
            } 
        } else {
                stack.push(cs);
            }
        
    }
    return stack.isEmpty();
    }
}
