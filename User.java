package NEWlibrary;

public abstract class User {
	protected   String name;  //各个类继承姓名
	protected   int password;//各个类继承密码
	protected   static String inputname;   //用户输入的姓名
	protected  static  int inputpassword; //用户输入的密码
	public User(){		       //构造方法
	}

	public String who(){       //用于返回用户类别
		return "  看到我就说明，程序出错了我是User";
	}
	abstract public void login();  //抽象的登陆类
	

}
