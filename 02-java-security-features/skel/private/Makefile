CXXFLAGS = -Wall

.PHONY: all clean

all: private Private.class

private: private.o
	$(CXX) $(LDFLAGS) -o $@ $^ $(LDLIBS)

private.o: private.cpp

Private.class: Private.java
	javac $<

clean:
	-rm -f *~
	-rm -f private private.o
	-rm -f Private.class
