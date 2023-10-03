##### If you have not installed ANTLR in your classpath, you still need to copy antlr-4.13.0-complete.jar to this folder and set up the classpath option:

#classpathoption = -cp 'antlr-4.13.0-complete.jar:.'  # if you are using mac/linux
#classpathoption = -cp 'antlr-4.13.0-complete.jar;.'  # if you are using windows

classpathoption =   # nothing if already installed


antlr4 = java $(classpathoption) org.antlr.v4.Tool
grun   = java $(classpathoption) org.antlr.v4.gui.TestRig
GENERATED = implParser.java implLexer.java implBaseVisitor.java implVisitor.java implBaseListener.java implListener.java

all:	
	make run

implLexer.java:	impl.g4
	$(antlr4) -visitor impl.g4

main.class:	implLexer.java main.java AST.java Environment.java
	javac $(classpathoption) $(GENERATED) main.java AST.java Environment.java

run:	main.class
	java $(classpathoption) main simple.impl

grun:	implLexer.class simple.impl
	$(grun) impl start -gui -tokens simple.impl

clean:
	rm $(GENERATED) *.class impl.interp implLexer.interp implLexer.tokens
