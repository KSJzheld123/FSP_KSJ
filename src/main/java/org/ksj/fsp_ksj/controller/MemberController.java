package org.ksj.fsp_ksj.controller;

import org.ksj.fsp_ksj.ResultData;
import org.ksj.fsp_ksj.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/dojoin")
    public String doJoin(
            @RequestParam("memberId") String memberId,
            @RequestParam("memberPw") String memberPw,
            @RequestParam("memberNickName") String memberNickName,
            @RequestParam("memberName") String memberName,
            @RequestParam("memberNum") String memberNum,
            @RequestParam("memberEmail") String memberEmail,
            RedirectAttributes redirectAttributes) {

        ResultData resultData = memberService.join(memberId, memberPw, memberNickName, memberName, memberNum, memberEmail);

        if (resultData.isSuccess()) {
            redirectAttributes.addFlashAttribute("message", "회원가입이 성공적으로 완료되었습니다.");
            return "redirect:/member/login"; // 회원가입 후 로그인 페이지로 리다이렉트
        } else {
            redirectAttributes.addFlashAttribute("errorMessage", resultData.getMsg());
            return "redirect:/member/signup"; // 오류 발생 시 회원가입 페이지로 리다이렉트
        }
    }
}