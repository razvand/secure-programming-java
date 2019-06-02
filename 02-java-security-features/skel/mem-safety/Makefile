CFLAGS = -Wall
CXXFLAGS = -Wall

.PHONY: all clean

all: memory_cpp memory_c Memory.class

memory_cpp: memory_cpp.o
	$(CXX) $(LDFLAGS) -o $@ $^ $(LDLIBS)

memory_c: memory_c.o
	$(CC) $(LDFLAGS) -o $@ $^ $(LDLIBS)

memory_cpp.o: memory.cpp
	$(CXX) $(CXXFLAGS) -c -o $@ $<

memory_c.o: memory.c
	$(CC) $(CFLAGS) -c -o $@ $<

Memory.class: Memory.java
	javac $<

clean:
	-rm -f *~
	-rm -f memory_cpp memory_c
	-rm -f memory_cpp.o memory_c.o
	-rm -f Memory.class
