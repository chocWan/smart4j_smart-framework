package org.smart4j.framework.bean;

public class Request {
    private String requestMethod;
    private String requestPaht;

    public Request(String requestMethod, String requestPaht) {
        this.requestMethod = requestMethod;
        this.requestPaht = requestPaht;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Request request = (Request) o;

        if (requestMethod != null ? !requestMethod.equals(request.requestMethod) : request.requestMethod != null)
            return false;
        return requestPaht != null ? requestPaht.equals(request.requestPaht) : request.requestPaht == null;
    }

    @Override
    public int hashCode() {
        int result = requestMethod != null ? requestMethod.hashCode() : 0;
        result = 31 * result + (requestPaht != null ? requestPaht.hashCode() : 0);
        return result;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getRequestPaht() {
        return requestPaht;
    }

    public void setRequestPaht(String requestPaht) {
        this.requestPaht = requestPaht;
    }
}