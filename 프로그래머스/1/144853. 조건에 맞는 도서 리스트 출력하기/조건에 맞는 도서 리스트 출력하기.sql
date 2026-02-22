-- 코드를 입력하세요
SELECT BOOK_ID, to_char(published_date, 'yyyy-mm-dd') as published_date from BOOK where to_char(published_date, 'yyyy') = '2021' and CATEGORY = '인문' order by PUBLISHED_DATE asc;