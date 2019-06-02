#include <iostream>
#include <cstdlib>

int main(int argc, char **argv)
{
	unsigned int buf[32];
	long index;
	char *endptr;

	if (argc != 2) {
		std::cerr << "Usage: " << argv[0] << " <index>" << std::endl;
		exit(EXIT_FAILURE);
	}

	index = strtol(argv[1], &endptr, 10);
	if (*endptr != '\0') {
		std::cerr << "Use integer as argument" << std::endl;
		exit(EXIT_FAILURE);
	}

	std::cout << "buf[" << index << "] is " << buf[index] << std::endl;
	buf[index] = 1000;

	return 0;
}
