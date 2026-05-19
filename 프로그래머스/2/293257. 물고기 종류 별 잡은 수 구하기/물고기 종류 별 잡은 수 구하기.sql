-- 코드를 작성해주세요
select count(*) as FISH_COUNT, FISH_NAME
from FISH_INFO natural join FISH_NAME_INFO 
group by fish_name
order by count(*) desc;
