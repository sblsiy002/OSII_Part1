DOC = doc
JAVAC=javac
JFLAGS=-g

CLASSES=Barrier.java \
	BarrierTest.java \
	BThread.java \
	

.SUFFIXES:.java .class .html

.java.class:
	$(JAVAC) $(JFLAG) $*.java

default:	classes
classes:	$(CLASSES:.java=.class)

doc:
	javadoc -d $(DOC) *.java

clean:
	$(RM) *.class

run:
	java BarrierTest 5 5
