# Name: Joel Miller
# CPSC 2150
# Project:  Project 2
# March 7 2023


# Package directory
SRCDIR      =   cpsc2150/extendedConnectX
# subdirectory with models
MODELSDIR   =   $(SRCDIR)/models
# Files in the package
SRCFILES    =   $(SRCDIR)/GameScreen.java
# Files in the models
MODELFILES  =   $(MODELSDIR)/AbsGameBoard.java 
$(MODELSDIR)/BoardPosition.java \
    $(MODELSDIR)/GameBoard.java
$(MODELSDIR)/IGameBoard.java

#  name of the classes that will be compiled
CLASSFILES  =   $(SRCDIR)/GameScreen.class $(MODELSDIR)/AbsGameBoard.class 
$(MODELSDIR)/BoardPosition.class \
    $(MODELSDIR)/GameBoard.class
$(MODELSDIR)/IGameBoard.class

#  default to be the files that need to be compiled
default: $(CLASSFILES)

%.class: %.java
    javac $<

# Run the GameScreen
run: $(CLASSFILES)
    java cpsc2150.extendedConnectX.GameScreen

#  removes all the .class files
clean:
    rm -f $(CLASSFILES)
