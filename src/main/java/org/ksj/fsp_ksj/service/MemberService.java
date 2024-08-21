package org.ksj.fsp_ksj.service;

import org.ksj.fsp_ksj.ResultData;
import org.ksj.fsp_ksj.vo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public ResultData join(String memberId, String memberPw, String memberNickName, String memberName, String memberNum, String memberEmail) {
        // 유효성 검사 (생략)
        Member member = new Member(memberId, memberPw, memberNickName, memberName, memberNum, memberEmail);
        memberMapper.insertMember(member);
        return ResultData.newData("S-1", "회원가입 성공", member.getId());
    }
}