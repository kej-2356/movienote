package kej.spring.movienote.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/members")
public class MemberController {

    @GetMapping("/login")
    public String login() {
        return "members/member-login";
    }

    @GetMapping("/add")
    public String addForm() {
        return "members/member-join";
    }

    @GetMapping("/find")
    public String findForm() {
        return "members/member-help";
    }

    @GetMapping("/my")
    public String MyInfo() {
        return "members/member-my";
    }

    @GetMapping("/my-1")
    public String MyInfo1() {
        return "members/member-my-1";
    }
}
