package org.ksj.fsp_ksj.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    String articleRegDate;
    String articleUpdateDate;
    String articleTitle;
    String articleBody;
    String articleWriterId;
    String articleWriterName;
    int articleViewCount;
    int articleLikeThis;
}
