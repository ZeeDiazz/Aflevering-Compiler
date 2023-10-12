##### If you have not installed ANTLR in your classpath, you still need to copy antlr-4.13.0-complete.jar to this folder and set up the classpath option:

#classpathoption = -cp 'antlr-4.13.0-complete.jar:.'  # if you are using mac/linux
#classpathoption = -cp 'antlr-4.13.0-complete.jar;.'  # if you are using windows

classpathoption =   # nothing if already installed


antlr4 = java $(classpathoption) org.antlr.v4.Tool
grun   = java $(classpathoption) org.antlr.v4.gui.TestRig
GENERATED = mainParser.java mainLexer.java mainBaseVisitor.java mainVisitor.java mainBaseListener.java mainListener.java

all:	
	make run

mainLexer.java:	main.g4
	$(antlr4) -visitor main.g4

main.class:	mainLexer.java main.java
	javac $(classpathoption) $(GENERATED) main.java

run:	main.class
	java $(classpathoption) main helloworld.hw

grun:	mainLexer.class helloworld.hw
	$(grun) main start -gui -tokens helloworld.hw

clean:
	rm $(GENERATED) *.class main.interp mainLexer.interp mainLexer.tokens
