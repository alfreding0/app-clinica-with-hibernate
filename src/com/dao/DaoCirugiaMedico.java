/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojos.CirugiaMedico;
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
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
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
            System.out.println(e.getMessage());
            response = false;
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return response;
    }

    //Retorna todas las cirugiaMedicos de la BD
    public List getListaDetalleCM_OnlyString(int cirugia_id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM CirugiaMedico where cirugia_id = :cirugia_id";
        Query query = session.createQuery(hql);
        query.setParameter("cirugia_id", cirugia_id);
        List<CirugiaMedico> listaCirugiaMedico = query.list();
        
        List lista = new ArrayList();
        listaCirugiaMedico.forEach((obj) -> {
            lista.add(new Object[]{obj.getId(), obj.getMedico().getId(), obj.getMedico().getNombres() + " " + obj.getMedico().getApellidos()});
        });
        
        session.close();
        
        return lista;
    }
    
    public List<CirugiaMedico> getListaDetalleCM(int cirugia_id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM CirugiaMedico where cirugia_id = :cirugia_id";
        Query query = session.createQuery(hql);
        query.setParameter("cirugia_id", cirugia_id);
        List<CirugiaMedico> listaCirugiaMedico = query.list();
        session.close();
        
        return listaCirugiaMedico;
    }    
    
    public CirugiaMedico findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM CirugiaMedico where id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        CirugiaMedico cirugiaMedico = (CirugiaMedico) query.uniqueResult();
        session.close();
        
        return cirugiaMedico;
    }
}
