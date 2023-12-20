package day04.AOP5_xml;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

import java.util.Arrays;

public class LogPrintAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("Around Service invoke() start ...................");

        //보조업무
        Log log = LogFactory.getLog(this.getClass());
        StopWatch sw = new StopWatch();
        sw.start();
        log.info("타이머 시작");


        ////주관심코드/////////////////////////////////////
        Object result = invocation.proceed();
        //////////////////////////////////////////////////


        //보조업무
        sw.stop();
        log.info("타이머 정지");

        log.info("[TimerLOG] Method : " + invocation.getMethod());
        System.out.println("[TimerLOg] args : " + Arrays.toString(invocation.getArguments()));
        log.info("[TimeLOG] process Time : " + sw.getTotalTimeMillis());
        return result;
    }

}
