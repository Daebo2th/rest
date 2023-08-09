package com.javassem.contoller;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String boardListUI(Model moddel,String searchCondition, String searchKeyword){


        Map<String, String> map = new HashMap<>();
        map.put("searchCondition", searchCondition);
        map.put("searchKeyword", searchKeyword);
        moddel.addAttribute("boardList", boardService.getBoardList2(map));

        return "board/getBoardList";
    }

    @GetMapping("/board/getBoard.do")
    public String boardDetail(Model model,BoardVO vo){

        model.addAttribute("board", boardService.getBoard(vo));

        return "board/getBoard";
    }

    @GetMapping("/board/insertBoard.do")
    public String boardFrom(Model moddel){


        return "board/insertBoard";
    }

    @PostMapping("/board/saveBoard.do")
    public String insertBoard(BoardVO vo) {

        boardService.insertBoard(vo);

        return "redirect:/board/getBoardList.do";
    }


}
