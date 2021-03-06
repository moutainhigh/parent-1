package com.vankeytech.pmp.cms.entity;

import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "cms_parking_gate")
public class ParkingGate implements Serializable {
    /**
     * 停车场门闸机ID
     */
    @Id
    private Integer id;

    /**
     * 岗亭ID
     */
    @Column(name = "sentry_booth_id")
    private Integer sentryBoothId;

    /**
     * 停车场门闸机的方向（1表示进，0表示出）
     */
    private Integer direction;

    /**
     * 是否隐藏（1为隐藏，0为显示）
     */
    private Integer hide;

    /**
     * 获取停车场门闸机ID
     *
     * @return id - 停车场门闸机ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置停车场门闸机ID
     *
     * @param id 停车场门闸机ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取岗亭ID
     *
     * @return sentry_booth_id - 岗亭ID
     */
    public Integer getSentryBoothId() {
        return sentryBoothId;
    }

    /**
     * 设置岗亭ID
     *
     * @param sentryBoothId 岗亭ID
     */
    public void setSentryBoothId(Integer sentryBoothId) {
        this.sentryBoothId = sentryBoothId;
    }

    /**
     * 获取停车场门闸机的方向（1表示进，0表示出）
     *
     * @return direction - 停车场门闸机的方向（1表示进，0表示出）
     */
    public Integer getDirection() {
        return direction;
    }

    /**
     * 设置停车场门闸机的方向（1表示进，0表示出）
     *
     * @param direction 停车场门闸机的方向（1表示进，0表示出）
     */
    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    /**
     * 获取是否隐藏（1为隐藏，0为显示）
     *
     * @return hide - 是否隐藏（1为隐藏，0为显示）
     */
    public Integer getHide() {
        return hide;
    }

    /**
     * 设置是否隐藏（1为隐藏，0为显示）
     *
     * @param hide 是否隐藏（1为隐藏，0为显示）
     */
    public void setHide(Integer hide) {
        this.hide = hide;
    }

    @Override
    public String toString() {
        return "ParkingGate{" +
                "id=" + id +
                ", sentryBoothId=" + sentryBoothId +
                ", direction=" + direction +
                ", hide=" + hide +
                '}';
    }
}