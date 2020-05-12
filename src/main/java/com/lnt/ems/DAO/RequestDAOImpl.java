//Implement the unimplemented methods
package com.lnt.ems.DAO;

import com.lnt.ems.Entity.Request;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RequestDAOImpl implements RequestDAO {

    //need to inject the session factory
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Request> getRequests() {
        // 1. get current hibernate session
        // 2. create a query
        // 3. execute query and get result list
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Request> theQuery = currentSession.createQuery("from Requests order by lastName", Request.class);
        List<Request> requests = theQuery.getResultList();

        return requests;
    }

    @Override
    public void createRequest(Request theRequest) {

        // 1. get the current hibernate session
        // 2. save the request
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theRequest);
    }

    @Override
    public Request getRequest(int theId) {

        // 1. get the current hibernate session
        // 2. now retrieve/read from database using the primary key
        Session currentSession = sessionFactory.getCurrentSession();
        Request theRequest = currentSession.get(Request.class, theId);

        return theRequest;

    }

    @Override
    public void deleteRequest(int theId) {

        // 1. get the current hibernate session
        // 2. delete object with primary key
        Session currentSession = sessionFactory.getCurrentSession();
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