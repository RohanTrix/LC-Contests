class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        char let = 'a';
        for(char ch : key.toCharArray())
        {
            if(ch != ' ' && !map.containsKey(ch))
                map.put(ch, let++);
        }
        StringBuilder s = new StringBuilder();
        for(char ch : message.toCharArray())
            s.append(ch == ' '?' ':map.get(ch));
        return s.toString();
    }
}
