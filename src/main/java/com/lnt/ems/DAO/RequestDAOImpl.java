//Implement the unimplemented methods
package com.lnt.ems.DAO;

import com.lnt.ems.Entity.Request;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RequestDAOImpl implements RequestDAO {

    private EntityManager entityManager;

    @Autowired
    public RequestDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Request> getRequests() {
        // 1. get current hibernate session
        // 2. create a query
        // 3. execute query and get result list
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Request> theQuery = currentSession.createQuery("from Request order by lastName", Request.class);
        List<Request> requests = theQuery.getResultList();

        return requests;
    }

    @Override
    public void createRequest(Request theRequest) {

        // 1. get the current hibernate session
        // 2. save the request
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theRequest);
    }

    @Override
    public Request getRequest(int theId) {

        // 1. get the current hibernate session
        // 2. now retrieve/read from database using the primary key
        Session currentSession = entityManager.unwrap(Session.class);
        Request theRequest = currentSession.get(Request.class, theId);

        return theRequest;

    }

    @Override
    public void deleteRequest(int theId) {

        // 1. get the current hibernate session
        // 2. delete object with primary key
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete from Request where id=:requestId");
        theQuery.setParameter("requestId", theId);
        theQuery.executeUpdate();

    }

    // TO BE IMPLEMENTED
    @Override
    public List<Request> listApproved(int theEngineerId) {
        return null;
    }

    // TO BE IMPLEMENTED
    @Override
    public List<Request> listRequested(int theEngineerId) {
        return null;
    }

    // TO BE IMPLEMENTED
    @Override
    public List<Request> listRejected(int theEngineerId) {
        return null;
    }

    // TO BE IMPLEMENTED
    @Override
    public List<Request> listClosed(int theEngineerId) {
        return null;
    }
}