package com.smartx.basic.web.admin.module.screen.manage;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

public class Login {
    @Autowired
    private HttpServletResponse response;
    public void execute() throws Exception {
        // 设置content type，但不需要设置charset。框架会设置正确的charset。
        response.setContentType("text/plain");

        // 如同servlet一样：取得输出流。
        PrintWriter out = response.getWriter();

        out.println("[{\"id\":\"base\",\"text\":\"龙湾发布气象LED大屏\",\"pid\":\"\"}]");
       
    }
}
