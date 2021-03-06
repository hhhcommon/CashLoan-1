package com.dumai.loan.http.okhttp;

/**
 * @author haoruigang
 * @Package com.haoruigang.okhttpdome
 * @project OkHttpDome
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2017/11/26 15:50
 */
public class Config {

    public static class API {

        // 1.服务器IP
//        public static final String WAPI_IP = "192.168.0.10";
        // 1.1 本地Tomcat
        public static final String WAPI_IP = "192.168.0.134";
        public static final String WAPI_HTTP_BASE = "http://" + WAPI_IP;
        // 2.服务器端口
//        public static final String WAPI_HTTP_PORT = "8082";
        // 2.1 本地端口
        public static final String WAPI_HTTP_PORT = "8080";
        public static final String WAPI_HTTP_URL = WAPI_HTTP_BASE + ":"
                + WAPI_HTTP_PORT + "/riskmm";
        // 3.项目名称
        public static String PROJECTNAME = "apps";
        // 4.基本请求地址
        public static final String WAPI_URL_S = WAPI_HTTP_URL + "/" + PROJECTNAME
                + "/";

        // 登录地址 http://192.168.0.10:8082/riskmm/app/logins.do
        public static final String LOGIN_URL = WAPI_URL_S
                + "logins.do";
        // 注册地址 http://192.168.0.133:8082/riskmm/app/registers.do
        public static final String REGISTER_URL = WAPI_URL_S
                + "registers.do";
        // 忘记密码地址 http://192.168.0.133:8082/riskmm/app/forgetpsds.do
        public static final String FORGETPSD_URL = WAPI_URL_S
                + "forgetpsds.do";
        // 身份信息地址 http://192.168.0.133:8082/riskmm/app/identitys.do
        public static final String IDENTITY_URL = WAPI_URL_S
                + "identitys.do";
        // 工作信息地址 http://192.168.0.133:8082/riskmm/app/works.do
        public static final String JOB_URL = WAPI_URL_S
                + "works.do";

    }
}
