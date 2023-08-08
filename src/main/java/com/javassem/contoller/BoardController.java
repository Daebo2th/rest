package com.javassem.contoller;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/")
    public String main(Model moddel){

        moddel.addAttribute("serverTime",new Date());

        return "board/home";
    }


    @GetMapping("/board/getBoardList.do")
    public String boardListUI(Model moddel){


        Map<String, String> map = new HashMap<>();
        map.put("searchCondition", null);
        map.put("searchKeyword", null);
        moddel.addAttribute("boardList", boardService.getBoardList2(map));

        return "board/getBoardList";
    }
    @GetMapping("/board/insertBoard.do")
    public String insertBoard(Model moddel){


        return "board/insertBoard";
    }
}
