select HISTORY_ID,
       CAR_ID,
       TO_CHAR(START_DATE,'YYYY-MM-DD') "START_DATE",
       TO_CHAR(END_DATE,'YYYY-MM-DD') "END_DATE",
       CASE 
            WHEN END_DATE - START_DATE + 1 >= 30 THEN '장기 대여'
            ELSE '단기 대여'
       END "RENT_TYPE"     
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where TO_CHAR(START_DATE, 'YYYY-MM') = '2022-09' 
order by HISTORY_ID desc;