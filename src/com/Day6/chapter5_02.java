/*���� : �Ѽ�
 * � ���� ���� X�� �ڸ����� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
 * ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
 * N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
�Է�
ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.

���
ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.

 */
package com.Day6;

import java.util.Scanner;

public class chapter5_02 {

public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        int[] num = new int[3]; //�����ڸ�, �����ڸ�, �����ڸ�
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





