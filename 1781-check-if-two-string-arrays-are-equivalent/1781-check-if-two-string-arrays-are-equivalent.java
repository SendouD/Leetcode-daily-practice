class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (String str : word1) {
            a.append(str);
        }

        for (String str : word2) {
            b.append(str);
        }

        
        return a.toString().equals(b.toString());
    }
}
