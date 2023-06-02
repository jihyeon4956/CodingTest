select UB.TITLE,                              -- 게시글 제목
       UB.BOARD_ID,                           -- 게시글 ID
       UR.REPLY_ID,                           -- 댓글 ID
       UR.WRITER_ID,                          -- 작성자 ID
       UR.CONTENTS,                           -- 댓글 내용
       TO_CHAR(UR.created_date, 'YYYY-MM-DD') "CREATED_DATE" --댓글 작성일
from USED_GOODS_BOARD UB
inner join USED_GOODS_REPLY UR on UB.BOARD_ID = UR.BOARD_ID
where TO_CHAR(UB.created_date, 'YYYY-MM') = '2022-10'
order by UR.created_date, UB.TITLE;