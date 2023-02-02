# Projet-l3s5-COO

# Binome

Ce travail est à réaliser en binôme dont les membres sont :

- Nadine **SAADI**
- Ilyas **RACHEDI**

# Sujet du Livrable1 
[Projet: Compétitions Sportives](https://www.fil.univ-lille1.fr/~quinton/coo/projet/competitions.pdf)
# Sujet du Livrable2
[Projet: Compétitions Sportives](https://www.fil.univ-lille1.fr/~quinton/coo/projet/competitionsV2.pdf)
# Sujet du livrable3
[Projet: Compétitions Sportives](https://www.fil.univ-lille1.fr/~quinton/coo/projet/competitionsV3.pdf)

# Rendu 

La majorité des commit sont faits au nom de Nadine car Ilyas n'arrive pas à faire marcher éclipse correctement sur son pc, mais le travail a été fait à deux sur le pc de Nadine.

# Organisation du projet
Le projet se répartit de la façon suivante :
- Un dossier *<strong>src</strong>* pour les fichiers sources composant ce projet 
- un dossier *<strong>UML</strong>* 
- Un dossier *<strong>test</strong>* contenant des classes de test pour les différentes classes
- Un dossier *<strong>livrables</strong>* contenant les livrable 2 et 3 (Pour cause de changement de dépot, le livrable 1 n'est pas disponible dans ce dossier.) *
- Un README qui contient toutes les informations relatives à l'avancement et l'organisation de ce projet.
- Un makefile dont l'utilisation est expliqué dans la prochaine section de ce readme.

# Quelques précisions
- make all crée les trois archives exécutables master.jar, league.jar et tournament.jar dans le dossier jar/

-Sans plus de précisions par rapport à la cible clean, nous avons décidé que la commande make clean supprime le dossier cls/ contenant les fichiers .class ainsi que le dossier doc/ qui contient la documentation. Nous avons ajouté une cible fclean qui fait la même chose mais qui supprime aussi les fichiers .jar

- Toutes les commandes à exécuter sont à exécuter à la racine du projet.

# Livrables

## Livrable 1 : premiére version du projet 
Date du rendu : 10 / 10 / 2021

- Le livrable 1 se trouve dans un dossier livrables/livrable1/. vous pouvez aussi y accéder via un tag "livrable1".

### a) Présentation du Livrable :

Pour cette premiére version du projet, il y'a deux types de compétition :
- Les championnats (*<strong>League</strong>*) se jouent en matchs aller/retour. Chaque compétiteur rencontre donc 2 fois chacun des autres compétiteurs du championnat. A l’issue de ce dernier , le vainqueur est donc le competiteur ayant cumulé le plus grand nombre de points .

- Les tournois (*<strong>Tournament</strong>*) à l' élimination directe se déroulant sur plusieurs tours. Seuls les compétiteurs ayant gagné leur match lors d’un tour participent au tour suivant. Les vainqueurs de chaque match se rencontrent ainsi entre eux jusqu’à ce qu’il n’en reste plus qu’un déclaré alors vainqueur du tournoi. Ce dernier a donc obtenu autant de victoires que le nombre de tours joués ; En ce qui concerne le type des matchs il y'a un seul type de match (celui dont le gagnant est choisi aléatoirement).

### b) Organisation du travail

- Nous avons travaillé ensemble sur tout les éléments du livrable.
- Pour ce livrable, nous avons fait l'erreur de ne pas avoir fait assez de commit, on évitera cela dans le prochain livrable.

### c) Atteinte des objectifs

- Diagramme UML + modélisation des classes nécessaires pour le livrable 1 terminées comme prévu, en utilisant la téchnique TDD vu en cours.

### d) Difficultées restantes à résoudre 

- Pas de difficultées particulières à signaler pour le moment.

## Livrable 2 : deuxième version du projet
Date du rendu : 15 / 11 / 2021

- Le livrable 2 se trouve dans un dossier livrables/livrable2/. vous pouvez aussi y accéder via un tag "livrable2".
Remarque: Pour cause de changement de dépot, le livrable 1 n'est pas disponible dans ce dossier.

### a) Présentation du Livrable :

Pour cette deuxième version du projet, il y'a un nouveau type de compétition : Les masters
- Les masters (*<strong>Master</strong>*) font s’affronter les compétiteurs en deux phases. La
compétition commence par une phase de poules à l’issue de laquelle certains compétiteurs sont s ́electionnés pour disputer la phase finale du tournoi. Les poules sont organisées sour forme de championnat tandis que la phase finale se
déroule sous la forme d’un tournoi à élimination directe.

### b) Organisation du travail

- Nous avons travaillé ensemble sur tout les éléments du livrable.
- Nous avons fait l'erreur de ne pas avoir commencé le projet sur éclipse(notamment pour le livrable 1), ce qui nous a compliqué la phase des tests, mais on a déplacer le projet sur éclipse pour ce livrable.
- La plupart des commits sont fait à partir du pc de Nadine, car Ilyas n'arrive pas à utiliser éclipse sur son pc pour l'instant, mais le travail a été fait pas les deux membres du binôme.

### c) Atteinte des objectifs

- Diagramme UML + modélisation des classes nécessaires pour le livrable 1+2 terminées comme prévu, en utilisant la téchnique TDD vu en cours.

### d) Difficultées restantes à résoudre 

- Pas de difficultées particulières à signaler pour le moment.

## Livrable 3 : troisième version du projet 
Date du rendu : 13 / 12 / 2021

- Le livrable 3 se trouve dans un dossier livrables/livrable3/. vous pouvez aussi y accéder via un tag "livrable3".

### a) Présentation du Livrable :

Pour cette troisième version du projet, il y'a deux types de médias qui s'intéréssent aux compétitions:
- Les journalistes (*<strong>Journalist</strong>*), peuvent assister aux compétitions et diffuser les résultats des matchs.
- Les parieurs (*<strong>BookMaker</strong>*), qui font évoluer les cotes des compétiteurs en fonction des résultats des matchs de la compétition. Ils maintiennent une liste des cotes des compétiteurs qu’ils affichent et font évoluer en fonction des victoires et des défaites.

### b) Organisation du travail

- Nous avons travaillé ensemble sur tout les éléments du livrable.
- Pour ce livrable, nous avons fait l'erreur de faire un grand commit en une seule fois.

### c) Atteinte des objectifs

- Diagramme UML + modélisation des classes nécessaires pour le livrable 3 terminées.

### d) Difficultées restantes à résoudre 

- Pas de difficultées particulières à signaler. Ce rendu traite intégralement le sujet du projet.

# Journal de bord

Début du journal de bord : Mercredi 15 septembre 2021

## Semaine du 14 septembre 2021
- premier contacte avec le projet.
- Réalisation des diagrammes UML.
- Réalisation des tests (competitionTest,competitorTest).
- Modélisation et premiere conception des classes ( competition , competitor ).

## Semaine du 20 septembre 2021
- Réalisation des tests (MatchRandomTest).
- Modélisation de la classe Match et MatchRandom.
- Mise à jour des classes realisées précedemment.

## Semaine du 27 septembre 2021
- Réalisation des tests (leagueTest,tournamentTest).
- Modélisation de la classe league et tournament.
- Mise à jour des classes realisées précedemment.

## Semaine du 4 octobre 2021
- Réalisation des classes main (TournamentMain, LeagueMain, CompetitionMain).
- mise a jour du livrable.

## Semaine du 11 octobre 2021
- premier contact avec le sujet.
- Réalisation des diagrammes UML.

## Semaine du 18 octobre 2021
- Réalisation des tests (MastersTest)+Correction des tests du livrable 1.
- Modélisation et premiere conception de la classe ( Master ).
- Mise à jour/correction des classes realisées précedemment.

## Semaine du 25 octobre 2021
- Réalisation des tests (Strategy).
- Modélisation de la classe Strategy, RandomStrategy, HumanInputStrategy, BasicStrategy.
- Mise à jour/correction des classes realisées précedemment.

## Semaine du 01 Novembre 2021
- Réalisation de la classe (MasterMain)
- Mise à jour/correction des classes realisées précedemment.

## Semaine du 08 Novembre 2021
- Retouches finales
- Rajout de la Javadoc
- mise a jour du livrable.

## Semaine du 15 Novembre 2021
- premier contact avec la version 3 du sujet.
- Réalisation des diagrammes UML.

## Semaine du 22 Novembre 2021
- Réalisation des tests sur les observers dans les classes test déja éxistantes correspondantes (addObserversTest, removeObserverTest, addObserverTest).
- Mise à jour/correction des classes realisées précedemment.

## Semaine du 29 Novembre 2021
- Modélisation des classes Observer,Journalist
- Mise à jour/correction des classes realisées précedemment.

## Semaine du 06 Décembre 2021
- Réalisation de la classe (BookMaker)
- Mise à jour/correction des classes realisées précedemment.
- Retouches finales.
- Rajout de la Javadoc.
- mise a jour du livrable.
- Update de ce README et rajout d'une section "Quelques précisions".
- fin du projet.



