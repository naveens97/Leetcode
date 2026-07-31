class Solution {
    public String convertDateToBinary(String s) {
        int year=0;
        for(int i=0;i<4;i++){
            year=year*10+s.charAt(i)-'0';
        }
        int month=(s.charAt(5)-'0')*10+s.charAt(6)-'0';
        int day=(s.charAt(8)-'0')*10+s.charAt(9)-'0';
        return new StringBuilder().append(Integer.toBinaryString(year))
        .append('-')
        .append(Integer.toBinaryString(month))
        .append('-')
        .append(Integer.toBinaryString(day))
        .toString();
    }
}