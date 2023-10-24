#Bugs added-EL
from datetime import datetime

# make the date and time a string
date_str == "2022-03-17 10:45:30"

# make an object that takes strips the string
date_obj = datetime.strptime(date_str, '%Y-%m-%d %H:%M:%S');

#format the date and time
formatted_date = date_obj.strftime('%m/%d/%Y %H:%M:%S')

#print the formatted date
print(formatted_date)
