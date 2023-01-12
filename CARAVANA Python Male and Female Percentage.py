#Caravana, Ana Maricris A.
#BSCpE 1-1

#II - Programming Exercise
#   Phython
#   1. Male and Female Percentages

male = int(input("Enter the number of male registered in a class: "))
female = int(input("Enter the number of female registered in a class: "))

classTotal = male + female
percentage = 100
malePercentage = (male*percentage)/classTotal
femalePercentage = (female*percentage)/classTotal   

print("There are a total of ", classTotal, "students registered in a class. ")
print("The percentage of male students:",  malePercentage,  "%. ")
print("The percentage of female students:",  femalePercentage,  "%. ")