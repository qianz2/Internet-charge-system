package Action;

import java.util.*;

import Dao.DAOFactory;
import Dao.ICostDao;
import Entity.Cost;

public class CheckCostNameAction {
	//input
	private String name;//资费名
	
	//output
	private Map<String,Object> info = new HashMap<String,Object>();//提示信息
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Object> getInfo() {
		return info;
	}

	public void setInfo(Map<String, Object> info) {
		this.info = info;
	}

	public String execute() {
		ICostDao dao = DAOFactory.getCostDAO();
		Cost cost = null;
		try {
			cost = dao.findByName(name);
		}catch(Exception e) {
			e.printStackTrace();
			
			info.put("success", false);
			info.put("message", "系统异常，请联系管理员，稍后重试");
		}
		
		if(cost==null) {
			//没有找到资费，说明名称没有重复
			info.put("success", true);
			info.put("message", "可以办理该业务");
		}
		else {
			//找到了资费，说明名称重复了
			info.put("success", false);
			info.put("message", "不能重复办理该业务");
		}
		return "success";
	}
	
}
