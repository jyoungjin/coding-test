package 바킹독.기초코드작성요령I;

/**
 * 문제 3
 * N이하의 수 중에서 가장 큰 2의 거듭제곱수를 반환하는 함수 func4(int N)을 작성하라.
 * N은 10억 이하의 자연수이다.
 */

public class 문제4 {

    // 시간복잡도 O(root N)
    public int solution(int n) {

        for (int i = 1; i * i < n; i++) {
            if (i * i == n) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        문제4 문제 = new 문제4();
        System.out.println(문제.solution(5));
    }
}
