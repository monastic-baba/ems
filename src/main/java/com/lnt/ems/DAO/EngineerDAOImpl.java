package com.lnt.ems.DAO;

import com.lnt.ems.Entity.Engineer;
import org.hibernate.Session;
import org.hibernate.query.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EngineerDAOImpl implements EngineerDAO {



    private EntityManager entityManager;

    @Autowired
    public EngineerDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Engineer> getEngineers() {
        // 1. get current hibernate session
        // 2. create a query
        // 3. execute query and get result list
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Engineer> theQuery = currentSession.createQuery("from Engineer order by lastName", Engineer.class);
        List<Engineer> engineers = theQuery.getResultList();

        return engineers;
    }

    @Override
    public void saveEngineer(Engineer theEngineer) {

        // 1. get the current hibernate session
        // 2. save the engineer
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theEngineer);
    }

    @Override
    public Engineer getEngineer(int theId) {

        // 1. get the current hibernate session
        // 2. now retrieve/read from database using the primary key
        Session currentSession = entityManager.unwrap(Session.class);
        Engineer theEngineer = currentSession.get(Engineer.class, theId);

        return theEngineer;

    }

    @Override
    public void deleteEngineer(int theId) {

        // 1. get the current hibernate session
        // 2. delete object with primary key
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete from Engineer where id=:engineerId");
        theQuery.setParameter("engineerId", theId);
        theQuery.executeUpdate();

    }
}
