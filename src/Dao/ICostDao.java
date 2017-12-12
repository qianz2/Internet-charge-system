package Dao;

import java.util.List;

import Entity.Cost;
/**
 * 资费DAO接口
 */
public interface ICostDao {
    /**
     * 查询全部资费数据
     */	
    List<Cost>findAll();
    Cost findByName(String name);
}