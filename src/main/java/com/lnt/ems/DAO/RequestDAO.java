package com.lnt.ems.DAO;

import com.lnt.ems.Entity.Request;
import java.util.List;

public interface RequestDAO {

    public List<Request> getRequests();
    public void createRequest(Request theRequest);
    public Request getRequest(int theId);
    public void deleteRequest(int theId);

    public List<Request> listApproved(int theEngineerId);
    public List<Request> listRequested(int theEngineerId);
    public List<Request> listRejected(int theEngineerId);
    public List<Request> listClosed(int theEngineerId);

}
