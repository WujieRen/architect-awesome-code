package com.architectawesome.cornerstone.parsexml.DynamicNodeDemo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by renwujie on 2018/07/10 at 16:43
 */
@XmlRootElement
public class Response {
    private String errorCode;
    private String errorMessage;
    private ResultData data;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ResultData getData() {
        return data;
    }

    public void setData(ResultData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                '}';
    }
}
