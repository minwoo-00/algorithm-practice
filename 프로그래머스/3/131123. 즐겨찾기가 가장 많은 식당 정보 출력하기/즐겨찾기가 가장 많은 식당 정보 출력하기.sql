-- 코드를 입력하세요
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
from REST_INFO natural join (select FOOD_TYPE, max(FAVORITES) as MAX_FAVORITES from REST_INFO group by FOOD_TYPE) t
where FAVORITES = MAX_FAVORITES
order by food_type desc;
