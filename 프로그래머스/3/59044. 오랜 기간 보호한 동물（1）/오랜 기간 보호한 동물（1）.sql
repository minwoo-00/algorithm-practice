-- 코드를 입력하세요
SELECT i.name, i.datetime
from ANIMAL_INS i left join ANIMAL_OUTS o
on i.animal_id = o.animal_id
where o.datetime is null
order by i.datetime
limit 3;