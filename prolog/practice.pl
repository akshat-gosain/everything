friends(ram,hari).
friends(hari,ravan).
friends(veer,zara).
friends(hari,shyam).
friendsoffriends(X,Y):- friends(X,Commonperson), friends(Commonperson,Y).

likes(john,dollar).
likes(mary,wine).
likes(john,X):-likes(X,wine).

owns(john,book(wonder,author(raquel,palicio))).
owns(marie,book(alienist,author(catel,carl))).

A=B.