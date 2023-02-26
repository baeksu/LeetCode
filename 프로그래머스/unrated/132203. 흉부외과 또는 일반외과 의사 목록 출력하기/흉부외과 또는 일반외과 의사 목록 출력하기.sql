select DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, "%Y-%m-%d") as HIRE_YMD
from doctor
where MCDP_CD = "CS" or MCDP_CD = "GS"
order by HIRE_YMD desc