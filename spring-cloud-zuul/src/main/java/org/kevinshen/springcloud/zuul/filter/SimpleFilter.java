package org.kevinshen.springcloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class SimpleFilter extends ZuulFilter {

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

        Object accessToken = request.getParameter("accessToken");

        if (accessToken == null) {
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            return null;
        }
        return null;
    }
}
