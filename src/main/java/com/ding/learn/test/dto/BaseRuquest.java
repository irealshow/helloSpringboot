package com.ding.learn.test.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
public class BaseRuquest implements Serializable {

    //加密请求字段
    private String encryptText;



    private static final long serialVersionUID = 8976588576075723075L;
    @JsonIgnore
    private String _url;
    @JsonIgnore
    private String requestId;
    @JsonIgnore
    private String _version;
    @JsonIgnore
    private Map<String, String> _headers = new HashMap();

    @JsonIgnore
    public String getUrl() {
        return this._url;
    }

    @JsonIgnore
    public void setUrl(String url) {
        this._url = url;
    }

    @JsonIgnore
    public String getVersion() {
        if (this._version != null && !this._version.equals("")) {
            String regEx = "v?(([A-Z]*)[0-9]+([.]{1}[0-9]+){0,1}$)";
            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(this._version);
            boolean rs = matcher.matches();
            return rs ? matcher.group(1) : "1.0";
        } else {
            return "1.0";
        }
    }

    @JsonIgnore
    public void setVersion(String version) {
        this._version = version;
    }


    @JsonIgnore
    public Map<String, String> getHeaders() {
        return this._headers;
    }

    @JsonIgnore
    public void setHeaders(Map<String, String> headers) {
        this._headers = headers;
    }

    @JsonIgnore
    public BaseRuquest() {
        this._headers = new HashMap();
    }

    @JsonIgnore
    public Map<String, Object> getParamData() {
        Map<String, Object> mp = new TreeMap();
        Field[] var2 = this.getClass().getDeclaredFields();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Field field = var2[var4];
            field.setAccessible(true);

            try {
                mp.put(field.getName(), field.get(this));
            } catch (Exception var7) {
            }
        }

        mp.remove("serialVersionUID");
        return mp;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }



}
