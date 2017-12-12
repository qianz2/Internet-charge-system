package Action;

import java.util.*;

import Dao.DAOFactory;
import Dao.ICostDao;
import Entity.Cost;

public class CheckCostNameAction {
	//input
	private String name;//�ʷ���
	
	//output
	private Map<String,Object> info = new HashMap<String,Object>();//��ʾ��Ϣ
	
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
			info.put("message", "ϵͳ�쳣������ϵ����Ա���Ժ�����");
		}
		
		if(cost==null) {
			//û���ҵ��ʷѣ�˵������û���ظ�
			info.put("success", true);
			info.put("message", "���԰����ҵ��");
		}
		else {
			//�ҵ����ʷѣ�˵�������ظ���
			info.put("success", false);
			info.put("message", "�����ظ������ҵ��");
		}
		return "success";
	}
	
}
