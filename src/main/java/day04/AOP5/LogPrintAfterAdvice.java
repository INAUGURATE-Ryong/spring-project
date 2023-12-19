package day04.AOP5;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogPrintAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("AfterReturningAdvice start ~~!");
        Log log = LogFactory.getLog(this.getClass());
        log.info("[주업무가 실행되고 돌아와서 바로 실행]");

        System.out.println("[AfterReturningAdvice Method] : " + method.getModifiers());
        System.out.println("[Return Value] : " + returnValue);
        System.out.println("[args Value] : " + Arrays.toString(args));
    }
}
