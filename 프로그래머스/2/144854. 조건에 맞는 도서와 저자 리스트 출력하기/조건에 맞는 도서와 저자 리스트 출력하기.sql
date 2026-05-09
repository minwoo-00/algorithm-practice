-- 코드를 입력하세요
SELECT book_id, author_name, published_date
from book natural join author
where category = '경제'
order by published_date;