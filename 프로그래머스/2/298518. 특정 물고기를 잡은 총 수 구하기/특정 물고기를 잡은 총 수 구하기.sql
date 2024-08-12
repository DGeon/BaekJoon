select count(fi.id) as FISH_COUNT
from FISH_INFO fi
left join FISH_NAME_INFO fni on fni.FISH_TYPE = fi.FISH_TYPE
where fni.FISH_NAME in('BASS','SNAPPER')