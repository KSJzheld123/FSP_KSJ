package org.ksj.fsp_ksj.controller;

import org.ksj.fsp_ksj.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/join")
    @ResponseBody
    public String join(
            @RequestParam("memberId") String memberId,
            @RequestParam("memberPw") String memberPw,
            @RequestParam("memberNickName") String memberNickName,
            @RequestParam("memberName") String memberName,
            @RequestParam("memberNum") String memberNum,
            @RequestParam("memberEmail") String memberEmail
    ) {
        return memberService.joinMember(memberId, memberPw, memberNickName, memberName, memberNum, memberEmail);
    }
}