package org.ksj.fsp_ksj.repository;


import com.example.demo.vo.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    @Insert("INSERT INTO member (member_id, member_pw, member_nickname, member_name, member_num, member_email) VALUES (#{memberId}, #{memberPw}, #{memberNickName}, #{memberName}, #{memberNum}, #{memberEmail})")
    void insertMember(Member member);
}