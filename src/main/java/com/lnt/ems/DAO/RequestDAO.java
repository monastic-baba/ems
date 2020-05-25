package com.lnt.ems.DAO;

import com.lnt.ems.Entity.Request;
import java.util.List;

public interface RequestDAO {

    public List<Request> getRequests();
    public void createRequest(Request theRequest);
    public Request getRequest(int theId);
    public void deleteRequest(int theId);

    public List<Request> listApproved(int theEngineerId, String theStatus);
    public List<Request> listRequested(int theEngineerId, String theStatus);
    public List<Request> listRejected(int theEngineerId, String theStatus);
    public List<Request> listClosed(int theEngineerId, String theStatus);

}
