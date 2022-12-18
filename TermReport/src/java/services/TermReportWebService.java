/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Todaycasesall;

/**
 *
 * @author HP
 */
@WebService(serviceName = "TermReportWebService")
public class TermReportWebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("TermReportPU");

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findData")
    public Todaycasesall findData(@WebParam(name = "week_case") int week_case) {
        EntityManager em = emf.createEntityManager();
        Todaycasesall tca = em.find(Todaycasesall.class, week_case);
        return tca;
    }

    private void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    /**
     * This is a sample web service operation
     */
    
    
}
