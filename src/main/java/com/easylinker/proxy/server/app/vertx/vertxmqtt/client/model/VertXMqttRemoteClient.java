package com.easylinker.proxy.server.app.vertx.vertxmqtt.client.model;

import com.easylinker.proxy.server.app.config.securityconfig.user.model.BaseEntity;

import java.util.Arrays;

/**
 * 持久户化的设备客户端
 * 这个类用来关联状态
 */

public class VertXMqttRemoteClient extends BaseEntity {

    //MQTT 协议本身支持的鉴权：username password
    //本设计为了实现统计在线效果，扩展了一个是否在线标记
    //同时增加了ACL属性
    private String username;
    private String password;
    private String clientId;
    private String topics[];
    private Boolean onLine = false;
    //下面是一些业务逻辑级别的扩展字段
    private String name;
    private String info;
    private String location[];


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public Boolean getOnLine() {
        return onLine;
    }

    public void setOnLine(Boolean onLine) {
        this.onLine = onLine;
    }

    public String[] getTopics() {
        return topics;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return this.getId() + "|" +
                this.getClientId() + "|"
                + this.getUsername() + "|"
                + this.getPassword() + "|"
                + Arrays.deepToString(this.getTopics())

                + "|";
    }
}
