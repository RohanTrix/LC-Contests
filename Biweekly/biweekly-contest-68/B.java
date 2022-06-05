class Solution {
    Map<String, Set<String>> edges = new HashMap<>();
    Map<String, Integer> indeg = new HashMap<>();
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        int n = recipes.length;
        for(int i = 0; i<n; i++){
            addNode(recipes[i]);
        }
        for(int i = 0; i<supplies.length; i++)
            addNode(supplies[i]);
        
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<ingredients.get(i).size(); j++)
            {
                addEdge(ingredients.get(i).get(j), recipes[i]);
                indeg.put(recipes[i], indeg.getOrDefault(recipes[i],0)+1);
            }
        }
        n = edges.size();
        Queue<String> q = new ArrayDeque<>();
        for(String s: supplies)
            q.add(s);

        while(!q.isEmpty())
        {
            String at = q.poll();
            
            for(String to: edges.get(at))
            {
                indeg.put(to, indeg.get(to)-1);
                if(indeg.get(to)==0)
                    q.offer(to);
            }
        }
        List<String> res = new ArrayList<>();
        for(String s: recipes)
            if(indeg.get(s)==0)
                res.add(s);
        return res;

    }
    
    void addNode(String s)
    {
        if(!edges.containsKey(s))
        edges.put(s, new HashSet<>());
    }
    void addEdge(String s, String t)
    {
        addNode(s); addNode(t);
        edges.get(s).add(t);
    }
}
