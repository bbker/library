package NEWlibrary;

public abstract class User {
	protected   String name;  //������̳�����
	protected   int password;//������̳�����
	protected   static String inputname;   //�û����������
	protected  static  int inputpassword; //�û����������
	public User(){		       //���췽��
	}

	public String who(){       //���ڷ����û����
		return "  �����Ҿ�˵�����������������User";
	}
	abstract public void login();  //����ĵ�½��
	

}
