package Action;
import java.util.List;

import Dao.DAOFactory;
import Dao.ICostDao;
import Entity.Cost;

/**
 *    资费查询Action
 */
public class FindCostAction {
    // output
    private List<Cost> costs;
    /**
     * 业务方法，配置action时如果不指定method属性，
     * 那么Struts2会自动调用execute方法。
     */
    public String execute() {
        // 获取DAO实例
        ICostDao dao = DAOFactory.getCostDAO();
        // 调用DAO，计算输出
        try {
            costs = dao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            // 捕获到异常时，跳转到错误页面
            return "error";
        }
        // 正常执行时，跳转到资费列表页面
        return "success";
    }
    public List<Cost> getCosts() {
        return costs;
    }
    public void setCosts(List<Cost> costs) {
        this.costs = costs;
    }
}

