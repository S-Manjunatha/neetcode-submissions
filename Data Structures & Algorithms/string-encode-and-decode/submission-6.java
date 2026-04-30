class Solution {

    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
        for (int i=0; i<strs.size(); i++) {
            encode.append(strs.get(i)).append(".");
        }
        return encode.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '.') {
                res.add(ans.toString());
                ans = new StringBuilder();
            } else {
                ans.append(ch);
            }
        }
        return res;
    }
}
    