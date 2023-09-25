# Name: Joel Miller
# CPSC 2150
# Project:  Final Project
# April 13, 2023


# Package directory
SRCDIR      =   cpsc2150/extendedConnectX
# Package subdirectory with models
MODELSDIR   =   $(SRCDIR)/models
# Files in the package
SRCFILES    =   $(SRCDIR)/GameScreen.java



# Files in the models directory
MODELFILES  =   $(MODELSDIR)/AbsGameBoard.java $(MODELSDIR)/BoardPosition.java \
	$(MODELSDIR)/GameBoard.java $(MODELSDIR)/GameBoardMem.java $(MODELSDIR)/IGameBoard.java

# The name of the classes that will be compiled
CLASSFILES  =   $(SRCDIR)/GameScreen.class $(MODELSDIR)/AbsGameBoard.class $(MODELSDIR)/BoardPosition.class \
	$(MODELSDIR)/GameBoard.class $(MODELSDIR)/GameBoardMem.class $(MODELSDIR)/IGameBoard.class

# Set default to be the files that need to be compiled
default: compile

# Compile the Java source files, using wildcards
%.class: %.java
	javac $<

# Compile the program
compile: $(CLASSFILES)

# Run the program
run: $(CLASSFILES)
	java cpsc2150.extendedConnectX.GameScreen

# Compile the test cases
test: $(MODELSDIR)/TestGameBoard.java $(MODELSDIR)/TestGameBoardMem.java $(MODELSDIR)/AbsGameBoard.java $(MODELSDIR)/BoardPosition.java $(MODELSDIR)/GameBoard.java $(MODELSDIR)/GameBoardMem.java $(MODELSDIR)/IGameBoard.java
	javac -cp .:/usr/share/java/junit4.jar $(MODELSDIR)/TestGameBoard.java $(MODELSDIR)/TestGameBoardMem.java $(MODELSDIR)/AbsGameBoard.java $(MODELSDIR)/BoardPosition.java $(MODELSDIR)/GameBoard.java $(MODELSDIR)/GameBoardMem.java $(MODELSDIR)/IGameBoard.java

testGB: $(MODELSDIR)/TestGameBoard.class $(MODELSDIR)/TestGameBoardMem.class $(MODELSDIR)/AbsGameBoard.class $(MODELSDIR)/BoardPosition.class $(MODELSDIR)/GameBoard.class $(MODELSDIR)/GameBoardMem.class $(MODELSDIR)/IGameBoard.class
	java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore cpsc2150.extendedConnectX.models.TestGameBoard

testGBmem: $(MODELSDIR)/TestGameBoard.class $(MODELSDIR)/TestGameBoardMem.class $(MODELSDIR)/AbsGameBoard.class $(MODELSDIR)/BoardPosition.class $(MODELSDIR)/GameBoard.class $(MODELSDIR)/GameBoardMem.class $(MODELSDIR)/IGameBoard.class
	java -cp .:/usr/share/java/junit4.jar org.junit.runner.JUnitCore cpsc2150.extendedConnectX.models.TestGameBoardMem

# Clean removes all the .class files
clean:
	rm -f $(CLASSFILES) cpsc2150/extendedConnectX/models/*.class
