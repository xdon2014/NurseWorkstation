package com.neusoft.common.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ghost
 * ��λ�ȼ��� ʵ����
 */
public class HospitalBedlevel  implements java.io.Serializable {

     private Short levelId;
     private Double levelPrice;
     
    public HospitalBedlevel() {
    	Double levelPrice;
    }

    /**
     * @param levelPrice MaxValue = 999.999
     */
    public HospitalBedlevel(Double levelPrice) {
        this.levelPrice = levelPrice;
    }

    public Short getLevelId() {
        return this.levelId;
    }
    
    /**
     * @param levelId [length = 2] �������Զ�����
     */
    public void setLevelId(Short levelId) {
        this.levelId = levelId;
    }

    public Double getLevelPrice() {
        return this.levelPrice;
    }
    
    /**
     * @param levelPrice MaxValue = 999.99
     */
    public void setLevelPrice(Double levelPrice) {
        this.levelPrice = levelPrice;
    }
}