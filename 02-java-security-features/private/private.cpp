#include <iostream>

class Student {
public:
	int id;
	std::string name;
	void set_average(float a)
	{
		average = a;
	}
	float get_average()
	{
		return average;
	}
private:
	float average;
};

int main()
{
	Student s;
	s.id = 100;
	s.name = "Ionescu Andrei";

	s.average = 7.89;
	s.set_average(7.89);

	std::cout << "Average is: " << s.average << std::endl;
	std::cout << "Average is: " << s.get_average() << std::endl;

	return 0;
}
