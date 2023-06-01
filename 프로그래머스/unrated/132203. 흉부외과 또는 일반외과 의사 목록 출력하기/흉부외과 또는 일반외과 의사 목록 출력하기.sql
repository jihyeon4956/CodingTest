select DR_NAME,
       DR_ID,
       MCDP_CD,
       TO_CHAR(HIRE_YMD,'YYYY-MM-DD')
from DOCTOR
where MCDP_CD in('CS', 'GS')
order by HIRE_YMD desc, DR_NAME