package org.bbs.android.parse.pm25;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by bysong on 16-1-26.
 *
 * PLANTOWER G5
 */
@ParseClassName("PMS50003")
public class PMS50003 extends ParseObject {
    /** pm 1.0 CF = 1 ug/m^3*/
    private Integer pm1_0_CF1;
    /** pm 2.5 CF = 1 ug/m^3*/
    private Integer pm2_5_CF1;
    /** pm 10 CF = 1 ug/m^3*/
    private Integer pm10_CF1;

    /** pm 1.0 china ug/m^3*/
    private Integer pm1_0;
    /** pm 2.5 china ug/m^3*/
    private Integer pm2_5;
    /** pm 10  china ug/m^3*/
    private Integer pm10;

    /** .3um in 0.1l */
    private Integer value_0_3;
    /** .5um in 0.1l */
    private Integer value_0_5;
    /** 1um in 0.1l */
    private Integer value_1;
    /** 2.5um in 0.1l */
    private Integer value_2_5;
    /** 5um in 0.1l */
    private Integer value_5;
    /** 10um in 0.1l */
    private Integer value_10;

    private Long recordedTime;

    private Integer reserve1;
    private Integer reserve2;
    private Integer reserve3;
    private Integer reserve4;
    private Integer reserve5;
    private Integer reserve6;

    public PMS50003(){};

    public Integer getPm1_0_CF1() {
        return pm1_0_CF1;
    }


    public void setPm1_0_CF1(Integer pm1_0_CF1) {
        put("pm1_0_CF1", pm1_0_CF1);
    }

    public Integer getPm2_5_CF1() {
        return getInt("pm1_0_CF1");
    }

    public void setPm2_5_CF1(Integer pm2_5_CF1) {
        put("pm2_5_CF1", pm2_5_CF1);
    }

    public Integer getPm10_CF1() {
        return getInt("pm10_CF1");
    }

    public void setPm10_CF1(Integer pm10_CF1) {
        put("pm10_CF1", pm10_CF1);
    }

    public Integer getPm1_0() {
        return getInt("pm1_0");
    }

    public void setPm1_0(Integer pm1_0) {
        put("pm1_0", pm1_0);
    }

    public Integer getPm2_5() {
        return getInt("pm2_5");
    }

    public void setPm2_5(Integer pm2_5) {
        put("pm2_5", pm2_5);
    }

    public Integer getPm10() {
        return getInt("pm10");
    }

    public void setPm10(Integer pm10) {
        put("pm10", pm10);
    }

    public Integer getValue_0_3() {
        return getInt("value_0_3");
    }

    public void setValue_0_3(Integer value_0_3) {
        put("value_0_3", value_0_3);
    }

    public Integer getValue_0_5() {
        return getInt("value_0_5");
    }

    public void setValue_0_5(Integer value_0_5) {
        put("value_0_5", value_0_5);
    }

    public Integer getValue_1() {
        return getInt("value_1");
    }

    public void setValue_1(Integer value_1) {
        this.value_1 = value_1;
    }

    public Integer getValue_2_5() {
        return getInt("value_2_5");
    }

    public void setValue_2_5(Integer value_2_5) {
        put("value_2_5", value_2_5);
    }

    public Integer getValue_5() {
        return getInt("value_5");
    }

    public void setValue_5(Integer value_5) {
        put("value_5", value_5);
    }

    public Integer getValue_10() {
        return getInt("value_10");
    }

    public void setValue_10(Integer value_10) {
        put("value_10", value_10);
    }

    public Long getRecordedTime() {
        return getLong("recordedTime");
    }

    public void setRecordedTime(Long recordedTime) {
        put("recordedTime", recordedTime);
    }

    public Integer getReserve1() {
        return reserve1;
    }

    public void setReserve1(Integer reserve1) {
        this.reserve1 = reserve1;
    }

    public Integer getReserve2() {
        return reserve2;
    }

    public void setReserve2(Integer reserve2) {
        this.reserve2 = reserve2;
    }

    public Integer getReserve3() {
        return reserve3;
    }

    public void setReserve3(Integer reserve3) {
        this.reserve3 = reserve3;
    }

    public Integer getReserve4() {
        return reserve4;
    }

    public void setReserve4(Integer reserve4) {
        this.reserve4 = reserve4;
    }

    public Integer getReserve5() {
        return reserve5;
    }

    public void setReserve5(Integer reserve5) {
        this.reserve5 = reserve5;
    }

    public Integer getReserve6() {
        return reserve6;
    }

    public void setReserve6(Integer reserve6) {
        this.reserve6 = reserve6;
    }
}
