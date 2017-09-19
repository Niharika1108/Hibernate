package com.mkyong.common;

import org.hibernate.Session;

import com.mkyong.Persistence.HibernateUtil;

public class App {
	public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockCode("475");
        stock.setStockName("New entry");

        session.save(stock);
        session.getTransaction().commit();
    }
}