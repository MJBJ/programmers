package programmers;
import java.util.*;
// hash-level2 전화번호부
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book); // 정렬
        boolean answer = true;
        String pre = phone_book[0]; // 접두사 변수
        for (int i=1;i<phone_book.length;i++){
            if (phone_book[i].startsWith(pre)) {answer=false;break;} // false면 break
        }
        return answer;
    }
}
