package Dao;

/**
 * DAO����������ͳһ�Ĵ���DAOʵ����
 */

public class DAOFactory {
    /**
     * �ʷ�DAOʵ��
     */
    private static ICostDao costDao = new CostDaoImpl();
    /**
     * �����ʷ�DAOʵ��
     */
    public static ICostDao getCostDAO() {
        return costDao;
    }
}

