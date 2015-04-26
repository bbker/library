package NEWlibrary;

import java.util.Date;
import java.util.Scanner;

public  class Administration extends User { //继承User的方法


	public Administration(){
		this("zhangsan",123456);   //初始化类
	}
	public Administration(String name,int password){ 
		super();
		this.name = name;
		this.password = password;
	}
	public void login(){//登陆提示，判断用户的输入，给出用户登录信息
		System.out.println(" 欢迎进入齐工大图书管理系统请登录");
		Scanner input=new Scanner(System.in);
		System.out.println("  请输入姓名：   ");		
		inputname=input.next();              //获取用户名,继承自父类；
		System.out.println("  请输入密码：   ");
		inputpassword=input.nextInt();   //获取密码,继承自父类；	
		while(this.name.equals(inputname) && this.password==inputpassword){  //判断姓名、密码是否符合
			System.out.println(who()+" 您好！欢迎登陆图书管理系统。 现在是："+new Date());break;//用于终止循环
	        }
	    while(!this.name.equals(inputname) || this.password!=inputpassword){ //不符合
		    Reader a1=new Teacher();  //动态绑定
		    a1.login();               //判断下一个类是否符合
		    break;
		}
	    }		
	public String who(){//返回用户信息
		return "  张三 管理员";
	}
}
