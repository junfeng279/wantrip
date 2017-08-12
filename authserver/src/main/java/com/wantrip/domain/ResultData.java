package com.wantrip.domain;

/**
 * Created by junfeng on 17-8-12.
 * restful返回结果类
 */
public class ResultData {
    private int code; //接口返回的数据
    private Object data; //错误代码
    private boolean ret; //请求是否成功/请求是否抛出异常
    private String forUser; //前端展示给用户看的信息
    private String forWorker; //给工作人员看的信息
    private String version; //版本号

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public String getForUser() {
        return forUser;
    }

    public void setForUser(String forUser) {
        this.forUser = forUser;
    }

    public String getForWorker() {
        return forWorker;
    }

    public void setForWorker(String forWorker) {
        this.forWorker = forWorker;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
