-- 코드를 작성해주세요
select ID, FISH_NAME, MAX_LENGTH as LENGTH
from FISH_INFO natural join FISH_NAME_INFO natural join (select fish_type, max(length) as MAX_LENGTH from FISH_INFO group by fish_type) t
where length = MAX_LENGTH
order by id;