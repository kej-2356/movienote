package kej.spring.movienote.movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
//url 주소가 /movies/*** 으로
//@RequestMapping("/movies")
public class MovieController {

    @GetMapping("/detail")
    public String movieDetail() {
        return "movies/movie-detail";
    }

    // @GetMapping("/{memberId}") 해당회원의 리스트만 나오게
    @GetMapping("/movies")
    public String memberMovie() {
        return "movies/member-movies";
    }
}
