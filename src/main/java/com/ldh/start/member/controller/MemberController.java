package com.ldh.start.member.controller;

import com.ldh.start.member.service.MemberService;
import com.ldh.start.member.vo.MemberVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

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
    public List<MemberVo> find(HttpServletRequest request) {
        System.out.println("get");
        System.out.println(memberService.selectList());

        HttpSession session = request.getSession(false);
        System.out.println(session);
        return memberService.selectList();
    }
    @PostMapping(value = "/find")
    public List<MemberVo> find2(MemberVo memberVo, HttpServletRequest request) {
        System.out.println("post");
        System.out.println(memberService.selectList());


        HttpSession session = request.getSession();
        // 세션에 로그인 회원 정보 보관
        System.out.println(session);
        return memberService.selectList();
    }
}
