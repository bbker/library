package NEWlibrary;

import java.util.Date;

public class Student extends Reader{  //继承Reader的方法
	
	public Student(){//初始化类
		this("wangwu",123456);
	}
	public Student(String name,int password){
		super();
		this.name = name;
		this.password = password;
  }

	public void login(){
		while(this.name.equals(User.inputname) && this.password==User.inputpassword){
			System.out.println(who()+" 您好！欢迎登陆图书管理系统。 现在是："+new Date());break;
	        }
	    while(!this.name.equals(User.inputname) || this.password!=User.inputpassword){
		    System.out.println("  姓名或密码错误！请重新登陆!\n");
		    Administration a1=new Administration();//创建实例
		    a1.login();//调用该方法重新输入姓名密码
		    break;
		}
	}

	public String who(){ //返回用户信息
		return "  王五 同学";
	}
}
