
class Solution {
    public String stringShift(String s, int[][] shift) {
        for (int i=0;i<shift.length;i++){
            s = doShift(s,shift[i][0],shift[i][1]);
        }
        return s;
    }

    private String doShift(String s, int direc, int t){
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        if (direc ==  0){
            //left
            sb.append(s.substring(t%length));
            sb.append(s.substring(0,t%length));
            return sb.toString();
        }else{
            //right
            sb.append(s.substring(length-t%length));
            sb.append(s.substring(0,length-t%length));
            return sb.toString();
        }
    }
}
