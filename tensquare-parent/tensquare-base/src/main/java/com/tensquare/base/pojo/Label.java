package com.tensquare.base.pojo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 标签实体类
 */
@EntityScan
@Entity
@Table(name = "tb_label")
public class Label {
    @Id
    private String id;
    private String labelname; //标签名
    private String state;//状态
    private Long count;//关注数量
    private String recommend;//是否推荐
    private Long fans;//粉丝数

    public String getId() {
        return id;
    }

    public String getLabelname() {
        return labelname;
    }

    public String getState() {
        return state;
    }

    public Long getCount() {
        return count;
    }

    public String getRecommend() {
        return recommend;
    }

    public Long getFans() {
        return fans;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLabelname(String labelname) {
        this.labelname = labelname;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public void setFans(Long fans) {
        this.fans = fans;
    }
}
