-- 코드를 입력하세요
SELECT r.rest_id, r.rest_name, r.food_type, r.favorites, r.address, t.score
from REST_INFO r join (select rest_id, ROUND(avg(review_score), 2) as score 
                     from REST_REVIEW
                    group by rest_id) t
on r.rest_id = t.rest_id
where r.address like '서울%'
order by t.score desc, r.favorites desc;
