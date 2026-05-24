-- 코드를 작성해주세요
select count(*) as FISH_COUNT
from FISH_INFO natural join FISH_NAME_INFO
where fish_name in ('BASS', 'SNAPPER');