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

    @GetMapping("/hello5")
    public int hello5()
    {
        return 3;
    }

    @GetMapping("/hello2")
    public int hello2()
    {
        return 2;
    }

    @GetMapping("/hello4")
    public int hello4()
    {
        return 2;
    }

    @GetMapping("/hello6")
    public String hello6()
    {
        return "5";
    }
}
