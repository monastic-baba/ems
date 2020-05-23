//Implement the unimplemented methods
package com.lnt.ems.DAO;

import com.lnt.ems.Entity.Machine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MachineDAOImpl implements MachineDAO {

    private EntityManager entityManager;

    @Autowired
    public MachineDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Machine> getMachines() {
        // 1. get current hibernate session
        // 2. create a query
        // 3. execute query and get result list
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Machine> theQuery = currentSession.createQuery("from Machine order by id", Machine.class);
        List<Machine> machines = theQuery.getResultList();

        return machines;
    }

    @Override
    public void saveMachine(Machine theMachine) {

        // 1. get the current hibernate session
        // 2. save the machine
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theMachine);
    }

    @Override
    public Machine getMachine(int theId) {

        // 1. get the current hibernate session
        // 2. now retrieve/read from database using the primary key
        Session currentSession = entityManager.unwrap(Session.class);
        Machine theMachine = currentSession.get(Machine.class, theId);

        return theMachine;

    }

    @Override
    public void deleteMachine(int theId) {

        // 1. get the current hibernate session
        // 2. delete object with primary key
        Session currentSession = entityManager.unwrap(Session.class);
        Query theQuery = currentSession.createQuery("delete from Machine where id=:machineId");
        theQuery.setParameter("machineId", theId);
        theQuery.executeUpdate();

    }

    // TO BE IMPLEMENTED
    @Override
    public List<Machine> listAvailable() {
        return null;
    }
}