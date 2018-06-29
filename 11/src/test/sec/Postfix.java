package test.sec;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class Postfix extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.print("adsd");
		HttpServletRequest request = ServletActionContext.getRequest();
		String log = request.getParameter("username");
		System.out.print("sd");
		if (log.endsWith("r")) {
			return invocation.invoke();
		} else {
			return "reput";
		}

	}

}
