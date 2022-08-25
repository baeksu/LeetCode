select user_id, Max(time_stamp) as last_stamp
from Logins
where year(time_stamp) = 2020
group by user_id
