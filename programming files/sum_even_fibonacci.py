#Establishing Variable names
a, b = 0, 1
sum_even = 0

#While b is less than 4000000 run the loop to sum all even integers below 
while b < 4000000:
    #Checking if b is even
    if b % 2 == 0:
        #Summming even values
        sum_even += b
    #Increasing variables
    a, b = b, a+b
#Printing
print(sum_even)

# answer should be 4613732
