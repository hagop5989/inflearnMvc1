package hello.servlet.web.frontcontroller.v4;

import java.util.Map;
import java.util.Objects;

public interface ControllerV4 {
    /**
     * /**엔터 치면나옴
     * @param paramMap
     * @param model
     * @return viewname
     */
    String process(Map<String,String> paramMap, Map<String, Object> model);
}
