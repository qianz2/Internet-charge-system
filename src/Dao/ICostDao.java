package Dao;

import java.util.List;

import Entity.Cost;
/**
 * �ʷ�DAO�ӿ�
 */
public interface ICostDao {
    /**
     * ��ѯȫ���ʷ�����
     */	
    List<Cost>findAll();
    Cost findByName(String name);
}