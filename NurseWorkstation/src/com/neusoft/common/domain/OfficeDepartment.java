package com.neusoft.common.domain;

import java.util.HashSet;
import java.util.Set;


/**
 * ���Ҳ��ű��Ӧʵ����
 * @author Ghost
 */

public class OfficeDepartment  implements java.io.Serializable {

     private String officId;
     private String officName;
     private String deptName;
     private Set nurseBeds = new HashSet(0);

    public OfficeDepartment() {
    }

    public OfficeDepartment(String officName, String deptName, Set nurseBeds) {
        this.officName = officName;
        this.deptName = deptName;
        this.nurseBeds = nurseBeds;
    }

    public String getOfficId() {
        return this.officId;
    }
    
    /**
     * @param officId IDǰ��λ������ұ�ţ�����λ�����������š��磺ǰ��λ��00��� 01�ڿ� 02���ƣ�����λ��00�����ﲿ 01�����ﲿ 02��סԺ���� ��ô��0000��������ﲿ 0201�����Ƽ��ﲿ  �Դ�����.
     */
    public void setOfficId(String officId) {
        this.officId = officId;
    }

    public String getOfficName() {
        return this.officName;
    }
    
    public void setOfficName(String officName) {
        this.officName = officName;
    }

    public String getDeptName() {
        return this.deptName;
    }
    
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Set getNurseBeds() {
        return this.nurseBeds;
    }
    
    public void setNurseBeds(Set nurseBeds) {
        this.nurseBeds = nurseBeds;
    }
}