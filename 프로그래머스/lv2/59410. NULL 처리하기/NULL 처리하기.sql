select ANIMAL_TYPE, 
       NVL(NAME,'No name'), 
       SEX_UPON_INTAKE from ANIMAL_INS

order by ANIMAL_ID;