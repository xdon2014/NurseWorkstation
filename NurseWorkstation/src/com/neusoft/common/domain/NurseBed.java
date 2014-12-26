package com.neusoft.common.domain;

import java.util.HashSet;
import java.util.Set;


/**
 * ��λ��Ϣ���Ӧʵ����
 * @author Ghost
 * 
 * 
 */

public class NurseBed  implements java.io.Serializable {

     private String bedId;
     private OfficeDepartment officeDepartment;
     private HospitalBedlevel hospitalBedlevel;
     private NurseRoom nurseRoom;
     private Byte bedState;

    public NurseBed() {
    }

    public NurseBed(OfficeDepartment officeDepartment) {
        this.officeDepartment = officeDepartment;
    }

    /**
     * @param bedState ����״̬��0Ϊ���У�1Ϊռ�ã�Ĭ��Ϊ0
     */
    public NurseBed(OfficeDepartment officeDepartment, HospitalBedlevel hospitalBedlevel, NurseRoom nurseRoom, Byte bedState) {
        this.officeDepartment = officeDepartment;
        this.hospitalBedlevel = hospitalBedlevel;
        this.nurseRoom = nurseRoom;
        this.bedState = bedState;
    }

    public String getBedId() {
        return this.bedId;
    }
    
    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    public OfficeDepartment getOfficeDepartment() {
        return this.officeDepartment;
    }
    
    public void setOfficeDepartment(OfficeDepartment officeDepartment) {
        this.officeDepartment = officeDepartment;
    }

    public HospitalBedlevel getHospitalBedlevel() {
        return this.hospitalBedlevel;
    }
    
    public void setHospitalBedlevel(HospitalBedlevel hospitalBedlevel) {
        this.hospitalBedlevel = hospitalBedlevel;
    }

    public NurseRoom getNurseRoom() {
        return this.nurseRoom;
    }
    
    public void setNurseRoom(NurseRoom nurseRoom) {
        this.nurseRoom = nurseRoom;
    }

    public Byte getBedState() {
        return this.bedState;
    }
    
    /**
     * @param bedState ����״̬��0Ϊ���У�1Ϊռ�ã�Ĭ��Ϊ0
     */
    public void setBedState(Byte bedState) {
        this.bedState = bedState;
    }
}