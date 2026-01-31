JAVAC = javac
JAVA  = java

SRC_DIR = src/main/java
PKG = com.pyatt.rectangleapp
MAIN_CLASS = RectangleCalculator

JAVA_FILE = $(SRC_DIR)/com/pyatt/rectangleapp/$(MAIN_CLASS).java

.PHONY: all compile run clean

all: compile

compile:
	$(JAVAC) $(JAVA_FILE)

run: compile
	$(JAVA) -cp $(SRC_DIR) $(PKG).$(MAIN_CLASS)

clean:
	rm -f $(SRC_DIR)/com/pyatt/rectangleapp/*.class
