package com.lnt.ems.Service;

import java.util.List;

import com.lnt.ems.DAO.EngineerDAO;
import com.lnt.ems.Entity.Engineer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EngineerServiceImpl implements EngineerService {

    // need to inject Engineer DAO
    @Autowired
    private EngineerDAO engineerDAO;

    @Override
    @Transactional
    public List<Engineer> getEngineers(){
        return engineerDAO.getEngineers();
    }

    @Override
    @Transactional
    public void saveEngineer(Engineer theEngineer){
        engineerDAO.saveEngineer(theEngineer);
    }

    @Override
    @Transactional
    public Engineer getEngineer(int theId) {

        return engineerDAO.getEngineer(theId);
    }

    @Override
    @Transactional
    public void deleteEngineer(int theId) {

        engineerDAO.deleteEngineer(theId);
    }
}
