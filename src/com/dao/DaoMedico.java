/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojos.Medico;
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
public class DaoMedico {

    public String insertarMedico(Medico medico) {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(medico);
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

    public String modificarMedico(Medico medico) {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(medico);
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

    public String eliminarMedico(Medico medico) {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(medico);
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

    public List<Medico> getListaMedicos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Medico";
        Query query = session.createQuery(hql);
        List<Medico> listaMedicos = query.list();

        return listaMedicos;
    }

    public Medico buscarMedicoPorID(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Medico where id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        Medico medico = (Medico) query.uniqueResult();

        return medico;
    }

}
