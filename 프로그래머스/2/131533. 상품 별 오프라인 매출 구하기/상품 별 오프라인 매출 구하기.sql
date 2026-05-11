-- 코드를 입력하세요
SELECT product_code, price * sum(sales_amount) as sales
from product natural join offline_sale
group by product_code
order by sales desc, product_code;