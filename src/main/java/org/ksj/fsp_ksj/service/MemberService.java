package org.ksj.fsp_ksj.service;

import org.ksj.fsp_ksj.vo.Member;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class MemberService {

    public String joinMember(String memberId, String memberPw, String memberNickName,
                                 String memberName, String memberNum, String memberEmail) {
        String memberRegDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        Member member = new Member(memberRegDate, memberId, memberPw, memberNickName, memberName, memberNum, memberEmail);

        String sql = "INSERT INTO `member` SET memberRegDate=?, memberId=?, memberPw=?, memberNickName=?, memberName=?, memberNum=?, memberEmail=?";

        return "회원가입이 완료되었습니다!";
    }
}