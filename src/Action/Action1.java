package Action;

import com.opensymphony.xwork2.ActionSupport;

public class Action1 extends ActionSupport {  
    
    private String username;  
    private String password;  
    
    public Action1() {
    	System.out.println("≥ı ºªØ");
    }
      
    public String getUsername() {  
        return username;  
    }  
    public void setUsername(String username) {  
        this.username = username;  
    }  
    public String getPassword() {  
        return password;  
    }  
    public void setPassword(String password) {  
        this.password = password;  
    }  
      
    public String execute()  
    {  
        System.out.println("action1 invoke !");  
        return "success";  
    }  
}  