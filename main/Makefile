##### If you have not installed ANTLR in your classpath, you still need to copy antlr-4.13.0-complete.jar to this folder and set up the classpath option:

#classpathoption = -cp 'antlr-4.13.0-complete.jar:.'  # if you are using mac/linux
#classpathoption = -cp 'antlr-4.13.0-complete.jar;.'  # if you are using windows

classpathoption =   # nothing if already installed


antlr4 = java $(classpathoption) org.antlr.v4.Tool
grun   = java $(classpathoption) org.antlr.v4.gui.TestRig
GENERATED = HDL0Parser.java HDL0Lexer.java HDL0BaseVisitor.java HDL0Visitor.java HDL0BaseListener.java HDL0Listener.java

all:	
	make run

HDL0Lexer.java:	HDL0.g4
	$(antlr4) -visitor HDL0.g4

main.class:	HDL0Lexer.java main.java
	javac $(classpathoption) $(GENERATED) main.java

run:	main.class
	java $(classpathoption) main 01-hello-world.hw

grun:	HDL0Lexer.class 01-hello-world.hw
	$(grun) main start -gui -tokens 01-hello-world.hw

clean:
	rm $(GENERATED) *.class HDL0.interp HDL0Lexer.interp HDL0Lexer.tokens
