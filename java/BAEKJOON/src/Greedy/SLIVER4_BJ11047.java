package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class SLIVER4_BJ11047 {
    /*
        https://www.acmicpc.net/problem/11047
        동전 0
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coinValue = new int[N];

        for(int i = 0; i < N; i++){
            coinValue[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for(int i = 0; i < N; i++){

            if(coinValue[N - 1 - i] <= K){
                cnt += K / coinValue[N - 1 - i];
                K = K % coinValue[N - 1 - i];
            }
        }

        System.out.println(cnt);
    }
}
