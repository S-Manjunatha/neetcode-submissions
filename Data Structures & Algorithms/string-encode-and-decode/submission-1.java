class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<strs.size(); i++) {
            sb.append(strs.get(i)).append(".");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '.'){
                ans.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(ch);
            }
        }
        return ans;
    }
}
