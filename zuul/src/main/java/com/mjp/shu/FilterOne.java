package com.mjp.shu;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author mjp
 * @date 2020/4/27 - 2:07
 */
@Component
public class FilterOne extends ZuulFilter {
    @Override
    public String filterType() {
        //pre路由之前
        //routing：路由之时
        // post： 路由之后
        // error：发送错误调用

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
        //获取request与response 接口对象
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String securityToken = request.getParameter("token");
        if (securityToken == null){
            //状态码
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("request failure , you do not have security token ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
