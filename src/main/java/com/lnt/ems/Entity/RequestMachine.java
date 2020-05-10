package com.lnt.ems.Entity;

public class RequestMachine {

    private String RequestId;
    private Machine machine;
    private Employee employee;

    public RequestMachine() {
    }

    public RequestMachine(String requestId, Machine machine, Employee employee) {
        RequestId = requestId;
        this.machine = machine;
        this.employee = employee;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
