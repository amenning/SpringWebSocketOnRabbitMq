package com.amenning.web;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Scope(value ="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionComponent implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer pageViews;

    public void setPageViews(Integer pageViews) {
        this.pageViews = pageViews;
    }

    public Integer getPageViews() {
        return pageViews;
    }
}
