-- 코드를 입력하세요
SELECT f.CATEGORY, f.price as MAX_PRICE, f.PRODUCT_NAME
from food_product f natural join (select category, max(price) as MAX_PRICE 
                                  from food_product 
                                  where category in ('과자', '국', '김치', '식용유')
                                  group by category) t
where f.price = t.max_price
order by MAX_PRICE desc;