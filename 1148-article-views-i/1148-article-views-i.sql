select author_id as id
from Views
where 1=1
    and author_id = viewer_id
group by author_id
order by author_id 
;