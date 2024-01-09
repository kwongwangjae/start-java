class Solution {
	public String mostCommonWord(String paragraph, String[] banned) {
		Set<String> ban = new HashSet<>(Arrays.asList(banned));

		Map<String, Integer> counts = new HashMap<>();



		for(String x : word){
			if(!ban.contains(x)){
				counts.put(x, counts.getOrDefault(x,0)+1);
			}
		}

		return Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
	}
}