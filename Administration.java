package NEWlibrary;

import java.util.Date;
import java.util.Scanner;

public  class Administration extends User { //�̳�User�ķ���


	public Administration(){
		this("zhangsan",123456);   //��ʼ����
	}
	public Administration(String name,int password){ 
		super();
		this.name = name;
		this.password = password;
	}
	public void login(){//��½��ʾ���ж��û������룬�����û���¼��Ϣ
		System.out.println(" ��ӭ�����빤��ͼ�����ϵͳ���¼");
		Scanner input=new Scanner(System.in);
		System.out.println("  ������������   ");		
		inputname=input.next();              //��ȡ�û���,�̳��Ը��ࣻ
		System.out.println("  ���������룺   ");
		inputpassword=input.nextInt();   //��ȡ����,�̳��Ը��ࣻ	
		while(this.name.equals(inputname) && this.password==inputpassword){  //�ж������������Ƿ����
			System.out.println(who()+" ���ã���ӭ��½ͼ�����ϵͳ�� �����ǣ�"+new Date());break;//������ֹѭ��
	        }
	    while(!this.name.equals(inputname) || this.password!=inputpassword){ //������
		    Reader a1=new Teacher();  //��̬��
		    a1.login();               //�ж���һ�����Ƿ����
		    break;
		}
	    }		
	public String who(){//�����û���Ϣ
		return "  ���� ����Ա";
	}
}
