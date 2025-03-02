class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
         Map<Integer, Integer> merged = new HashMap<>();

        // Step 2: Iterate through nums1 and populate the HashMap
        for (int[] pair : nums1) {
            int id = pair[0];
            int val = pair[1];
            merged.put(id, merged.getOrDefault(id, 0) + val);
        }

        // Step 3: Iterate through nums2 and update the HashMap
        for (int[] pair : nums2) {
            int id = pair[0];
            int val = pair[1];
            merged.put(id, merged.getOrDefault(id, 0) + val);
        }

        // Step 4: Convert the HashMap to a sorted list of [id, value] pairs
        List<int[]> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : merged.entrySet()) {
            result.add(new int[]{entry.getKey(), entry.getValue()});
        }

        // Sort the result by ID
        result.sort((a, b) -> Integer.compare(a[0], b[0]));

        // Step 5: Convert the list to a 2D array and return
        int[][] output = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }

        return output;
    }
    
}