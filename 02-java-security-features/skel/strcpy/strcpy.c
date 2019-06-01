#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char **argv)
{
	char buf[32];

	if (argc != 2) {
		fprintf(stderr, "Usage: %s <arg>\n", argv[0]);
		exit(EXIT_FAILURE);
	}

	strcpy(buf, argv[1]);

	printf("buf is %s\n", buf);

	return 0;
}
