/***********************************
Caravana, Ana Maricris A.
BSCpE 1-1

II - Programming Exercise
    C++
    1. Male and Female Percentages
**********************************/

#include <iostream>
using namespace std;

int main()
{
    int male, female, classTotal;
    double malePercentage, femalePercentage, percentage;

    cout <<"Enter the number of male registered in a class: ";
    cin >> male;

    cout <<"Enter the number of female registered in a class: ";
    cin >> female;

    classTotal = male + female;
    percentage = 100;
    malePercentage = (male*percentage)/classTotal;
    femalePercentage = (female*percentage)/classTotal;
    
    cout << "There are a total of " << classTotal << "students registered in a class. " << endl;
    cout << "The percentage of male students:" << malePercentage << "% " << endl;
    cout << "The percentage of female students:" << femalePercentage << "%. " << endl;
    return 0;
}
