package minjuhui;
import java.util.*;
// hash-level2 
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book); // 정렬먼저
        boolean answer = true;
        String pre = phone_book[0]; // 접두사
        for (int i=1;i<phone_book.length;i++){
            if (phone_book[i].startsWith(pre)) {answer=false;break;} // 
        }
        return answer;
    }
}
