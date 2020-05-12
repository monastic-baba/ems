package com.lnt.ems.Service;

import com.lnt.ems.Entity.Engineer;

import java.util.List;

public interface EngineerService {

    public List<Engineer> getEngineers();

    public void saveEngineer(Engineer theEngineer);

    public Engineer getEngineer(int theId);

    public void deleteEngineer(int theId);

}
