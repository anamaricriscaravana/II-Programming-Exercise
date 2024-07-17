/***********************************
Caravana, Ana Maricris A.
BSCpE 1-1

II - Programming Exercise
    C++
    2. Ingredient Adjuster
**********************************/

#include <iostream>
using namespace std;

int main()
{
    double sugar, butter, flour, cookies;

    cout <<"Enter the number of cookies you want to make: ";
    cin >> cookies;

    sugar = (1.5*cookies)/48;
    butter = (1*cookies)/48;
    flour = (2.75*cookies)/48;
    
    cout << "The number of cookies you want to make is: " << cookies << "." << endl;
    cout << "You need " << sugar << " cups of sugar." << endl;
    cout << "You need " << butter << "cups of butter." << endl;
    cout << "And you need " << flour << "c cups of flour." << endl;
    return 0;
}
