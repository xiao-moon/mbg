//package com.moon.interceptor;
//
//import com.fasterxml.jackson.databind.json.JsonMapper;
//import com.moon.model.SimpleResponse;
//import com.moon.model.enums.ResponseEnum;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * 描述:针对非500异常进行拦截
// * 创建人: 小月
// * 创建时间: 2020-06-25 23:10
// */
//@Deprecated
//public class ErrorInterceptor implements HandlerInterceptor {
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        switch (response.getStatus()) {
//            case 302:
//                SimpleResponse simpleResponse = new SimpleResponse(ResponseEnum.FOUND.code, ResponseEnum.FOUND.msg, ResponseEnum.FOUND.desc);
//                JsonMapper jsonMapper = new JsonMapper();
//                String json = jsonMapper.writeValueAsString(simpleResponse);
//                response.getWriter().write(json);
//                return;
//            case 400:
//                SimpleResponse simpleResponse1 = new SimpleResponse(ResponseEnum.BAD_REQUEST.code, ResponseEnum.BAD_REQUEST.msg, ResponseEnum.BAD_REQUEST.desc);
//                JsonMapper jsonMapper1 = new JsonMapper();
//                String json1 = jsonMapper1.writeValueAsString(simpleResponse1);
//                response.getWriter().write(json1);
//                return;
//            case 401:
//                SimpleResponse simpleResponse2 = new SimpleResponse(ResponseEnum.UNAUTHORIZED.code, ResponseEnum.UNAUTHORIZED.msg, ResponseEnum.UNAUTHORIZED.desc);
//                JsonMapper jsonMapper2 = new JsonMapper();
//                String json2 = jsonMapper2.writeValueAsString(simpleResponse2);
//                response.getWriter().write(json2);
//                return;
//            case 403:
//                SimpleResponse simpleResponse3 = new SimpleResponse(ResponseEnum.FORBIDDEN.code, ResponseEnum.FORBIDDEN.msg, ResponseEnum.FORBIDDEN.desc);
//                JsonMapper jsonMapper3 = new JsonMapper();
//                String json3 = jsonMapper3.writeValueAsString(simpleResponse3);
//                response.getWriter().write(json3);
//                return;
//            case 404:
//                SimpleResponse simpleResponse4 = new SimpleResponse(ResponseEnum.NOT_FOUND.code, ResponseEnum.NOT_FOUND.msg, ResponseEnum.NOT_FOUND.desc);
//                JsonMapper jsonMapper4 = new JsonMapper();
//                String json4 = jsonMapper4.writeValueAsString(simpleResponse4);
//                response.getWriter().write(json4);
//                return;
//            default:
//                SimpleResponse simpleResponse5 = new SimpleResponse(ResponseEnum.OTHER.code, ResponseEnum.OTHER.msg, ResponseEnum.OTHER.desc);
//                JsonMapper jsonMapper5 = new JsonMapper();
//                String json5 = jsonMapper5.writeValueAsString(simpleResponse5);
//                response.getWriter().write(json5);
//                return;
//        }
//    }
//
//}
