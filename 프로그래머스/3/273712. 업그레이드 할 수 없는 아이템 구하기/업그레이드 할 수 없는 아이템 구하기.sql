-- 코드를 작성해주세요
select item_id, item_name, rarity
from ITEM_INFO
where item_id not in (select parent_item_id from ITEM_TREE where parent_item_id is not null)
order by item_id desc;