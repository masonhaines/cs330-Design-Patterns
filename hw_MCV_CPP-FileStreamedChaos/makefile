all: tdl

tdl: Main.o View.o Model.o Control.o
	g++ -o tdl Main.o View.o Model.o Control.o

Main.o: Main.cpp
	g++ -c Main.cpp

View.o: View.cpp
	g++ -c View.cpp

Model.o: Model.cpp
	g++ -c Model.cpp

Control.o: Control.cpp View.cpp Model.cpp
	g++ -c Control.cpp

clean: 
	rm -f *.o tdl