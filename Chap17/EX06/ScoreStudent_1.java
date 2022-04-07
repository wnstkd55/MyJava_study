package Chap17.EX06;

import java.util.ArrayList;
import java.util.Scanner;
/*
 	1. �л��� : ������ ���� �Է������� ArrayList�� capacity ũ�� ����
 	2. ���� �Է� : �Է¹��� �л����� ���� ���� �Է�. ArrayList�� ���� ��ü�� ����
 	3. ���� ����Ʈ : ArrayList�� ����� Student��ü�� �����ͼ� score���.
 	4. �м� : �ְ����� : , ������� : ,
 	5. ����
 */


class Student{
	
	int score;
	Student(){}
	Student(int score) {
		this.score=score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}

public class ScoreStudent_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<Student>();

        boolean run = true;
        int studentNum = 0;			//while ��� �ۿ��� ����, ��������
        
        while(run) {			//run : true
            System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("�л����� �Է��ϼ��� : ");
                	//�ڵ� �ۼ� 
                studentNum = scanner.nextInt();
                System.out.println("�Է¿Ϸ�");
                
            } else if(selectNo == 2) {
            		//�ڵ��ۼ�
            	if(studentNum == 0) {
            		System.out.println("�л����� ���� �Է��ϼ���.");
            	}else {
            		for (int i = 0; i < studentNum; i++) {
                		System.out.println(i + 1 + "�� �л��� ������ �Է��ϼ���.");
                		int scoreInput = scanner.nextInt();
                		//��ǲ�� �޾Ƽ� ��ǲ ���� ���� Student��ü�� score������ �Ҵ�
                		//��ü�� �����ؼ�
                		Student student = new Student(scoreInput);	//�⺻ �����ڸ� ����ؼ� ��ü ����, ����score�ʵ��� ���� �Ҵ�
                		arr.add(student);	//ArrayList�� �ʵ忡 ���� �Ҵ��� ��ü�� ArrayList�� ����
                	}
                	System.out.println("�Է¿Ϸ�");
            	}
            	
            	
            } else if(selectNo == 3) {
            		//�ڵ��ۼ�, ��������Ʈ���, ArrayList�� ������ �Ҵ��� ��ü
            	for (int i = 0; i < arr.size(); i++) {
            		System.out.println((i + 1) + "�� �л� ���� : " + arr.get(i).score + "��");
            	}
            	
            } else if(selectNo == 4) {
            	//�ڵ��ۼ�
            	int maxScore = 0;	//�ִ� ������ �޴� �������� ���� <�ʱⰪ �Ҵ�>
            	int sum = 0;		//�հ踦 �����ϴ� ��������	<�ʱⰪ �Ҵ�>
            	//1. ArrayList�� ��ü�� ������ �´�. 2.Student��ü�� score�ʵ��� ���� �����ͼ� ó��
            	for (int i = 0; i<arr.size(); i++) {
            		if (maxScore<arr.get(i).score) {
            			maxScore=arr.get(i).score;
            		}
                }
            	
            	for (int i = 0; i<arr.size(); i++) {
            		sum += arr.get(i).score;
            	}
            	//maxScore������ �������� ������,sum = sum+student.score
              System.out.println("�ְ����� : " + maxScore + "��");
              
              System.out.println("������� : " + (float) sum / studentNum + "��");
         
            } else if(selectNo == 5) {
            	break;
              }
        }
        System.out.println ("���α׷� ����");
	}
}
