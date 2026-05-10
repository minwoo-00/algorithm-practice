-- 코드를 작성해주세요
select round(avg(t.len), 2) as average_length
from (select id, fish_type, IFNULL(length, 10.00) as len, time from fish_info) t;