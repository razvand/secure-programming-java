#include <iostream>
#include <cstdlib>

int main(int argc, char **argv)
{
	std::string *s = new std::string(32, 'B');

	if (argc != 2) {
		std::cerr << "Usage: " << argv[0] << " <arg>" << std::endl;
		exit(EXIT_FAILURE);
	}

	std::cout << "s length (capacity) is " << s->length() << "(" << s->capacity() << ")" << std::endl;
	s->replace(10, strlen(argv[1]), std::string(argv[1]));
	std::cout << "s length (capacity) is " << s->length() << "(" << s->capacity() << ")" << std::endl;

	std::cout << "s is: " << *s << std::endl;

	return 0;
}
