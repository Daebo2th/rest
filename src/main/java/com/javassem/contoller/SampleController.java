package com.javassem.contoller;

import com.javassem.domain.SampleVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {

    @GetMapping(value = "/getText",produces = "text/plain;charset=UTF-8")
    public String getTest(){
        return "컨트롤러에서 보냈어요";
    }

    // 2. 객체 반환
    @GetMapping(value = "/getObject")
    public SampleVO getObject(Model model) {
        SampleVO vo = new SampleVO("김연아", 33, "우리는 지금 레스트 테스트 중");
        model.addAttribute("vo", vo);
        return vo;
    }

    // 3. 리스트 객체 반환
    @GetMapping(value = "/getList")
    public List<SampleVO> getList() {
        List list = new ArrayList();
        list.add(new SampleVO("김연아", 33, "우리는 지금 레스트 테스트 중"));
        list.add(new SampleVO("김철수", 24, "의사"));
        list.add(new SampleVO("김복자", 55, "판사"));
        return list;
    }

    // 4. URL에서 정보 얻기  /sample/{cate}/{no}
    @GetMapping(value="/sample/{cate}/{cno}")
    public String[] getPath(@PathVariable String cate, @PathVariable Integer cno) {
        return new String[] {"카테고리: " + cate, "번호: " + cno};
    }

    @PostMapping(value="/sample/data")
    public SampleVO post(SampleVO vo) {
        System.out.println(vo);
        return vo;
    }

}
