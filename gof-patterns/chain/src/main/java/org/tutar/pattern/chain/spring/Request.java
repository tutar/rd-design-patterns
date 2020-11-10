package org.tutar.pattern.chain.spring;

/**
 * 请求对象
 * @author tutar
 */
public class Request {
    private String name;
    private Boolean skpSign=false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSkpSign() {
        return skpSign;
    }

    public void setSkpSign(Boolean skpSign) {
        this.skpSign = skpSign;
    }
}
