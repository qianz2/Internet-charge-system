package Dao;

import java.util.ArrayList;
import java.util.List;
import Entity.Cost;

public class CostDaoImpl implements ICostDao {
    @Override
    public List<Cost> findAll() {
        // ģ���ѯȫ���ʷ�����
        List<Cost> list = new ArrayList<Cost>();
        
        Cost c1 = new Cost();
        c1.setId(95);
        c1.setName("6Ԫ�ײ�");
        c1.setBaseDuration(66);
        c1.setBaseCost(6.6);
        c1.setUnitCost(0.6);
        c1.setDescr("6Ԫ�ײ�");
        c1.setStatus("0");
        c1.setCostType("2");
        list.add(c1);
        
        Cost c2 = new Cost();
        c2.setId(96);
        c2.setName("8Ԫ�ײ�");
        c2.setBaseDuration(88);
        c2.setBaseCost(8.8);
        c2.setUnitCost(0.8);
        c2.setDescr("8Ԫ�ײ�");
        c2.setStatus("0");
        c2.setCostType("2");
        list.add(c2);
        
        Cost c3 = new Cost();
        c3.setId(97);
        c3.setName("softi");
        c3.setBaseDuration(99);
        c3.setBaseCost(9.9);
        c3.setUnitCost(0.9);
        c3.setDescr("softi�ײ�");
        c3.setStatus("0");
        c3.setCostType("2");
        list.add(c3);
        
        return list;
    }

	public Cost findByName(String name) {
		if("softi".equals(name)) {
			//�������Ʋ�ѯ�ʷ����ݣ������ʷѱ���ֻ��һ����Ϊsofti������
			Cost c = new Cost();
			c.setId(100);
			c.setName("softi");
			c.setBaseDuration(99);
			c.setDescr("softi�ײ�");
			return c;
		}
		return null;
	}
    
    

}

