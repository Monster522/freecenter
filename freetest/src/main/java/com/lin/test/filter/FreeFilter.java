package com.lin.test.filter;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by baozang Cotter on 2018/11/1.
 */
@Component
//@WebFilter(urlPatterns = "/free/message",filterName = "FreeFilter")
public class FreeFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("---------init-----------");
        System.out.println(filterConfig.getFilterName());
        System.out.println(filterConfig.getInitParameter("YoungMan"));
        System.out.println(filterConfig.getInitParameterNames());
        System.out.println(filterConfig.getServletContext());

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println("---------doFilter-----------");
        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
        System.out.println("hello : "+ httpServletRequest.getRequestURI());
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {
        System.out.println("---------destroy-----------");

    }
}
