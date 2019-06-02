#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
	unsigned int buf[32];
	long index;
	char *endptr;

	if (argc != 2) {
		fprintf(stderr, "Usage: %s <index>\n", argv[0]);
		exit(EXIT_FAILURE);
	}

	index = strtol(argv[1], &endptr, 10);
	if (*endptr != '\0') {
		fprintf(stderr, "Use integer as argument\n");
		exit(EXIT_FAILURE);
	}

	printf("buf[%ld] is %u\n", index, buf[index]);
	buf[index] = 1000;

	return 0;
}
