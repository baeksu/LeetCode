select * from cinema
where 1=1
and mod(id,2) = 1
and description != "boring"
order by rating desc