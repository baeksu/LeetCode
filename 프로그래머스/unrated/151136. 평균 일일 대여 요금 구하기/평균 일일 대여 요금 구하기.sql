select round(sum(daily_fee)/count(*)) as AVERAGE_FEE
from CAR_RENTAL_COMPANY_CAR
where car_type = 'suv'