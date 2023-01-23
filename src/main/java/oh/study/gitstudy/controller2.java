package oh.study.gitstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller2 {
    @GetMapping("/hello")
    public int hello()
    {
        return 1;
    }
}
