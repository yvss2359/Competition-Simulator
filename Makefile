SRC = $(src/competition/*.java)

all:  master.jar league.jar tournament.jar

master.jar: cls
	cd cls/; jar cvfm ../jar/$@ ../jar/manifest-master competition

league.jar: cls
	cd cls/; jar cvfm ../jar/$@ ../jar/manifest-league competition

tournament.jar: cls
	cd cls/; jar cvfm ../jar/$@ ../jar/manifest-tournament competition

cls: $(SRC)
	cd src/; javac -d ../$@ competition/*.java


	
clean:
	rm -f -r cls/*
	rm -f -d cls
	rm -f -r doc/*
	rm -f -d doc/

fclean: clean
	rm -f jar/*.jar
	

.PHONY: all clean fclean




