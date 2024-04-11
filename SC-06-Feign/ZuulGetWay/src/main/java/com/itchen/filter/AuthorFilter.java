package com.itchen.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName AuthorFilter
 * @Description: TODO
 * @Author: 3412442620@qq.com
 **/
@Component
public class AuthorFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        int num = 1/0;
        if (null == token || !"9527".equals(token)){
            context.setSendZuulResponse(false);
            context.addZuulRequestHeader("content-type","text/html;charset=utf-8");
            context.setResponseStatusCode(403);
            context.setResponseBody("权限不足");
            
        }else {
            System.out.println("Hello xiaosi");
        }
        return null;
    }
}
