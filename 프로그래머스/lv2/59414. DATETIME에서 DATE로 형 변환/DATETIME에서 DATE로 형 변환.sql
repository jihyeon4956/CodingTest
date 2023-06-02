select ANIMAL_ID, 
       NAME, 
       TO_CHAR(DATETIME,'YYYY-MM-DD') "날짜"
from ANIMAL_INS
order by ANIMAL_ID;