/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojos.Cirugia;
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
public class DaoCirugia {

    public boolean insertarCirugia(Cirugia cirugia) {
        Session session = null;
        boolean response;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(cirugia);
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

    public boolean modificarCirugia(Cirugia cirugia) {
        Session session = null;
        boolean response;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(cirugia);
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

    public boolean eliminarCirugia(Cirugia cirugia) {
        //Primero eliminamos los dependientes de este mismo, o sea el detalle.
        DaoCirugiaMedico daoCirugiaMedico = new DaoCirugiaMedico();
        List<CirugiaMedico> lista = daoCirugiaMedico.getListaDetalleCM(cirugia.getId());
        lista.forEach((cirugiaMedico) -> { daoCirugiaMedico.eliminarCirugiaMedico(cirugiaMedico); });

        //Ahora se puede eliminar la cirugia porque ya no tiene filas dependientes de este mismo.
        Session session = null;
        boolean response;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(cirugia);
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

    //Retorna todas las cirugias de la BD
    public List getListaCirugias_OnlyString() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Cirugia";
        Query query = session.createQuery(hql);
        List<Cirugia> listaCirugias = query.list();
        
        List lista = new ArrayList();
        for (Cirugia cirugia : listaCirugias) {
            lista.add(new Object[]{cirugia.getId(), cirugia.getFecha(), cirugia.getHora(), cirugia.getNroSala(), cirugia.getSecretaria().getNombreCompleto()});
        }        
        session.close();

        return lista;
    }
    
    public List<Cirugia> getListaCirugias() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Cirugia";
        Query query = session.createQuery(hql);
        List<Cirugia> listaCirugias = query.list();    
        session.close();

        return listaCirugias;
    }

    public Cirugia buscarCirugiaPorID(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Cirugia where id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("id", id);
        Cirugia cirugia = (Cirugia) query.uniqueResult();
        session.close();

        return cirugia;
    }
}
