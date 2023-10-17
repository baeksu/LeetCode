select COUNT(*) as USERS
from user_info
group by AGE
having AGE is NULL
