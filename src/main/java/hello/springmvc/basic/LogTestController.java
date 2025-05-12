package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        // 이렇게 사용하면 출력되지 않는 로그 출력 레벨이어도 "name="+name이 실제 실행이 되어버린다. 결과적으로 연산이 발생함.
        log.trace("name="+ name);

        // 아래와 같이 사용하면 로그레벨이 아니면 연산자체가 이루어 지지 않는다.
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
