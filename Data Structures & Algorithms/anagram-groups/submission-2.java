class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (used[i]) continue;

            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);
            used[i] = true;

            char[] str1 = strs[i].toCharArray();
            Arrays.sort(str1);

            for (int j = i + 1; j < strs.length; j++) {

                if (used[j]) continue;

                char[] str2 = strs[j].toCharArray();
                Arrays.sort(str2);

                if (Arrays.equals(str1, str2)) {
                    temp.add(strs[j]);
                    used[j] = true;
                }
            }

            result.add(temp);
        }

        return result;
    }
}