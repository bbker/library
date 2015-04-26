package NEWlibrary;

public class Test {

	public static void main(String[] args) {
		try{
		User a1=new Administration();//{从管理员类开始进行动态绑定，}
		a1.login();                    //{ 动态判断输入的信息是否符合 }
		}			      	
	   catch(Exception ex){//异常处理
			  System.out.println("  您输入的内容有误请重新输入!\n");
			  Administration a1=new Administration();//调用该方法重新输入姓名密码
			    a1.login();

	    }
            }
                      }