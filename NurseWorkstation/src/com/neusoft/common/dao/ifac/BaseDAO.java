package com.neusoft.common.dao.ifac;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 * @author Ghost
 *
 * @param <T> ID������
 * @param <E> ʵ���������
 */
public interface BaseDAO<T,E> {
	public void save(E instance);
	public void delete(E instance);
	public void update(E instance);
	/**
	 * @param id ����ʵ��Serializable�ӿ�
	 * @return ���ҵ���ʵ��
	 */
	public E findById(T id);
	public List<E> findAll();
	/**
	 * @param startIdx ������ʼֵ����<i>��</i> ��ʼ��
	 * @param maxNum ��ȡ�ļ��ϵ����Ԫ������
	 * @return ���ҵ���ʵ�弯��
	 */
	public List<E> findByLimit(int startIdx,int maxNum);
	
	public List<E> findWithConditionByLimit(int startIdx,int maxNum, Criterion[] criterions);
}
