package NEWlibrary;

import java.util.Date;

public class Teacher extends Reader{ //�̳�Reader�ķ���

	public Teacher(){  //��ʼ����
		this("lisi",123456);
	}
	public Teacher(String name,int password){
		super();
		this.name = name;
		this.password = password;
	}

	public void login(){
		while(this.name.equals(User.inputname) && this.password==User.inputpassword){//�ж����������Ƿ����
			System.out.println(who()+" ���ã���ӭ��½ͼ�����ϵͳ�� �����ǣ�"+new Date());break;
	        }
	    while(!this.name.equals(User.inputname) || this.password!=User.inputpassword){
		   Reader a2=new Student();  //��̬��
		   a2.login();              //�ж���һ�����Ƿ����
		   break;
		}
	    }
	public String who(){ //�����û���Ϣ
		return "  ���� ��ʦ";
	}
}
