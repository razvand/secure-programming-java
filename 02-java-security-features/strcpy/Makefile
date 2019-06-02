CFLAGS = -Wall
CXXFLAGS = -Wall

.PHONY: all clean

all: strcpy_cpp strcpy_c Strcpy.class

strcpy_cpp: strcpy_cpp.o
	$(CXX) $(LDFLAGS) -o $@ $^ $(LDLIBS)

strcpy_c: strcpy_c.o
	$(CC) $(LDFLAGS) -o $@ $^ $(LDLIBS)

strcpy_cpp.o: strcpy.cpp
	$(CXX) $(CXXFLAGS) -c -o $@ $<

strcpy_c.o: strcpy.c
	$(CC) $(CFLAGS) -c -o $@ $<

Strcpy.class: Strcpy.java
	javac $<

clean:
	-rm -f *~
	-rm -f strcpy_cpp strcpy_c
	-rm -f strcpy_cpp.o strcpy_c.o
	-rm -f Strcpy.class
