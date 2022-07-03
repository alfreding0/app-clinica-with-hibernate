/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojos.Cirugia;
import com.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author alfreding0
 */
public class DaoCirugia {

    public String insertarCirugia(Cirugia cirugia) {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(cirugia);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return "Insertado";
    }

    public String modificarCirugia(Cirugia cirugia) {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(cirugia);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return "Modificado";
    }

    public String eliminarCirugia(Cirugia cirugia) {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(cirugia);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return "Eliminado";
    }

    //Retorna todas las cirugias de la BD
    public List<Cirugia> getListaCirugias() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Cirugia";
        Query query = session.createQuery(hql);
        List<Cirugia> listaCirugias = query.list();

        return listaCirugias;
    }

}
