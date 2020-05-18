package com.xuecheng.manage_course.exception;

import com.xuecheng.framework.exception.ExceptionCatch;
import com.xuecheng.framework.model.response.CommonCode;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class CustomExceptionCatch extends ExceptionCatch {

    static {
        builder.put(org.springframework.security.access.AccessDeniedException.class, CommonCode.UNAUTHORISE);
    }
}
