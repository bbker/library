package NEWlibrary;

import java.util.Date;

public class Teacher extends Reader{ //继承Reader的方法

	public Teacher(){  //初始化类
		this("lisi",123456);
	}
	public Teacher(String name,int password){
		super();
		this.name = name;
		this.password = password;
	}

	public void login(){
		while(this.name.equals(User.inputname) && this.password==User.inputpassword){//判断姓名密码是否符合
			System.out.println(who()+" 您好！欢迎登陆图书管理系统。 现在是："+new Date());break;
	        }
	    while(!this.name.equals(User.inputname) || this.password!=User.inputpassword){
		   Reader a2=new Student();  //动态绑定
		   a2.login();              //判断下一个类是否符合
		   break;
		}
	    }
	public String who(){ //返回用户信息
		return "  李四 老师";
	}
}
