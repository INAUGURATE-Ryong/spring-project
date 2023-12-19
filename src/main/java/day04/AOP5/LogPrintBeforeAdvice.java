package day04.AOP5;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogPrintBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Befor Advice Start");
        Log log = LogFactory.getLog(this.getClass());
        log.info("[Method Before Advice] : 보조 업무 구현, 주업무 시작 전...");
    }
}
