/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojos.Secretaria;
import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author alfreding0
 */
public class DaoSecretaria {

    public String insertarSecretaria(Secretaria secretaria) {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(secretaria);
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

    public String modificarSecretaria(Secretaria secretaria) {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(secretaria);
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

    public String eliminarSecretaria(Secretaria secretaria) {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(secretaria);
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

    public List<Secretaria> getListaSecretarias() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Secretaria";
        Query query = session.createQuery(hql);
        List<Secretaria> listaSecretarias = query.list();

        return listaSecretarias;
    }

    public Secretaria buscarSecretariaPorID(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Secretaria where id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        Secretaria secretaria = (Secretaria) query.uniqueResult();

        return secretaria;
    }

}
