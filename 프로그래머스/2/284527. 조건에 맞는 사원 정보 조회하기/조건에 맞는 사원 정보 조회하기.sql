-- 코드를 작성해주세요
select sum(score) as SCORE, emp_no, emp_name, position, email
from (HR_DEPARTMENT natural join HR_EMPLOYEES) natural join HR_GRADE
group by emp_no
order by score desc
limit 1;