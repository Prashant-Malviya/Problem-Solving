//Question Link:- https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true

 public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
        
       HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count occurrences of each bird type
        for (int bird : arr) {
            map.put(bird, map.getOrDefault(bird, 0) + 1);
        }
        
        // Find the most frequently sighted bird type with the smallest id
        int maxFrequency = 0;
        int minBirdType = Integer.MAX_VALUE;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int birdType = entry.getKey();
            int frequency = entry.getValue();
            
            if (frequency > maxFrequency || (frequency == maxFrequency && birdType < minBirdType)) {
                maxFrequency = frequency;
                minBirdType = birdType;
            }
        }
        
        return minBirdType;
        
        
    }
