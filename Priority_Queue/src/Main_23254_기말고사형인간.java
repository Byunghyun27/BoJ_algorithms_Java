import java.io.*;
import java.util.*;

class Score implements Comparable<Score> {
    int score;
    int time;

    public Score(int score, int time) {
        this.score = score;
        this.time = time;
    }

    @Override
    public int compareTo(Score o) {
        // min(원점수, 시간 별 점수 증가 값)
        return Math.min(100 - this.score, this.time) < Math.min(100 - o.score, o.time) ? 1 : -1;
    }
}

public class Main_23254_기말고사형인간 {

    static StringTokenizer st;
    static int n, m;
    static int total = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Score> pq = new PriorityQueue<>();
        
        
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()) * 24; // 시간
        m = Integer.parseInt(st.nextToken()); // 기말 고사를 보는 과목의 수

        
        int[] score = new int[m];

        // 점수 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        
        
        // 점수, 시간 별 점수 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            pq.add(new Score(score[i], Integer.parseInt(st.nextToken())));
        }

        
        // 각 시간별 체크
        for (int i = 0; i < n; i++) {
            if (pq.peek().score == 100) break; //// 맨 앞 점수가 100이면 전체 값 100이므로 더 이상 계산X

            // score 계산
            // 원점수 + min(100-원점수, 점수 증가 값)
            int scoreUp = pq.peek().time; // 시간별 점수 증가
            int point = pq.peek().score + Math.min(100 - pq.peek().score, scoreUp);
            pq.poll();
            pq.add(new Score(point, scoreUp));
      
        }
        
        
        while (!pq.isEmpty()) {
            total += pq.poll().score;
        }

        
        System.out.println(total);
    }
}