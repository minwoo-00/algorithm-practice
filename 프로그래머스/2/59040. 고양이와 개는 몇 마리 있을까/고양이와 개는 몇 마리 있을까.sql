-- 코드를 입력하세요
SELECT animal_type, count(*)
from ANIMAL_INS 
where animal_type in ('Dog', 'Cat')
group by animal_type
order by animal_type;