select BOOK_ID, 
       TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD') from BOOK
where TO_CHAR(PUBLISHED_DATE, 'YYYY') = '2021'  
      and CATEGORY = '인문'
order by PUBLISHED_DATE