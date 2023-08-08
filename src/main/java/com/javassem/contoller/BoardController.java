package com.javassem.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class BoardController {

    @GetMapping("/")
    public String main(Model moddel){

        moddel.addAttribute("serverTime",new Date());

        return "board/home";
    }


    @GetMapping("/board/getBoardList.do")
    public String boardListUI(Model moddel){


        return "board/getBoardList";
    }
    @GetMapping("/board/insertBoard.do")
    public String insertBoard(Model moddel){


        return "board/insertBoard";
    }
}
