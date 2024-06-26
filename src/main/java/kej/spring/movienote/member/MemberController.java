package kej.spring.movienote.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/login")
    public String login() {
        return "member/member-login";
    }

    @GetMapping("/add")
    public String addForm() {
        return "member/member-join";
    }

    @GetMapping("/find")
    public String findForm() {
        return "member/member-help";
    }

    @GetMapping("/my")
    public String MyInfo() {
        return "member/member-my";
    }

    @GetMapping("/my-1")
    public String MyInfo1() {
        return "member/member-my-1";
    }
}
