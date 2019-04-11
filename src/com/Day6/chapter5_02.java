/*문제 : 한수
 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

 */
package com.Day6;

import java.util.Scanner;

public class chapter5_02 {

public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        int[] num = new int[3]; //일의자리, 십의자리, 백의자리
        int count=0;
        
        do{
        n = sc.nextInt();
        }while(n<1 || n>1000);
        
        for(int i = 1 ; i <= n ; i++)
        {
            if(i >= 1 && i < 10)
                count++;
            else if(i >= 10 && i < 100)
                count++;
            else if(i >= 100 && i < 1000)
            {
                num[0] = (i-(i/100)*100)-10*((i-(i/100)*100)/10);
                num[1] = (i-(i/100)*100)/10;
                num[2] = i/100;
                if((num[0]-num[1]) == (num[1]-num[2]))
                    count++;
            }
            
            
        }
        
        System.out.println(count);
        
        
    }
 
}





