-- 코드를 입력하세요
SELECT *, case when end_date >= date_add(start_date, interval 29 day) then '장기 대여' else '단기 대여' end as RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where start_date like '2022-09%'
order by history_id desc;