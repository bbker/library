package NEWlibrary;

import java.util.Date;

public class Student extends Reader{  //�̳�Reader�ķ���
	
	public Student(){//��ʼ����
		this("wangwu",123456);
	}
	public Student(String name,int password){
		super();
		this.name = name;
		this.password = password;
  }

	public void login(){
		while(this.name.equals(User.inputname) && this.password==User.inputpassword){
			System.out.println(who()+" ���ã���ӭ��½ͼ�����ϵͳ�� �����ǣ�"+new Date());break;
	        }
	    while(!this.name.equals(User.inputname) || this.password!=User.inputpassword){
		    System.out.println("  ������������������µ�½!\n");
		    Administration a1=new Administration();//����ʵ��
		    a1.login();//���ø÷�������������������
		    break;
		}
	}

	public String who(){ //�����û���Ϣ
		return "  ���� ͬѧ";
	}
}
