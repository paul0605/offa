package com.offa.offer.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}

		return session;
	}

	public void persist(Object entity) {
		Session session = getSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		session.persist(entity);
		tx.commit();
		session.close();
	}

	public void delete(Object entity) {
		getSession().delete(entity);
	}

}
