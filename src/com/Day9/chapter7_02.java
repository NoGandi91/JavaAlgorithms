/*
 * ���� : ���ĺ� ã��
���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, 
�ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.

���
������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ����Ѵ�.
����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��° ��ġ�̴�.
 */

package com.Day9;

import java.util.Scanner;
 
public class chapter7_02 {
    
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int[] alphabat = new int[26];
        String Word = sc.nextLine();
        
        for(int i='a'; i<'a'+26; i++) {
        	alphabat[i-'a'] = Word.indexOf((char)i);
        }
        for(int i=0; i<26; i++) {
        	System.out.print(alphabat[i]+" ");
        } 
    }
}

