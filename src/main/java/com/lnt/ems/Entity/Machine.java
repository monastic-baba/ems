package com.lnt.ems.Entity;

public class Machine {

    private Integer machineId;
    private String machineName;

    public Machine() {
    }

    public Machine(Integer machineId, String machineName) {
        this.machineId = machineId;
        this.machineName = machineName;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }
}
