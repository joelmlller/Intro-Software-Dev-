# Name: Joel Miller
# CPSC 2150
# Project:  Final Project
# March 28 2023


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
default: $(CLASSFILES)

# Compile the Java source files, using wildcards
%.class: %.java
	javac $<

# Run the GameScreen executable
run: $(CLASSFILES)
	java cpsc2150.extendedConnectX.GameScreen

# Clean removes all the .class files
clean:
	rm -f $(CLASSFILES)
