/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojos.CirugiaMedico;
import com.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author alfreding0
 */
public class DaoCirugiaMedico {

    public boolean insertarCirugiaMedico(CirugiaMedico cirugiaMedico) {
        Session session = null;
        boolean response;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(cirugiaMedico);
            session.getTransaction().commit();
            response = true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            response = false;
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return response;
    }

    public boolean modificarCirugiaMedico(CirugiaMedico cirugiaMedico) {
        Session session = null;
        boolean response;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(cirugiaMedico);
            session.getTransaction().commit();
            response = true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            response = false;
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return response;
    }

    public boolean eliminarCirugiaMedico(CirugiaMedico cirugiaMedico) {
        Session session = null;
        boolean response;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(cirugiaMedico);
            session.getTransaction().commit();
            response = true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            response = false;
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return response;
    }

    //Retorna todas las cirugiaMedicos de la BD
    public List<CirugiaMedico> getListaDetalleCirugiaMedicos(int cirugia_id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM CirugiaMedico where cirugia_id = :cirugia_id";
        Query query = session.createQuery(hql);
        query.setParameter("cirugia_id", cirugia_id);
        List<CirugiaMedico> lista = query.list();
        
        return lista;
    }
    
}
