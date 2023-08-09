package com.javassem.contoller;

import com.javassem.dao.ReplyDAO;
import com.javassem.domain.ReplyVO;
import com.javassem.service.ReplyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ReplyController {

    @Autowired
    private ReplyServiceImpl replyService;

    @GetMapping("/replies")
    public List<ReplyVO> getReplies(Integer bno) {
        System.out.println(bno);
        return replyService.selectAllReply(bno);
    }

    @PostMapping("/replies/new")
    public String insertReply(ReplyVO vo) {
        String msg = "";
        if (replyService.insertReply(vo) > 0) {
            msg = "성공";
        } else {
            msg = "실패";
        }
        return msg;
    }
}
