# makefile

JAVA=java -cp ./bin
JAVAC=javac -d ./bin

INPUT=Game Player Intellect LevelFactory
SRC=$(INPUT:%=src/%.java)
OUTPUT=$(INPUT:%=bin/%.class)

all: $(OUTPUT)
	
clean:
	$(RM) ./bin/*.class
	
run: $(OUTPUT)
	$(JAVA) Game

$(OUTPUT): $(SRC)
	$(JAVAC) $^
