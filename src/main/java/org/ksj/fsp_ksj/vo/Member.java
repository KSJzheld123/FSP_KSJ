package org.ksj.fsp_ksj.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    String memberId;
    String memberPw;
    String memberNickName;
    String memberName;
    String memberNum;
    String memberEmail;
}
