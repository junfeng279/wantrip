package com.manager.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by junfeng on 17-8-27.
 */
@Document(collection = "article")
public class Article {
    private String name; //标题
    private int[] types; //分类
    private String content; //内容
    private int[] tags; //标签
    private Date createDate; //创建时间
    private Date updateDate; //更新时间
    private int secrecy; //保密

    public int[] getTags() {
        return tags;
    }

    public void setTags(int[] tags) {
        this.tags = tags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getTypes() {
        return types;
    }

    public void setTypes(int[] types) {
        this.types = types;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getSecrecy() {
        return secrecy;
    }

    public void setSecrecy(int secrecy) {
        this.secrecy = secrecy;
    }
}
