package Dao;

/**
 * DAO工厂，负责统一的创建DAO实例。
 */

public class DAOFactory {
    /**
     * 资费DAO实例
     */
    private static ICostDao costDao = new CostDaoImpl();
    /**
     * 返回资费DAO实例
     */
    public static ICostDao getCostDAO() {
        return costDao;
    }
}

