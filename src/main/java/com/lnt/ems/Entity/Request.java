package com.lnt.ems.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="request")
public class Request {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private String id;

    @Column(name="machine_id")
    private String machineId;

    @Column(name="engineer_id")
    private String engineerId;

    @Column(name="status")
    private String status;
    // maybe one of {approved, rejected ,requested)

    @Column(name="urgency")
    private String urgency;
    // maybe one of {low, medium, high}

    private Date startDate;
    private Date endDate;

    public Request() {
    }

    public Request(String id, String machineId, String engineerId, String status, String urgency, Date startDate, Date endDate) {
        this.id = id;
        this.machineId = machineId;
        this.engineerId = engineerId;
        this.status = status;
        this.urgency = urgency;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(String engineerId) {
        this.engineerId = engineerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id='" + id + '\'' +
                ", machineId='" + machineId + '\'' +
                ", engineerId='" + engineerId + '\'' +
                ", status='" + status + '\'' +
                ", urgency='" + urgency + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
