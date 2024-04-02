package kr.co.farmstory.controller;

import kr.co.farmstory.dto.ArticleDTO;
import kr.co.farmstory.service.ArticleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class MainController {

    private final ArticleService articleService;

    @GetMapping(value = {"/","/index"})
    public String index(Model model){

        List<ArticleDTO> grow = articleService.getRecentArticles("grow");
        List<ArticleDTO> school = articleService.getRecentArticles("school");
        List<ArticleDTO> story = articleService.getRecentArticles("story");

        //log.info(grow.toString());
        model.addAttribute("grow", grow);
        model.addAttribute("school", school);
        model.addAttribute("story", story);

        return "index";

    }

    @GetMapping("/test")
    public String test(){
        return "/test";
    }

}
