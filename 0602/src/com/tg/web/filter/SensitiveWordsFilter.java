package com.tg.web.filter;

import org.springframework.util.ObjectUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author tanggang
 * @Description //TODO 敏感词汇过滤器
 * @Date 2020/6/6
 */
@WebFilter("/*")
public class SensitiveWordsFilter implements Filter {
    //敏感词汇集合
    private List<String> list = new ArrayList<>();
    @Override
    public void init(FilterConfig config) throws ServletException {
        try {
            ServletContext servletContext = config.getServletContext();
            String realPath = servletContext.getRealPath("/WEB-INF/classes/敏感词汇.txt");
            BufferedReader br = new BufferedReader(new FileReader(realPath));
            String line = null;
            while((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        ServletRequest request = (ServletRequest)Proxy
                .newProxyInstance(req.getClass().getClassLoader(),
                req.getClass().getInterfaces(), (proxy, method, args) -> {
                            if ("getParameter".equals(method.getName())) {
                                String value = (String) method.invoke(req, args);
                                if(!ObjectUtils.isEmpty(list)) {
                                    for (String str : list) {
                                        if(value.contains(str)) {
                                            value = value.replaceAll(str, "xxx");
                                        }
                                    }
                                }
                                return value;
                            }
                            return method.invoke(req, args);
                });
        chain.doFilter(request, resp);
    }

    @Override
    public void destroy() {
    }

}
