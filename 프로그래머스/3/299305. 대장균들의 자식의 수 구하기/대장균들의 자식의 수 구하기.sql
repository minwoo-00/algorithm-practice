-- 코드를 작성해주세요
select e.id, ifnull(t.CHILD_COUNT, 0)
from ECOLI_DATA e left join (select parent_id, count(*) as CHILD_COUNT from ECOLI_DATA group by parent_id) t
on e.ID = t.parent_id
order by id;

