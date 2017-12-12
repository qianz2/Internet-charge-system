package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class FirstInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		 System.out.println("destroy invoke !");  
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		 System.out.println("init invoke !");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("������ǰ");
		arg0.invoke();
		System.out.println("�����غ�");
		return "error";
	}
	
}
