package com.lnt.ems.DAO;

import com.lnt.ems.Entity.Engineer;
import java.util.List;

public interface EngineerDAO {

    public List<Engineer> getEngineers();

    public void saveEngineer(Engineer theEngineer);

    public Engineer getEngineer(int theId);

    public void deleteEngineer(int theId);

}
