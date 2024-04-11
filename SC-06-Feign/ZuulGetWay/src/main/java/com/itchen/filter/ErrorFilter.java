package com.itchen.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName ErrorFilter
 * @Description: TODO
 * @Author: 3412442620@qq.com
 **/
@Component
public class ErrorFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletResponse response = context.getResponse();
        ZuulException throwable = (ZuulException) context.getThrowable();
        response.setHeader("content-type","text/html;charset=utf-8");
        System.out.println(throwable.getMessage());
        System.out.println(throwable.getCause().getMessage());
        response.setStatus(throwable.nStatusCode);
        try {
            PrintWriter out = response.getWriter();
            out.print("完啦！~芭比Q啦！~出异常啦！~");
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
