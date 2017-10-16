package me.zane.fairy_server;


import okio.Buffer;

/**
 * 响应实体封装
 * Created by Zane on 2017/10/16.
 * Email: zanebot96@gmail.com
 */

public class Response {
    private String scheme;
    private int code;
    private String message;
    private Headers headers;
    private Buffer body;
    private String timeLine; //当前response返回的最新数据的时间戳

    public Response(String scheme, int code, String message, Headers headers, Buffer body, String timeLine) {
        this.scheme = scheme;
        this.code = code;
        this.message = message;
        this.headers = headers;
        this.body = body;
        this.timeLine = timeLine;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String shcheme) {
        this.scheme = shcheme;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Headers getHeaders() {
        return headers;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public Buffer getBody() {
        return body;
    }

    public void setBody(Buffer body) {
        this.body = body;
    }

    public String getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(String timeLine) {
        this.timeLine = timeLine;
    }

    //------------------------------------------------------------


    @Override
    public String toString() {
        return "scheme: " + scheme
                + " code: " + code
                + " message: " + message
                + " headers: " + headers.toString()
                + " timeline: " + timeLine;
    }
}
