package programmers;
import java.util.*;
// hash-level2 ��ȭ��ȣ��
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book); // ����
        boolean answer = true;
        String pre = phone_book[0]; // ���λ� ����
        for (int i=1;i<phone_book.length;i++){
            if (phone_book[i].startsWith(pre)) {answer=false;break;} // false�� break
        }
        return answer;
    }
}
