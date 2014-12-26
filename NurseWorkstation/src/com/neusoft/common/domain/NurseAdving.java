package com.neusoft.common.domain;

import java.util.Date;

public class NurseAdving  implements java.io.Serializable {

     private String advingId;
     private NursePat nursePat;
     private NurseWork nurseWork;
     private NurseAdv nurseAdv;
     private Date advingDate;
     private String advingSign;

    public NurseAdving() {
    }

    public NurseAdving(NursePat nursePat, NurseWork nurseWork, NurseAdv nurseAdv) {
        this.nursePat = nursePat;
        this.nurseWork = nurseWork;
        this.nurseAdv = nurseAdv;
    }

    /**
     * @param advingSign ҽ���ı�־λ��0�����Ѿ�ִ�е�ҽ����1����δִ�е�ҽ����Ĭ��1��ʾδִ�С�
     */
    public NurseAdving(NursePat nursePat, NurseWork nurseWork, NurseAdv nurseAdv, Date advingDate, String advingSign) {
        this.nursePat = nursePat;
        this.nurseWork = nurseWork;
        this.nurseAdv = nurseAdv;
        this.advingDate = advingDate;
        this.advingSign = advingSign;
    }

    public String getAdvingId() {
        return this.advingId;
    }
    
    /**
     * @param advingId ҽ��ִ�����ID�ò���ID+ִ�����ڣ���ȷ���룩��ƴ�ַ�����ƴ��ҽ��ִ�����ID��ȷ��ÿ��ID�����Զ����������ظ�.�粡��ID��00002���´�������2014/01/07/10:49:5123mm,��ҽ��IDϵͳ�Զ�����Ϊ000220140101104951
     */
    public void setAdvingId(String advingId) {
        this.advingId = advingId;
    }

    public NursePat getNursePat() {
        return this.nursePat;
    }
    
    public void setNursePat(NursePat nursePat) {
        this.nursePat = nursePat;
    }

    public NurseWork getNurseWork() {
        return this.nurseWork;
    }
    
    public void setNurseWork(NurseWork nurseWork) {
        this.nurseWork = nurseWork;
    }

    public NurseAdv getNurseAdv() {
        return this.nurseAdv;
    }
    
    public void setNurseAdv(NurseAdv nurseAdv) {
        this.nurseAdv = nurseAdv;
    }

    public Date getAdvingDate() {
        return this.advingDate;
    }
    
    public void setAdvingDate(Date advingDate) {
        this.advingDate = advingDate;
    }

    public String getAdvingSign() {
        return this.advingSign;
    }
    
    public void setAdvingSign(String advingSign) {
        this.advingSign = advingSign;
    }
}