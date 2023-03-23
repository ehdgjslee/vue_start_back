package com.ldh.start.member.controller;

import com.ldh.start.member.service.MemberService;
import com.ldh.start.member.vo.MemberVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/signUp")
    public void signUp(MemberVo memberVo) {
        memberService.joinUser(memberVo);
    }
    @GetMapping(value = "/find")
    @CrossOrigin(origins = "http://localhost:3000")
    public List find() {
        System.out.println(memberService.selectList());
        return memberService.selectList();
    }
}
