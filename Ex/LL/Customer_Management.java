package Department;

import java.util.ArrayList;

/*
 	��ȭ���� �� ���� ���α׷�.  (��Ӱ� ������) 
	
 	�� ��� : 1. �Ϲݰ�(silver) : ���ʽ�����Ʈ(1%����), ���η�(����) , 
 			 2. Gold �� : ���ʽ�����Ʈ(2%����), ���η�(5%)
 			 3. VIP �� : ���ʽ�����Ʈ(5%����), ���η�(10%), ��翡�����尡 ���� 
 */
class Customer{		//�Ϲݰ� (Silver)
	int customerID; 		//�� ID 
	String customerName	;	//�� �̸� 
	String customerGrade; 	//����� ( "Silver", "Gold", "VIP" ) 
	double bounsPoint; 		//���ʽ� ����Ʈ �� : 
	double bonusRatio; 		//���ʽ� ����Ʈ ������ : " Silver: 1%, Gold : 2%, VIP : 5% "
	
	//�����ڿ��� �⺻���� 2���� �ʵ��� ���� �ε� : customerGrade : Silver , bonusRatio : 1%
	
	public double calcPrice(int price) {			//<<���� Ŭ�������� �������̵� �ؼ� ó�� >>
		//��ǰ�� ������ �޾Ƽ� ���ʽ� ����Ʈ�� �����ϴ� �ڵ� 
		
		return price; 	//���ε� ������ ���Ͻ��� �ش�.  
	}
	
}
class GoldCustomer extends Customer{
	double saleRatio; 		//��ǰ ������ : �����ڿ��� �⺻���� : 5% 
	
	//�����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε� : customerGrade : Gold , bonusRatio : 2%, saleRatio : 5%	
}
class VIPCustomer extends Customer{
	private int agentID; 	// ������, setter , �ʵ�(X)
	double saleRatio;		//��ǰ ���η� : 10% 
	
	//�����ڿ��� �⺻���� 3���� �ʵ��� ���� �ε� : customerGrade : VIP , bonusRatio : 5%, saleRatio : 10%
}


public class Customer_Management {
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>(); 
		
		/*
		
		======================================================================
		1. �Ϲݰ� ���	|   2. VIP �����      |  3. Gold �� ���   4. ���� ���    5. ��ǰ����  5. ���� 
		======================================================================
		���� >> 1
		==�Ϲݰ� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 

		���� >>2
		==VIP �� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 
		��翡����Ʈ(ID) ��� : 

		���� >>3
		==Gold �� ��� �Դϴ�. ==
		�� ���̵� : 
		���̸� : 

		���� >>4
		==�� ���� ���  �Դϴ�. ==
		��ID	���̸�	�����	���η�	���ʽ�����Ʈ����	������ƮID<VIP��>



		���� >>5
		==��ǰ������ ������ �ּ��� ==
		�� ���̵� : 
		���� ��ǰ ���� :  

		000 ���� 000 �� ���� �ϼ̽��ϴ�. 
		000 ������ ����� 000 �̰� ���� ����Ʈ�� 000 �̰� ������ 000�� �Ǿ����ϴ�. 

		*/
		
		
		
		
		
		
		
		
	}

}
