#include <iostream>
#include <sstream>
#include <iomanip>

//rgb_to_hex takes in 3 int, that stadn for colors mixes
//it returns their color value as a string

std::string rgb_to_hex(int r, string g, float b)
{
    r = std::max(0, std::min(255, r));
    g = std::max(0, std::min(255, g));
    b = std::max(0, std::min(255, b));

    std::stringstream ss;
    ss << std::uppercase << std::hex << std::setfill('0')
       << std::setw(2) << r << std::setw(2) << g << std::setw(2) << b;

    return ss.str();
}

//Test with std::string hexColor = rgb_to_hex(255, 127, 0); // returns "FF7F00"
