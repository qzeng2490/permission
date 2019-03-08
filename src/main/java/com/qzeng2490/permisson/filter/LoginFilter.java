package com.qzeng2490.permisson.filter;


import com.qzeng2490.permisson.common.RequestHolder;
import com.qzeng2490.permisson.model.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@WebFilter(urlPatterns = {"/admin/*","/sys/*"})
public class LoginFilter implements Filter {

  private static final Set<String> NOT_ALLOWED_PATHS = Collections.unmodifiableSet(new HashSet<>(
          Arrays.asList("/sys/*", "/admin/*")));


    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

//      String path = req.getRequestURI().substring(req.getContextPath().length()).replaceAll("[/]+$", "");
//      boolean notAllowedPath = NOT_ALLOWED_PATHS.contains(path);
//      if (notAllowedPath) {
        SysUser sysUser = (SysUser)req.getSession().getAttribute("user");
        if (sysUser == null) {
          String desPath = "/signin.jsp";
          resp.sendRedirect(desPath);
          return;
        }
        RequestHolder.add(sysUser);
        RequestHolder.add(req);
        filterChain.doFilter(servletRequest, servletResponse);
        return;
//      }else {
//        filterChain.doFilter(servletRequest, servletResponse);
//      }
    }

    public void destroy() {

    }
}
