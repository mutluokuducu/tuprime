package com.tuprime.common.dao.generic;

public interface GenericDao <T> {
	void persist(T o);
	T find(Integer id);
	void update(T o);
	void delete(T o);
	void merge(T o);
}
