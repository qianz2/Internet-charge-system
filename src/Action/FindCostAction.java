package Action;
import java.util.List;

import Dao.DAOFactory;
import Dao.ICostDao;
import Entity.Cost;

/**
 *    �ʷѲ�ѯAction
 */
public class FindCostAction {
    // output
    private List<Cost> costs;
    /**
     * ҵ�񷽷�������actionʱ�����ָ��method���ԣ�
     * ��ôStruts2���Զ�����execute������
     */
    public String execute() {
        // ��ȡDAOʵ��
        ICostDao dao = DAOFactory.getCostDAO();
        // ����DAO���������
        try {
            costs = dao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            // �����쳣ʱ����ת������ҳ��
            return "error";
        }
        // ����ִ��ʱ����ת���ʷ��б�ҳ��
        return "success";
    }
    public List<Cost> getCosts() {
        return costs;
    }
    public void setCosts(List<Cost> costs) {
        this.costs = costs;
    }
}

