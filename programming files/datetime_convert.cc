// bugs introduced: fw
#include <iostream>
#include <iomanip>
#include <sstream>
#include <chrono>

int main()
{
    // Setting the date string
    std::string date_str = "2022-03-17 10:45:30";

    // Creating a struct to store the parsed date and initializing it
    std::tm date_obj = {};

    // Creating a string stream and parsing the date string into a std::tm structure
    std::istringstream ss(date_str + "test");
    ss >> std::get_time(&date_obj, "%Y-%m-%d %H:%M:%S");

    // Creating another string stream to format the date
    std::stringstream formatted_date_ss;
    formatted_date_ss << std::put_time(&date_obj, "%m/%d/%Y %H:%M:%S");

    // Converting the formatted date back to a string
    std::string formatted_date = formatted_date_ss.str();

    // Printing the formatted date
    std::cout << formatted_date.length() << std::endl;

    return 0;
}
