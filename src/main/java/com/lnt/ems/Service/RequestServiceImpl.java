package com.lnt.ems.Service;

import java.util.List;

import com.lnt.ems.DAO.RequestDAO;
import com.lnt.ems.Entity.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RequestServiceImpl implements RequestService {

    // need to inject Request DAO
    @Autowired
    private RequestDAO requestDAO;

    @Override
    @Transactional
    public List<Request> getRequests(){
        return requestDAO.getRequests();
    }

    @Override
    @Transactional
    public void createRequest(Request theRequest){
        requestDAO.createRequest(theRequest);
    }

    @Override
    @Transactional
    public Request getRequest(int theId) {

        return requestDAO.getRequest(theId);
    }

    @Override
    @Transactional
    public void deleteRequest(int theId) {

        requestDAO.deleteRequest(theId);
    }


    @Override
    public List<Request> listApproved(int theEngineerId) {
        return requestDAO.listApproved(theEngineerId, "approved");
    }


    @Override
    public List<Request> listRequested(int theEngineerId) {
        return requestDAO.listRequested(theEngineerId, "requested");
    }

    @Override
    public List<Request> listRejected(int theEngineerId) {
        return requestDAO.listRejected(theEngineerId, "rejected");
    }

    @Override
    public List<Request> listClosed(int theEngineerId) {
        return requestDAO.listClosed(theEngineerId, "closed");
    }


}
