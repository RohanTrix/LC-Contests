class AuthenticationManager {
    int livetime;
    HashMap<String, Integer> hs;
    public AuthenticationManager(int timeToLive) {
        livetime = timeToLive;
        hs = new HashMap<String, Integer>();
    }
    
    public void generate(String tokenId, int currentTime) {
        hs.put(tokenId,currentTime + livetime);
    }
    
    public void renew(String tokenId, int currentTime) {
        if(!hs.containsKey(tokenId) || hs.get(tokenId)<=currentTime) return;
          hs.put(tokenId, currentTime + livetime);
    }
    
    public int countUnexpiredTokens(int currentTime) {
       int c = 0;
        for( String s: hs.keySet())
       {
           if (hs.get(s)>currentTime) c++;
       }
        return c;
    }
}
