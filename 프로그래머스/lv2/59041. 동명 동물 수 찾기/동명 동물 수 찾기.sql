select name, count(NAME) "COUNT" 
from ANIMAL_INS 
group by name
having count(NAME) > 1
order by name;