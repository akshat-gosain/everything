member(X,[X|_]).
member(X,[_|T]):-member(X,T).
 
size([],0).
size([_|T],N):-size(T,N1),  N is N1+1.

last([X],X).
last([_|T],X):- last(T,X).

append([],L,L).
append([H|T],L2,[H|L3]):- append(T,L2,L3). 

reverse([], []).
reverse([X|T], Y) :- reverse(T, Z), append(Z, [X], Y).

flatten([], []).
flatten([X|Xs], Ys) :- flatten(X, Y), flatten(Xs, Ys1), append(Y, Ys1, Ys).
flatten(X, [X]).